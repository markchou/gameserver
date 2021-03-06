// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseCraftPrice.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseCraftPrice {
  private XinqiBseCraftPrice() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseCraftPriceOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional int32 price = 1;
    boolean hasPrice();
    int getPrice();
    
    // optional int32 successratio = 2;
    boolean hasSuccessratio();
    int getSuccessratio();
    
    // optional int32 guildratio = 3;
    boolean hasGuildratio();
    int getGuildratio();
    
    // optional int32 vipratio = 4;
    boolean hasVipratio();
    int getVipratio();
  }
  public static final class BseCraftPrice extends
      com.google.protobuf.GeneratedMessage
      implements BseCraftPriceOrBuilder {
    // Use BseCraftPrice.newBuilder() to construct.
    private BseCraftPrice(Builder builder) {
      super(builder);
    }
    private BseCraftPrice(boolean noInit) {}
    
    private static final BseCraftPrice defaultInstance;
    public static BseCraftPrice getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseCraftPrice getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.internal_static_com_xinqihd_sns_gameserver_proto_BseCraftPrice_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.internal_static_com_xinqihd_sns_gameserver_proto_BseCraftPrice_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional int32 price = 1;
    public static final int PRICE_FIELD_NUMBER = 1;
    private int price_;
    public boolean hasPrice() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getPrice() {
      return price_;
    }
    
    // optional int32 successratio = 2;
    public static final int SUCCESSRATIO_FIELD_NUMBER = 2;
    private int successratio_;
    public boolean hasSuccessratio() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getSuccessratio() {
      return successratio_;
    }
    
    // optional int32 guildratio = 3;
    public static final int GUILDRATIO_FIELD_NUMBER = 3;
    private int guildratio_;
    public boolean hasGuildratio() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getGuildratio() {
      return guildratio_;
    }
    
    // optional int32 vipratio = 4;
    public static final int VIPRATIO_FIELD_NUMBER = 4;
    private int vipratio_;
    public boolean hasVipratio() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getVipratio() {
      return vipratio_;
    }
    
    private void initFields() {
      price_ = 0;
      successratio_ = 0;
      guildratio_ = 0;
      vipratio_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, price_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, successratio_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, guildratio_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, vipratio_);
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
          .computeInt32Size(1, price_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, successratio_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, guildratio_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, vipratio_);
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPriceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.internal_static_com_xinqihd_sns_gameserver_proto_BseCraftPrice_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.internal_static_com_xinqihd_sns_gameserver_proto_BseCraftPrice_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        price_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        successratio_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        guildratio_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        vipratio_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice result = new com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.price_ = price_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.successratio_ = successratio_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.guildratio_ = guildratio_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.vipratio_ = vipratio_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice.getDefaultInstance()) return this;
        if (other.hasPrice()) {
          setPrice(other.getPrice());
        }
        if (other.hasSuccessratio()) {
          setSuccessratio(other.getSuccessratio());
        }
        if (other.hasGuildratio()) {
          setGuildratio(other.getGuildratio());
        }
        if (other.hasVipratio()) {
          setVipratio(other.getVipratio());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
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
            case 8: {
              bitField0_ |= 0x00000001;
              price_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              successratio_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              guildratio_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              vipratio_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional int32 price = 1;
      private int price_ ;
      public boolean hasPrice() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getPrice() {
        return price_;
      }
      public Builder setPrice(int value) {
        bitField0_ |= 0x00000001;
        price_ = value;
        onChanged();
        return this;
      }
      public Builder clearPrice() {
        bitField0_ = (bitField0_ & ~0x00000001);
        price_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 successratio = 2;
      private int successratio_ ;
      public boolean hasSuccessratio() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getSuccessratio() {
        return successratio_;
      }
      public Builder setSuccessratio(int value) {
        bitField0_ |= 0x00000002;
        successratio_ = value;
        onChanged();
        return this;
      }
      public Builder clearSuccessratio() {
        bitField0_ = (bitField0_ & ~0x00000002);
        successratio_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 guildratio = 3;
      private int guildratio_ ;
      public boolean hasGuildratio() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getGuildratio() {
        return guildratio_;
      }
      public Builder setGuildratio(int value) {
        bitField0_ |= 0x00000004;
        guildratio_ = value;
        onChanged();
        return this;
      }
      public Builder clearGuildratio() {
        bitField0_ = (bitField0_ & ~0x00000004);
        guildratio_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 vipratio = 4;
      private int vipratio_ ;
      public boolean hasVipratio() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getVipratio() {
        return vipratio_;
      }
      public Builder setVipratio(int value) {
        bitField0_ |= 0x00000008;
        vipratio_ = value;
        onChanged();
        return this;
      }
      public Builder clearVipratio() {
        bitField0_ = (bitField0_ & ~0x00000008);
        vipratio_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseCraftPrice)
    }
    
    static {
      defaultInstance = new BseCraftPrice(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseCraftPrice)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseCraftPrice_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseCraftPrice_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023BseCraftPrice.proto\022 com.xinqihd.sns.g" +
      "ameserver.proto\032\016MailData.proto\"Z\n\rBseCr" +
      "aftPrice\022\r\n\005price\030\001 \001(\005\022\024\n\014successratio\030" +
      "\002 \001(\005\022\022\n\nguildratio\030\003 \001(\005\022\020\n\010vipratio\030\004 " +
      "\001(\005B\024B\022XinqiBseCraftPrice"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseCraftPrice_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseCraftPrice_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseCraftPrice_descriptor,
              new java.lang.String[] { "Price", "Successratio", "Guildratio", "Vipratio", },
              com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseCraftPrice.BseCraftPrice.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xinqihd.sns.gameserver.proto.XinqiMailData.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
