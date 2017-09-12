// Generated by the protocol buffer compiler.  DO NOT EDIT!

package bible.bibleverse.biblia.bibleverses.scripture.holywrit.verse.devotion.protobuf;

public final class ICLProto {
  private ICLProto() {}
  public static final class ICL extends
      com.google.protobuf.micro.MessageMicro {
    public ICL() {}
    
    public static final class ICI extends
        com.google.protobuf.micro.MessageMicro {
      public ICI() {}
      
      // optional string image = 1;
      public static final int IMAGE_FIELD_NUMBER = 1;
      private boolean hasImage;
      private String image_ = "";
      public String getImage() { return image_; }
      public boolean hasImage() { return hasImage; }
      public ICI setImage(String value) {
        hasImage = true;
        image_ = value;
        return this;
      }
      public ICI clearImage() {
        hasImage = false;
        image_ = "";
        return this;
      }
      
      // optional string thumbnail = 2;
      public static final int THUMBNAIL_FIELD_NUMBER = 2;
      private boolean hasThumbnail;
      private String thumbnail_ = "";
      public String getThumbnail() { return thumbnail_; }
      public boolean hasThumbnail() { return hasThumbnail; }
      public ICI setThumbnail(String value) {
        hasThumbnail = true;
        thumbnail_ = value;
        return this;
      }
      public ICI clearThumbnail() {
        hasThumbnail = false;
        thumbnail_ = "";
        return this;
      }
      
      public final ICI clear() {
        clearImage();
        clearThumbnail();
        cachedSize = -1;
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro output)
                          throws java.io.IOException {
        if (hasImage()) {
          output.writeString(1, getImage());
        }
        if (hasThumbnail()) {
          output.writeString(2, getThumbnail());
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
        if (hasImage()) {
          size += com.google.protobuf.micro.CodedOutputStreamMicro
            .computeStringSize(1, getImage());
        }
        if (hasThumbnail()) {
          size += com.google.protobuf.micro.CodedOutputStreamMicro
            .computeStringSize(2, getThumbnail());
        }
        cachedSize = size;
        return size;
      }
      
      public ICI mergeFrom(
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
            case 10: {
              setImage(input.readString());
              break;
            }
            case 18: {
              setThumbnail(input.readString());
              break;
            }
          }
        }
      }
      
      public  ICI parseFrom(byte[] data)
          throws com.google.protobuf.micro.InvalidProtocolBufferMicroException {
        return (ICI) (new ICI().mergeFrom(data));
      }
      
      public  ICI parseFrom(
              com.google.protobuf.micro.CodedInputStreamMicro input)
          throws java.io.IOException {
        return (ICI) (new ICI().mergeFrom(input));
      }
      
    }
    
    // optional int32 toalPage = 1;
    public static final int TOALPAGE_FIELD_NUMBER = 1;
    private boolean hasToalPage;
    private int toalPage_ = 0;
    public int getToalPage() { return toalPage_; }
    public boolean hasToalPage() { return hasToalPage; }
    public ICL setToalPage(int value) {
      hasToalPage = true;
      toalPage_ = value;
      return this;
    }
    public ICL clearToalPage() {
      hasToalPage = false;
      toalPage_ = 0;
      return this;
    }
    
    // optional int32 toalCount = 2;
    public static final int TOALCOUNT_FIELD_NUMBER = 2;
    private boolean hasToalCount;
    private int toalCount_ = 0;
    public int getToalCount() { return toalCount_; }
    public boolean hasToalCount() { return hasToalCount; }
    public ICL setToalCount(int value) {
      hasToalCount = true;
      toalCount_ = value;
      return this;
    }
    public ICL clearToalCount() {
      hasToalCount = false;
      toalCount_ = 0;
      return this;
    }
    
    // repeated .bean.ICL.ICI imageList = 3;
    public static final int IMAGELIST_FIELD_NUMBER = 3;
    private java.util.List<ICI> imageList_ =
      java.util.Collections.emptyList();
    public java.util.List<ICI> getImageListList() {
      return imageList_;
    }
    public int getImageListCount() { return imageList_.size(); }
    public ICI getImageList(int index) {
      return imageList_.get(index);
    }
    public ICL setImageList(int index, ICI value) {
      if (value == null) {
        throw new NullPointerException();
      }
      imageList_.set(index, value);
      return this;
    }
    public ICL addImageList(ICI value) {
      if (value == null) {
        throw new NullPointerException();
      }
      if (imageList_.isEmpty()) {
        imageList_ = new java.util.ArrayList<ICI>();
      }
      imageList_.add(value);
      return this;
    }
    public ICL clearImageList() {
      imageList_ = java.util.Collections.emptyList();
      return this;
    }
    
    public final ICL clear() {
      clearToalPage();
      clearToalCount();
      clearImageList();
      cachedSize = -1;
      return this;
    }
    
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.micro.CodedOutputStreamMicro output)
                        throws java.io.IOException {
      if (hasToalPage()) {
        output.writeInt32(1, getToalPage());
      }
      if (hasToalCount()) {
        output.writeInt32(2, getToalCount());
      }
      for (ICI element : getImageListList()) {
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
      if (hasToalPage()) {
        size += com.google.protobuf.micro.CodedOutputStreamMicro
          .computeInt32Size(1, getToalPage());
      }
      if (hasToalCount()) {
        size += com.google.protobuf.micro.CodedOutputStreamMicro
          .computeInt32Size(2, getToalCount());
      }
      for (ICI element : getImageListList()) {
        size += com.google.protobuf.micro.CodedOutputStreamMicro
          .computeMessageSize(3, element);
      }
      cachedSize = size;
      return size;
    }
    
    public ICL mergeFrom(
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
            setToalPage(input.readInt32());
            break;
          }
          case 16: {
            setToalCount(input.readInt32());
            break;
          }
          case 26: {
            ICI value = new ICI();
            input.readMessage(value);
            addImageList(value);
            break;
          }
        }
      }
    }
    
    public static ICL parseFrom(byte[] data)
        throws com.google.protobuf.micro.InvalidProtocolBufferMicroException {
      return (ICL) (new ICL().mergeFrom(data));
    }
    
    public static ICL parseFrom(
            com.google.protobuf.micro.CodedInputStreamMicro input)
        throws java.io.IOException {
      return (ICL) (new ICL().mergeFrom(input));
    }
    
  }
  
}
