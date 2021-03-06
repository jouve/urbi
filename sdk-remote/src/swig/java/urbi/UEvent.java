/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package urbi;
  /** UEvent class definition

     Each UEvent instance corresponds to one URBI event. The class
     provides access to the event properties, and emitting/receiving
     events with payload.  */

public class UEvent {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected UEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        urbiJNI.delete_UEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void emit(UValue v1, UValue v2, UValue v3, UValue v4, UValue v5, UValue v6, UValue v7) {
    emit(new UAutoValue(v1), new UAutoValue(v2), new UAutoValue(v3),
	 new UAutoValue(v4), new UAutoValue(v5), new UAutoValue(v6),
	 new UAutoValue(v7));
  }
  public void emit(UValue v1, UValue v2, UValue v3, UValue v4, UValue v5, UValue v6) {
    emit(new UAutoValue(v1), new UAutoValue(v2), new UAutoValue(v3),
	 new UAutoValue(v4), new UAutoValue(v5), new UAutoValue(v6));
  }
  public void emit(UValue v1, UValue v2, UValue v3, UValue v4, UValue v5) {
    emit(new UAutoValue(v1), new UAutoValue(v2), new UAutoValue(v3),
	 new UAutoValue(v4), new UAutoValue(v5));
  }
  public void emit(UValue v1, UValue v2, UValue v3, UValue v4) {
    emit(new UAutoValue(v1), new UAutoValue(v2), new UAutoValue(v3),
	 new UAutoValue(v4));
  }
  public void emit(UValue v1, UValue v2, UValue v3) {
    emit(new UAutoValue(v1), new UAutoValue(v2), new UAutoValue(v3));
  }
  public void emit(UValue v1, UValue v2) {
    emit(new UAutoValue(v1), new UAutoValue(v2));
  }
  public void emit(UValue v1) {
    emit(new UAutoValue(v1));
  }

      /// Creates an unbound UEvent. Call init() to bind it.
 public  UEvent() {
    this(urbiJNI.new_UEvent__SWIG_0(), true);
  }

      /// Creates an unbound UEvent. Call init() to bind it.
 public  UEvent(String varname, UContextImpl impl) {
    this(urbiJNI.new_UEvent__SWIG_1(varname, UContextImpl.getCPtr(impl), impl), true);
  }

      /// Creates an unbound UEvent. Call init() to bind it.
 public  UEvent(String varname) {
    this(urbiJNI.new_UEvent__SWIG_2(varname), true);
  }

      /// Creates an unbound UEvent. Call init() to bind it.
 public  UEvent(String objname, String varname, UContextImpl impl) {
    this(urbiJNI.new_UEvent__SWIG_3(objname, varname, UContextImpl.getCPtr(impl), impl), true);
  }

      /// Creates an unbound UEvent. Call init() to bind it.
 public  UEvent(String objname, String varname) {
    this(urbiJNI.new_UEvent__SWIG_4(objname, varname), true);
  }

      /// Creates an unbound UEvent. Call init() to bind it.
 public  UEvent(UObjectCPP obj, String varname, UContextImpl impl) {
    this(urbiJNI.new_UEvent__SWIG_5(UObjectCPP.getCPtr(obj), obj, varname, UContextImpl.getCPtr(impl), impl), true);
  }

      /// Creates an unbound UEvent. Call init() to bind it.
 public  UEvent(UObjectCPP obj, String varname) {
    this(urbiJNI.new_UEvent__SWIG_6(UObjectCPP.getCPtr(obj), obj, varname), true);
  }

      /// Creates an unbound UEvent. Call init() to bind it.
 public  UEvent(UEvent e) {
    this(urbiJNI.new_UEvent__SWIG_7(UEvent.getCPtr(e), e), true);
  }

  public void init(String object, String slot, UContextImpl arg2) {
    urbiJNI.UEvent_init__SWIG_0(swigCPtr, this, object, slot, UContextImpl.getCPtr(arg2), arg2);
  }

  public void init(String object, String slot) {
    urbiJNI.UEvent_init__SWIG_1(swigCPtr, this, object, slot);
  }

  public void emit(UAutoValue v1, UAutoValue v2, UAutoValue v3, UAutoValue v4, UAutoValue v5, UAutoValue v6, UAutoValue v7) {
    urbiJNI.UEvent_emit__SWIG_0(swigCPtr, this, UAutoValue.getCPtr(v1), v1, UAutoValue.getCPtr(v2), v2, UAutoValue.getCPtr(v3), v3, UAutoValue.getCPtr(v4), v4, UAutoValue.getCPtr(v5), v5, UAutoValue.getCPtr(v6), v6, UAutoValue.getCPtr(v7), v7);
  }

  public void emit(UAutoValue v1, UAutoValue v2, UAutoValue v3, UAutoValue v4, UAutoValue v5, UAutoValue v6) {
    urbiJNI.UEvent_emit__SWIG_1(swigCPtr, this, UAutoValue.getCPtr(v1), v1, UAutoValue.getCPtr(v2), v2, UAutoValue.getCPtr(v3), v3, UAutoValue.getCPtr(v4), v4, UAutoValue.getCPtr(v5), v5, UAutoValue.getCPtr(v6), v6);
  }

  public void emit(UAutoValue v1, UAutoValue v2, UAutoValue v3, UAutoValue v4, UAutoValue v5) {
    urbiJNI.UEvent_emit__SWIG_2(swigCPtr, this, UAutoValue.getCPtr(v1), v1, UAutoValue.getCPtr(v2), v2, UAutoValue.getCPtr(v3), v3, UAutoValue.getCPtr(v4), v4, UAutoValue.getCPtr(v5), v5);
  }

  public void emit(UAutoValue v1, UAutoValue v2, UAutoValue v3, UAutoValue v4) {
    urbiJNI.UEvent_emit__SWIG_3(swigCPtr, this, UAutoValue.getCPtr(v1), v1, UAutoValue.getCPtr(v2), v2, UAutoValue.getCPtr(v3), v3, UAutoValue.getCPtr(v4), v4);
  }

  public void emit(UAutoValue v1, UAutoValue v2, UAutoValue v3) {
    urbiJNI.UEvent_emit__SWIG_4(swigCPtr, this, UAutoValue.getCPtr(v1), v1, UAutoValue.getCPtr(v2), v2, UAutoValue.getCPtr(v3), v3);
  }

  public void emit(UAutoValue v1, UAutoValue v2) {
    urbiJNI.UEvent_emit__SWIG_5(swigCPtr, this, UAutoValue.getCPtr(v1), v1, UAutoValue.getCPtr(v2), v2);
  }

  public void emit(UAutoValue v1) {
    urbiJNI.UEvent_emit__SWIG_6(swigCPtr, this, UAutoValue.getCPtr(v1), v1);
  }

  public void emit() {
    urbiJNI.UEvent_emit__SWIG_7(swigCPtr, this);
  }

  public String get_name() {
    return urbiJNI.UEvent_get_name__SWIG_0(swigCPtr, this);
  }

  public void set_name(String v) {
    urbiJNI.UEvent_set_name(swigCPtr, this, v);
  }

}
