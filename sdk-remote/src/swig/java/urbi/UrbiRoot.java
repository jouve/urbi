/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package urbi;

public class UrbiRoot {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected UrbiRoot(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UrbiRoot obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        urbiJNI.delete_UrbiRoot(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public UrbiRoot(String program, boolean static_build) {
    this(urbiJNI.new_UrbiRoot__SWIG_0(program, static_build), true);
  }

  public UrbiRoot(String program) {
    this(urbiJNI.new_UrbiRoot__SWIG_1(program), true);
  }

  public int urbi_launch(int argc, String[] argv) {
    return urbiJNI.UrbiRoot_urbi_launch__SWIG_0(swigCPtr, this, argc, argv);
  }

  public int urbi_main(StringVector args, boolean block, boolean errors) {
    return urbiJNI.UrbiRoot_urbi_main(swigCPtr, this, StringVector.getCPtr(args), args, block, errors);
  }

  public void load_plugin() {
    urbiJNI.UrbiRoot_load_plugin(swigCPtr, this);
  }

  public void load_remote() {
    urbiJNI.UrbiRoot_load_remote(swigCPtr, this);
  }

  public void load_custom(String path) {
    urbiJNI.UrbiRoot_load_custom(swigCPtr, this, path);
  }

  public String root() {
    return urbiJNI.UrbiRoot_root(swigCPtr, this);
  }

  public String core_path() {
    return urbiJNI.UrbiRoot_core_path(swigCPtr, this);
  }

  public String doc_dir() {
    return urbiJNI.UrbiRoot_doc_dir(swigCPtr, this);
  }

  public String share_dir() {
    return urbiJNI.UrbiRoot_share_dir(swigCPtr, this);
  }

  public StringVector uobjects_path() {
    return new StringVector(urbiJNI.UrbiRoot_uobjects_path(swigCPtr, this), true);
  }

  public String library_suffix() {
    return urbiJNI.UrbiRoot_library_suffix(swigCPtr, this);
  }

}
