// Generated by the protocol buffer compiler.  DO NOT EDIT!

package bible.bibleverse.biblia.bibleverses.scripture.holywrit.verse.devotion.protobuf;

public final class BPCLProto {
  private BPCLProto() {}
  public static final class BPCL extends
      com.google.protobuf.micro.MessageMicro {
    public BPCL() {}
    
    public static final class BPC extends
        com.google.protobuf.micro.MessageMicro {
      public BPC() {}
      
      // optional int32 categoryId = 1;
      public static final int CATEGORYID_FIELD_NUMBER = 1;
      private boolean hasCategoryId;
      private int categoryId_ = 0;
      public int getCategoryId() { return categoryId_; }
      public boolean hasCategoryId() { return hasCategoryId; }
      public BPC setCategoryId(int value) {
        hasCategoryId = true;
        categoryId_ = value;
        return this;
      }
      public BPC clearCategoryId() {
        hasCategoryId = false;
        categoryId_ = 0;
        return this;
      }
      
      // optional string categoryName = 2;
      public static final int CATEGORYNAME_FIELD_NUMBER = 2;
      private boolean hasCategoryName;
      private String categoryName_ = "";
      public String getCategoryName() { return categoryName_; }
      public boolean hasCategoryName() { return hasCategoryName; }
      public BPC setCategoryName(String value) {
        hasCategoryName = true;
        categoryName_ = value;
        return this;
      }
      public BPC clearCategoryName() {
        hasCategoryName = false;
        categoryName_ = "";
        return this;
      }
      
      // repeated .bean.BP list = 3;
      public static final int LIST_FIELD_NUMBER = 3;
      private java.util.List<BPProto.BP> list_ =
        java.util.Collections.emptyList();
      public java.util.List<BPProto.BP> getListList() {
        return list_;
      }
      public int getListCount() { return list_.size(); }
      public BPProto.BP getList(int index) {
        return list_.get(index);
      }
      public BPC setList(int index, BPProto.BP value) {
        if (value == null) {
          throw new NullPointerException();
        }
        list_.set(index, value);
        return this;
      }
      public BPC addList(BPProto.BP value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (list_.isEmpty()) {
          list_ = new java.util.ArrayList<BPProto.BP>();
        }
        list_.add(value);
        return this;
      }
      public BPC clearList() {
        list_ = java.util.Collections.emptyList();
        return this;
      }
      
      public final BPC clear() {
        clearCategoryId();
        clearCategoryName();
        clearList();
        cachedSize = -1;
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro output)
                          throws java.io.IOException {
        if (hasCategoryId()) {
          output.writeInt32(1, getCategoryId());
        }
        if (hasCategoryName()) {
          output.writeString(2, getCategoryName());
        }
        for (BPProto.BP element : getListList()) {
          output.writeMessage(3, element);
        }
      }
      
      private int cachedSize = -1;
      public int getCachedSize() {
        if (cachedSize < 0) {
          // getSerializedSize sets cachedSize
          getSerializedSize();
        }
        return cachedSize;
      }
      
      public int getSerializedSize() {
        int size = 0;
        if (hasCategoryId()) {
          size += com.google.protobuf.micro.CodedOutputStreamMicro
            .computeInt32Size(1, getCategoryId());
        }
        if (hasCategoryName()) {
          size += com.google.protobuf.micro.CodedOutputStreamMicro
            .computeStringSize(2, getCategoryName());
        }
        for (BPProto.BP element : getListList()) {
          size += com.google.protobuf.micro.CodedOutputStreamMicro
            .computeMessageSize(3, element);
        }
        cachedSize = size;
        return size;
      }
      
      public BPC mergeFrom(
          com.google.protobuf.micro.CodedInputStreamMicro input)
          throws java.io.IOException {
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              return this;
            default: {
              if (!parseUnknownField(input, tag)) {
                return this;
              }
              break;
            }
            case 8: {
              setCategoryId(input.readInt32());
              break;
            }
            case 18: {
              setCategoryName(input.readString());
              break;
            }
            case 26: {
              BPProto.BP value = new BPProto.BP();
              input.readMessage(value);
              addList(value);
              break;
            }
          }
        }
      }
      
      public  BPC parseFrom(byte[] data)
          throws com.google.protobuf.micro.InvalidProtocolBufferMicroException {
        return (BPC) (new BPC().mergeFrom(data));
      }
      
      public  BPC parseFrom(
              com.google.protobuf.micro.CodedInputStreamMicro input)
          throws java.io.IOException {
        return (BPC) (new BPC().mergeFrom(input));
      }
      
    }
    
    // optional int32 catesCount = 1;
    public static final int CATESCOUNT_FIELD_NUMBER = 1;
    private boolean hasCatesCount;
    private int catesCount_ = 0;
    public int getCatesCount() { return catesCount_; }
    public boolean hasCatesCount() { return hasCatesCount; }
    public BPCL setCatesCount(int value) {
      hasCatesCount = true;
      catesCount_ = value;
      return this;
    }
    public BPCL clearCatesCount() {
      hasCatesCount = false;
      catesCount_ = 0;
      return this;
    }
    
    // repeated .bean.BPCL.BPC cateList = 2;
    public static final int CATELIST_FIELD_NUMBER = 2;
    private java.util.List<BPC> cateList_ =
      java.util.Collections.emptyList();
    public java.util.List<BPC> getCateListList() {
      return cateList_;
    }
    public int getCateListCount() { return cateList_.size(); }
    public BPC getCateList(int index) {
      return cateList_.get(index);
    }
    public BPCL setCateList(int index, BPC value) {
      if (value == null) {
        throw new NullPointerException();
      }
      cateList_.set(index, value);
      return this;
    }
    public BPCL addCateList(BPC value) {
      if (value == null) {
        throw new NullPointerException();
      }
      if (cateList_.isEmpty()) {
        cateList_ = new java.util.ArrayList<BPC>();
      }
      cateList_.add(value);
      return this;
    }
    public BPCL clearCateList() {
      cateList_ = java.util.Collections.emptyList();
      return this;
    }
    
    public final BPCL clear() {
      clearCatesCount();
      clearCateList();
      cachedSize = -1;
      return this;
    }
    
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro output)
                        throws java.io.IOException {
      if (hasCatesCount()) {
        output.writeInt32(1, getCatesCount());
      }
      for (BPC element : getCateListList()) {
        output.writeMessage(2, element);
      }
    }
    
    private int cachedSize = -1;
    public int getCachedSize() {
      if (cachedSize < 0) {
        // getSerializedSize sets cachedSize
        getSerializedSize();
      }
      return cachedSize;
    }
    
    public int getSerializedSize() {
      int size = 0;
      if (hasCatesCount()) {
        size += com.google.protobuf.micro.CodedOutputStreamMicro
          .computeInt32Size(1, getCatesCount());
      }
      for (BPC element : getCateListList()) {
        size += com.google.protobuf.micro.CodedOutputStreamMicro
          .computeMessageSize(2, element);
      }
      cachedSize = size;
      return size;
    }
    
    public BPCL mergeFrom(
        com.google.protobuf.micro.CodedInputStreamMicro input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            setCatesCount(input.readInt32());
            break;
          }
          case 18: {
            BPC value = new BPC();
            input.readMessage(value);
            addCateList(value);
            break;
          }
        }
      }
    }
    
    public static BPCL parseFrom(byte[] data)
        throws com.google.protobuf.micro.InvalidProtocolBufferMicroException {
      return (BPCL) (new BPCL().mergeFrom(data));
    }
    
    public static BPCL parseFrom(
            com.google.protobuf.micro.CodedInputStreamMicro input)
        throws java.io.IOException {
      return (BPCL) (new BPCL().mergeFrom(input));
    }
    
  }
  
}
