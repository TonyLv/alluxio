// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/job_master.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.job.ListAllPResponse}
 */
public  final class ListAllPResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.job.ListAllPResponse)
    ListAllPResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAllPResponse.newBuilder() to construct.
  private ListAllPResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAllPResponse() {
    jobIds_ = emptyLongList();
    jobInfos_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAllPResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListAllPResponse(
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
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              jobIds_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            jobIds_.addLong(input.readInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              jobIds_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              jobIds_.addLong(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              jobInfos_ = new java.util.ArrayList<alluxio.grpc.JobInfo>();
              mutable_bitField0_ |= 0x00000002;
            }
            jobInfos_.add(
                input.readMessage(alluxio.grpc.JobInfo.PARSER, extensionRegistry));
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
        jobIds_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        jobInfos_ = java.util.Collections.unmodifiableList(jobInfos_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_ListAllPResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_ListAllPResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.ListAllPResponse.class, alluxio.grpc.ListAllPResponse.Builder.class);
  }

  public static final int JOBIDS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList jobIds_;
  /**
   * <code>repeated int64 jobIds = 1;</code>
   * @return A list containing the jobIds.
   */
  public java.util.List<java.lang.Long>
      getJobIdsList() {
    return jobIds_;
  }
  /**
   * <code>repeated int64 jobIds = 1;</code>
   * @return The count of jobIds.
   */
  public int getJobIdsCount() {
    return jobIds_.size();
  }
  /**
   * <code>repeated int64 jobIds = 1;</code>
   * @param index The index of the element to return.
   * @return The jobIds at the given index.
   */
  public long getJobIds(int index) {
    return jobIds_.getLong(index);
  }

  public static final int JOBINFOS_FIELD_NUMBER = 2;
  private java.util.List<alluxio.grpc.JobInfo> jobInfos_;
  /**
   * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
   */
  public java.util.List<alluxio.grpc.JobInfo> getJobInfosList() {
    return jobInfos_;
  }
  /**
   * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
   */
  public java.util.List<? extends alluxio.grpc.JobInfoOrBuilder> 
      getJobInfosOrBuilderList() {
    return jobInfos_;
  }
  /**
   * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
   */
  public int getJobInfosCount() {
    return jobInfos_.size();
  }
  /**
   * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
   */
  public alluxio.grpc.JobInfo getJobInfos(int index) {
    return jobInfos_.get(index);
  }
  /**
   * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
   */
  public alluxio.grpc.JobInfoOrBuilder getJobInfosOrBuilder(
      int index) {
    return jobInfos_.get(index);
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
    for (int i = 0; i < jobIds_.size(); i++) {
      output.writeInt64(1, jobIds_.getLong(i));
    }
    for (int i = 0; i < jobInfos_.size(); i++) {
      output.writeMessage(2, jobInfos_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < jobIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(jobIds_.getLong(i));
      }
      size += dataSize;
      size += 1 * getJobIdsList().size();
    }
    for (int i = 0; i < jobInfos_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, jobInfos_.get(i));
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
    if (!(obj instanceof alluxio.grpc.ListAllPResponse)) {
      return super.equals(obj);
    }
    alluxio.grpc.ListAllPResponse other = (alluxio.grpc.ListAllPResponse) obj;

    if (!getJobIdsList()
        .equals(other.getJobIdsList())) return false;
    if (!getJobInfosList()
        .equals(other.getJobInfosList())) return false;
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
    if (getJobIdsCount() > 0) {
      hash = (37 * hash) + JOBIDS_FIELD_NUMBER;
      hash = (53 * hash) + getJobIdsList().hashCode();
    }
    if (getJobInfosCount() > 0) {
      hash = (37 * hash) + JOBINFOS_FIELD_NUMBER;
      hash = (53 * hash) + getJobInfosList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.ListAllPResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.ListAllPResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.ListAllPResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.ListAllPResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.ListAllPResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.ListAllPResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.ListAllPResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.ListAllPResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.ListAllPResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.ListAllPResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.ListAllPResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.ListAllPResponse parseFrom(
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
  public static Builder newBuilder(alluxio.grpc.ListAllPResponse prototype) {
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
   * Protobuf type {@code alluxio.grpc.job.ListAllPResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.job.ListAllPResponse)
      alluxio.grpc.ListAllPResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_ListAllPResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_ListAllPResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.ListAllPResponse.class, alluxio.grpc.ListAllPResponse.Builder.class);
    }

    // Construct using alluxio.grpc.ListAllPResponse.newBuilder()
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
        getJobInfosFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      jobIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      if (jobInfosBuilder_ == null) {
        jobInfos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        jobInfosBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_ListAllPResponse_descriptor;
    }

    @java.lang.Override
    public alluxio.grpc.ListAllPResponse getDefaultInstanceForType() {
      return alluxio.grpc.ListAllPResponse.getDefaultInstance();
    }

    @java.lang.Override
    public alluxio.grpc.ListAllPResponse build() {
      alluxio.grpc.ListAllPResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public alluxio.grpc.ListAllPResponse buildPartial() {
      alluxio.grpc.ListAllPResponse result = new alluxio.grpc.ListAllPResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        jobIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.jobIds_ = jobIds_;
      if (jobInfosBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          jobInfos_ = java.util.Collections.unmodifiableList(jobInfos_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.jobInfos_ = jobInfos_;
      } else {
        result.jobInfos_ = jobInfosBuilder_.build();
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
      if (other instanceof alluxio.grpc.ListAllPResponse) {
        return mergeFrom((alluxio.grpc.ListAllPResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.ListAllPResponse other) {
      if (other == alluxio.grpc.ListAllPResponse.getDefaultInstance()) return this;
      if (!other.jobIds_.isEmpty()) {
        if (jobIds_.isEmpty()) {
          jobIds_ = other.jobIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureJobIdsIsMutable();
          jobIds_.addAll(other.jobIds_);
        }
        onChanged();
      }
      if (jobInfosBuilder_ == null) {
        if (!other.jobInfos_.isEmpty()) {
          if (jobInfos_.isEmpty()) {
            jobInfos_ = other.jobInfos_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureJobInfosIsMutable();
            jobInfos_.addAll(other.jobInfos_);
          }
          onChanged();
        }
      } else {
        if (!other.jobInfos_.isEmpty()) {
          if (jobInfosBuilder_.isEmpty()) {
            jobInfosBuilder_.dispose();
            jobInfosBuilder_ = null;
            jobInfos_ = other.jobInfos_;
            bitField0_ = (bitField0_ & ~0x00000002);
            jobInfosBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getJobInfosFieldBuilder() : null;
          } else {
            jobInfosBuilder_.addAllMessages(other.jobInfos_);
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
      alluxio.grpc.ListAllPResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.ListAllPResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList jobIds_ = emptyLongList();
    private void ensureJobIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        jobIds_ = mutableCopy(jobIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int64 jobIds = 1;</code>
     * @return A list containing the jobIds.
     */
    public java.util.List<java.lang.Long>
        getJobIdsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(jobIds_) : jobIds_;
    }
    /**
     * <code>repeated int64 jobIds = 1;</code>
     * @return The count of jobIds.
     */
    public int getJobIdsCount() {
      return jobIds_.size();
    }
    /**
     * <code>repeated int64 jobIds = 1;</code>
     * @param index The index of the element to return.
     * @return The jobIds at the given index.
     */
    public long getJobIds(int index) {
      return jobIds_.getLong(index);
    }
    /**
     * <code>repeated int64 jobIds = 1;</code>
     * @param index The index to set the value at.
     * @param value The jobIds to set.
     * @return This builder for chaining.
     */
    public Builder setJobIds(
        int index, long value) {
      ensureJobIdsIsMutable();
      jobIds_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 jobIds = 1;</code>
     * @param value The jobIds to add.
     * @return This builder for chaining.
     */
    public Builder addJobIds(long value) {
      ensureJobIdsIsMutable();
      jobIds_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 jobIds = 1;</code>
     * @param values The jobIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllJobIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureJobIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, jobIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 jobIds = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJobIds() {
      jobIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.util.List<alluxio.grpc.JobInfo> jobInfos_ =
      java.util.Collections.emptyList();
    private void ensureJobInfosIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        jobInfos_ = new java.util.ArrayList<alluxio.grpc.JobInfo>(jobInfos_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        alluxio.grpc.JobInfo, alluxio.grpc.JobInfo.Builder, alluxio.grpc.JobInfoOrBuilder> jobInfosBuilder_;

    /**
     * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
     */
    public java.util.List<alluxio.grpc.JobInfo> getJobInfosList() {
      if (jobInfosBuilder_ == null) {
        return java.util.Collections.unmodifiableList(jobInfos_);
      } else {
        return jobInfosBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
     */
    public int getJobInfosCount() {
      if (jobInfosBuilder_ == null) {
        return jobInfos_.size();
      } else {
        return jobInfosBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
     */
    public alluxio.grpc.JobInfo getJobInfos(int index) {
      if (jobInfosBuilder_ == null) {
        return jobInfos_.get(index);
      } else {
        return jobInfosBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
     */
    public Builder setJobInfos(
        int index, alluxio.grpc.JobInfo value) {
      if (jobInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobInfosIsMutable();
        jobInfos_.set(index, value);
        onChanged();
      } else {
        jobInfosBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
     */
    public Builder setJobInfos(
        int index, alluxio.grpc.JobInfo.Builder builderForValue) {
      if (jobInfosBuilder_ == null) {
        ensureJobInfosIsMutable();
        jobInfos_.set(index, builderForValue.build());
        onChanged();
      } else {
        jobInfosBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
     */
    public Builder addJobInfos(alluxio.grpc.JobInfo value) {
      if (jobInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobInfosIsMutable();
        jobInfos_.add(value);
        onChanged();
      } else {
        jobInfosBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
     */
    public Builder addJobInfos(
        int index, alluxio.grpc.JobInfo value) {
      if (jobInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobInfosIsMutable();
        jobInfos_.add(index, value);
        onChanged();
      } else {
        jobInfosBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
     */
    public Builder addJobInfos(
        alluxio.grpc.JobInfo.Builder builderForValue) {
      if (jobInfosBuilder_ == null) {
        ensureJobInfosIsMutable();
        jobInfos_.add(builderForValue.build());
        onChanged();
      } else {
        jobInfosBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
     */
    public Builder addJobInfos(
        int index, alluxio.grpc.JobInfo.Builder builderForValue) {
      if (jobInfosBuilder_ == null) {
        ensureJobInfosIsMutable();
        jobInfos_.add(index, builderForValue.build());
        onChanged();
      } else {
        jobInfosBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
     */
    public Builder addAllJobInfos(
        java.lang.Iterable<? extends alluxio.grpc.JobInfo> values) {
      if (jobInfosBuilder_ == null) {
        ensureJobInfosIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, jobInfos_);
        onChanged();
      } else {
        jobInfosBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
     */
    public Builder clearJobInfos() {
      if (jobInfosBuilder_ == null) {
        jobInfos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        jobInfosBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
     */
    public Builder removeJobInfos(int index) {
      if (jobInfosBuilder_ == null) {
        ensureJobInfosIsMutable();
        jobInfos_.remove(index);
        onChanged();
      } else {
        jobInfosBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
     */
    public alluxio.grpc.JobInfo.Builder getJobInfosBuilder(
        int index) {
      return getJobInfosFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
     */
    public alluxio.grpc.JobInfoOrBuilder getJobInfosOrBuilder(
        int index) {
      if (jobInfosBuilder_ == null) {
        return jobInfos_.get(index);  } else {
        return jobInfosBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
     */
    public java.util.List<? extends alluxio.grpc.JobInfoOrBuilder> 
         getJobInfosOrBuilderList() {
      if (jobInfosBuilder_ != null) {
        return jobInfosBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(jobInfos_);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
     */
    public alluxio.grpc.JobInfo.Builder addJobInfosBuilder() {
      return getJobInfosFieldBuilder().addBuilder(
          alluxio.grpc.JobInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
     */
    public alluxio.grpc.JobInfo.Builder addJobInfosBuilder(
        int index) {
      return getJobInfosFieldBuilder().addBuilder(
          index, alluxio.grpc.JobInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .alluxio.grpc.job.JobInfo jobInfos = 2;</code>
     */
    public java.util.List<alluxio.grpc.JobInfo.Builder> 
         getJobInfosBuilderList() {
      return getJobInfosFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        alluxio.grpc.JobInfo, alluxio.grpc.JobInfo.Builder, alluxio.grpc.JobInfoOrBuilder> 
        getJobInfosFieldBuilder() {
      if (jobInfosBuilder_ == null) {
        jobInfosBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            alluxio.grpc.JobInfo, alluxio.grpc.JobInfo.Builder, alluxio.grpc.JobInfoOrBuilder>(
                jobInfos_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        jobInfos_ = null;
      }
      return jobInfosBuilder_;
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


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.job.ListAllPResponse)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.job.ListAllPResponse)
  private static final alluxio.grpc.ListAllPResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.ListAllPResponse();
  }

  public static alluxio.grpc.ListAllPResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ListAllPResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListAllPResponse>() {
    @java.lang.Override
    public ListAllPResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListAllPResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListAllPResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAllPResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public alluxio.grpc.ListAllPResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

