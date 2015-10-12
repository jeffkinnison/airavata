/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.status;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-12")
public class ProcessStatus implements org.apache.thrift.TBase<ProcessStatus, ProcessStatus._Fields>, java.io.Serializable, Cloneable, Comparable<ProcessStatus> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProcessStatus");

  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TIME_OF_STATE_CHANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("timeOfStateChange", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField REASON_FIELD_DESC = new org.apache.thrift.protocol.TField("reason", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ProcessStatusStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ProcessStatusTupleSchemeFactory());
  }

  private ProcessState state; // required
  private long timeOfStateChange; // optional
  private String reason; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see ProcessState
     */
    STATE((short)1, "state"),
    TIME_OF_STATE_CHANGE((short)2, "timeOfStateChange"),
    REASON((short)3, "reason");

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
        case 1: // STATE
          return STATE;
        case 2: // TIME_OF_STATE_CHANGE
          return TIME_OF_STATE_CHANGE;
        case 3: // REASON
          return REASON;
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
  private static final int __TIMEOFSTATECHANGE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TIME_OF_STATE_CHANGE,_Fields.REASON};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ProcessState.class)));
    tmpMap.put(_Fields.TIME_OF_STATE_CHANGE, new org.apache.thrift.meta_data.FieldMetaData("timeOfStateChange", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.REASON, new org.apache.thrift.meta_data.FieldMetaData("reason", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProcessStatus.class, metaDataMap);
  }

  public ProcessStatus() {
  }

  public ProcessStatus(
    ProcessState state)
  {
    this();
    this.state = state;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProcessStatus(ProcessStatus other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetState()) {
      this.state = other.state;
    }
    this.timeOfStateChange = other.timeOfStateChange;
    if (other.isSetReason()) {
      this.reason = other.reason;
    }
  }

  public ProcessStatus deepCopy() {
    return new ProcessStatus(this);
  }

  @Override
  public void clear() {
    this.state = null;
    setTimeOfStateChangeIsSet(false);
    this.timeOfStateChange = 0;
    this.reason = null;
  }

  /**
   * 
   * @see ProcessState
   */
  public ProcessState getState() {
    return this.state;
  }

  /**
   * 
   * @see ProcessState
   */
  public void setState(ProcessState state) {
    this.state = state;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  public long getTimeOfStateChange() {
    return this.timeOfStateChange;
  }

  public void setTimeOfStateChange(long timeOfStateChange) {
    this.timeOfStateChange = timeOfStateChange;
    setTimeOfStateChangeIsSet(true);
  }

  public void unsetTimeOfStateChange() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMEOFSTATECHANGE_ISSET_ID);
  }

  /** Returns true if field timeOfStateChange is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeOfStateChange() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMEOFSTATECHANGE_ISSET_ID);
  }

  public void setTimeOfStateChangeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMEOFSTATECHANGE_ISSET_ID, value);
  }

  public String getReason() {
    return this.reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public void unsetReason() {
    this.reason = null;
  }

  /** Returns true if field reason is set (has been assigned a value) and false otherwise */
  public boolean isSetReason() {
    return this.reason != null;
  }

  public void setReasonIsSet(boolean value) {
    if (!value) {
      this.reason = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((ProcessState)value);
      }
      break;

    case TIME_OF_STATE_CHANGE:
      if (value == null) {
        unsetTimeOfStateChange();
      } else {
        setTimeOfStateChange((Long)value);
      }
      break;

    case REASON:
      if (value == null) {
        unsetReason();
      } else {
        setReason((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATE:
      return getState();

    case TIME_OF_STATE_CHANGE:
      return Long.valueOf(getTimeOfStateChange());

    case REASON:
      return getReason();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATE:
      return isSetState();
    case TIME_OF_STATE_CHANGE:
      return isSetTimeOfStateChange();
    case REASON:
      return isSetReason();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProcessStatus)
      return this.equals((ProcessStatus)that);
    return false;
  }

  public boolean equals(ProcessStatus that) {
    if (that == null)
      return false;

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_timeOfStateChange = true && this.isSetTimeOfStateChange();
    boolean that_present_timeOfStateChange = true && that.isSetTimeOfStateChange();
    if (this_present_timeOfStateChange || that_present_timeOfStateChange) {
      if (!(this_present_timeOfStateChange && that_present_timeOfStateChange))
        return false;
      if (this.timeOfStateChange != that.timeOfStateChange)
        return false;
    }

    boolean this_present_reason = true && this.isSetReason();
    boolean that_present_reason = true && that.isSetReason();
    if (this_present_reason || that_present_reason) {
      if (!(this_present_reason && that_present_reason))
        return false;
      if (!this.reason.equals(that.reason))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_state = true && (isSetState());
    list.add(present_state);
    if (present_state)
      list.add(state.getValue());

    boolean present_timeOfStateChange = true && (isSetTimeOfStateChange());
    list.add(present_timeOfStateChange);
    if (present_timeOfStateChange)
      list.add(timeOfStateChange);

    boolean present_reason = true && (isSetReason());
    list.add(present_reason);
    if (present_reason)
      list.add(reason);

    return list.hashCode();
  }

  @Override
  public int compareTo(ProcessStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetState()).compareTo(other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeOfStateChange()).compareTo(other.isSetTimeOfStateChange());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeOfStateChange()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeOfStateChange, other.timeOfStateChange);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReason()).compareTo(other.isSetReason());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReason()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reason, other.reason);
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
    StringBuilder sb = new StringBuilder("ProcessStatus(");
    boolean first = true;

    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
    }
    first = false;
    if (isSetTimeOfStateChange()) {
      if (!first) sb.append(", ");
      sb.append("timeOfStateChange:");
      sb.append(this.timeOfStateChange);
      first = false;
    }
    if (isSetReason()) {
      if (!first) sb.append(", ");
      sb.append("reason:");
      if (this.reason == null) {
        sb.append("null");
      } else {
        sb.append(this.reason);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetState()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'state' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
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
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ProcessStatusStandardSchemeFactory implements SchemeFactory {
    public ProcessStatusStandardScheme getScheme() {
      return new ProcessStatusStandardScheme();
    }
  }

  private static class ProcessStatusStandardScheme extends StandardScheme<ProcessStatus> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProcessStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.state = org.apache.airavata.model.status.ProcessState.findByValue(iprot.readI32());
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TIME_OF_STATE_CHANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timeOfStateChange = iprot.readI64();
              struct.setTimeOfStateChangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REASON
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.reason = iprot.readString();
              struct.setReasonIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProcessStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.state != null) {
        oprot.writeFieldBegin(STATE_FIELD_DESC);
        oprot.writeI32(struct.state.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.isSetTimeOfStateChange()) {
        oprot.writeFieldBegin(TIME_OF_STATE_CHANGE_FIELD_DESC);
        oprot.writeI64(struct.timeOfStateChange);
        oprot.writeFieldEnd();
      }
      if (struct.reason != null) {
        if (struct.isSetReason()) {
          oprot.writeFieldBegin(REASON_FIELD_DESC);
          oprot.writeString(struct.reason);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProcessStatusTupleSchemeFactory implements SchemeFactory {
    public ProcessStatusTupleScheme getScheme() {
      return new ProcessStatusTupleScheme();
    }
  }

  private static class ProcessStatusTupleScheme extends TupleScheme<ProcessStatus> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProcessStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.state.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetTimeOfStateChange()) {
        optionals.set(0);
      }
      if (struct.isSetReason()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTimeOfStateChange()) {
        oprot.writeI64(struct.timeOfStateChange);
      }
      if (struct.isSetReason()) {
        oprot.writeString(struct.reason);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProcessStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.state = org.apache.airavata.model.status.ProcessState.findByValue(iprot.readI32());
      struct.setStateIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.timeOfStateChange = iprot.readI64();
        struct.setTimeOfStateChangeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.reason = iprot.readString();
        struct.setReasonIsSet(true);
      }
    }
  }

}

