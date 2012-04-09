/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package urbi;

public class FinallySharedPtr {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected FinallySharedPtr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FinallySharedPtr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        urbiJNI.delete_FinallySharedPtr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FinallySharedPtr() {
    this(urbiJNI.new_FinallySharedPtr(), true);
  }

}