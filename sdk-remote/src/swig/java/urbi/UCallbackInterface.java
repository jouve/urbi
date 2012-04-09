/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package urbi;

public class UCallbackInterface {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected UCallbackInterface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UCallbackInterface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        urbiJNI.delete_UCallbackInterface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    urbiJNI.UCallbackInterface_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    urbiJNI.UCallbackInterface_change_ownership(this, swigCPtr, true);
  }

  public UCallbackInterface() {
    this(urbiJNI.new_UCallbackInterface(), true);
    urbiJNI.UCallbackInterface_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public UCallbackAction onMessage(UMessage msg) {
    return UCallbackAction.swigToEnum(urbiJNI.UCallbackInterface_onMessage(swigCPtr, this, UMessage.getCPtr(msg), msg));
  }

}
