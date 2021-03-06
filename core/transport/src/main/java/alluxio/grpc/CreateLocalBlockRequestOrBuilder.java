// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/block_worker.proto

package alluxio.grpc;

public interface CreateLocalBlockRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.block.CreateLocalBlockRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 block_id = 1;</code>
   * @return Whether the blockId field is set.
   */
  boolean hasBlockId();
  /**
   * <code>optional int64 block_id = 1;</code>
   * @return The blockId.
   */
  long getBlockId();

  /**
   * <code>optional int32 tier = 3;</code>
   * @return Whether the tier field is set.
   */
  boolean hasTier();
  /**
   * <code>optional int32 tier = 3;</code>
   * @return The tier.
   */
  int getTier();

  /**
   * <code>optional int64 space_to_reserve = 4;</code>
   * @return Whether the spaceToReserve field is set.
   */
  boolean hasSpaceToReserve();
  /**
   * <code>optional int64 space_to_reserve = 4;</code>
   * @return The spaceToReserve.
   */
  long getSpaceToReserve();

  /**
   * <pre>
   * If set, only reserve space for the block.
   * </pre>
   *
   * <code>optional bool only_reserve_space = 5;</code>
   * @return Whether the onlyReserveSpace field is set.
   */
  boolean hasOnlyReserveSpace();
  /**
   * <pre>
   * If set, only reserve space for the block.
   * </pre>
   *
   * <code>optional bool only_reserve_space = 5;</code>
   * @return The onlyReserveSpace.
   */
  boolean getOnlyReserveSpace();

  /**
   * <code>optional bool cleanup_on_failure = 6;</code>
   * @return Whether the cleanupOnFailure field is set.
   */
  boolean hasCleanupOnFailure();
  /**
   * <code>optional bool cleanup_on_failure = 6;</code>
   * @return The cleanupOnFailure.
   */
  boolean getCleanupOnFailure();

  /**
   * <code>optional string medium_type = 7;</code>
   * @return Whether the mediumType field is set.
   */
  boolean hasMediumType();
  /**
   * <code>optional string medium_type = 7;</code>
   * @return The mediumType.
   */
  java.lang.String getMediumType();
  /**
   * <code>optional string medium_type = 7;</code>
   * @return The bytes for mediumType.
   */
  com.google.protobuf.ByteString
      getMediumTypeBytes();

  /**
   * <code>optional bool pin_on_create = 8;</code>
   * @return Whether the pinOnCreate field is set.
   */
  boolean hasPinOnCreate();
  /**
   * <code>optional bool pin_on_create = 8;</code>
   * @return The pinOnCreate.
   */
  boolean getPinOnCreate();
}
