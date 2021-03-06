/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package urbi;
  /*-----------.
  | UStarter.  |
  `-----------*/
  /*** UObject factory class.
  */

public class baseURBIStarter {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected baseURBIStarter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(baseURBIStarter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        urbiJNI.delete_baseURBIStarter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public UObjectCPP instanciate(UContextImpl ctx, String n) {
    long cPtr = urbiJNI.baseURBIStarter_instanciate__SWIG_0(swigCPtr, this, UContextImpl.getCPtr(ctx), ctx, n);
    return (cPtr == 0) ? null : new UObjectCPP(cPtr, false);
  }

  public UObjectCPP instanciate(UContextImpl ctx) {
    long cPtr = urbiJNI.baseURBIStarter_instanciate__SWIG_1(swigCPtr, this, UContextImpl.getCPtr(ctx), ctx);
    return (cPtr == 0) ? null : new UObjectCPP(cPtr, false);
  }

  public void setName(String value) {
    urbiJNI.baseURBIStarter_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return urbiJNI.baseURBIStarter_name_get(swigCPtr, this);
  }

  public void setLocal(boolean value) {
    urbiJNI.baseURBIStarter_local_set(swigCPtr, this, value);
  }

  public boolean getLocal() {
    return urbiJNI.baseURBIStarter_local_get(swigCPtr, this);
  }

}
