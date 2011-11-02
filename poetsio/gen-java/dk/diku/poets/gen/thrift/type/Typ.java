/**
 * Autogenerated by Thrift Compiler (0.8.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package dk.diku.poets.gen.thrift.type;

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

public class Typ implements org.apache.thrift.TBase<Typ, Typ._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Typ");

  private static final org.apache.thrift.protocol.TField TYPE_CONSTANT_FIELD_DESC = new org.apache.thrift.protocol.TField("typeConstant", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TYPE_RECORD_FIELD_DESC = new org.apache.thrift.protocol.TField("typeRecord", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TYPE_REF_FIELD_DESC = new org.apache.thrift.protocol.TField("typeRef", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TYPE_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("typeList", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TypStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TypTupleSchemeFactory());
  }

  /**
   * 
   * @see TypeConstant
   */
  public TypeConstant typeConstant; // required
  public String typeRecord; // required
  public String typeRef; // required
  public int typeList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TypeConstant
     */
    TYPE_CONSTANT((short)1, "typeConstant"),
    TYPE_RECORD((short)2, "typeRecord"),
    TYPE_REF((short)3, "typeRef"),
    TYPE_LIST((short)4, "typeList");

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
        case 1: // TYPE_CONSTANT
          return TYPE_CONSTANT;
        case 2: // TYPE_RECORD
          return TYPE_RECORD;
        case 3: // TYPE_REF
          return TYPE_REF;
        case 4: // TYPE_LIST
          return TYPE_LIST;
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
  private static final int __TYPELIST_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);
  private _Fields optionals[] = {_Fields.TYPE_CONSTANT,_Fields.TYPE_RECORD,_Fields.TYPE_REF,_Fields.TYPE_LIST};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE_CONSTANT, new org.apache.thrift.meta_data.FieldMetaData("typeConstant", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TypeConstant.class)));
    tmpMap.put(_Fields.TYPE_RECORD, new org.apache.thrift.meta_data.FieldMetaData("typeRecord", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "RecordName")));
    tmpMap.put(_Fields.TYPE_REF, new org.apache.thrift.meta_data.FieldMetaData("typeRef", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "RecordName")));
    tmpMap.put(_Fields.TYPE_LIST, new org.apache.thrift.meta_data.FieldMetaData("typeList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Index")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Typ.class, metaDataMap);
  }

  public Typ() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Typ(Typ other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetTypeConstant()) {
      this.typeConstant = other.typeConstant;
    }
    if (other.isSetTypeRecord()) {
      this.typeRecord = other.typeRecord;
    }
    if (other.isSetTypeRef()) {
      this.typeRef = other.typeRef;
    }
    this.typeList = other.typeList;
  }

  public Typ deepCopy() {
    return new Typ(this);
  }

  @Override
  public void clear() {
    this.typeConstant = null;
    this.typeRecord = null;
    this.typeRef = null;
    setTypeListIsSet(false);
    this.typeList = 0;
  }

  /**
   * 
   * @see TypeConstant
   */
  public TypeConstant getTypeConstant() {
    return this.typeConstant;
  }

  /**
   * 
   * @see TypeConstant
   */
  public Typ setTypeConstant(TypeConstant typeConstant) {
    this.typeConstant = typeConstant;
    return this;
  }

  public void unsetTypeConstant() {
    this.typeConstant = null;
  }

  /** Returns true if field typeConstant is set (has been assigned a value) and false otherwise */
  public boolean isSetTypeConstant() {
    return this.typeConstant != null;
  }

  public void setTypeConstantIsSet(boolean value) {
    if (!value) {
      this.typeConstant = null;
    }
  }

  public String getTypeRecord() {
    return this.typeRecord;
  }

  public Typ setTypeRecord(String typeRecord) {
    this.typeRecord = typeRecord;
    return this;
  }

  public void unsetTypeRecord() {
    this.typeRecord = null;
  }

  /** Returns true if field typeRecord is set (has been assigned a value) and false otherwise */
  public boolean isSetTypeRecord() {
    return this.typeRecord != null;
  }

  public void setTypeRecordIsSet(boolean value) {
    if (!value) {
      this.typeRecord = null;
    }
  }

  public String getTypeRef() {
    return this.typeRef;
  }

  public Typ setTypeRef(String typeRef) {
    this.typeRef = typeRef;
    return this;
  }

  public void unsetTypeRef() {
    this.typeRef = null;
  }

  /** Returns true if field typeRef is set (has been assigned a value) and false otherwise */
  public boolean isSetTypeRef() {
    return this.typeRef != null;
  }

  public void setTypeRefIsSet(boolean value) {
    if (!value) {
      this.typeRef = null;
    }
  }

  public int getTypeList() {
    return this.typeList;
  }

  public Typ setTypeList(int typeList) {
    this.typeList = typeList;
    setTypeListIsSet(true);
    return this;
  }

  public void unsetTypeList() {
    __isset_bit_vector.clear(__TYPELIST_ISSET_ID);
  }

  /** Returns true if field typeList is set (has been assigned a value) and false otherwise */
  public boolean isSetTypeList() {
    return __isset_bit_vector.get(__TYPELIST_ISSET_ID);
  }

  public void setTypeListIsSet(boolean value) {
    __isset_bit_vector.set(__TYPELIST_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE_CONSTANT:
      if (value == null) {
        unsetTypeConstant();
      } else {
        setTypeConstant((TypeConstant)value);
      }
      break;

    case TYPE_RECORD:
      if (value == null) {
        unsetTypeRecord();
      } else {
        setTypeRecord((String)value);
      }
      break;

    case TYPE_REF:
      if (value == null) {
        unsetTypeRef();
      } else {
        setTypeRef((String)value);
      }
      break;

    case TYPE_LIST:
      if (value == null) {
        unsetTypeList();
      } else {
        setTypeList((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE_CONSTANT:
      return getTypeConstant();

    case TYPE_RECORD:
      return getTypeRecord();

    case TYPE_REF:
      return getTypeRef();

    case TYPE_LIST:
      return Integer.valueOf(getTypeList());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE_CONSTANT:
      return isSetTypeConstant();
    case TYPE_RECORD:
      return isSetTypeRecord();
    case TYPE_REF:
      return isSetTypeRef();
    case TYPE_LIST:
      return isSetTypeList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Typ)
      return this.equals((Typ)that);
    return false;
  }

  public boolean equals(Typ that) {
    if (that == null)
      return false;

    boolean this_present_typeConstant = true && this.isSetTypeConstant();
    boolean that_present_typeConstant = true && that.isSetTypeConstant();
    if (this_present_typeConstant || that_present_typeConstant) {
      if (!(this_present_typeConstant && that_present_typeConstant))
        return false;
      if (!this.typeConstant.equals(that.typeConstant))
        return false;
    }

    boolean this_present_typeRecord = true && this.isSetTypeRecord();
    boolean that_present_typeRecord = true && that.isSetTypeRecord();
    if (this_present_typeRecord || that_present_typeRecord) {
      if (!(this_present_typeRecord && that_present_typeRecord))
        return false;
      if (!this.typeRecord.equals(that.typeRecord))
        return false;
    }

    boolean this_present_typeRef = true && this.isSetTypeRef();
    boolean that_present_typeRef = true && that.isSetTypeRef();
    if (this_present_typeRef || that_present_typeRef) {
      if (!(this_present_typeRef && that_present_typeRef))
        return false;
      if (!this.typeRef.equals(that.typeRef))
        return false;
    }

    boolean this_present_typeList = true && this.isSetTypeList();
    boolean that_present_typeList = true && that.isSetTypeList();
    if (this_present_typeList || that_present_typeList) {
      if (!(this_present_typeList && that_present_typeList))
        return false;
      if (this.typeList != that.typeList)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Typ other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Typ typedOther = (Typ)other;

    lastComparison = Boolean.valueOf(isSetTypeConstant()).compareTo(typedOther.isSetTypeConstant());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTypeConstant()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.typeConstant, typedOther.typeConstant);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTypeRecord()).compareTo(typedOther.isSetTypeRecord());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTypeRecord()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.typeRecord, typedOther.typeRecord);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTypeRef()).compareTo(typedOther.isSetTypeRef());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTypeRef()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.typeRef, typedOther.typeRef);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTypeList()).compareTo(typedOther.isSetTypeList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTypeList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.typeList, typedOther.typeList);
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
    StringBuilder sb = new StringBuilder("Typ(");
    boolean first = true;

    if (isSetTypeConstant()) {
      sb.append("typeConstant:");
      if (this.typeConstant == null) {
        sb.append("null");
      } else {
        sb.append(this.typeConstant);
      }
      first = false;
    }
    if (isSetTypeRecord()) {
      if (!first) sb.append(", ");
      sb.append("typeRecord:");
      if (this.typeRecord == null) {
        sb.append("null");
      } else {
        sb.append(this.typeRecord);
      }
      first = false;
    }
    if (isSetTypeRef()) {
      if (!first) sb.append(", ");
      sb.append("typeRef:");
      if (this.typeRef == null) {
        sb.append("null");
      } else {
        sb.append(this.typeRef);
      }
      first = false;
    }
    if (isSetTypeList()) {
      if (!first) sb.append(", ");
      sb.append("typeList:");
      sb.append(this.typeList);
      first = false;
    }
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TypStandardSchemeFactory implements SchemeFactory {
    public TypStandardScheme getScheme() {
      return new TypStandardScheme();
    }
  }

  private static class TypStandardScheme extends StandardScheme<Typ> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Typ struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE_CONSTANT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.typeConstant = TypeConstant.findByValue(iprot.readI32());
              struct.setTypeConstantIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TYPE_RECORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.typeRecord = iprot.readString();
              struct.setTypeRecordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TYPE_REF
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.typeRef = iprot.readString();
              struct.setTypeRefIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TYPE_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.typeList = iprot.readI32();
              struct.setTypeListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Typ struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.typeConstant != null) {
        if (struct.isSetTypeConstant()) {
          oprot.writeFieldBegin(TYPE_CONSTANT_FIELD_DESC);
          oprot.writeI32(struct.typeConstant.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.typeRecord != null) {
        if (struct.isSetTypeRecord()) {
          oprot.writeFieldBegin(TYPE_RECORD_FIELD_DESC);
          oprot.writeString(struct.typeRecord);
          oprot.writeFieldEnd();
        }
      }
      if (struct.typeRef != null) {
        if (struct.isSetTypeRef()) {
          oprot.writeFieldBegin(TYPE_REF_FIELD_DESC);
          oprot.writeString(struct.typeRef);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTypeList()) {
        oprot.writeFieldBegin(TYPE_LIST_FIELD_DESC);
        oprot.writeI32(struct.typeList);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TypTupleSchemeFactory implements SchemeFactory {
    public TypTupleScheme getScheme() {
      return new TypTupleScheme();
    }
  }

  private static class TypTupleScheme extends TupleScheme<Typ> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Typ struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTypeConstant()) {
        optionals.set(0);
      }
      if (struct.isSetTypeRecord()) {
        optionals.set(1);
      }
      if (struct.isSetTypeRef()) {
        optionals.set(2);
      }
      if (struct.isSetTypeList()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTypeConstant()) {
        oprot.writeI32(struct.typeConstant.getValue());
      }
      if (struct.isSetTypeRecord()) {
        oprot.writeString(struct.typeRecord);
      }
      if (struct.isSetTypeRef()) {
        oprot.writeString(struct.typeRef);
      }
      if (struct.isSetTypeList()) {
        oprot.writeI32(struct.typeList);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Typ struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.typeConstant = TypeConstant.findByValue(iprot.readI32());
        struct.setTypeConstantIsSet(true);
      }
      if (incoming.get(1)) {
        struct.typeRecord = iprot.readString();
        struct.setTypeRecordIsSet(true);
      }
      if (incoming.get(2)) {
        struct.typeRef = iprot.readString();
        struct.setTypeRefIsSet(true);
      }
      if (incoming.get(3)) {
        struct.typeList = iprot.readI32();
        struct.setTypeListIsSet(true);
      }
    }
  }

}

