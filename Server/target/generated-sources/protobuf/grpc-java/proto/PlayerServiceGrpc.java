package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: PlayerService.proto")
public final class PlayerServiceGrpc {

  private PlayerServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.PlayerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      proto.PlayerServiceOuterClass.ConnectResponse> getAssignIdToClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "assignIdToClient",
      requestType = com.google.protobuf.Empty.class,
      responseType = proto.PlayerServiceOuterClass.ConnectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      proto.PlayerServiceOuterClass.ConnectResponse> getAssignIdToClientMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, proto.PlayerServiceOuterClass.ConnectResponse> getAssignIdToClientMethod;
    if ((getAssignIdToClientMethod = PlayerServiceGrpc.getAssignIdToClientMethod) == null) {
      synchronized (PlayerServiceGrpc.class) {
        if ((getAssignIdToClientMethod = PlayerServiceGrpc.getAssignIdToClientMethod) == null) {
          PlayerServiceGrpc.getAssignIdToClientMethod = getAssignIdToClientMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, proto.PlayerServiceOuterClass.ConnectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "assignIdToClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PlayerServiceOuterClass.ConnectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerServiceMethodDescriptorSupplier("assignIdToClient"))
              .build();
        }
      }
    }
    return getAssignIdToClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      proto.PlayerServiceOuterClass.SpawnPlayerResponse> getSpawnPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "spawnPlayer",
      requestType = com.google.protobuf.Empty.class,
      responseType = proto.PlayerServiceOuterClass.SpawnPlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      proto.PlayerServiceOuterClass.SpawnPlayerResponse> getSpawnPlayerMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, proto.PlayerServiceOuterClass.SpawnPlayerResponse> getSpawnPlayerMethod;
    if ((getSpawnPlayerMethod = PlayerServiceGrpc.getSpawnPlayerMethod) == null) {
      synchronized (PlayerServiceGrpc.class) {
        if ((getSpawnPlayerMethod = PlayerServiceGrpc.getSpawnPlayerMethod) == null) {
          PlayerServiceGrpc.getSpawnPlayerMethod = getSpawnPlayerMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, proto.PlayerServiceOuterClass.SpawnPlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "spawnPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PlayerServiceOuterClass.SpawnPlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerServiceMethodDescriptorSupplier("spawnPlayer"))
              .build();
        }
      }
    }
    return getSpawnPlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.PlayerServiceOuterClass.MovementRequest,
      proto.PlayerServiceOuterClass.MovementResponse> getMovePlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "movePlayer",
      requestType = proto.PlayerServiceOuterClass.MovementRequest.class,
      responseType = proto.PlayerServiceOuterClass.MovementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<proto.PlayerServiceOuterClass.MovementRequest,
      proto.PlayerServiceOuterClass.MovementResponse> getMovePlayerMethod() {
    io.grpc.MethodDescriptor<proto.PlayerServiceOuterClass.MovementRequest, proto.PlayerServiceOuterClass.MovementResponse> getMovePlayerMethod;
    if ((getMovePlayerMethod = PlayerServiceGrpc.getMovePlayerMethod) == null) {
      synchronized (PlayerServiceGrpc.class) {
        if ((getMovePlayerMethod = PlayerServiceGrpc.getMovePlayerMethod) == null) {
          PlayerServiceGrpc.getMovePlayerMethod = getMovePlayerMethod =
              io.grpc.MethodDescriptor.<proto.PlayerServiceOuterClass.MovementRequest, proto.PlayerServiceOuterClass.MovementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "movePlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PlayerServiceOuterClass.MovementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PlayerServiceOuterClass.MovementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerServiceMethodDescriptorSupplier("movePlayer"))
              .build();
        }
      }
    }
    return getMovePlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.PlayerServiceOuterClass.MoveOtherPlayerOnMapRequest,
      proto.PlayerServiceOuterClass.CurrentCoordinatesOtherPlayersResponse> getMoveOtherPlayersOnSenderMapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "moveOtherPlayersOnSenderMap",
      requestType = proto.PlayerServiceOuterClass.MoveOtherPlayerOnMapRequest.class,
      responseType = proto.PlayerServiceOuterClass.CurrentCoordinatesOtherPlayersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<proto.PlayerServiceOuterClass.MoveOtherPlayerOnMapRequest,
      proto.PlayerServiceOuterClass.CurrentCoordinatesOtherPlayersResponse> getMoveOtherPlayersOnSenderMapMethod() {
    io.grpc.MethodDescriptor<proto.PlayerServiceOuterClass.MoveOtherPlayerOnMapRequest, proto.PlayerServiceOuterClass.CurrentCoordinatesOtherPlayersResponse> getMoveOtherPlayersOnSenderMapMethod;
    if ((getMoveOtherPlayersOnSenderMapMethod = PlayerServiceGrpc.getMoveOtherPlayersOnSenderMapMethod) == null) {
      synchronized (PlayerServiceGrpc.class) {
        if ((getMoveOtherPlayersOnSenderMapMethod = PlayerServiceGrpc.getMoveOtherPlayersOnSenderMapMethod) == null) {
          PlayerServiceGrpc.getMoveOtherPlayersOnSenderMapMethod = getMoveOtherPlayersOnSenderMapMethod =
              io.grpc.MethodDescriptor.<proto.PlayerServiceOuterClass.MoveOtherPlayerOnMapRequest, proto.PlayerServiceOuterClass.CurrentCoordinatesOtherPlayersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "moveOtherPlayersOnSenderMap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PlayerServiceOuterClass.MoveOtherPlayerOnMapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PlayerServiceOuterClass.CurrentCoordinatesOtherPlayersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlayerServiceMethodDescriptorSupplier("moveOtherPlayersOnSenderMap"))
              .build();
        }
      }
    }
    return getMoveOtherPlayersOnSenderMapMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PlayerServiceStub newStub(io.grpc.Channel channel) {
    return new PlayerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlayerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PlayerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlayerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PlayerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PlayerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void assignIdToClient(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.PlayerServiceOuterClass.ConnectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignIdToClientMethod(), responseObserver);
    }

    /**
     */
    public void spawnPlayer(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.PlayerServiceOuterClass.SpawnPlayerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSpawnPlayerMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<proto.PlayerServiceOuterClass.MovementRequest> movePlayer(
        io.grpc.stub.StreamObserver<proto.PlayerServiceOuterClass.MovementResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getMovePlayerMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<proto.PlayerServiceOuterClass.MoveOtherPlayerOnMapRequest> moveOtherPlayersOnSenderMap(
        io.grpc.stub.StreamObserver<proto.PlayerServiceOuterClass.CurrentCoordinatesOtherPlayersResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getMoveOtherPlayersOnSenderMapMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAssignIdToClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                proto.PlayerServiceOuterClass.ConnectResponse>(
                  this, METHODID_ASSIGN_ID_TO_CLIENT)))
          .addMethod(
            getSpawnPlayerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                proto.PlayerServiceOuterClass.SpawnPlayerResponse>(
                  this, METHODID_SPAWN_PLAYER)))
          .addMethod(
            getMovePlayerMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                proto.PlayerServiceOuterClass.MovementRequest,
                proto.PlayerServiceOuterClass.MovementResponse>(
                  this, METHODID_MOVE_PLAYER)))
          .addMethod(
            getMoveOtherPlayersOnSenderMapMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                proto.PlayerServiceOuterClass.MoveOtherPlayerOnMapRequest,
                proto.PlayerServiceOuterClass.CurrentCoordinatesOtherPlayersResponse>(
                  this, METHODID_MOVE_OTHER_PLAYERS_ON_SENDER_MAP)))
          .build();
    }
  }

  /**
   */
  public static final class PlayerServiceStub extends io.grpc.stub.AbstractStub<PlayerServiceStub> {
    private PlayerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PlayerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PlayerServiceStub(channel, callOptions);
    }

    /**
     */
    public void assignIdToClient(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.PlayerServiceOuterClass.ConnectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignIdToClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void spawnPlayer(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.PlayerServiceOuterClass.SpawnPlayerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSpawnPlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<proto.PlayerServiceOuterClass.MovementRequest> movePlayer(
        io.grpc.stub.StreamObserver<proto.PlayerServiceOuterClass.MovementResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMovePlayerMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<proto.PlayerServiceOuterClass.MoveOtherPlayerOnMapRequest> moveOtherPlayersOnSenderMap(
        io.grpc.stub.StreamObserver<proto.PlayerServiceOuterClass.CurrentCoordinatesOtherPlayersResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMoveOtherPlayersOnSenderMapMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class PlayerServiceBlockingStub extends io.grpc.stub.AbstractStub<PlayerServiceBlockingStub> {
    private PlayerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PlayerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PlayerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.PlayerServiceOuterClass.ConnectResponse assignIdToClient(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getAssignIdToClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.PlayerServiceOuterClass.SpawnPlayerResponse spawnPlayer(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSpawnPlayerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PlayerServiceFutureStub extends io.grpc.stub.AbstractStub<PlayerServiceFutureStub> {
    private PlayerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PlayerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlayerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PlayerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.PlayerServiceOuterClass.ConnectResponse> assignIdToClient(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignIdToClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.PlayerServiceOuterClass.SpawnPlayerResponse> spawnPlayer(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSpawnPlayerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ASSIGN_ID_TO_CLIENT = 0;
  private static final int METHODID_SPAWN_PLAYER = 1;
  private static final int METHODID_MOVE_PLAYER = 2;
  private static final int METHODID_MOVE_OTHER_PLAYERS_ON_SENDER_MAP = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PlayerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PlayerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ASSIGN_ID_TO_CLIENT:
          serviceImpl.assignIdToClient((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<proto.PlayerServiceOuterClass.ConnectResponse>) responseObserver);
          break;
        case METHODID_SPAWN_PLAYER:
          serviceImpl.spawnPlayer((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<proto.PlayerServiceOuterClass.SpawnPlayerResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MOVE_PLAYER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.movePlayer(
              (io.grpc.stub.StreamObserver<proto.PlayerServiceOuterClass.MovementResponse>) responseObserver);
        case METHODID_MOVE_OTHER_PLAYERS_ON_SENDER_MAP:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.moveOtherPlayersOnSenderMap(
              (io.grpc.stub.StreamObserver<proto.PlayerServiceOuterClass.CurrentCoordinatesOtherPlayersResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PlayerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PlayerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.PlayerServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PlayerService");
    }
  }

  private static final class PlayerServiceFileDescriptorSupplier
      extends PlayerServiceBaseDescriptorSupplier {
    PlayerServiceFileDescriptorSupplier() {}
  }

  private static final class PlayerServiceMethodDescriptorSupplier
      extends PlayerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PlayerServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PlayerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlayerServiceFileDescriptorSupplier())
              .addMethod(getAssignIdToClientMethod())
              .addMethod(getSpawnPlayerMethod())
              .addMethod(getMovePlayerMethod())
              .addMethod(getMoveOtherPlayersOnSenderMapMethod())
              .build();
        }
      }
    }
    return result;
  }
}
