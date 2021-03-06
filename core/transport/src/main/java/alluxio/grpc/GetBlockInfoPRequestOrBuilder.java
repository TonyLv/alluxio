// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/block_master.proto

package alluxio.grpc;

public interface GetBlockInfoPRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.block.GetBlockInfoPRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   ** the id of the block 
   * </pre>
   *
   * <code>optional int64 blockId = 1;</code>
   * @return Whether the blockId field is set.
   */
  boolean hasBlockId();
  /**
   * <pre>
   ** the id of the block 
   * </pre>
   *
   * <code>optional int64 blockId = 1;</code>
   * @return The blockId.
   */
  long getBlockId();

  /**
   * <code>optional .alluxio.grpc.block.GetBlockInfoPOptions options = 2;</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <code>optional .alluxio.grpc.block.GetBlockInfoPOptions options = 2;</code>
   * @return The options.
   */
  alluxio.grpc.GetBlockInfoPOptions getOptions();
  /**
   * <code>optional .alluxio.grpc.block.GetBlockInfoPOptions options = 2;</code>
   */
  alluxio.grpc.GetBlockInfoPOptionsOrBuilder getOptionsOrBuilder();
}
