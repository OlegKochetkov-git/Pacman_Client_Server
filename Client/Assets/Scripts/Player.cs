using Assets.Scripts;
using Grpc.Core;
using Proto;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using UnityEngine;
using UnityEngine.UI;

public class Player : MonoBehaviour
{
    [SerializeField] GameObject anotherPlayer;

    private Channel channel;
    private PlayerService.PlayerServiceClient playerServiceClient;

    private GameManager gameManager;
    private string server = GameManager.server;

    private Dictionary<(int, int), GameObject> coinCoordinatesDictionary = null;
    private Dictionary<int, (GameObject, Vector3)> anotherPlayersCoordinatesDictionary = null;

    private Vector3 currentCoordinates;

    public int Id { get; set; }

    private void Start()
    {
        channel = new Channel(server, ChannelCredentials.Insecure);
        playerServiceClient = new PlayerService.PlayerServiceClient(channel);

        currentCoordinates = transform.position;

        gameManager = FindObjectOfType<GameManager>();
        coinCoordinatesDictionary = gameManager.CoinCoordinatesDictionary;
        anotherPlayersCoordinatesDictionary = new Dictionary<int, (GameObject, Vector3)>();
    }

    private void Update()
    {
        MoveOtherPlayers();
        DestroyCoinsByOtherPlayers();
        ReadInput();
        DestroyCoin();

        Escape();

        //Debug.Log($"Current coordinates:  X = {currentCoordinates.x}  Y = {currentCoordinates.y}");
    }
    private void FixedUpdate()
    {
        transform.position = currentCoordinates;
    }

    private async void MoveOtherPlayers()
    {
        using (var call = playerServiceClient.moveOtherPlayersOnSenderMap())
        {
            var response = Task.Run(async () =>
            {
                while (await call.ResponseStream.MoveNext())
                {
                    var current = call.ResponseStream.Current;
                    var id = current.Id;

                    if (!anotherPlayersCoordinatesDictionary.ContainsKey(id))
                    {
                        SpawnOtherPlayer(id, current.CoordinateX, current.CoordinateY);
                    }

                    var obj = anotherPlayersCoordinatesDictionary[id].Item1;
                    var pos = anotherPlayersCoordinatesDictionary[id].Item2;
                    pos = new Vector3(current.CoordinateX, current.CoordinateY);
                    obj.transform.position = pos;                 
                }
            });

            var request = call.RequestStream;
            await request.WriteAsync(new MoveOtherPlayerOnMapRequest() { Id = Id });

            await call.RequestStream.CompleteAsync();
            await response;
        }
    }

    private void SpawnOtherPlayer(int id, int x, int y)
    {
        GameObject obj = Instantiate(anotherPlayer, new Vector3(x, y, 0f), Quaternion.identity);
        anotherPlayersCoordinatesDictionary[id] = (obj, new Vector3(x, y, 0f));
    }

    private void DestroyCoinsByOtherPlayers()
    {
        foreach (var item in anotherPlayersCoordinatesDictionary)
        {
            int x = Convert.ToInt32(item.Value.Item1.gameObject.transform.position.x);
            int y = Convert.ToInt32(item.Value.Item1.gameObject.transform.position.y);

            if (coinCoordinatesDictionary.ContainsKey((x, y)))
            {
                Destroy(coinCoordinatesDictionary[(x, y)]);
            }
        }
    }

    private void ReadInput()
    {
        Move(new MovementRequest() { Id = Id });
        transform.position = currentCoordinates;

        if (Input.GetKey(KeyCode.A))
        {
            if (Input.GetKey(KeyCode.D))
            {
                MoveLeftAndRight();
                return;
            }

            MoveLeft();        
        }

        if (Input.GetKey(KeyCode.D))
        {
            if (Input.GetKey(KeyCode.A))
            {
                MoveLeftAndRight();
                return;
            }

            MoveRight();        
        }

        if (Input.GetKey(KeyCode.W))
        {
            if (Input.GetKey(KeyCode.S))
            {
                UpAndDownMove();          
                return;
            }

            MoveUp();         
        }

        if (Input.GetKey(KeyCode.S))
        {
            if (Input.GetKey(KeyCode.W))
            {
                UpAndDownMove();
                return;
            }

            MoveDown();        
        }
    }

    private void MoveDown()
    {
        Move(new MovementRequest() { Down = true, Id = Id });
        transform.position = currentCoordinates;
    }

    private void MoveUp()
    {
        Move(new MovementRequest() { Up = true, Id = Id });
        transform.position = currentCoordinates;
    }

    private void MoveRight()
    {
        Move(new MovementRequest() { Right = true, Id = Id });
        transform.position = currentCoordinates;
    }

    private void MoveLeft()
    {
        Move(new MovementRequest() { Left = true, Id = Id });
        transform.position = currentCoordinates;
    }

    private void UpAndDownMove()
    {
        Move(new MovementRequest() { Up = true, Down = true, Id = Id });
        transform.position = currentCoordinates;
    }

    private void MoveLeftAndRight()
    {
        Move(new MovementRequest() { Left = true, Right = true, Id = Id });
        transform.position = currentCoordinates;
    }

    private void DestroyCoin()
    {
        int x = Convert.ToInt32(currentCoordinates.x);
        int y = Convert.ToInt32(currentCoordinates.y);

        if (coinCoordinatesDictionary.ContainsKey((x, y)))
        {
            Destroy(coinCoordinatesDictionary[(x, y)]);
        }
    }

    private async void Move(MovementRequest movement)
    {
        using (var call = playerServiceClient.movePlayer())
        {
            var response = Task.Run(async () =>
            {
                while (await call.ResponseStream.MoveNext())
                {
                    var current = call.ResponseStream.Current;
                    currentCoordinates = new Vector3(current.CoordinateX, current.CoordinateY, 0f);
                }
            });

            var request = call.RequestStream;
            await request.WriteAsync(movement);

            await call.RequestStream.CompleteAsync();
            await response;
        }
    }

    private async Task Escape()
    {
        if (Input.GetKeyDown(KeyCode.Escape))
        {
            await channel.ShutdownAsync();
            Application.Quit();
        }   
    }
}