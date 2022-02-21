package services;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import unity.Player;
import proto.PlayerServiceGrpc;
import proto.PlayerServiceOuterClass;

import java.util.ArrayList;
import java.util.List;

public class PlayerService extends PlayerServiceGrpc.PlayerServiceImplBase {
    List<Player> players = new ArrayList<>();
    int id = 1;
    int spawnPointX = 1;
    int spawnPointY = 1;

    @Override
    public void assignIdToClient(Empty request, StreamObserver<PlayerServiceOuterClass.ConnectResponse> responseObserver) {
        players.add(new Player(spawnPointX, spawnPointY, id));

        responseObserver.onNext(PlayerServiceOuterClass.ConnectResponse.newBuilder()
                .setId(id).build());

        id++;
        responseObserver.onCompleted();
    }

    @Override
    public void spawnPlayer(Empty request, StreamObserver<PlayerServiceOuterClass.SpawnPlayerResponse> responseObserver) {
        responseObserver.onNext(PlayerServiceOuterClass.SpawnPlayerResponse.newBuilder()
                .setCoordinateX(spawnPointX).setCoordinateY(spawnPointY).build());

        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<PlayerServiceOuterClass.MovementRequest> movePlayer(StreamObserver<PlayerServiceOuterClass.MovementResponse> responseObserver) {
        return new StreamObserver<PlayerServiceOuterClass.MovementRequest>() {

            @Override
            public void onNext(PlayerServiceOuterClass.MovementRequest movementRequest) {
                for (Player player : players) {
                    if (movementRequest.getId() == player.getId()) {
                        player.move(movementRequest);

                        responseObserver.onNext(PlayerServiceOuterClass.MovementResponse.newBuilder()
                                .setCoordinateX(player.gameObjectPosition.x).setCoordinateY(player.gameObjectPosition.y).build());
                    }
                }
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<PlayerServiceOuterClass.MoveOtherPlayerOnMapRequest> moveOtherPlayersOnSenderMap(StreamObserver<PlayerServiceOuterClass.CurrentCoordinatesOtherPlayersResponse> responseObserver) {
        return new StreamObserver<PlayerServiceOuterClass.MoveOtherPlayerOnMapRequest>() {

            @Override
            public void onNext(PlayerServiceOuterClass.MoveOtherPlayerOnMapRequest connectNewPlayerRequest) {
                for (Player player : players) {
                    if (player.getId() != connectNewPlayerRequest.getId()) {
                        responseObserver.onNext(PlayerServiceOuterClass.CurrentCoordinatesOtherPlayersResponse.newBuilder()
                                .setCoordinateX((int) player.getMovePoint().x)
                                .setCoordinateY((int) player.getMovePoint().y)
                                .setId(player.getId())
                                .build());
                    }
                }
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
