/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.navercorp.pinpoint.thrift.dto.command;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-03-16")
public class TMonitorInfo implements org.apache.thrift.TBase<TMonitorInfo, TMonitorInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TMonitorInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMonitorInfo");

  private static final org.apache.thrift.protocol.TField STACK_DEPTH_FIELD_DESC = new org.apache.thrift.protocol.TField("stackDepth", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField STACK_FRAME_FIELD_DESC = new org.apache.thrift.protocol.TField("stackFrame", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMonitorInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMonitorInfoTupleSchemeFactory();

  private int stackDepth; // required
  private java.lang.String stackFrame; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STACK_DEPTH((short)1, "stackDepth"),
    STACK_FRAME((short)2, "stackFrame");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STACK_DEPTH
          return STACK_DEPTH;
        case 2: // STACK_FRAME
          return STACK_FRAME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __STACKDEPTH_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STACK_DEPTH, new org.apache.thrift.meta_data.FieldMetaData("stackDepth", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STACK_FRAME, new org.apache.thrift.meta_data.FieldMetaData("stackFrame", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMonitorInfo.class, metaDataMap);
  }

  public TMonitorInfo() {
  }

  public TMonitorInfo(
    int stackDepth,
    java.lang.String stackFrame)
  {
    this();
    this.stackDepth = stackDepth;
    setStackDepthIsSet(true);
    this.stackFrame = stackFrame;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMonitorInfo(TMonitorInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.stackDepth = other.stackDepth;
    if (other.isSetStackFrame()) {
      this.stackFrame = other.stackFrame;
    }
  }

  public TMonitorInfo deepCopy() {
    return new TMonitorInfo(this);
  }

  @Override
  public void clear() {
    setStackDepthIsSet(false);
    this.stackDepth = 0;
    this.stackFrame = null;
  }

  public int getStackDepth() {
    return this.stackDepth;
  }

  public void setStackDepth(int stackDepth) {
    this.stackDepth = stackDepth;
    setStackDepthIsSet(true);
  }

  public void unsetStackDepth() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STACKDEPTH_ISSET_ID);
  }

  /** Returns true if field stackDepth is set (has been assigned a value) and false otherwise */
  public boolean isSetStackDepth() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STACKDEPTH_ISSET_ID);
  }

  public void setStackDepthIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STACKDEPTH_ISSET_ID, value);
  }

  public java.lang.String getStackFrame() {
    return this.stackFrame;
  }

  public void setStackFrame(java.lang.String stackFrame) {
    this.stackFrame = stackFrame;
  }

  public void unsetStackFrame() {
    this.stackFrame = null;
  }

  /** Returns true if field stackFrame is set (has been assigned a value) and false otherwise */
  public boolean isSetStackFrame() {
    return this.stackFrame != null;
  }

  public void setStackFrameIsSet(boolean value) {
    if (!value) {
      this.stackFrame = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case STACK_DEPTH:
      if (value == null) {
        unsetStackDepth();
      } else {
        setStackDepth((java.lang.Integer)value);
      }
      break;

    case STACK_FRAME:
      if (value == null) {
        unsetStackFrame();
      } else {
        setStackFrame((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STACK_DEPTH:
      return getStackDepth();

    case STACK_FRAME:
      return getStackFrame();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STACK_DEPTH:
      return isSetStackDepth();
    case STACK_FRAME:
      return isSetStackFrame();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TMonitorInfo)
      return this.equals((TMonitorInfo)that);
    return false;
  }

  public boolean equals(TMonitorInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_stackDepth = true;
    boolean that_present_stackDepth = true;
    if (this_present_stackDepth || that_present_stackDepth) {
      if (!(this_present_stackDepth && that_present_stackDepth))
        return false;
      if (this.stackDepth != that.stackDepth)
        return false;
    }

    boolean this_present_stackFrame = true && this.isSetStackFrame();
    boolean that_present_stackFrame = true && that.isSetStackFrame();
    if (this_present_stackFrame || that_present_stackFrame) {
      if (!(this_present_stackFrame && that_present_stackFrame))
        return false;
      if (!this.stackFrame.equals(that.stackFrame))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + stackDepth;

    hashCode = hashCode * 8191 + ((isSetStackFrame()) ? 131071 : 524287);
    if (isSetStackFrame())
      hashCode = hashCode * 8191 + stackFrame.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TMonitorInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStackDepth()).compareTo(other.isSetStackDepth());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStackDepth()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stackDepth, other.stackDepth);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStackFrame()).compareTo(other.isSetStackFrame());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStackFrame()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stackFrame, other.stackFrame);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMonitorInfo(");
    boolean first = true;

    sb.append("stackDepth:");
    sb.append(this.stackDepth);
    first = false;
    if (!first) sb.append(", ");
    sb.append("stackFrame:");
    if (this.stackFrame == null) {
      sb.append("null");
    } else {
      sb.append(this.stackFrame);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TMonitorInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMonitorInfoStandardScheme getScheme() {
      return new TMonitorInfoStandardScheme();
    }
  }

  private static class TMonitorInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMonitorInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TMonitorInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STACK_DEPTH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.stackDepth = iprot.readI32();
              struct.setStackDepthIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STACK_FRAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stackFrame = iprot.readString();
              struct.setStackFrameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TMonitorInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(STACK_DEPTH_FIELD_DESC);
      oprot.writeI32(struct.stackDepth);
      oprot.writeFieldEnd();
      if (struct.stackFrame != null) {
        oprot.writeFieldBegin(STACK_FRAME_FIELD_DESC);
        oprot.writeString(struct.stackFrame);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMonitorInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMonitorInfoTupleScheme getScheme() {
      return new TMonitorInfoTupleScheme();
    }
  }

  private static class TMonitorInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMonitorInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMonitorInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStackDepth()) {
        optionals.set(0);
      }
      if (struct.isSetStackFrame()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetStackDepth()) {
        oprot.writeI32(struct.stackDepth);
      }
      if (struct.isSetStackFrame()) {
        oprot.writeString(struct.stackFrame);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMonitorInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.stackDepth = iprot.readI32();
        struct.setStackDepthIsSet(true);
      }
      if (incoming.get(1)) {
        struct.stackFrame = iprot.readString();
        struct.setStackFrameIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
