// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/journal_master.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.journal.QuorumServerInfo}
 */
public  final class QuorumServerInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.journal.QuorumServerInfo)
    QuorumServerInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuorumServerInfo.newBuilder() to construct.
  private QuorumServerInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuorumServerInfo() {
    serverState_ = 1;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QuorumServerInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QuorumServerInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            alluxio.grpc.NetAddress.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = serverAddress_.toBuilder();
            }
            serverAddress_ = input.readMessage(alluxio.grpc.NetAddress.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(serverAddress_);
              serverAddress_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            alluxio.grpc.QuorumServerState value = alluxio.grpc.QuorumServerState.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(2, rawValue);
            } else {
              bitField0_ |= 0x00000002;
              serverState_ = rawValue;
            }
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.JournalMasterProto.internal_static_alluxio_grpc_journal_QuorumServerInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.JournalMasterProto.internal_static_alluxio_grpc_journal_QuorumServerInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.QuorumServerInfo.class, alluxio.grpc.QuorumServerInfo.Builder.class);
  }

  private int bitField0_;
  public static final int SERVERADDRESS_FIELD_NUMBER = 1;
  private alluxio.grpc.NetAddress serverAddress_;
  /**
   * <code>optional .alluxio.grpc.NetAddress serverAddress = 1;</code>
   * @return Whether the serverAddress field is set.
   */
  public boolean hasServerAddress() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .alluxio.grpc.NetAddress serverAddress = 1;</code>
   * @return The serverAddress.
   */
  public alluxio.grpc.NetAddress getServerAddress() {
    return serverAddress_ == null ? alluxio.grpc.NetAddress.getDefaultInstance() : serverAddress_;
  }
  /**
   * <code>optional .alluxio.grpc.NetAddress serverAddress = 1;</code>
   */
  public alluxio.grpc.NetAddressOrBuilder getServerAddressOrBuilder() {
    return serverAddress_ == null ? alluxio.grpc.NetAddress.getDefaultInstance() : serverAddress_;
  }

  public static final int SERVERSTATE_FIELD_NUMBER = 2;
  private int serverState_;
  /**
   * <code>optional .alluxio.grpc.journal.QuorumServerState serverState = 2;</code>
   * @return Whether the serverState field is set.
   */
  public boolean hasServerState() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .alluxio.grpc.journal.QuorumServerState serverState = 2;</code>
   * @return The serverState.
   */
  public alluxio.grpc.QuorumServerState getServerState() {
    @SuppressWarnings("deprecation")
    alluxio.grpc.QuorumServerState result = alluxio.grpc.QuorumServerState.valueOf(serverState_);
    return result == null ? alluxio.grpc.QuorumServerState.AVAILABLE : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getServerAddress());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, serverState_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getServerAddress());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, serverState_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof alluxio.grpc.QuorumServerInfo)) {
      return super.equals(obj);
    }
    alluxio.grpc.QuorumServerInfo other = (alluxio.grpc.QuorumServerInfo) obj;

    if (hasServerAddress() != other.hasServerAddress()) return false;
    if (hasServerAddress()) {
      if (!getServerAddress()
          .equals(other.getServerAddress())) return false;
    }
    if (hasServerState() != other.hasServerState()) return false;
    if (hasServerState()) {
      if (serverState_ != other.serverState_) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasServerAddress()) {
      hash = (37 * hash) + SERVERADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getServerAddress().hashCode();
    }
    if (hasServerState()) {
      hash = (37 * hash) + SERVERSTATE_FIELD_NUMBER;
      hash = (53 * hash) + serverState_;
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.QuorumServerInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.QuorumServerInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.QuorumServerInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.QuorumServerInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.QuorumServerInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.QuorumServerInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.QuorumServerInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.QuorumServerInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.QuorumServerInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.QuorumServerInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.QuorumServerInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.QuorumServerInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(alluxio.grpc.QuorumServerInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code alluxio.grpc.journal.QuorumServerInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.journal.QuorumServerInfo)
      alluxio.grpc.QuorumServerInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.JournalMasterProto.internal_static_alluxio_grpc_journal_QuorumServerInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.JournalMasterProto.internal_static_alluxio_grpc_journal_QuorumServerInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.QuorumServerInfo.class, alluxio.grpc.QuorumServerInfo.Builder.class);
    }

    // Construct using alluxio.grpc.QuorumServerInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getServerAddressFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (serverAddressBuilder_ == null) {
        serverAddress_ = null;
      } else {
        serverAddressBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      serverState_ = 1;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.JournalMasterProto.internal_static_alluxio_grpc_journal_QuorumServerInfo_descriptor;
    }

    @java.lang.Override
    public alluxio.grpc.QuorumServerInfo getDefaultInstanceForType() {
      return alluxio.grpc.QuorumServerInfo.getDefaultInstance();
    }

    @java.lang.Override
    public alluxio.grpc.QuorumServerInfo build() {
      alluxio.grpc.QuorumServerInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public alluxio.grpc.QuorumServerInfo buildPartial() {
      alluxio.grpc.QuorumServerInfo result = new alluxio.grpc.QuorumServerInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (serverAddressBuilder_ == null) {
          result.serverAddress_ = serverAddress_;
        } else {
          result.serverAddress_ = serverAddressBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.serverState_ = serverState_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof alluxio.grpc.QuorumServerInfo) {
        return mergeFrom((alluxio.grpc.QuorumServerInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.QuorumServerInfo other) {
      if (other == alluxio.grpc.QuorumServerInfo.getDefaultInstance()) return this;
      if (other.hasServerAddress()) {
        mergeServerAddress(other.getServerAddress());
      }
      if (other.hasServerState()) {
        setServerState(other.getServerState());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      alluxio.grpc.QuorumServerInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.QuorumServerInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private alluxio.grpc.NetAddress serverAddress_;
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.NetAddress, alluxio.grpc.NetAddress.Builder, alluxio.grpc.NetAddressOrBuilder> serverAddressBuilder_;
    /**
     * <code>optional .alluxio.grpc.NetAddress serverAddress = 1;</code>
     * @return Whether the serverAddress field is set.
     */
    public boolean hasServerAddress() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .alluxio.grpc.NetAddress serverAddress = 1;</code>
     * @return The serverAddress.
     */
    public alluxio.grpc.NetAddress getServerAddress() {
      if (serverAddressBuilder_ == null) {
        return serverAddress_ == null ? alluxio.grpc.NetAddress.getDefaultInstance() : serverAddress_;
      } else {
        return serverAddressBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .alluxio.grpc.NetAddress serverAddress = 1;</code>
     */
    public Builder setServerAddress(alluxio.grpc.NetAddress value) {
      if (serverAddressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serverAddress_ = value;
        onChanged();
      } else {
        serverAddressBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.NetAddress serverAddress = 1;</code>
     */
    public Builder setServerAddress(
        alluxio.grpc.NetAddress.Builder builderForValue) {
      if (serverAddressBuilder_ == null) {
        serverAddress_ = builderForValue.build();
        onChanged();
      } else {
        serverAddressBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.NetAddress serverAddress = 1;</code>
     */
    public Builder mergeServerAddress(alluxio.grpc.NetAddress value) {
      if (serverAddressBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            serverAddress_ != null &&
            serverAddress_ != alluxio.grpc.NetAddress.getDefaultInstance()) {
          serverAddress_ =
            alluxio.grpc.NetAddress.newBuilder(serverAddress_).mergeFrom(value).buildPartial();
        } else {
          serverAddress_ = value;
        }
        onChanged();
      } else {
        serverAddressBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.NetAddress serverAddress = 1;</code>
     */
    public Builder clearServerAddress() {
      if (serverAddressBuilder_ == null) {
        serverAddress_ = null;
        onChanged();
      } else {
        serverAddressBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.NetAddress serverAddress = 1;</code>
     */
    public alluxio.grpc.NetAddress.Builder getServerAddressBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getServerAddressFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .alluxio.grpc.NetAddress serverAddress = 1;</code>
     */
    public alluxio.grpc.NetAddressOrBuilder getServerAddressOrBuilder() {
      if (serverAddressBuilder_ != null) {
        return serverAddressBuilder_.getMessageOrBuilder();
      } else {
        return serverAddress_ == null ?
            alluxio.grpc.NetAddress.getDefaultInstance() : serverAddress_;
      }
    }
    /**
     * <code>optional .alluxio.grpc.NetAddress serverAddress = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.NetAddress, alluxio.grpc.NetAddress.Builder, alluxio.grpc.NetAddressOrBuilder> 
        getServerAddressFieldBuilder() {
      if (serverAddressBuilder_ == null) {
        serverAddressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            alluxio.grpc.NetAddress, alluxio.grpc.NetAddress.Builder, alluxio.grpc.NetAddressOrBuilder>(
                getServerAddress(),
                getParentForChildren(),
                isClean());
        serverAddress_ = null;
      }
      return serverAddressBuilder_;
    }

    private int serverState_ = 1;
    /**
     * <code>optional .alluxio.grpc.journal.QuorumServerState serverState = 2;</code>
     * @return Whether the serverState field is set.
     */
    public boolean hasServerState() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .alluxio.grpc.journal.QuorumServerState serverState = 2;</code>
     * @return The serverState.
     */
    public alluxio.grpc.QuorumServerState getServerState() {
      @SuppressWarnings("deprecation")
      alluxio.grpc.QuorumServerState result = alluxio.grpc.QuorumServerState.valueOf(serverState_);
      return result == null ? alluxio.grpc.QuorumServerState.AVAILABLE : result;
    }
    /**
     * <code>optional .alluxio.grpc.journal.QuorumServerState serverState = 2;</code>
     * @param value The serverState to set.
     * @return This builder for chaining.
     */
    public Builder setServerState(alluxio.grpc.QuorumServerState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      serverState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.journal.QuorumServerState serverState = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearServerState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      serverState_ = 1;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.journal.QuorumServerInfo)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.journal.QuorumServerInfo)
  private static final alluxio.grpc.QuorumServerInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.QuorumServerInfo();
  }

  public static alluxio.grpc.QuorumServerInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<QuorumServerInfo>
      PARSER = new com.google.protobuf.AbstractParser<QuorumServerInfo>() {
    @java.lang.Override
    public QuorumServerInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QuorumServerInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QuorumServerInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuorumServerInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public alluxio.grpc.QuorumServerInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

