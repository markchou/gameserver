// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseGuildList.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseGuildList {
  private XinqiBseGuildList() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseGuildListOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string myGuildId = 1 [default = ""];
    boolean hasMyGuildId();
    String getMyGuildId();
    
    // repeated .com.xinqihd.sns.gameserver.proto.GuildSimpleInfo guildList = 2;
    java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo> 
        getGuildListList();
    com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo getGuildList(int index);
    int getGuildListCount();
    java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfoOrBuilder> 
        getGuildListOrBuilderList();
    com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfoOrBuilder getGuildListOrBuilder(
        int index);
    
    // repeated string requestGuildId = 4;
    java.util.List<String> getRequestGuildIdList();
    int getRequestGuildIdCount();
    String getRequestGuildId(int index);
    
    // repeated string requestGuildNames = 6;
    java.util.List<String> getRequestGuildNamesList();
    int getRequestGuildNamesCount();
    String getRequestGuildNames(int index);
  }
  public static final class BseGuildList extends
      com.google.protobuf.GeneratedMessage
      implements BseGuildListOrBuilder {
    // Use BseGuildList.newBuilder() to construct.
    private BseGuildList(Builder builder) {
      super(builder);
    }
    private BseGuildList(boolean noInit) {}
    
    private static final BseGuildList defaultInstance;
    public static BseGuildList getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseGuildList getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildList_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildList_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string myGuildId = 1 [default = ""];
    public static final int MYGUILDID_FIELD_NUMBER = 1;
    private java.lang.Object myGuildId_;
    public boolean hasMyGuildId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getMyGuildId() {
      java.lang.Object ref = myGuildId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          myGuildId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getMyGuildIdBytes() {
      java.lang.Object ref = myGuildId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        myGuildId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // repeated .com.xinqihd.sns.gameserver.proto.GuildSimpleInfo guildList = 2;
    public static final int GUILDLIST_FIELD_NUMBER = 2;
    private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo> guildList_;
    public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo> getGuildListList() {
      return guildList_;
    }
    public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfoOrBuilder> 
        getGuildListOrBuilderList() {
      return guildList_;
    }
    public int getGuildListCount() {
      return guildList_.size();
    }
    public com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo getGuildList(int index) {
      return guildList_.get(index);
    }
    public com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfoOrBuilder getGuildListOrBuilder(
        int index) {
      return guildList_.get(index);
    }
    
    // repeated string requestGuildId = 4;
    public static final int REQUESTGUILDID_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList requestGuildId_;
    public java.util.List<String>
        getRequestGuildIdList() {
      return requestGuildId_;
    }
    public int getRequestGuildIdCount() {
      return requestGuildId_.size();
    }
    public String getRequestGuildId(int index) {
      return requestGuildId_.get(index);
    }
    
    // repeated string requestGuildNames = 6;
    public static final int REQUESTGUILDNAMES_FIELD_NUMBER = 6;
    private com.google.protobuf.LazyStringList requestGuildNames_;
    public java.util.List<String>
        getRequestGuildNamesList() {
      return requestGuildNames_;
    }
    public int getRequestGuildNamesCount() {
      return requestGuildNames_.size();
    }
    public String getRequestGuildNames(int index) {
      return requestGuildNames_.get(index);
    }
    
    private void initFields() {
      myGuildId_ = "";
      guildList_ = java.util.Collections.emptyList();
      requestGuildId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      requestGuildNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      for (int i = 0; i < getGuildListCount(); i++) {
        if (!getGuildList(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getMyGuildIdBytes());
      }
      for (int i = 0; i < guildList_.size(); i++) {
        output.writeMessage(2, guildList_.get(i));
      }
      for (int i = 0; i < requestGuildId_.size(); i++) {
        output.writeBytes(4, requestGuildId_.getByteString(i));
      }
      for (int i = 0; i < requestGuildNames_.size(); i++) {
        output.writeBytes(6, requestGuildNames_.getByteString(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getMyGuildIdBytes());
      }
      for (int i = 0; i < guildList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, guildList_.get(i));
      }
      {
        int dataSize = 0;
        for (int i = 0; i < requestGuildId_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(requestGuildId_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getRequestGuildIdList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < requestGuildNames_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(requestGuildNames_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getRequestGuildNamesList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildList_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.internal_static_com_xinqihd_sns_gameserver_proto_BseGuildList_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getGuildListFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        myGuildId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (guildListBuilder_ == null) {
          guildList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          guildListBuilder_.clear();
        }
        requestGuildId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        requestGuildNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList result = new com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.myGuildId_ = myGuildId_;
        if (guildListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            guildList_ = java.util.Collections.unmodifiableList(guildList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.guildList_ = guildList_;
        } else {
          result.guildList_ = guildListBuilder_.build();
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          requestGuildId_ = new com.google.protobuf.UnmodifiableLazyStringList(
              requestGuildId_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.requestGuildId_ = requestGuildId_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          requestGuildNames_ = new com.google.protobuf.UnmodifiableLazyStringList(
              requestGuildNames_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.requestGuildNames_ = requestGuildNames_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList.getDefaultInstance()) return this;
        if (other.hasMyGuildId()) {
          setMyGuildId(other.getMyGuildId());
        }
        if (guildListBuilder_ == null) {
          if (!other.guildList_.isEmpty()) {
            if (guildList_.isEmpty()) {
              guildList_ = other.guildList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureGuildListIsMutable();
              guildList_.addAll(other.guildList_);
            }
            onChanged();
          }
        } else {
          if (!other.guildList_.isEmpty()) {
            if (guildListBuilder_.isEmpty()) {
              guildListBuilder_.dispose();
              guildListBuilder_ = null;
              guildList_ = other.guildList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              guildListBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getGuildListFieldBuilder() : null;
            } else {
              guildListBuilder_.addAllMessages(other.guildList_);
            }
          }
        }
        if (!other.requestGuildId_.isEmpty()) {
          if (requestGuildId_.isEmpty()) {
            requestGuildId_ = other.requestGuildId_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureRequestGuildIdIsMutable();
            requestGuildId_.addAll(other.requestGuildId_);
          }
          onChanged();
        }
        if (!other.requestGuildNames_.isEmpty()) {
          if (requestGuildNames_.isEmpty()) {
            requestGuildNames_ = other.requestGuildNames_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureRequestGuildNamesIsMutable();
            requestGuildNames_.addAll(other.requestGuildNames_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        for (int i = 0; i < getGuildListCount(); i++) {
          if (!getGuildList(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              myGuildId_ = input.readBytes();
              break;
            }
            case 18: {
              com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo.Builder subBuilder = com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addGuildList(subBuilder.buildPartial());
              break;
            }
            case 34: {
              ensureRequestGuildIdIsMutable();
              requestGuildId_.add(input.readBytes());
              break;
            }
            case 50: {
              ensureRequestGuildNamesIsMutable();
              requestGuildNames_.add(input.readBytes());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string myGuildId = 1 [default = ""];
      private java.lang.Object myGuildId_ = "";
      public boolean hasMyGuildId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getMyGuildId() {
        java.lang.Object ref = myGuildId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          myGuildId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setMyGuildId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        myGuildId_ = value;
        onChanged();
        return this;
      }
      public Builder clearMyGuildId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        myGuildId_ = getDefaultInstance().getMyGuildId();
        onChanged();
        return this;
      }
      void setMyGuildId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        myGuildId_ = value;
        onChanged();
      }
      
      // repeated .com.xinqihd.sns.gameserver.proto.GuildSimpleInfo guildList = 2;
      private java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo> guildList_ =
        java.util.Collections.emptyList();
      private void ensureGuildListIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          guildList_ = new java.util.ArrayList<com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo>(guildList_);
          bitField0_ |= 0x00000002;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo, com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo.Builder, com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfoOrBuilder> guildListBuilder_;
      
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo> getGuildListList() {
        if (guildListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(guildList_);
        } else {
          return guildListBuilder_.getMessageList();
        }
      }
      public int getGuildListCount() {
        if (guildListBuilder_ == null) {
          return guildList_.size();
        } else {
          return guildListBuilder_.getCount();
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo getGuildList(int index) {
        if (guildListBuilder_ == null) {
          return guildList_.get(index);
        } else {
          return guildListBuilder_.getMessage(index);
        }
      }
      public Builder setGuildList(
          int index, com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo value) {
        if (guildListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGuildListIsMutable();
          guildList_.set(index, value);
          onChanged();
        } else {
          guildListBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setGuildList(
          int index, com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo.Builder builderForValue) {
        if (guildListBuilder_ == null) {
          ensureGuildListIsMutable();
          guildList_.set(index, builderForValue.build());
          onChanged();
        } else {
          guildListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addGuildList(com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo value) {
        if (guildListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGuildListIsMutable();
          guildList_.add(value);
          onChanged();
        } else {
          guildListBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addGuildList(
          int index, com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo value) {
        if (guildListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGuildListIsMutable();
          guildList_.add(index, value);
          onChanged();
        } else {
          guildListBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addGuildList(
          com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo.Builder builderForValue) {
        if (guildListBuilder_ == null) {
          ensureGuildListIsMutable();
          guildList_.add(builderForValue.build());
          onChanged();
        } else {
          guildListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addGuildList(
          int index, com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo.Builder builderForValue) {
        if (guildListBuilder_ == null) {
          ensureGuildListIsMutable();
          guildList_.add(index, builderForValue.build());
          onChanged();
        } else {
          guildListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllGuildList(
          java.lang.Iterable<? extends com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo> values) {
        if (guildListBuilder_ == null) {
          ensureGuildListIsMutable();
          super.addAll(values, guildList_);
          onChanged();
        } else {
          guildListBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearGuildList() {
        if (guildListBuilder_ == null) {
          guildList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          guildListBuilder_.clear();
        }
        return this;
      }
      public Builder removeGuildList(int index) {
        if (guildListBuilder_ == null) {
          ensureGuildListIsMutable();
          guildList_.remove(index);
          onChanged();
        } else {
          guildListBuilder_.remove(index);
        }
        return this;
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo.Builder getGuildListBuilder(
          int index) {
        return getGuildListFieldBuilder().getBuilder(index);
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfoOrBuilder getGuildListOrBuilder(
          int index) {
        if (guildListBuilder_ == null) {
          return guildList_.get(index);  } else {
          return guildListBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfoOrBuilder> 
           getGuildListOrBuilderList() {
        if (guildListBuilder_ != null) {
          return guildListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(guildList_);
        }
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo.Builder addGuildListBuilder() {
        return getGuildListFieldBuilder().addBuilder(
            com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo.getDefaultInstance());
      }
      public com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo.Builder addGuildListBuilder(
          int index) {
        return getGuildListFieldBuilder().addBuilder(
            index, com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo.getDefaultInstance());
      }
      public java.util.List<com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo.Builder> 
           getGuildListBuilderList() {
        return getGuildListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo, com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo.Builder, com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfoOrBuilder> 
          getGuildListFieldBuilder() {
        if (guildListBuilder_ == null) {
          guildListBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo, com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfo.Builder, com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.GuildSimpleInfoOrBuilder>(
                  guildList_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          guildList_ = null;
        }
        return guildListBuilder_;
      }
      
      // repeated string requestGuildId = 4;
      private com.google.protobuf.LazyStringList requestGuildId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureRequestGuildIdIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          requestGuildId_ = new com.google.protobuf.LazyStringArrayList(requestGuildId_);
          bitField0_ |= 0x00000004;
         }
      }
      public java.util.List<String>
          getRequestGuildIdList() {
        return java.util.Collections.unmodifiableList(requestGuildId_);
      }
      public int getRequestGuildIdCount() {
        return requestGuildId_.size();
      }
      public String getRequestGuildId(int index) {
        return requestGuildId_.get(index);
      }
      public Builder setRequestGuildId(
          int index, String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureRequestGuildIdIsMutable();
        requestGuildId_.set(index, value);
        onChanged();
        return this;
      }
      public Builder addRequestGuildId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureRequestGuildIdIsMutable();
        requestGuildId_.add(value);
        onChanged();
        return this;
      }
      public Builder addAllRequestGuildId(
          java.lang.Iterable<String> values) {
        ensureRequestGuildIdIsMutable();
        super.addAll(values, requestGuildId_);
        onChanged();
        return this;
      }
      public Builder clearRequestGuildId() {
        requestGuildId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      void addRequestGuildId(com.google.protobuf.ByteString value) {
        ensureRequestGuildIdIsMutable();
        requestGuildId_.add(value);
        onChanged();
      }
      
      // repeated string requestGuildNames = 6;
      private com.google.protobuf.LazyStringList requestGuildNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureRequestGuildNamesIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          requestGuildNames_ = new com.google.protobuf.LazyStringArrayList(requestGuildNames_);
          bitField0_ |= 0x00000008;
         }
      }
      public java.util.List<String>
          getRequestGuildNamesList() {
        return java.util.Collections.unmodifiableList(requestGuildNames_);
      }
      public int getRequestGuildNamesCount() {
        return requestGuildNames_.size();
      }
      public String getRequestGuildNames(int index) {
        return requestGuildNames_.get(index);
      }
      public Builder setRequestGuildNames(
          int index, String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureRequestGuildNamesIsMutable();
        requestGuildNames_.set(index, value);
        onChanged();
        return this;
      }
      public Builder addRequestGuildNames(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureRequestGuildNamesIsMutable();
        requestGuildNames_.add(value);
        onChanged();
        return this;
      }
      public Builder addAllRequestGuildNames(
          java.lang.Iterable<String> values) {
        ensureRequestGuildNamesIsMutable();
        super.addAll(values, requestGuildNames_);
        onChanged();
        return this;
      }
      public Builder clearRequestGuildNames() {
        requestGuildNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      void addRequestGuildNames(com.google.protobuf.ByteString value) {
        ensureRequestGuildNamesIsMutable();
        requestGuildNames_.add(value);
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseGuildList)
    }
    
    static {
      defaultInstance = new BseGuildList(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseGuildList)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseGuildList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseGuildList_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022BseGuildList.proto\022 com.xinqihd.sns.ga" +
      "meserver.proto\032\025GuildSimpleInfo.proto\"\234\001" +
      "\n\014BseGuildList\022\023\n\tmyGuildId\030\001 \001(\t:\000\022D\n\tg" +
      "uildList\030\002 \003(\01321.com.xinqihd.sns.gameser" +
      "ver.proto.GuildSimpleInfo\022\026\n\016requestGuil" +
      "dId\030\004 \003(\t\022\031\n\021requestGuildNames\030\006 \003(\tB\023B\021" +
      "XinqiBseGuildList"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseGuildList_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseGuildList_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseGuildList_descriptor,
              new java.lang.String[] { "MyGuildId", "GuildList", "RequestGuildId", "RequestGuildNames", },
              com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseGuildList.BseGuildList.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xinqihd.sns.gameserver.proto.XinqiGuildSimpleInfo.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
