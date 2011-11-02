/**
 * Autogenerated by Thrift Compiler (0.8.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package dk.diku.poets.gen.thrift.contracts;

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

public class Expression implements org.apache.thrift.TBase<Expression, Expression._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Expression");

  private static final org.apache.thrift.protocol.TField EXPRESSIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("expressions", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField ROOT_FIELD_DESC = new org.apache.thrift.protocol.TField("root", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ExpressionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ExpressionTupleSchemeFactory());
  }

  public Map<Integer,Exp> expressions; // required
  public int root; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXPRESSIONS((short)1, "expressions"),
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
        case 1: // EXPRESSIONS
          return EXPRESSIONS;
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
    tmpMap.put(_Fields.EXPRESSIONS, new org.apache.thrift.meta_data.FieldMetaData("expressions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32            , "Index"), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Exp.class))));
    tmpMap.put(_Fields.ROOT, new org.apache.thrift.meta_data.FieldMetaData("root", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Index")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Expression.class, metaDataMap);
  }

  public Expression() {
  }

  public Expression(
    Map<Integer,Exp> expressions,
    int root)
  {
    this();
    this.expressions = expressions;
    this.root = root;
    setRootIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Expression(Expression other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetExpressions()) {
      Map<Integer,Exp> __this__expressions = new HashMap<Integer,Exp>();
      for (Map.Entry<Integer, Exp> other_element : other.expressions.entrySet()) {

        Integer other_element_key = other_element.getKey();
        Exp other_element_value = other_element.getValue();

        Integer __this__expressions_copy_key = other_element_key;

        Exp __this__expressions_copy_value = new Exp(other_element_value);

        __this__expressions.put(__this__expressions_copy_key, __this__expressions_copy_value);
      }
      this.expressions = __this__expressions;
    }
    this.root = other.root;
  }

  public Expression deepCopy() {
    return new Expression(this);
  }

  @Override
  public void clear() {
    this.expressions = null;
    setRootIsSet(false);
    this.root = 0;
  }

  public int getExpressionsSize() {
    return (this.expressions == null) ? 0 : this.expressions.size();
  }

  public void putToExpressions(int key, Exp val) {
    if (this.expressions == null) {
      this.expressions = new HashMap<Integer,Exp>();
    }
    this.expressions.put(key, val);
  }

  public Map<Integer,Exp> getExpressions() {
    return this.expressions;
  }

  public Expression setExpressions(Map<Integer,Exp> expressions) {
    this.expressions = expressions;
    return this;
  }

  public void unsetExpressions() {
    this.expressions = null;
  }

  /** Returns true if field expressions is set (has been assigned a value) and false otherwise */
  public boolean isSetExpressions() {
    return this.expressions != null;
  }

  public void setExpressionsIsSet(boolean value) {
    if (!value) {
      this.expressions = null;
    }
  }

  public int getRoot() {
    return this.root;
  }

  public Expression setRoot(int root) {
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
    case EXPRESSIONS:
      if (value == null) {
        unsetExpressions();
      } else {
        setExpressions((Map<Integer,Exp>)value);
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
    case EXPRESSIONS:
      return getExpressions();

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
    case EXPRESSIONS:
      return isSetExpressions();
    case ROOT:
      return isSetRoot();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Expression)
      return this.equals((Expression)that);
    return false;
  }

  public boolean equals(Expression that) {
    if (that == null)
      return false;

    boolean this_present_expressions = true && this.isSetExpressions();
    boolean that_present_expressions = true && that.isSetExpressions();
    if (this_present_expressions || that_present_expressions) {
      if (!(this_present_expressions && that_present_expressions))
        return false;
      if (!this.expressions.equals(that.expressions))
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

  public int compareTo(Expression other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Expression typedOther = (Expression)other;

    lastComparison = Boolean.valueOf(isSetExpressions()).compareTo(typedOther.isSetExpressions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpressions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expressions, typedOther.expressions);
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
    StringBuilder sb = new StringBuilder("Expression(");
    boolean first = true;

    sb.append("expressions:");
    if (this.expressions == null) {
      sb.append("null");
    } else {
      sb.append(this.expressions);
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

  private static class ExpressionStandardSchemeFactory implements SchemeFactory {
    public ExpressionStandardScheme getScheme() {
      return new ExpressionStandardScheme();
    }
  }

  private static class ExpressionStandardScheme extends StandardScheme<Expression> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Expression struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXPRESSIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map16 = iprot.readMapBegin();
                struct.expressions = new HashMap<Integer,Exp>(2*_map16.size);
                for (int _i17 = 0; _i17 < _map16.size; ++_i17)
                {
                  int _key18; // required
                  Exp _val19; // required
                  _key18 = iprot.readI32();
                  _val19 = new Exp();
                  _val19.read(iprot);
                  struct.expressions.put(_key18, _val19);
                }
                iprot.readMapEnd();
              }
              struct.setExpressionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Expression struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.expressions != null) {
        oprot.writeFieldBegin(EXPRESSIONS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, struct.expressions.size()));
          for (Map.Entry<Integer, Exp> _iter20 : struct.expressions.entrySet())
          {
            oprot.writeI32(_iter20.getKey());
            _iter20.getValue().write(oprot);
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

  private static class ExpressionTupleSchemeFactory implements SchemeFactory {
    public ExpressionTupleScheme getScheme() {
      return new ExpressionTupleScheme();
    }
  }

  private static class ExpressionTupleScheme extends TupleScheme<Expression> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Expression struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetExpressions()) {
        optionals.set(0);
      }
      if (struct.isSetRoot()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetExpressions()) {
        {
          oprot.writeI32(struct.expressions.size());
          for (Map.Entry<Integer, Exp> _iter21 : struct.expressions.entrySet())
          {
            oprot.writeI32(_iter21.getKey());
            _iter21.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetRoot()) {
        oprot.writeI32(struct.root);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Expression struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map22 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.expressions = new HashMap<Integer,Exp>(2*_map22.size);
          for (int _i23 = 0; _i23 < _map22.size; ++_i23)
          {
            int _key24; // required
            Exp _val25; // required
            _key24 = iprot.readI32();
            _val25 = new Exp();
            _val25.read(iprot);
            struct.expressions.put(_key24, _val25);
          }
        }
        struct.setExpressionsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.root = iprot.readI32();
        struct.setRootIsSet(true);
      }
    }
  }

}

