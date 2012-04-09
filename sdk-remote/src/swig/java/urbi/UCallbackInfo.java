/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package urbi;
  //used internaly

public class UCallbackInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected UCallbackInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UCallbackInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        urbiJNI.delete_UCallbackInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public UCallbackInfo(UCallbackWrapper w) {
    this(urbiJNI.new_UCallbackInfo(UCallbackWrapper.getCPtr(w), w), true);
  }

  public boolean isEqual(long id) {
    return urbiJNI.UCallbackInfo_isEqual(swigCPtr, this, id);
  }

  public void setTag(String value) {
    urbiJNI.UCallbackInfo_tag_set(swigCPtr, this, value);
  }

  public String getTag() {
    return urbiJNI.UCallbackInfo_tag_get(swigCPtr, this);
  }

  public void setCallback(UCallbackWrapper value) {
    urbiJNI.UCallbackInfo_callback_set(swigCPtr, this, UCallbackWrapper.getCPtr(value), value);
  }

  public UCallbackWrapper getCallback() {
    return new UCallbackWrapper(urbiJNI.UCallbackInfo_callback_get(swigCPtr, this), false);
  }

  public void setId(long value) {
    urbiJNI.UCallbackInfo_id_set(swigCPtr, this, value);
  }

  public long getId() {
    return urbiJNI.UCallbackInfo_id_get(swigCPtr, this);
  }

}
