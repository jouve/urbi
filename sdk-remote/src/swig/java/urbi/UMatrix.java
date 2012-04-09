/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package urbi;

public class UMatrix {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected UMatrix(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UMatrix obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        urbiJNI.delete_UMatrix(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public long size1() {
    return urbiJNI.UMatrix_size1(swigCPtr, this);
  }

  public long size2() {
    return urbiJNI.UMatrix_size2(swigCPtr, this);
  }

  public double get(int i, int j) {
    return urbiJNI.UMatrix_get(swigCPtr, this, i, j);
  }

  public void set(int i, int j, double v) {
    urbiJNI.UMatrix_set(swigCPtr, this, i, j, v);
  }

  public UMatrix() {
    this(urbiJNI.new_UMatrix(), true);
  }

}