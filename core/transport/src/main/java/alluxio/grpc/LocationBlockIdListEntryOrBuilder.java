// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/block_master.proto

package alluxio.grpc;

public interface LocationBlockIdListEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.block.LocationBlockIdListEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .alluxio.grpc.BlockStoreLocationProto key = 1;</code>
   * @return Whether the key field is set.
   */
  boolean hasKey();
  /**
   * <code>optional .alluxio.grpc.BlockStoreLocationProto key = 1;</code>
   * @return The key.
   */
  alluxio.grpc.BlockStoreLocationProto getKey();
  /**
   * <code>optional .alluxio.grpc.BlockStoreLocationProto key = 1;</code>
   */
  alluxio.grpc.BlockStoreLocationProtoOrBuilder getKeyOrBuilder();

  /**
   * <code>optional .alluxio.grpc.block.BlockIdList value = 2;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>optional .alluxio.grpc.block.BlockIdList value = 2;</code>
   * @return The value.
   */
  alluxio.grpc.BlockIdList getValue();
  /**
   * <code>optional .alluxio.grpc.block.BlockIdList value = 2;</code>
   */
  alluxio.grpc.BlockIdListOrBuilder getValueOrBuilder();
}
