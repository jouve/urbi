/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package urbi;

public enum USoundSampleFormat {
  SAMPLE_SIGNED(1),
  SAMPLE_UNSIGNED(2),
  SAMPLE_FLOAT(3);

  public final int swigValue() {
    return swigValue;
  }

  public static USoundSampleFormat swigToEnum(int swigValue) {
    USoundSampleFormat[] swigValues = USoundSampleFormat.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (USoundSampleFormat swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + USoundSampleFormat.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private USoundSampleFormat() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private USoundSampleFormat(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private USoundSampleFormat(USoundSampleFormat swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
