package alluxio.grpc;

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
 * <pre>
 **
 * This interface contains job master service endpoints for job service workers.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.27.0)",
    comments = "Source: grpc/job_master.proto")
public final class JobMasterWorkerServiceGrpc {

  private JobMasterWorkerServiceGrpc() {}

  public static final String SERVICE_NAME = "alluxio.grpc.job.JobMasterWorkerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.JobHeartbeatPRequest,
      alluxio.grpc.JobHeartbeatPResponse> getHeartbeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Heartbeat",
      requestType = alluxio.grpc.JobHeartbeatPRequest.class,
      responseType = alluxio.grpc.JobHeartbeatPResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alluxio.grpc.JobHeartbeatPRequest,
      alluxio.grpc.JobHeartbeatPResponse> getHeartbeatMethod() {
    io.grpc.MethodDescriptor<alluxio.grpc.JobHeartbeatPRequest, alluxio.grpc.JobHeartbeatPResponse> getHeartbeatMethod;
    if ((getHeartbeatMethod = JobMasterWorkerServiceGrpc.getHeartbeatMethod) == null) {
      synchronized (JobMasterWorkerServiceGrpc.class) {
        if ((getHeartbeatMethod = JobMasterWorkerServiceGrpc.getHeartbeatMethod) == null) {
          JobMasterWorkerServiceGrpc.getHeartbeatMethod = getHeartbeatMethod =
              io.grpc.MethodDescriptor.<alluxio.grpc.JobHeartbeatPRequest, alluxio.grpc.JobHeartbeatPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Heartbeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.JobHeartbeatPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.JobHeartbeatPResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobMasterWorkerServiceMethodDescriptorSupplier("Heartbeat"))
              .build();
        }
      }
    }
    return getHeartbeatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.RegisterJobWorkerPRequest,
      alluxio.grpc.RegisterJobWorkerPResponse> getRegisterJobWorkerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterJobWorker",
      requestType = alluxio.grpc.RegisterJobWorkerPRequest.class,
      responseType = alluxio.grpc.RegisterJobWorkerPResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alluxio.grpc.RegisterJobWorkerPRequest,
      alluxio.grpc.RegisterJobWorkerPResponse> getRegisterJobWorkerMethod() {
    io.grpc.MethodDescriptor<alluxio.grpc.RegisterJobWorkerPRequest, alluxio.grpc.RegisterJobWorkerPResponse> getRegisterJobWorkerMethod;
    if ((getRegisterJobWorkerMethod = JobMasterWorkerServiceGrpc.getRegisterJobWorkerMethod) == null) {
      synchronized (JobMasterWorkerServiceGrpc.class) {
        if ((getRegisterJobWorkerMethod = JobMasterWorkerServiceGrpc.getRegisterJobWorkerMethod) == null) {
          JobMasterWorkerServiceGrpc.getRegisterJobWorkerMethod = getRegisterJobWorkerMethod =
              io.grpc.MethodDescriptor.<alluxio.grpc.RegisterJobWorkerPRequest, alluxio.grpc.RegisterJobWorkerPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterJobWorker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.RegisterJobWorkerPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.RegisterJobWorkerPResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobMasterWorkerServiceMethodDescriptorSupplier("RegisterJobWorker"))
              .build();
        }
      }
    }
    return getRegisterJobWorkerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobMasterWorkerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobMasterWorkerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobMasterWorkerServiceStub>() {
        @java.lang.Override
        public JobMasterWorkerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobMasterWorkerServiceStub(channel, callOptions);
        }
      };
    return JobMasterWorkerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobMasterWorkerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobMasterWorkerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobMasterWorkerServiceBlockingStub>() {
        @java.lang.Override
        public JobMasterWorkerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobMasterWorkerServiceBlockingStub(channel, callOptions);
        }
      };
    return JobMasterWorkerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobMasterWorkerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobMasterWorkerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobMasterWorkerServiceFutureStub>() {
        @java.lang.Override
        public JobMasterWorkerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobMasterWorkerServiceFutureStub(channel, callOptions);
        }
      };
    return JobMasterWorkerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   * This interface contains job master service endpoints for job service workers.
   * </pre>
   */
  public static abstract class JobMasterWorkerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     **
     * Periodic worker heartbeat returns a list of commands for the worker to execute.
     * </pre>
     */
    public void heartbeat(alluxio.grpc.JobHeartbeatPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.JobHeartbeatPResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHeartbeatMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * Returns a worker id for the given network address.
     * </pre>
     */
    public void registerJobWorker(alluxio.grpc.RegisterJobWorkerPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.RegisterJobWorkerPResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterJobWorkerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHeartbeatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.JobHeartbeatPRequest,
                alluxio.grpc.JobHeartbeatPResponse>(
                  this, METHODID_HEARTBEAT)))
          .addMethod(
            getRegisterJobWorkerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.RegisterJobWorkerPRequest,
                alluxio.grpc.RegisterJobWorkerPResponse>(
                  this, METHODID_REGISTER_JOB_WORKER)))
          .build();
    }
  }

  /**
   * <pre>
   **
   * This interface contains job master service endpoints for job service workers.
   * </pre>
   */
  public static final class JobMasterWorkerServiceStub extends io.grpc.stub.AbstractAsyncStub<JobMasterWorkerServiceStub> {
    private JobMasterWorkerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobMasterWorkerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobMasterWorkerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * Periodic worker heartbeat returns a list of commands for the worker to execute.
     * </pre>
     */
    public void heartbeat(alluxio.grpc.JobHeartbeatPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.JobHeartbeatPResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Returns a worker id for the given network address.
     * </pre>
     */
    public void registerJobWorker(alluxio.grpc.RegisterJobWorkerPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.RegisterJobWorkerPResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterJobWorkerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   **
   * This interface contains job master service endpoints for job service workers.
   * </pre>
   */
  public static final class JobMasterWorkerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<JobMasterWorkerServiceBlockingStub> {
    private JobMasterWorkerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobMasterWorkerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobMasterWorkerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * Periodic worker heartbeat returns a list of commands for the worker to execute.
     * </pre>
     */
    public alluxio.grpc.JobHeartbeatPResponse heartbeat(alluxio.grpc.JobHeartbeatPRequest request) {
      return blockingUnaryCall(
          getChannel(), getHeartbeatMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Returns a worker id for the given network address.
     * </pre>
     */
    public alluxio.grpc.RegisterJobWorkerPResponse registerJobWorker(alluxio.grpc.RegisterJobWorkerPRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterJobWorkerMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   **
   * This interface contains job master service endpoints for job service workers.
   * </pre>
   */
  public static final class JobMasterWorkerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<JobMasterWorkerServiceFutureStub> {
    private JobMasterWorkerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobMasterWorkerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobMasterWorkerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * Periodic worker heartbeat returns a list of commands for the worker to execute.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.JobHeartbeatPResponse> heartbeat(
        alluxio.grpc.JobHeartbeatPRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Returns a worker id for the given network address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.RegisterJobWorkerPResponse> registerJobWorker(
        alluxio.grpc.RegisterJobWorkerPRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterJobWorkerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HEARTBEAT = 0;
  private static final int METHODID_REGISTER_JOB_WORKER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobMasterWorkerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobMasterWorkerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HEARTBEAT:
          serviceImpl.heartbeat((alluxio.grpc.JobHeartbeatPRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.JobHeartbeatPResponse>) responseObserver);
          break;
        case METHODID_REGISTER_JOB_WORKER:
          serviceImpl.registerJobWorker((alluxio.grpc.RegisterJobWorkerPRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.RegisterJobWorkerPResponse>) responseObserver);
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

  private static abstract class JobMasterWorkerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobMasterWorkerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return alluxio.grpc.JobMasterProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JobMasterWorkerService");
    }
  }

  private static final class JobMasterWorkerServiceFileDescriptorSupplier
      extends JobMasterWorkerServiceBaseDescriptorSupplier {
    JobMasterWorkerServiceFileDescriptorSupplier() {}
  }

  private static final class JobMasterWorkerServiceMethodDescriptorSupplier
      extends JobMasterWorkerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobMasterWorkerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (JobMasterWorkerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobMasterWorkerServiceFileDescriptorSupplier())
              .addMethod(getHeartbeatMethod())
              .addMethod(getRegisterJobWorkerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
