// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: PlayerService.proto
// </auto-generated>
#pragma warning disable 0414, 1591
#region Designer generated code

using grpc = global::Grpc.Core;

namespace Proto {
  public static partial class PlayerService
  {
    static readonly string __ServiceName = "proto.PlayerService";

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static void __Helper_SerializeMessage(global::Google.Protobuf.IMessage message, grpc::SerializationContext context)
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (message is global::Google.Protobuf.IBufferMessage)
      {
        context.SetPayloadLength(message.CalculateSize());
        global::Google.Protobuf.MessageExtensions.WriteTo(message, context.GetBufferWriter());
        context.Complete();
        return;
      }
      #endif
      context.Complete(global::Google.Protobuf.MessageExtensions.ToByteArray(message));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static class __Helper_MessageCache<T>
    {
      public static readonly bool IsBufferMessage = global::System.Reflection.IntrospectionExtensions.GetTypeInfo(typeof(global::Google.Protobuf.IBufferMessage)).IsAssignableFrom(typeof(T));
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static T __Helper_DeserializeMessage<T>(grpc::DeserializationContext context, global::Google.Protobuf.MessageParser<T> parser) where T : global::Google.Protobuf.IMessage<T>
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (__Helper_MessageCache<T>.IsBufferMessage)
      {
        return parser.ParseFrom(context.PayloadAsReadOnlySequence());
      }
      #endif
      return parser.ParseFrom(context.PayloadAsNewBuffer());
    }

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Google.Protobuf.WellKnownTypes.Empty> __Marshaller_google_protobuf_Empty = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Google.Protobuf.WellKnownTypes.Empty.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Proto.ConnectResponse> __Marshaller_proto_ConnectResponse = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Proto.ConnectResponse.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Proto.SpawnPlayerResponse> __Marshaller_proto_SpawnPlayerResponse = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Proto.SpawnPlayerResponse.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Proto.MovementRequest> __Marshaller_proto_MovementRequest = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Proto.MovementRequest.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Proto.MovementResponse> __Marshaller_proto_MovementResponse = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Proto.MovementResponse.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Proto.MoveOtherPlayerOnMapRequest> __Marshaller_proto_MoveOtherPlayerOnMapRequest = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Proto.MoveOtherPlayerOnMapRequest.Parser));
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Marshaller<global::Proto.CurrentCoordinatesOtherPlayersResponse> __Marshaller_proto_CurrentCoordinatesOtherPlayersResponse = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::Proto.CurrentCoordinatesOtherPlayersResponse.Parser));

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Google.Protobuf.WellKnownTypes.Empty, global::Proto.ConnectResponse> __Method_assignIdToClient = new grpc::Method<global::Google.Protobuf.WellKnownTypes.Empty, global::Proto.ConnectResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "assignIdToClient",
        __Marshaller_google_protobuf_Empty,
        __Marshaller_proto_ConnectResponse);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Google.Protobuf.WellKnownTypes.Empty, global::Proto.SpawnPlayerResponse> __Method_spawnPlayer = new grpc::Method<global::Google.Protobuf.WellKnownTypes.Empty, global::Proto.SpawnPlayerResponse>(
        grpc::MethodType.Unary,
        __ServiceName,
        "spawnPlayer",
        __Marshaller_google_protobuf_Empty,
        __Marshaller_proto_SpawnPlayerResponse);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Proto.MovementRequest, global::Proto.MovementResponse> __Method_movePlayer = new grpc::Method<global::Proto.MovementRequest, global::Proto.MovementResponse>(
        grpc::MethodType.DuplexStreaming,
        __ServiceName,
        "movePlayer",
        __Marshaller_proto_MovementRequest,
        __Marshaller_proto_MovementResponse);

    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    static readonly grpc::Method<global::Proto.MoveOtherPlayerOnMapRequest, global::Proto.CurrentCoordinatesOtherPlayersResponse> __Method_moveOtherPlayersOnSenderMap = new grpc::Method<global::Proto.MoveOtherPlayerOnMapRequest, global::Proto.CurrentCoordinatesOtherPlayersResponse>(
        grpc::MethodType.DuplexStreaming,
        __ServiceName,
        "moveOtherPlayersOnSenderMap",
        __Marshaller_proto_MoveOtherPlayerOnMapRequest,
        __Marshaller_proto_CurrentCoordinatesOtherPlayersResponse);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::Proto.PlayerServiceReflection.Descriptor.Services[0]; }
    }

    /// <summary>Base class for server-side implementations of PlayerService</summary>
    [grpc::BindServiceMethod(typeof(PlayerService), "BindService")]
    public abstract partial class PlayerServiceBase
    {
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::Proto.ConnectResponse> assignIdToClient(global::Google.Protobuf.WellKnownTypes.Empty request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task<global::Proto.SpawnPlayerResponse> spawnPlayer(global::Google.Protobuf.WellKnownTypes.Empty request, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task movePlayer(grpc::IAsyncStreamReader<global::Proto.MovementRequest> requestStream, grpc::IServerStreamWriter<global::Proto.MovementResponse> responseStream, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::System.Threading.Tasks.Task moveOtherPlayersOnSenderMap(grpc::IAsyncStreamReader<global::Proto.MoveOtherPlayerOnMapRequest> requestStream, grpc::IServerStreamWriter<global::Proto.CurrentCoordinatesOtherPlayersResponse> responseStream, grpc::ServerCallContext context)
      {
        throw new grpc::RpcException(new grpc::Status(grpc::StatusCode.Unimplemented, ""));
      }

    }

    /// <summary>Client for PlayerService</summary>
    public partial class PlayerServiceClient : grpc::ClientBase<PlayerServiceClient>
    {
      /// <summary>Creates a new client for PlayerService</summary>
      /// <param name="channel">The channel to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public PlayerServiceClient(grpc::ChannelBase channel) : base(channel)
      {
      }
      /// <summary>Creates a new client for PlayerService that uses a custom <c>CallInvoker</c>.</summary>
      /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public PlayerServiceClient(grpc::CallInvoker callInvoker) : base(callInvoker)
      {
      }
      /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected PlayerServiceClient() : base()
      {
      }
      /// <summary>Protected constructor to allow creation of configured clients.</summary>
      /// <param name="configuration">The client configuration.</param>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected PlayerServiceClient(ClientBaseConfiguration configuration) : base(configuration)
      {
      }

      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Proto.ConnectResponse assignIdToClient(global::Google.Protobuf.WellKnownTypes.Empty request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return assignIdToClient(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Proto.ConnectResponse assignIdToClient(global::Google.Protobuf.WellKnownTypes.Empty request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_assignIdToClient, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Proto.ConnectResponse> assignIdToClientAsync(global::Google.Protobuf.WellKnownTypes.Empty request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return assignIdToClientAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Proto.ConnectResponse> assignIdToClientAsync(global::Google.Protobuf.WellKnownTypes.Empty request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_assignIdToClient, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Proto.SpawnPlayerResponse spawnPlayer(global::Google.Protobuf.WellKnownTypes.Empty request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return spawnPlayer(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual global::Proto.SpawnPlayerResponse spawnPlayer(global::Google.Protobuf.WellKnownTypes.Empty request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_spawnPlayer, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Proto.SpawnPlayerResponse> spawnPlayerAsync(global::Google.Protobuf.WellKnownTypes.Empty request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return spawnPlayerAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncUnaryCall<global::Proto.SpawnPlayerResponse> spawnPlayerAsync(global::Google.Protobuf.WellKnownTypes.Empty request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_spawnPlayer, null, options, request);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncDuplexStreamingCall<global::Proto.MovementRequest, global::Proto.MovementResponse> movePlayer(grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return movePlayer(new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncDuplexStreamingCall<global::Proto.MovementRequest, global::Proto.MovementResponse> movePlayer(grpc::CallOptions options)
      {
        return CallInvoker.AsyncDuplexStreamingCall(__Method_movePlayer, null, options);
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncDuplexStreamingCall<global::Proto.MoveOtherPlayerOnMapRequest, global::Proto.CurrentCoordinatesOtherPlayersResponse> moveOtherPlayersOnSenderMap(grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return moveOtherPlayersOnSenderMap(new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      public virtual grpc::AsyncDuplexStreamingCall<global::Proto.MoveOtherPlayerOnMapRequest, global::Proto.CurrentCoordinatesOtherPlayersResponse> moveOtherPlayersOnSenderMap(grpc::CallOptions options)
      {
        return CallInvoker.AsyncDuplexStreamingCall(__Method_moveOtherPlayersOnSenderMap, null, options);
      }
      /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
      [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
      protected override PlayerServiceClient NewInstance(ClientBaseConfiguration configuration)
      {
        return new PlayerServiceClient(configuration);
      }
    }

    /// <summary>Creates service definition that can be registered with a server</summary>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public static grpc::ServerServiceDefinition BindService(PlayerServiceBase serviceImpl)
    {
      return grpc::ServerServiceDefinition.CreateBuilder()
          .AddMethod(__Method_assignIdToClient, serviceImpl.assignIdToClient)
          .AddMethod(__Method_spawnPlayer, serviceImpl.spawnPlayer)
          .AddMethod(__Method_movePlayer, serviceImpl.movePlayer)
          .AddMethod(__Method_moveOtherPlayersOnSenderMap, serviceImpl.moveOtherPlayersOnSenderMap).Build();
    }

    /// <summary>Register service method with a service binder with or without implementation. Useful when customizing the  service binding logic.
    /// Note: this method is part of an experimental API that can change or be removed without any prior notice.</summary>
    /// <param name="serviceBinder">Service methods will be bound by calling <c>AddMethod</c> on this object.</param>
    /// <param name="serviceImpl">An object implementing the server-side handling logic.</param>
    [global::System.CodeDom.Compiler.GeneratedCode("grpc_csharp_plugin", null)]
    public static void BindService(grpc::ServiceBinderBase serviceBinder, PlayerServiceBase serviceImpl)
    {
      serviceBinder.AddMethod(__Method_assignIdToClient, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Google.Protobuf.WellKnownTypes.Empty, global::Proto.ConnectResponse>(serviceImpl.assignIdToClient));
      serviceBinder.AddMethod(__Method_spawnPlayer, serviceImpl == null ? null : new grpc::UnaryServerMethod<global::Google.Protobuf.WellKnownTypes.Empty, global::Proto.SpawnPlayerResponse>(serviceImpl.spawnPlayer));
      serviceBinder.AddMethod(__Method_movePlayer, serviceImpl == null ? null : new grpc::DuplexStreamingServerMethod<global::Proto.MovementRequest, global::Proto.MovementResponse>(serviceImpl.movePlayer));
      serviceBinder.AddMethod(__Method_moveOtherPlayersOnSenderMap, serviceImpl == null ? null : new grpc::DuplexStreamingServerMethod<global::Proto.MoveOtherPlayerOnMapRequest, global::Proto.CurrentCoordinatesOtherPlayersResponse>(serviceImpl.moveOtherPlayersOnSenderMap));
    }

  }
}
#endregion
