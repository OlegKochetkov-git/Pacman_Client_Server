package services;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import main.App;
import map.MapHandler;
import proto.InitializeMapServiceGrpc;
import proto.InitializeMapServiceOuterClass;
import unity.Coin;
import unity.Obstacle;
import java.util.Map;

public class InitializeMapService extends InitializeMapServiceGrpc.InitializeMapServiceImplBase {
    private Map<Obstacle, String> obstacleStringMap = null;
    private Map<Coin, String> coinStringMap = null;

    @Override
    public void getMapSize(Empty request, StreamObserver<InitializeMapServiceOuterClass.GetMapSizeResponse> responseObserver) {
        MapHandler mapHandler = App.mapHandler;
        obstacleStringMap = mapHandler.getObstacleStringMap();
        coinStringMap = mapHandler.getCoinStringMap();

        responseObserver.onNext(InitializeMapServiceOuterClass.GetMapSizeResponse.newBuilder()
                .setWidth(mapHandler.getWidthMap()).setHeight(mapHandler.getHeightMap()).build());

        responseObserver.onCompleted();
    }

    @Override
    public void generateMap(Empty request, StreamObserver<InitializeMapServiceOuterClass.GetMapGenerateResponse> responseObserver) {
        InitializeMapServiceOuterClass.GetMapGenerateResponse.Builder builder = InitializeMapServiceOuterClass.GetMapGenerateResponse.newBuilder();

        for (Map.Entry<Obstacle, String> entry : obstacleStringMap.entrySet()) {
            builder.addCoordinatesBuilder()
                    .setX((int)entry.getKey().gameObjectPosition.x)
                    .setY((int)entry.getKey().gameObjectPosition.y)
                    .setIsObstacle(true)
                    .build();
        }

        for (Map.Entry<Coin, String> entry : coinStringMap.entrySet()) {
            builder.addCoordinatesBuilder()
                    .setX((int)entry.getKey().gameObjectPosition.x)
                    .setY((int)entry.getKey().gameObjectPosition.y)
                    .setIsObstacle(false)
                    .build();
        }

        InitializeMapServiceOuterClass.GetMapGenerateResponse generatedMap = builder.build();

        responseObserver.onNext(generatedMap);
        responseObserver.onCompleted();
    }
}