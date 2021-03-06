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

public class ExternalChoiceClause implements org.apache.thrift.TBase<ExternalChoiceClause, ExternalChoiceClause._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExternalChoiceClause");

  private static final org.apache.thrift.protocol.TField TRANSACTION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("transactionType", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BINDERS_FIELD_DESC = new org.apache.thrift.protocol.TField("binders", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField REMAINDER_VAR_FIELD_DESC = new org.apache.thrift.protocol.TField("remainderVar", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PREDICATE_FIELD_DESC = new org.apache.thrift.protocol.TField("predicate", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField DEADLINE_FIELD_DESC = new org.apache.thrift.protocol.TField("deadline", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField CONTINUATION_FIELD_DESC = new org.apache.thrift.protocol.TField("continuation", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField ALTERNATIVE_CONTINUATION_FIELD_DESC = new org.apache.thrift.protocol.TField("alternativeContinuation", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ExternalChoiceClauseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ExternalChoiceClauseTupleSchemeFactory());
  }

  public String transactionType; // required
  public List<Binder> binders; // required
  public String remainderVar; // required
  public Expression predicate; // required
  public DeadlineExp deadline; // required
  public int continuation; // required
  public int alternativeContinuation; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRANSACTION_TYPE((short)1, "transactionType"),
    BINDERS((short)2, "binders"),
    REMAINDER_VAR((short)3, "remainderVar"),
    PREDICATE((short)4, "predicate"),
    DEADLINE((short)5, "deadline"),
    CONTINUATION((short)6, "continuation"),
    ALTERNATIVE_CONTINUATION((short)7, "alternativeContinuation");

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
        case 1: // TRANSACTION_TYPE
          return TRANSACTION_TYPE;
        case 2: // BINDERS
          return BINDERS;
        case 3: // REMAINDER_VAR
          return REMAINDER_VAR;
        case 4: // PREDICATE
          return PREDICATE;
        case 5: // DEADLINE
          return DEADLINE;
        case 6: // CONTINUATION
          return CONTINUATION;
        case 7: // ALTERNATIVE_CONTINUATION
          return ALTERNATIVE_CONTINUATION;
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
  private static final int __CONTINUATION_ISSET_ID = 0;
  private static final int __ALTERNATIVECONTINUATION_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TRANSACTION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("transactionType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "RecordName")));
    tmpMap.put(_Fields.BINDERS, new org.apache.thrift.meta_data.FieldMetaData("binders", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Binder.class))));
    tmpMap.put(_Fields.REMAINDER_VAR, new org.apache.thrift.meta_data.FieldMetaData("remainderVar", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Var")));
    tmpMap.put(_Fields.PREDICATE, new org.apache.thrift.meta_data.FieldMetaData("predicate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Expression.class)));
    tmpMap.put(_Fields.DEADLINE, new org.apache.thrift.meta_data.FieldMetaData("deadline", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DeadlineExp.class)));
    tmpMap.put(_Fields.CONTINUATION, new org.apache.thrift.meta_data.FieldMetaData("continuation", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Index")));
    tmpMap.put(_Fields.ALTERNATIVE_CONTINUATION, new org.apache.thrift.meta_data.FieldMetaData("alternativeContinuation", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Index")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExternalChoiceClause.class, metaDataMap);
  }

  public ExternalChoiceClause() {
  }

  public ExternalChoiceClause(
    String transactionType,
    List<Binder> binders,
    String remainderVar,
    Expression predicate,
    DeadlineExp deadline,
    int continuation,
    int alternativeContinuation)
  {
    this();
    this.transactionType = transactionType;
    this.binders = binders;
    this.remainderVar = remainderVar;
    this.predicate = predicate;
    this.deadline = deadline;
    this.continuation = continuation;
    setContinuationIsSet(true);
    this.alternativeContinuation = alternativeContinuation;
    setAlternativeContinuationIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExternalChoiceClause(ExternalChoiceClause other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetTransactionType()) {
      this.transactionType = other.transactionType;
    }
    if (other.isSetBinders()) {
      List<Binder> __this__binders = new ArrayList<Binder>();
      for (Binder other_element : other.binders) {
        __this__binders.add(new Binder(other_element));
      }
      this.binders = __this__binders;
    }
    if (other.isSetRemainderVar()) {
      this.remainderVar = other.remainderVar;
    }
    if (other.isSetPredicate()) {
      this.predicate = new Expression(other.predicate);
    }
    if (other.isSetDeadline()) {
      this.deadline = new DeadlineExp(other.deadline);
    }
    this.continuation = other.continuation;
    this.alternativeContinuation = other.alternativeContinuation;
  }

  public ExternalChoiceClause deepCopy() {
    return new ExternalChoiceClause(this);
  }

  @Override
  public void clear() {
    this.transactionType = null;
    this.binders = null;
    this.remainderVar = null;
    this.predicate = null;
    this.deadline = null;
    setContinuationIsSet(false);
    this.continuation = 0;
    setAlternativeContinuationIsSet(false);
    this.alternativeContinuation = 0;
  }

  public String getTransactionType() {
    return this.transactionType;
  }

  public ExternalChoiceClause setTransactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  public void unsetTransactionType() {
    this.transactionType = null;
  }

  /** Returns true if field transactionType is set (has been assigned a value) and false otherwise */
  public boolean isSetTransactionType() {
    return this.transactionType != null;
  }

  public void setTransactionTypeIsSet(boolean value) {
    if (!value) {
      this.transactionType = null;
    }
  }

  public int getBindersSize() {
    return (this.binders == null) ? 0 : this.binders.size();
  }

  public java.util.Iterator<Binder> getBindersIterator() {
    return (this.binders == null) ? null : this.binders.iterator();
  }

  public void addToBinders(Binder elem) {
    if (this.binders == null) {
      this.binders = new ArrayList<Binder>();
    }
    this.binders.add(elem);
  }

  public List<Binder> getBinders() {
    return this.binders;
  }

  public ExternalChoiceClause setBinders(List<Binder> binders) {
    this.binders = binders;
    return this;
  }

  public void unsetBinders() {
    this.binders = null;
  }

  /** Returns true if field binders is set (has been assigned a value) and false otherwise */
  public boolean isSetBinders() {
    return this.binders != null;
  }

  public void setBindersIsSet(boolean value) {
    if (!value) {
      this.binders = null;
    }
  }

  public String getRemainderVar() {
    return this.remainderVar;
  }

  public ExternalChoiceClause setRemainderVar(String remainderVar) {
    this.remainderVar = remainderVar;
    return this;
  }

  public void unsetRemainderVar() {
    this.remainderVar = null;
  }

  /** Returns true if field remainderVar is set (has been assigned a value) and false otherwise */
  public boolean isSetRemainderVar() {
    return this.remainderVar != null;
  }

  public void setRemainderVarIsSet(boolean value) {
    if (!value) {
      this.remainderVar = null;
    }
  }

  public Expression getPredicate() {
    return this.predicate;
  }

  public ExternalChoiceClause setPredicate(Expression predicate) {
    this.predicate = predicate;
    return this;
  }

  public void unsetPredicate() {
    this.predicate = null;
  }

  /** Returns true if field predicate is set (has been assigned a value) and false otherwise */
  public boolean isSetPredicate() {
    return this.predicate != null;
  }

  public void setPredicateIsSet(boolean value) {
    if (!value) {
      this.predicate = null;
    }
  }

  public DeadlineExp getDeadline() {
    return this.deadline;
  }

  public ExternalChoiceClause setDeadline(DeadlineExp deadline) {
    this.deadline = deadline;
    return this;
  }

  public void unsetDeadline() {
    this.deadline = null;
  }

  /** Returns true if field deadline is set (has been assigned a value) and false otherwise */
  public boolean isSetDeadline() {
    return this.deadline != null;
  }

  public void setDeadlineIsSet(boolean value) {
    if (!value) {
      this.deadline = null;
    }
  }

  public int getContinuation() {
    return this.continuation;
  }

  public ExternalChoiceClause setContinuation(int continuation) {
    this.continuation = continuation;
    setContinuationIsSet(true);
    return this;
  }

  public void unsetContinuation() {
    __isset_bit_vector.clear(__CONTINUATION_ISSET_ID);
  }

  /** Returns true if field continuation is set (has been assigned a value) and false otherwise */
  public boolean isSetContinuation() {
    return __isset_bit_vector.get(__CONTINUATION_ISSET_ID);
  }

  public void setContinuationIsSet(boolean value) {
    __isset_bit_vector.set(__CONTINUATION_ISSET_ID, value);
  }

  public int getAlternativeContinuation() {
    return this.alternativeContinuation;
  }

  public ExternalChoiceClause setAlternativeContinuation(int alternativeContinuation) {
    this.alternativeContinuation = alternativeContinuation;
    setAlternativeContinuationIsSet(true);
    return this;
  }

  public void unsetAlternativeContinuation() {
    __isset_bit_vector.clear(__ALTERNATIVECONTINUATION_ISSET_ID);
  }

  /** Returns true if field alternativeContinuation is set (has been assigned a value) and false otherwise */
  public boolean isSetAlternativeContinuation() {
    return __isset_bit_vector.get(__ALTERNATIVECONTINUATION_ISSET_ID);
  }

  public void setAlternativeContinuationIsSet(boolean value) {
    __isset_bit_vector.set(__ALTERNATIVECONTINUATION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TRANSACTION_TYPE:
      if (value == null) {
        unsetTransactionType();
      } else {
        setTransactionType((String)value);
      }
      break;

    case BINDERS:
      if (value == null) {
        unsetBinders();
      } else {
        setBinders((List<Binder>)value);
      }
      break;

    case REMAINDER_VAR:
      if (value == null) {
        unsetRemainderVar();
      } else {
        setRemainderVar((String)value);
      }
      break;

    case PREDICATE:
      if (value == null) {
        unsetPredicate();
      } else {
        setPredicate((Expression)value);
      }
      break;

    case DEADLINE:
      if (value == null) {
        unsetDeadline();
      } else {
        setDeadline((DeadlineExp)value);
      }
      break;

    case CONTINUATION:
      if (value == null) {
        unsetContinuation();
      } else {
        setContinuation((Integer)value);
      }
      break;

    case ALTERNATIVE_CONTINUATION:
      if (value == null) {
        unsetAlternativeContinuation();
      } else {
        setAlternativeContinuation((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TRANSACTION_TYPE:
      return getTransactionType();

    case BINDERS:
      return getBinders();

    case REMAINDER_VAR:
      return getRemainderVar();

    case PREDICATE:
      return getPredicate();

    case DEADLINE:
      return getDeadline();

    case CONTINUATION:
      return Integer.valueOf(getContinuation());

    case ALTERNATIVE_CONTINUATION:
      return Integer.valueOf(getAlternativeContinuation());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TRANSACTION_TYPE:
      return isSetTransactionType();
    case BINDERS:
      return isSetBinders();
    case REMAINDER_VAR:
      return isSetRemainderVar();
    case PREDICATE:
      return isSetPredicate();
    case DEADLINE:
      return isSetDeadline();
    case CONTINUATION:
      return isSetContinuation();
    case ALTERNATIVE_CONTINUATION:
      return isSetAlternativeContinuation();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExternalChoiceClause)
      return this.equals((ExternalChoiceClause)that);
    return false;
  }

  public boolean equals(ExternalChoiceClause that) {
    if (that == null)
      return false;

    boolean this_present_transactionType = true && this.isSetTransactionType();
    boolean that_present_transactionType = true && that.isSetTransactionType();
    if (this_present_transactionType || that_present_transactionType) {
      if (!(this_present_transactionType && that_present_transactionType))
        return false;
      if (!this.transactionType.equals(that.transactionType))
        return false;
    }

    boolean this_present_binders = true && this.isSetBinders();
    boolean that_present_binders = true && that.isSetBinders();
    if (this_present_binders || that_present_binders) {
      if (!(this_present_binders && that_present_binders))
        return false;
      if (!this.binders.equals(that.binders))
        return false;
    }

    boolean this_present_remainderVar = true && this.isSetRemainderVar();
    boolean that_present_remainderVar = true && that.isSetRemainderVar();
    if (this_present_remainderVar || that_present_remainderVar) {
      if (!(this_present_remainderVar && that_present_remainderVar))
        return false;
      if (!this.remainderVar.equals(that.remainderVar))
        return false;
    }

    boolean this_present_predicate = true && this.isSetPredicate();
    boolean that_present_predicate = true && that.isSetPredicate();
    if (this_present_predicate || that_present_predicate) {
      if (!(this_present_predicate && that_present_predicate))
        return false;
      if (!this.predicate.equals(that.predicate))
        return false;
    }

    boolean this_present_deadline = true && this.isSetDeadline();
    boolean that_present_deadline = true && that.isSetDeadline();
    if (this_present_deadline || that_present_deadline) {
      if (!(this_present_deadline && that_present_deadline))
        return false;
      if (!this.deadline.equals(that.deadline))
        return false;
    }

    boolean this_present_continuation = true;
    boolean that_present_continuation = true;
    if (this_present_continuation || that_present_continuation) {
      if (!(this_present_continuation && that_present_continuation))
        return false;
      if (this.continuation != that.continuation)
        return false;
    }

    boolean this_present_alternativeContinuation = true;
    boolean that_present_alternativeContinuation = true;
    if (this_present_alternativeContinuation || that_present_alternativeContinuation) {
      if (!(this_present_alternativeContinuation && that_present_alternativeContinuation))
        return false;
      if (this.alternativeContinuation != that.alternativeContinuation)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ExternalChoiceClause other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ExternalChoiceClause typedOther = (ExternalChoiceClause)other;

    lastComparison = Boolean.valueOf(isSetTransactionType()).compareTo(typedOther.isSetTransactionType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransactionType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transactionType, typedOther.transactionType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBinders()).compareTo(typedOther.isSetBinders());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBinders()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.binders, typedOther.binders);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRemainderVar()).compareTo(typedOther.isSetRemainderVar());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRemainderVar()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.remainderVar, typedOther.remainderVar);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPredicate()).compareTo(typedOther.isSetPredicate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPredicate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.predicate, typedOther.predicate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeadline()).compareTo(typedOther.isSetDeadline());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeadline()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deadline, typedOther.deadline);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContinuation()).compareTo(typedOther.isSetContinuation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContinuation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.continuation, typedOther.continuation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAlternativeContinuation()).compareTo(typedOther.isSetAlternativeContinuation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAlternativeContinuation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.alternativeContinuation, typedOther.alternativeContinuation);
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
    StringBuilder sb = new StringBuilder("ExternalChoiceClause(");
    boolean first = true;

    sb.append("transactionType:");
    if (this.transactionType == null) {
      sb.append("null");
    } else {
      sb.append(this.transactionType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("binders:");
    if (this.binders == null) {
      sb.append("null");
    } else {
      sb.append(this.binders);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("remainderVar:");
    if (this.remainderVar == null) {
      sb.append("null");
    } else {
      sb.append(this.remainderVar);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("predicate:");
    if (this.predicate == null) {
      sb.append("null");
    } else {
      sb.append(this.predicate);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("deadline:");
    if (this.deadline == null) {
      sb.append("null");
    } else {
      sb.append(this.deadline);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("continuation:");
    sb.append(this.continuation);
    first = false;
    if (!first) sb.append(", ");
    sb.append("alternativeContinuation:");
    sb.append(this.alternativeContinuation);
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

  private static class ExternalChoiceClauseStandardSchemeFactory implements SchemeFactory {
    public ExternalChoiceClauseStandardScheme getScheme() {
      return new ExternalChoiceClauseStandardScheme();
    }
  }

  private static class ExternalChoiceClauseStandardScheme extends StandardScheme<ExternalChoiceClause> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ExternalChoiceClause struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TRANSACTION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.transactionType = iprot.readString();
              struct.setTransactionTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BINDERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list34 = iprot.readListBegin();
                struct.binders = new ArrayList<Binder>(_list34.size);
                for (int _i35 = 0; _i35 < _list34.size; ++_i35)
                {
                  Binder _elem36; // required
                  _elem36 = new Binder();
                  _elem36.read(iprot);
                  struct.binders.add(_elem36);
                }
                iprot.readListEnd();
              }
              struct.setBindersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REMAINDER_VAR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.remainderVar = iprot.readString();
              struct.setRemainderVarIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PREDICATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.predicate = new Expression();
              struct.predicate.read(iprot);
              struct.setPredicateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DEADLINE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.deadline = new DeadlineExp();
              struct.deadline.read(iprot);
              struct.setDeadlineIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CONTINUATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.continuation = iprot.readI32();
              struct.setContinuationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // ALTERNATIVE_CONTINUATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.alternativeContinuation = iprot.readI32();
              struct.setAlternativeContinuationIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ExternalChoiceClause struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.transactionType != null) {
        oprot.writeFieldBegin(TRANSACTION_TYPE_FIELD_DESC);
        oprot.writeString(struct.transactionType);
        oprot.writeFieldEnd();
      }
      if (struct.binders != null) {
        oprot.writeFieldBegin(BINDERS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.binders.size()));
          for (Binder _iter37 : struct.binders)
          {
            _iter37.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.remainderVar != null) {
        oprot.writeFieldBegin(REMAINDER_VAR_FIELD_DESC);
        oprot.writeString(struct.remainderVar);
        oprot.writeFieldEnd();
      }
      if (struct.predicate != null) {
        oprot.writeFieldBegin(PREDICATE_FIELD_DESC);
        struct.predicate.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.deadline != null) {
        oprot.writeFieldBegin(DEADLINE_FIELD_DESC);
        struct.deadline.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CONTINUATION_FIELD_DESC);
      oprot.writeI32(struct.continuation);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ALTERNATIVE_CONTINUATION_FIELD_DESC);
      oprot.writeI32(struct.alternativeContinuation);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ExternalChoiceClauseTupleSchemeFactory implements SchemeFactory {
    public ExternalChoiceClauseTupleScheme getScheme() {
      return new ExternalChoiceClauseTupleScheme();
    }
  }

  private static class ExternalChoiceClauseTupleScheme extends TupleScheme<ExternalChoiceClause> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ExternalChoiceClause struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTransactionType()) {
        optionals.set(0);
      }
      if (struct.isSetBinders()) {
        optionals.set(1);
      }
      if (struct.isSetRemainderVar()) {
        optionals.set(2);
      }
      if (struct.isSetPredicate()) {
        optionals.set(3);
      }
      if (struct.isSetDeadline()) {
        optionals.set(4);
      }
      if (struct.isSetContinuation()) {
        optionals.set(5);
      }
      if (struct.isSetAlternativeContinuation()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetTransactionType()) {
        oprot.writeString(struct.transactionType);
      }
      if (struct.isSetBinders()) {
        {
          oprot.writeI32(struct.binders.size());
          for (Binder _iter38 : struct.binders)
          {
            _iter38.write(oprot);
          }
        }
      }
      if (struct.isSetRemainderVar()) {
        oprot.writeString(struct.remainderVar);
      }
      if (struct.isSetPredicate()) {
        struct.predicate.write(oprot);
      }
      if (struct.isSetDeadline()) {
        struct.deadline.write(oprot);
      }
      if (struct.isSetContinuation()) {
        oprot.writeI32(struct.continuation);
      }
      if (struct.isSetAlternativeContinuation()) {
        oprot.writeI32(struct.alternativeContinuation);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ExternalChoiceClause struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.transactionType = iprot.readString();
        struct.setTransactionTypeIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list39 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.binders = new ArrayList<Binder>(_list39.size);
          for (int _i40 = 0; _i40 < _list39.size; ++_i40)
          {
            Binder _elem41; // required
            _elem41 = new Binder();
            _elem41.read(iprot);
            struct.binders.add(_elem41);
          }
        }
        struct.setBindersIsSet(true);
      }
      if (incoming.get(2)) {
        struct.remainderVar = iprot.readString();
        struct.setRemainderVarIsSet(true);
      }
      if (incoming.get(3)) {
        struct.predicate = new Expression();
        struct.predicate.read(iprot);
        struct.setPredicateIsSet(true);
      }
      if (incoming.get(4)) {
        struct.deadline = new DeadlineExp();
        struct.deadline.read(iprot);
        struct.setDeadlineIsSet(true);
      }
      if (incoming.get(5)) {
        struct.continuation = iprot.readI32();
        struct.setContinuationIsSet(true);
      }
      if (incoming.get(6)) {
        struct.alternativeContinuation = iprot.readI32();
        struct.setAlternativeContinuationIsSet(true);
      }
    }
  }

}

