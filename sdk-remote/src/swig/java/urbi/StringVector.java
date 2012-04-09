/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package urbi;

public class StringVector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected StringVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StringVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        urbiJNI.delete_StringVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StringVector() {
    this(urbiJNI.new_StringVector__SWIG_0(), true);
  }

  public StringVector(long n) {
    this(urbiJNI.new_StringVector__SWIG_1(n), true);
  }

  public long size() {
    return urbiJNI.StringVector_size(swigCPtr, this);
  }

  public long capacity() {
    return urbiJNI.StringVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    urbiJNI.StringVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return urbiJNI.StringVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    urbiJNI.StringVector_clear(swigCPtr, this);
  }

  public void add(String x) {
    urbiJNI.StringVector_add(swigCPtr, this, x);
  }

  public String get(int i) {
    return urbiJNI.StringVector_get(swigCPtr, this, i);
  }

  public void set(int i, String val) {
    urbiJNI.StringVector_set(swigCPtr, this, i, val);
  }

}
