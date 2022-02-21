package main;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import map.MapHandler;
import services.InitializeMapService;
import services.PlayerService;

import java.io.*;
import java.util.List;

public class App {

    public static MapHandler mapHandler;

    public static void main( String[] args ) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(8080)
                .addService(new InitializeMapService())
                .addService(new PlayerService())
                .build();

        server.start();

        mapHandler = new MapHandler("C:\\Users\\Oleg\\Desktop\\Example\\pacman_field.txt");

        System.out.println("Server Started");

        server.awaitTermination();
    }
}