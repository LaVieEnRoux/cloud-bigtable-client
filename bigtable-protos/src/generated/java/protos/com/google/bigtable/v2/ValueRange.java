// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/data.proto

package com.google.bigtable.v2;

/**
 * Protobuf type {@code google.bigtable.v2.ValueRange}
 *
 * <pre>
 * Specifies a contiguous range of raw byte values.
 * </pre>
 */
public  final class ValueRange extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.bigtable.v2.ValueRange)
    ValueRangeOrBuilder {
  // Use ValueRange.newBuilder() to construct.
  private ValueRange(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ValueRange() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ValueRange(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            startValueCase_ = 1;
            startValue_ = input.readBytes();
            break;
          }
          case 18: {
            startValueCase_ = 2;
            startValue_ = input.readBytes();
            break;
          }
          case 26: {
            endValueCase_ = 3;
            endValue_ = input.readBytes();
            break;
          }
          case 34: {
            endValueCase_ = 4;
            endValue_ = input.readBytes();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_ValueRange_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_ValueRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.v2.ValueRange.class, com.google.bigtable.v2.ValueRange.Builder.class);
  }

  private int startValueCase_ = 0;
  private java.lang.Object startValue_;
  public enum StartValueCase
      implements com.google.protobuf.Internal.EnumLite {
    START_VALUE_CLOSED(1),
    START_VALUE_OPEN(2),
    STARTVALUE_NOT_SET(0);
    private int value = 0;
    private StartValueCase(int value) {
      this.value = value;
    }
    public static StartValueCase valueOf(int value) {
      switch (value) {
        case 1: return START_VALUE_CLOSED;
        case 2: return START_VALUE_OPEN;
        case 0: return STARTVALUE_NOT_SET;
        default: throw new java.lang.IllegalArgumentException(
          "Value is undefined for this oneof enum.");
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public StartValueCase
  getStartValueCase() {
    return StartValueCase.valueOf(
        startValueCase_);
  }

  private int endValueCase_ = 0;
  private java.lang.Object endValue_;
  public enum EndValueCase
      implements com.google.protobuf.Internal.EnumLite {
    END_VALUE_CLOSED(3),
    END_VALUE_OPEN(4),
    ENDVALUE_NOT_SET(0);
    private int value = 0;
    private EndValueCase(int value) {
      this.value = value;
    }
    public static EndValueCase valueOf(int value) {
      switch (value) {
        case 3: return END_VALUE_CLOSED;
        case 4: return END_VALUE_OPEN;
        case 0: return ENDVALUE_NOT_SET;
        default: throw new java.lang.IllegalArgumentException(
          "Value is undefined for this oneof enum.");
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public EndValueCase
  getEndValueCase() {
    return EndValueCase.valueOf(
        endValueCase_);
  }

  public static final int START_VALUE_CLOSED_FIELD_NUMBER = 1;
  /**
   * <code>optional bytes start_value_closed = 1;</code>
   *
   * <pre>
   * Used when giving an inclusive lower bound for the range.
   * </pre>
   */
  public com.google.protobuf.ByteString getStartValueClosed() {
    if (startValueCase_ == 1) {
      return (com.google.protobuf.ByteString) startValue_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int START_VALUE_OPEN_FIELD_NUMBER = 2;
  /**
   * <code>optional bytes start_value_open = 2;</code>
   *
   * <pre>
   * Used when giving an exclusive lower bound for the range.
   * </pre>
   */
  public com.google.protobuf.ByteString getStartValueOpen() {
    if (startValueCase_ == 2) {
      return (com.google.protobuf.ByteString) startValue_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int END_VALUE_CLOSED_FIELD_NUMBER = 3;
  /**
   * <code>optional bytes end_value_closed = 3;</code>
   *
   * <pre>
   * Used when giving an inclusive upper bound for the range.
   * </pre>
   */
  public com.google.protobuf.ByteString getEndValueClosed() {
    if (endValueCase_ == 3) {
      return (com.google.protobuf.ByteString) endValue_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int END_VALUE_OPEN_FIELD_NUMBER = 4;
  /**
   * <code>optional bytes end_value_open = 4;</code>
   *
   * <pre>
   * Used when giving an exclusive upper bound for the range.
   * </pre>
   */
  public com.google.protobuf.ByteString getEndValueOpen() {
    if (endValueCase_ == 4) {
      return (com.google.protobuf.ByteString) endValue_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (startValueCase_ == 1) {
      output.writeBytes(
          1, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) startValue_));
    }
    if (startValueCase_ == 2) {
      output.writeBytes(
          2, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) startValue_));
    }
    if (endValueCase_ == 3) {
      output.writeBytes(
          3, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) endValue_));
    }
    if (endValueCase_ == 4) {
      output.writeBytes(
          4, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) endValue_));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startValueCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            1, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) startValue_));
    }
    if (startValueCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            2, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) startValue_));
    }
    if (endValueCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            3, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) endValue_));
    }
    if (endValueCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            4, (com.google.protobuf.ByteString)((com.google.protobuf.ByteString) endValue_));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.bigtable.v2.ValueRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v2.ValueRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v2.ValueRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.v2.ValueRange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.v2.ValueRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.v2.ValueRange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.v2.ValueRange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.bigtable.v2.ValueRange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.bigtable.v2.ValueRange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.bigtable.v2.ValueRange parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.bigtable.v2.ValueRange prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.bigtable.v2.ValueRange}
   *
   * <pre>
   * Specifies a contiguous range of raw byte values.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.v2.ValueRange)
      com.google.bigtable.v2.ValueRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_ValueRange_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_ValueRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.v2.ValueRange.class, com.google.bigtable.v2.ValueRange.Builder.class);
    }

    // Construct using com.google.bigtable.v2.ValueRange.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      startValueCase_ = 0;
      startValue_ = null;
      endValueCase_ = 0;
      endValue_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.v2.DataProto.internal_static_google_bigtable_v2_ValueRange_descriptor;
    }

    public com.google.bigtable.v2.ValueRange getDefaultInstanceForType() {
      return com.google.bigtable.v2.ValueRange.getDefaultInstance();
    }

    public com.google.bigtable.v2.ValueRange build() {
      com.google.bigtable.v2.ValueRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.bigtable.v2.ValueRange buildPartial() {
      com.google.bigtable.v2.ValueRange result = new com.google.bigtable.v2.ValueRange(this);
      if (startValueCase_ == 1) {
        result.startValue_ = startValue_;
      }
      if (startValueCase_ == 2) {
        result.startValue_ = startValue_;
      }
      if (endValueCase_ == 3) {
        result.endValue_ = endValue_;
      }
      if (endValueCase_ == 4) {
        result.endValue_ = endValue_;
      }
      result.startValueCase_ = startValueCase_;
      result.endValueCase_ = endValueCase_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.v2.ValueRange) {
        return mergeFrom((com.google.bigtable.v2.ValueRange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.v2.ValueRange other) {
      if (other == com.google.bigtable.v2.ValueRange.getDefaultInstance()) return this;
      switch (other.getStartValueCase()) {
        case START_VALUE_CLOSED: {
          setStartValueClosed(other.getStartValueClosed());
          break;
        }
        case START_VALUE_OPEN: {
          setStartValueOpen(other.getStartValueOpen());
          break;
        }
        case STARTVALUE_NOT_SET: {
          break;
        }
      }
      switch (other.getEndValueCase()) {
        case END_VALUE_CLOSED: {
          setEndValueClosed(other.getEndValueClosed());
          break;
        }
        case END_VALUE_OPEN: {
          setEndValueOpen(other.getEndValueOpen());
          break;
        }
        case ENDVALUE_NOT_SET: {
          break;
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.bigtable.v2.ValueRange parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.v2.ValueRange) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int startValueCase_ = 0;
    private java.lang.Object startValue_;
    public StartValueCase
        getStartValueCase() {
      return StartValueCase.valueOf(
          startValueCase_);
    }

    public Builder clearStartValue() {
      startValueCase_ = 0;
      startValue_ = null;
      onChanged();
      return this;
    }

    private int endValueCase_ = 0;
    private java.lang.Object endValue_;
    public EndValueCase
        getEndValueCase() {
      return EndValueCase.valueOf(
          endValueCase_);
    }

    public Builder clearEndValue() {
      endValueCase_ = 0;
      endValue_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>optional bytes start_value_closed = 1;</code>
     *
     * <pre>
     * Used when giving an inclusive lower bound for the range.
     * </pre>
     */
    public com.google.protobuf.ByteString getStartValueClosed() {
      if (startValueCase_ == 1) {
        return (com.google.protobuf.ByteString) startValue_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <code>optional bytes start_value_closed = 1;</code>
     *
     * <pre>
     * Used when giving an inclusive lower bound for the range.
     * </pre>
     */
    public Builder setStartValueClosed(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  startValueCase_ = 1;
      startValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes start_value_closed = 1;</code>
     *
     * <pre>
     * Used when giving an inclusive lower bound for the range.
     * </pre>
     */
    public Builder clearStartValueClosed() {
      if (startValueCase_ == 1) {
        startValueCase_ = 0;
        startValue_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>optional bytes start_value_open = 2;</code>
     *
     * <pre>
     * Used when giving an exclusive lower bound for the range.
     * </pre>
     */
    public com.google.protobuf.ByteString getStartValueOpen() {
      if (startValueCase_ == 2) {
        return (com.google.protobuf.ByteString) startValue_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <code>optional bytes start_value_open = 2;</code>
     *
     * <pre>
     * Used when giving an exclusive lower bound for the range.
     * </pre>
     */
    public Builder setStartValueOpen(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  startValueCase_ = 2;
      startValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes start_value_open = 2;</code>
     *
     * <pre>
     * Used when giving an exclusive lower bound for the range.
     * </pre>
     */
    public Builder clearStartValueOpen() {
      if (startValueCase_ == 2) {
        startValueCase_ = 0;
        startValue_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>optional bytes end_value_closed = 3;</code>
     *
     * <pre>
     * Used when giving an inclusive upper bound for the range.
     * </pre>
     */
    public com.google.protobuf.ByteString getEndValueClosed() {
      if (endValueCase_ == 3) {
        return (com.google.protobuf.ByteString) endValue_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <code>optional bytes end_value_closed = 3;</code>
     *
     * <pre>
     * Used when giving an inclusive upper bound for the range.
     * </pre>
     */
    public Builder setEndValueClosed(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  endValueCase_ = 3;
      endValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes end_value_closed = 3;</code>
     *
     * <pre>
     * Used when giving an inclusive upper bound for the range.
     * </pre>
     */
    public Builder clearEndValueClosed() {
      if (endValueCase_ == 3) {
        endValueCase_ = 0;
        endValue_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>optional bytes end_value_open = 4;</code>
     *
     * <pre>
     * Used when giving an exclusive upper bound for the range.
     * </pre>
     */
    public com.google.protobuf.ByteString getEndValueOpen() {
      if (endValueCase_ == 4) {
        return (com.google.protobuf.ByteString) endValue_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <code>optional bytes end_value_open = 4;</code>
     *
     * <pre>
     * Used when giving an exclusive upper bound for the range.
     * </pre>
     */
    public Builder setEndValueOpen(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  endValueCase_ = 4;
      endValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes end_value_open = 4;</code>
     *
     * <pre>
     * Used when giving an exclusive upper bound for the range.
     * </pre>
     */
    public Builder clearEndValueOpen() {
      if (endValueCase_ == 4) {
        endValueCase_ = 0;
        endValue_ = null;
        onChanged();
      }
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.bigtable.v2.ValueRange)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.v2.ValueRange)
  private static final com.google.bigtable.v2.ValueRange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.v2.ValueRange();
  }

  public static com.google.bigtable.v2.ValueRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValueRange>
      PARSER = new com.google.protobuf.AbstractParser<ValueRange>() {
    public ValueRange parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ValueRange(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<ValueRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValueRange> getParserForType() {
    return PARSER;
  }

  public com.google.bigtable.v2.ValueRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
