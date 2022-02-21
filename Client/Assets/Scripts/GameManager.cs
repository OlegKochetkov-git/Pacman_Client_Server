using Grpc.Core;
using Proto;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Threading.Tasks;
using UnityEngine;

namespace Assets.Scripts
{
    public class GameManager : MonoBehaviour
    {
        [SerializeField] GameObject obstacle;
        [SerializeField] GameObject coin;
        [SerializeField] GameObject player;

        private Channel channel;
        private InitializeMapService.InitializeMapServiceClient initializeMapServiceClient;
        private PlayerService.PlayerServiceClient playerServiceClient;

        public const string server = "localhost:8080";

        public Dictionary<(int, int), GameObject> CoinCoordinatesDictionary { get; private set; }

        private int widthMap;
        private int heightMap;

        void Start()
        {
            Screen.SetResolution(640, 480, false);

            channel = new Channel(server, ChannelCredentials.Insecure);
            initializeMapServiceClient = new InitializeMapService.InitializeMapServiceClient(channel);
            playerServiceClient = new PlayerService.PlayerServiceClient(channel);

            CoinCoordinatesDictionary = new Dictionary<(int, int), GameObject>();

            SetMapSize();
            SetCamera();
            GenerateMap();
            
            SpawnPlayer();
            channel.ShutdownAsync();
        }

        private void SetMapSize()
        {
            var sizeMap = initializeMapServiceClient.getMapSize(new Google.Protobuf.WellKnownTypes.Empty());
            widthMap = sizeMap.Width;
            heightMap = sizeMap.Height;

            //Debug.Log($"Map size:  X = {widthMap}  Y = {heightMap}");
        }

        private void SetCamera()
        {
            Camera.main.transform.position = new Vector3((float)widthMap / 2 - 0.5f, (float)heightMap / 2 - 0.5f, -10f);
            Camera.main.orthographicSize = heightMap / 2f;
        }

        private void GenerateMap()
        {
            var generatedMap = initializeMapServiceClient.generateMap(new Google.Protobuf.WellKnownTypes.Empty());

            foreach (var cellCoordinate in generatedMap.Coordinates)
            {
                if (cellCoordinate.IsObstacle)
                {
                    Instantiate(obstacle, new Vector3(cellCoordinate.X, cellCoordinate.Y, 0f), Quaternion.identity);
                }
                else
                {
                    GameObject obj = Instantiate(coin, new Vector3(cellCoordinate.X, cellCoordinate.Y, 0f), Quaternion.identity);
                    CoinCoordinatesDictionary[(cellCoordinate.X, cellCoordinate.Y)] = obj;
                }
            }
        }

        private void SpawnPlayer()
        {
            var idResponse = playerServiceClient.assignIdToClient(new Google.Protobuf.WellKnownTypes.Empty());
            var playerCoortinates = playerServiceClient.spawnPlayer(new Google.Protobuf.WellKnownTypes.Empty());
            GameObject playerGO = Instantiate(player, new Vector3(playerCoortinates.CoordinateX, playerCoortinates.CoordinateY, 0f), Quaternion.identity);
            playerGO.GetComponent<Player>().Id = idResponse.Id;

            //Debug.Log($"Spawn player:  X = {playerCoortinates.CoordinateX}  Y = {playerCoortinates.CoordinateY}");
        }  
    }
}