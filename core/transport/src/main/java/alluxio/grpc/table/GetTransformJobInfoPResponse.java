// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

/**
 * Protobuf type {@code alluxio.grpc.table.GetTransformJobInfoPResponse}
 */
public  final class GetTransformJobInfoPResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.table.GetTransformJobInfoPResponse)
    GetTransformJobInfoPResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTransformJobInfoPResponse.newBuilder() to construct.
  private GetTransformJobInfoPResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTransformJobInfoPResponse() {
    info_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetTransformJobInfoPResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetTransformJobInfoPResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              info_ = new java.util.ArrayList<alluxio.grpc.table.TransformJobInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            info_.add(
                input.readMessage(alluxio.grpc.table.TransformJobInfo.PARSER, extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        info_ = java.util.Collections.unmodifiableList(info_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetTransformJobInfoPResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetTransformJobInfoPResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.table.GetTransformJobInfoPResponse.class, alluxio.grpc.table.GetTransformJobInfoPResponse.Builder.class);
  }

  public static final int INFO_FIELD_NUMBER = 1;
  private java.util.List<alluxio.grpc.table.TransformJobInfo> info_;
  /**
   * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
   */
  public java.util.List<alluxio.grpc.table.TransformJobInfo> getInfoList() {
    return info_;
  }
  /**
   * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
   */
  public java.util.List<? extends alluxio.grpc.table.TransformJobInfoOrBuilder> 
      getInfoOrBuilderList() {
    return info_;
  }
  /**
   * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
   */
  public int getInfoCount() {
    return info_.size();
  }
  /**
   * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
   */
  public alluxio.grpc.table.TransformJobInfo getInfo(int index) {
    return info_.get(index);
  }
  /**
   * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
   */
  public alluxio.grpc.table.TransformJobInfoOrBuilder getInfoOrBuilder(
      int index) {
    return info_.get(index);
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
    for (int i = 0; i < info_.size(); i++) {
      output.writeMessage(1, info_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < info_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, info_.get(i));
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
    if (!(obj instanceof alluxio.grpc.table.GetTransformJobInfoPResponse)) {
      return super.equals(obj);
    }
    alluxio.grpc.table.GetTransformJobInfoPResponse other = (alluxio.grpc.table.GetTransformJobInfoPResponse) obj;

    if (!getInfoList()
        .equals(other.getInfoList())) return false;
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
    if (getInfoCount() > 0) {
      hash = (37 * hash) + INFO_FIELD_NUMBER;
      hash = (53 * hash) + getInfoList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.table.GetTransformJobInfoPResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.GetTransformJobInfoPResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.GetTransformJobInfoPResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.GetTransformJobInfoPResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.GetTransformJobInfoPResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.GetTransformJobInfoPResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.GetTransformJobInfoPResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.GetTransformJobInfoPResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.table.GetTransformJobInfoPResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.GetTransformJobInfoPResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.table.GetTransformJobInfoPResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.GetTransformJobInfoPResponse parseFrom(
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
  public static Builder newBuilder(alluxio.grpc.table.GetTransformJobInfoPResponse prototype) {
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
   * Protobuf type {@code alluxio.grpc.table.GetTransformJobInfoPResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.table.GetTransformJobInfoPResponse)
      alluxio.grpc.table.GetTransformJobInfoPResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetTransformJobInfoPResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetTransformJobInfoPResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.table.GetTransformJobInfoPResponse.class, alluxio.grpc.table.GetTransformJobInfoPResponse.Builder.class);
    }

    // Construct using alluxio.grpc.table.GetTransformJobInfoPResponse.newBuilder()
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
        getInfoFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (infoBuilder_ == null) {
        info_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        infoBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetTransformJobInfoPResponse_descriptor;
    }

    @java.lang.Override
    public alluxio.grpc.table.GetTransformJobInfoPResponse getDefaultInstanceForType() {
      return alluxio.grpc.table.GetTransformJobInfoPResponse.getDefaultInstance();
    }

    @java.lang.Override
    public alluxio.grpc.table.GetTransformJobInfoPResponse build() {
      alluxio.grpc.table.GetTransformJobInfoPResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public alluxio.grpc.table.GetTransformJobInfoPResponse buildPartial() {
      alluxio.grpc.table.GetTransformJobInfoPResponse result = new alluxio.grpc.table.GetTransformJobInfoPResponse(this);
      int from_bitField0_ = bitField0_;
      if (infoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          info_ = java.util.Collections.unmodifiableList(info_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.info_ = info_;
      } else {
        result.info_ = infoBuilder_.build();
      }
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
      if (other instanceof alluxio.grpc.table.GetTransformJobInfoPResponse) {
        return mergeFrom((alluxio.grpc.table.GetTransformJobInfoPResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.table.GetTransformJobInfoPResponse other) {
      if (other == alluxio.grpc.table.GetTransformJobInfoPResponse.getDefaultInstance()) return this;
      if (infoBuilder_ == null) {
        if (!other.info_.isEmpty()) {
          if (info_.isEmpty()) {
            info_ = other.info_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInfoIsMutable();
            info_.addAll(other.info_);
          }
          onChanged();
        }
      } else {
        if (!other.info_.isEmpty()) {
          if (infoBuilder_.isEmpty()) {
            infoBuilder_.dispose();
            infoBuilder_ = null;
            info_ = other.info_;
            bitField0_ = (bitField0_ & ~0x00000001);
            infoBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInfoFieldBuilder() : null;
          } else {
            infoBuilder_.addAllMessages(other.info_);
          }
        }
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
      alluxio.grpc.table.GetTransformJobInfoPResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.table.GetTransformJobInfoPResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<alluxio.grpc.table.TransformJobInfo> info_ =
      java.util.Collections.emptyList();
    private void ensureInfoIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        info_ = new java.util.ArrayList<alluxio.grpc.table.TransformJobInfo>(info_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        alluxio.grpc.table.TransformJobInfo, alluxio.grpc.table.TransformJobInfo.Builder, alluxio.grpc.table.TransformJobInfoOrBuilder> infoBuilder_;

    /**
     * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
     */
    public java.util.List<alluxio.grpc.table.TransformJobInfo> getInfoList() {
      if (infoBuilder_ == null) {
        return java.util.Collections.unmodifiableList(info_);
      } else {
        return infoBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
     */
    public int getInfoCount() {
      if (infoBuilder_ == null) {
        return info_.size();
      } else {
        return infoBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
     */
    public alluxio.grpc.table.TransformJobInfo getInfo(int index) {
      if (infoBuilder_ == null) {
        return info_.get(index);
      } else {
        return infoBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
     */
    public Builder setInfo(
        int index, alluxio.grpc.table.TransformJobInfo value) {
      if (infoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInfoIsMutable();
        info_.set(index, value);
        onChanged();
      } else {
        infoBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
     */
    public Builder setInfo(
        int index, alluxio.grpc.table.TransformJobInfo.Builder builderForValue) {
      if (infoBuilder_ == null) {
        ensureInfoIsMutable();
        info_.set(index, builderForValue.build());
        onChanged();
      } else {
        infoBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
     */
    public Builder addInfo(alluxio.grpc.table.TransformJobInfo value) {
      if (infoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInfoIsMutable();
        info_.add(value);
        onChanged();
      } else {
        infoBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
     */
    public Builder addInfo(
        int index, alluxio.grpc.table.TransformJobInfo value) {
      if (infoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInfoIsMutable();
        info_.add(index, value);
        onChanged();
      } else {
        infoBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
     */
    public Builder addInfo(
        alluxio.grpc.table.TransformJobInfo.Builder builderForValue) {
      if (infoBuilder_ == null) {
        ensureInfoIsMutable();
        info_.add(builderForValue.build());
        onChanged();
      } else {
        infoBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
     */
    public Builder addInfo(
        int index, alluxio.grpc.table.TransformJobInfo.Builder builderForValue) {
      if (infoBuilder_ == null) {
        ensureInfoIsMutable();
        info_.add(index, builderForValue.build());
        onChanged();
      } else {
        infoBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
     */
    public Builder addAllInfo(
        java.lang.Iterable<? extends alluxio.grpc.table.TransformJobInfo> values) {
      if (infoBuilder_ == null) {
        ensureInfoIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, info_);
        onChanged();
      } else {
        infoBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
     */
    public Builder clearInfo() {
      if (infoBuilder_ == null) {
        info_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        infoBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
     */
    public Builder removeInfo(int index) {
      if (infoBuilder_ == null) {
        ensureInfoIsMutable();
        info_.remove(index);
        onChanged();
      } else {
        infoBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
     */
    public alluxio.grpc.table.TransformJobInfo.Builder getInfoBuilder(
        int index) {
      return getInfoFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
     */
    public alluxio.grpc.table.TransformJobInfoOrBuilder getInfoOrBuilder(
        int index) {
      if (infoBuilder_ == null) {
        return info_.get(index);  } else {
        return infoBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
     */
    public java.util.List<? extends alluxio.grpc.table.TransformJobInfoOrBuilder> 
         getInfoOrBuilderList() {
      if (infoBuilder_ != null) {
        return infoBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(info_);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
     */
    public alluxio.grpc.table.TransformJobInfo.Builder addInfoBuilder() {
      return getInfoFieldBuilder().addBuilder(
          alluxio.grpc.table.TransformJobInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
     */
    public alluxio.grpc.table.TransformJobInfo.Builder addInfoBuilder(
        int index) {
      return getInfoFieldBuilder().addBuilder(
          index, alluxio.grpc.table.TransformJobInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .alluxio.grpc.table.TransformJobInfo info = 1;</code>
     */
    public java.util.List<alluxio.grpc.table.TransformJobInfo.Builder> 
         getInfoBuilderList() {
      return getInfoFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        alluxio.grpc.table.TransformJobInfo, alluxio.grpc.table.TransformJobInfo.Builder, alluxio.grpc.table.TransformJobInfoOrBuilder> 
        getInfoFieldBuilder() {
      if (infoBuilder_ == null) {
        infoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            alluxio.grpc.table.TransformJobInfo, alluxio.grpc.table.TransformJobInfo.Builder, alluxio.grpc.table.TransformJobInfoOrBuilder>(
                info_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        info_ = null;
      }
      return infoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.table.GetTransformJobInfoPResponse)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.table.GetTransformJobInfoPResponse)
  private static final alluxio.grpc.table.GetTransformJobInfoPResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.table.GetTransformJobInfoPResponse();
  }

  public static alluxio.grpc.table.GetTransformJobInfoPResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GetTransformJobInfoPResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetTransformJobInfoPResponse>() {
    @java.lang.Override
    public GetTransformJobInfoPResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetTransformJobInfoPResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetTransformJobInfoPResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTransformJobInfoPResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public alluxio.grpc.table.GetTransformJobInfoPResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

