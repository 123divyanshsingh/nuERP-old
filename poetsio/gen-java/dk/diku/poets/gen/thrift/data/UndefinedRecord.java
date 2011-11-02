/**
 * Autogenerated by Thrift Compiler (0.8.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package dk.diku.poets.gen.thrift.data;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UndefinedRecord extends Exception implements org.apache.thrift.TBase<UndefinedRecord, UndefinedRecord._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UndefinedRecord");

  private static final org.apache.thrift.protocol.TField RECORD_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("recordName", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UndefinedRecordStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UndefinedRecordTupleSchemeFactory());
  }

  public String recordName; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RECORD_NAME((short)1, "recordName");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // RECORD_NAME
          return RECORD_NAME;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RECORD_NAME, new org.apache.thrift.meta_data.FieldMetaData("recordName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "RecordName")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UndefinedRecord.class, metaDataMap);
  }

  public UndefinedRecord() {
  }

  public UndefinedRecord(
    String recordName)
  {
    this();
    this.recordName = recordName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UndefinedRecord(UndefinedRecord other) {
    if (other.isSetRecordName()) {
      this.recordName = other.recordName;
    }
  }

  public UndefinedRecord deepCopy() {
    return new UndefinedRecord(this);
  }

  @Override
  public void clear() {
    this.recordName = null;
  }

  public String getRecordName() {
    return this.recordName;
  }

  public UndefinedRecord setRecordName(String recordName) {
    this.recordName = recordName;
    return this;
  }

  public void unsetRecordName() {
    this.recordName = null;
  }

  /** Returns true if field recordName is set (has been assigned a value) and false otherwise */
  public boolean isSetRecordName() {
    return this.recordName != null;
  }

  public void setRecordNameIsSet(boolean value) {
    if (!value) {
      this.recordName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RECORD_NAME:
      if (value == null) {
        unsetRecordName();
      } else {
        setRecordName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RECORD_NAME:
      return getRecordName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RECORD_NAME:
      return isSetRecordName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UndefinedRecord)
      return this.equals((UndefinedRecord)that);
    return false;
  }

  public boolean equals(UndefinedRecord that) {
    if (that == null)
      return false;

    boolean this_present_recordName = true && this.isSetRecordName();
    boolean that_present_recordName = true && that.isSetRecordName();
    if (this_present_recordName || that_present_recordName) {
      if (!(this_present_recordName && that_present_recordName))
        return false;
      if (!this.recordName.equals(that.recordName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(UndefinedRecord other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    UndefinedRecord typedOther = (UndefinedRecord)other;

    lastComparison = Boolean.valueOf(isSetRecordName()).compareTo(typedOther.isSetRecordName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecordName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recordName, typedOther.recordName);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("UndefinedRecord(");
    boolean first = true;

    sb.append("recordName:");
    if (this.recordName == null) {
      sb.append("null");
    } else {
      sb.append(this.recordName);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UndefinedRecordStandardSchemeFactory implements SchemeFactory {
    public UndefinedRecordStandardScheme getScheme() {
      return new UndefinedRecordStandardScheme();
    }
  }

  private static class UndefinedRecordStandardScheme extends StandardScheme<UndefinedRecord> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UndefinedRecord struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RECORD_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.recordName = iprot.readString();
              struct.setRecordNameIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, UndefinedRecord struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.recordName != null) {
        oprot.writeFieldBegin(RECORD_NAME_FIELD_DESC);
        oprot.writeString(struct.recordName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UndefinedRecordTupleSchemeFactory implements SchemeFactory {
    public UndefinedRecordTupleScheme getScheme() {
      return new UndefinedRecordTupleScheme();
    }
  }

  private static class UndefinedRecordTupleScheme extends TupleScheme<UndefinedRecord> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UndefinedRecord struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRecordName()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetRecordName()) {
        oprot.writeString(struct.recordName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UndefinedRecord struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.recordName = iprot.readString();
        struct.setRecordNameIsSet(true);
      }
    }
  }

}
