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

public class Type implements org.apache.thrift.TBase<Type, Type._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Type");

  private static final org.apache.thrift.protocol.TField TYPES_FIELD_DESC = new org.apache.thrift.protocol.TField("types", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField ROOT_FIELD_DESC = new org.apache.thrift.protocol.TField("root", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TypeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TypeTupleSchemeFactory());
  }

  public Map<Integer,Typ> types; // required
  public int root; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TYPES((short)1, "types"),
    ROOT((short)2, "root");

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
        case 1: // TYPES
          return TYPES;
        case 2: // ROOT
          return ROOT;
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
  private static final int __ROOT_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPES, new org.apache.thrift.meta_data.FieldMetaData("types", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32            , "Index"), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Typ.class))));
    tmpMap.put(_Fields.ROOT, new org.apache.thrift.meta_data.FieldMetaData("root", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Index")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Type.class, metaDataMap);
  }

  public Type() {
  }

  public Type(
    Map<Integer,Typ> types,
    int root)
  {
    this();
    this.types = types;
    this.root = root;
    setRootIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Type(Type other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetTypes()) {
      Map<Integer,Typ> __this__types = new HashMap<Integer,Typ>();
      for (Map.Entry<Integer, Typ> other_element : other.types.entrySet()) {

        Integer other_element_key = other_element.getKey();
        Typ other_element_value = other_element.getValue();

        Integer __this__types_copy_key = other_element_key;

        Typ __this__types_copy_value = new Typ(other_element_value);

        __this__types.put(__this__types_copy_key, __this__types_copy_value);
      }
      this.types = __this__types;
    }
    this.root = other.root;
  }

  public Type deepCopy() {
    return new Type(this);
  }

  @Override
  public void clear() {
    this.types = null;
    setRootIsSet(false);
    this.root = 0;
  }

  public int getTypesSize() {
    return (this.types == null) ? 0 : this.types.size();
  }

  public void putToTypes(int key, Typ val) {
    if (this.types == null) {
      this.types = new HashMap<Integer,Typ>();
    }
    this.types.put(key, val);
  }

  public Map<Integer,Typ> getTypes() {
    return this.types;
  }

  public Type setTypes(Map<Integer,Typ> types) {
    this.types = types;
    return this;
  }

  public void unsetTypes() {
    this.types = null;
  }

  /** Returns true if field types is set (has been assigned a value) and false otherwise */
  public boolean isSetTypes() {
    return this.types != null;
  }

  public void setTypesIsSet(boolean value) {
    if (!value) {
      this.types = null;
    }
  }

  public int getRoot() {
    return this.root;
  }

  public Type setRoot(int root) {
    this.root = root;
    setRootIsSet(true);
    return this;
  }

  public void unsetRoot() {
    __isset_bit_vector.clear(__ROOT_ISSET_ID);
  }

  /** Returns true if field root is set (has been assigned a value) and false otherwise */
  public boolean isSetRoot() {
    return __isset_bit_vector.get(__ROOT_ISSET_ID);
  }

  public void setRootIsSet(boolean value) {
    __isset_bit_vector.set(__ROOT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPES:
      if (value == null) {
        unsetTypes();
      } else {
        setTypes((Map<Integer,Typ>)value);
      }
      break;

    case ROOT:
      if (value == null) {
        unsetRoot();
      } else {
        setRoot((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPES:
      return getTypes();

    case ROOT:
      return Integer.valueOf(getRoot());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPES:
      return isSetTypes();
    case ROOT:
      return isSetRoot();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Type)
      return this.equals((Type)that);
    return false;
  }

  public boolean equals(Type that) {
    if (that == null)
      return false;

    boolean this_present_types = true && this.isSetTypes();
    boolean that_present_types = true && that.isSetTypes();
    if (this_present_types || that_present_types) {
      if (!(this_present_types && that_present_types))
        return false;
      if (!this.types.equals(that.types))
        return false;
    }

    boolean this_present_root = true;
    boolean that_present_root = true;
    if (this_present_root || that_present_root) {
      if (!(this_present_root && that_present_root))
        return false;
      if (this.root != that.root)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Type other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Type typedOther = (Type)other;

    lastComparison = Boolean.valueOf(isSetTypes()).compareTo(typedOther.isSetTypes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTypes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.types, typedOther.types);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRoot()).compareTo(typedOther.isSetRoot());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoot()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.root, typedOther.root);
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
    StringBuilder sb = new StringBuilder("Type(");
    boolean first = true;

    sb.append("types:");
    if (this.types == null) {
      sb.append("null");
    } else {
      sb.append(this.types);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("root:");
    sb.append(this.root);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TypeStandardSchemeFactory implements SchemeFactory {
    public TypeStandardScheme getScheme() {
      return new TypeStandardScheme();
    }
  }

  private static class TypeStandardScheme extends StandardScheme<Type> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Type struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.types = new HashMap<Integer,Typ>(2*_map0.size);
                for (int _i1 = 0; _i1 < _map0.size; ++_i1)
                {
                  int _key2; // required
                  Typ _val3; // required
                  _key2 = iprot.readI32();
                  _val3 = new Typ();
                  _val3.read(iprot);
                  struct.types.put(_key2, _val3);
                }
                iprot.readMapEnd();
              }
              struct.setTypesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ROOT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.root = iprot.readI32();
              struct.setRootIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Type struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.types != null) {
        oprot.writeFieldBegin(TYPES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, struct.types.size()));
          for (Map.Entry<Integer, Typ> _iter4 : struct.types.entrySet())
          {
            oprot.writeI32(_iter4.getKey());
            _iter4.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ROOT_FIELD_DESC);
      oprot.writeI32(struct.root);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TypeTupleSchemeFactory implements SchemeFactory {
    public TypeTupleScheme getScheme() {
      return new TypeTupleScheme();
    }
  }

  private static class TypeTupleScheme extends TupleScheme<Type> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Type struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTypes()) {
        optionals.set(0);
      }
      if (struct.isSetRoot()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTypes()) {
        {
          oprot.writeI32(struct.types.size());
          for (Map.Entry<Integer, Typ> _iter5 : struct.types.entrySet())
          {
            oprot.writeI32(_iter5.getKey());
            _iter5.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetRoot()) {
        oprot.writeI32(struct.root);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Type struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.types = new HashMap<Integer,Typ>(2*_map6.size);
          for (int _i7 = 0; _i7 < _map6.size; ++_i7)
          {
            int _key8; // required
            Typ _val9; // required
            _key8 = iprot.readI32();
            _val9 = new Typ();
            _val9.read(iprot);
            struct.types.put(_key8, _val9);
          }
        }
        struct.setTypesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.root = iprot.readI32();
        struct.setRootIsSet(true);
      }
    }
  }

}

