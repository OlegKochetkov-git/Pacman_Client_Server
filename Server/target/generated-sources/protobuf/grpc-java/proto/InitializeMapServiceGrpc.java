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
    comments = "Source: InitializeMapService.proto")
public final class InitializeMapServiceGrpc {

  private InitializeMapServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.InitializeMapService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      proto.InitializeMapServiceOuterClass.GetMapGenerateResponse> getGenerateMapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "generateMap",
      requestType = com.google.protobuf.Empty.class,
      responseType = proto.InitializeMapServiceOuterClass.GetMapGenerateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      proto.InitializeMapServiceOuterClass.GetMapGenerateResponse> getGenerateMapMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, proto.InitializeMapServiceOuterClass.GetMapGenerateResponse> getGenerateMapMethod;
    if ((getGenerateMapMethod = InitializeMapServiceGrpc.getGenerateMapMethod) == null) {
      synchronized (InitializeMapServiceGrpc.class) {
        if ((getGenerateMapMethod = InitializeMapServiceGrpc.getGenerateMapMethod) == null) {
          InitializeMapServiceGrpc.getGenerateMapMethod = getGenerateMapMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, proto.InitializeMapServiceOuterClass.GetMapGenerateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "generateMap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.InitializeMapServiceOuterClass.GetMapGenerateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InitializeMapServiceMethodDescriptorSupplier("generateMap"))
              .build();
        }
      }
    }
    return getGenerateMapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      proto.InitializeMapServiceOuterClass.GetMapSizeResponse> getGetMapSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMapSize",
      requestType = com.google.protobuf.Empty.class,
      responseType = proto.InitializeMapServiceOuterClass.GetMapSizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      proto.InitializeMapServiceOuterClass.GetMapSizeResponse> getGetMapSizeMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, proto.InitializeMapServiceOuterClass.GetMapSizeResponse> getGetMapSizeMethod;
    if ((getGetMapSizeMethod = InitializeMapServiceGrpc.getGetMapSizeMethod) == null) {
      synchronized (InitializeMapServiceGrpc.class) {
        if ((getGetMapSizeMethod = InitializeMapServiceGrpc.getGetMapSizeMethod) == null) {
          InitializeMapServiceGrpc.getGetMapSizeMethod = getGetMapSizeMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, proto.InitializeMapServiceOuterClass.GetMapSizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMapSize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.InitializeMapServiceOuterClass.GetMapSizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InitializeMapServiceMethodDescriptorSupplier("getMapSize"))
              .build();
        }
      }
    }
    return getGetMapSizeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InitializeMapServiceStub newStub(io.grpc.Channel channel) {
    return new InitializeMapServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InitializeMapServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InitializeMapServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InitializeMapServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InitializeMapServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class InitializeMapServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void generateMap(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.InitializeMapServiceOuterClass.GetMapGenerateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateMapMethod(), responseObserver);
    }

    /**
     */
    public void getMapSize(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.InitializeMapServiceOuterClass.GetMapSizeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMapSizeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateMapMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                proto.InitializeMapServiceOuterClass.GetMapGenerateResponse>(
                  this, METHODID_GENERATE_MAP)))
          .addMethod(
            getGetMapSizeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                proto.InitializeMapServiceOuterClass.GetMapSizeResponse>(
                  this, METHODID_GET_MAP_SIZE)))
          .build();
    }
  }

  /**
   */
  public static final class InitializeMapServiceStub extends io.grpc.stub.AbstractStub<InitializeMapServiceStub> {
    private InitializeMapServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InitializeMapServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InitializeMapServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InitializeMapServiceStub(channel, callOptions);
    }

    /**
     */
    public void generateMap(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.InitializeMapServiceOuterClass.GetMapGenerateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateMapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMapSize(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<proto.InitializeMapServiceOuterClass.GetMapSizeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMapSizeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InitializeMapServiceBlockingStub extends io.grpc.stub.AbstractStub<InitializeMapServiceBlockingStub> {
    private InitializeMapServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InitializeMapServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InitializeMapServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InitializeMapServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.InitializeMapServiceOuterClass.GetMapGenerateResponse generateMap(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGenerateMapMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.InitializeMapServiceOuterClass.GetMapSizeResponse getMapSize(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetMapSizeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InitializeMapServiceFutureStub extends io.grpc.stub.AbstractStub<InitializeMapServiceFutureStub> {
    private InitializeMapServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InitializeMapServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InitializeMapServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InitializeMapServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.InitializeMapServiceOuterClass.GetMapGenerateResponse> generateMap(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateMapMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.InitializeMapServiceOuterClass.GetMapSizeResponse> getMapSize(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMapSizeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_MAP = 0;
  private static final int METHODID_GET_MAP_SIZE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InitializeMapServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InitializeMapServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE_MAP:
          serviceImpl.generateMap((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<proto.InitializeMapServiceOuterClass.GetMapGenerateResponse>) responseObserver);
          break;
        case METHODID_GET_MAP_SIZE:
          serviceImpl.getMapSize((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<proto.InitializeMapServiceOuterClass.GetMapSizeResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class InitializeMapServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InitializeMapServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.InitializeMapServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InitializeMapService");
    }
  }

  private static final class InitializeMapServiceFileDescriptorSupplier
      extends InitializeMapServiceBaseDescriptorSupplier {
    InitializeMapServiceFileDescriptorSupplier() {}
  }

  private static final class InitializeMapServiceMethodDescriptorSupplier
      extends InitializeMapServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InitializeMapServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InitializeMapServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InitializeMapServiceFileDescriptorSupplier())
              .addMethod(getGenerateMapMethod())
              .addMethod(getGetMapSizeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
