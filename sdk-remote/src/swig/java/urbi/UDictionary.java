/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package urbi;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UDictionary extends AbstractMap<String, UValue> implements Map<String, UValue> {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected UDictionary(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UDictionary obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        urbiJNI.delete_UDictionary(swigCPtr);
      }
      swigCPtr = 0;
    }
  }



  private UDictionarySet dictionarySet = null;

  @Override
  public Set<Entry<String, UValue>> entrySet() {
    if (dictionarySet == null)
      dictionarySet = new UDictionarySet(this);
    return dictionarySet;
  }

  @SuppressWarnings("unchecked")
  public UValue remove(String key) {
    UValue old;
    try {
      old = get(key);
    }
    catch (RuntimeException e) {
      return null;
    }
    del(key);
    return old;
  }

  /**
   * {@inheritDoc}
   * <p>
   * Unsupported
   */
  public boolean containsValue(UValue value) {
    throw new UnsupportedOperationException();
  }

  protected class UDictionaryEntry implements Entry<String, UValue> {
    private final String key;
    private UValue value;
    private UDictionary dict;

    protected UDictionaryEntry(UDictionary d, String key, UValue value) {
      this.dict = d;
      this.key = key;
      this.value = value;
    }

    public String getKey() {
      return key;
    }

    public UValue getValue() {
      return value;
    }

    public UValue setValue(UValue value) {
      UValue old = this.value;
      this.value = value;
      put(key, value);
      return old;
    }
  }

  protected class UDictionarySet extends AbstractSet<Entry<String, UValue>>
    implements Set<Entry<String, UValue>> {

    private UDictionary dict;

    UDictionarySet(UDictionary d) {
      this.dict = d;
    }

    @Override
    public boolean add(Entry<String, UValue> item) {
      dict.put(item.getKey(), item.getValue());
      return true;
    }

    @Override
    public void clear() {
      dict.clear();
    }

    @Override
    public Iterator<Entry<String, UValue>> iterator() {
      return new UDictionarySetIterator(this.dict);
    }

    @Override
    public boolean remove(Object item) {
      return dict.remove(item) != null;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
      boolean modified = false;
      for (Object item : collection) {
	modified |= this.remove(item);
      }
      return modified;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
      //best way?
      List<Entry<String, UValue>> toRemove =
          new ArrayList<Entry<String, UValue>>(this.size());
      for (Entry<String, UValue> item : this) {
	if (!collection.contains(item)) {
	  toRemove.add(item);
	}
      }
      return removeAll(toRemove);
    }

    @Override
    public int size() {
      return dict.size();
    }
  }

  protected class UDictionarySetIterator
      implements Iterator<Entry<String, UValue>> {

    private UDictionary dict;
    private UDictionaryCPPIterator iterator;

    private UDictionarySetIterator(UDictionary d) {
      this.dict = d;
      this.iterator = d.getIterator();
    }

    public boolean hasNext() {
      return iterator.hasNext();
    }

    @SuppressWarnings("unchecked")
    public UDictionaryEntry next() {
      UDictionaryEntry res =
          new UDictionaryEntry(dict, iterator.getKey(), iterator.getValue());
      iterator.next();
      return res;
    }

    /**
     * {@inheritDoc}
     * <p>
     * Unsupported
     */
    public void remove() {
      throw new UnsupportedOperationException();
    }
  }


  public UDictionary() {
    this(urbiJNI.new_UDictionary__SWIG_0(), true);
  }

  public UDictionary(UDictionary arg0) {
    this(urbiJNI.new_UDictionary__SWIG_1(UDictionary.getCPtr(arg0), arg0), true);
  }

  public int size() {
    return urbiJNI.UDictionary_size(swigCPtr, this);
  }

  public boolean empty() {
    return urbiJNI.UDictionary_empty(swigCPtr, this);
  }

  public void clear() {
    urbiJNI.UDictionary_clear(swigCPtr, this);
  }

  public boolean isEmpty() {
    return urbiJNI.UDictionary_isEmpty(swigCPtr, this);
  }

  public boolean containsKey(String key) {
    return urbiJNI.UDictionary_containsKey(swigCPtr, this, key);
  }

  public UValue get(String key) {
    return new UValue(urbiJNI.UDictionary_get(swigCPtr, this, key), false);
  }

  public UValue put(String key, UValue x) {
    return new UValue(urbiJNI.UDictionary_put__SWIG_0(swigCPtr, this, key, UValue.getCPtr(x), x), false);
  }

  public void del(String key) {
    urbiJNI.UDictionary_del(swigCPtr, this, key);
  }

  public UDictionaryCPPIterator getIterator() {
    return new UDictionaryCPPIterator(urbiJNI.UDictionary_getIterator(swigCPtr, this), true);
  }

  public UList put(String key, UList v) {
    return new UList(urbiJNI.UDictionary_put__SWIG_1(swigCPtr, this, key, UList.getCPtr(v), v), false);
  }

  public UBinary put(String key, UBinary v) {
    return new UBinary(urbiJNI.UDictionary_put__SWIG_2(swigCPtr, this, key, UBinary.getCPtr(v), v), false);
  }

  public USound put(String key, USound v) {
    return new USound(urbiJNI.UDictionary_put__SWIG_3(swigCPtr, this, key, USound.getCPtr(v), v), false);
  }

  public UImage put(String key, UImage v) {
    return new UImage(urbiJNI.UDictionary_put__SWIG_4(swigCPtr, this, key, UImage.getCPtr(v), v), false);
  }

  public String put(String key, String v) {
    return urbiJNI.UDictionary_put__SWIG_5(swigCPtr, this, key, v);
  }

  public int put(String key, int v) {
    return urbiJNI.UDictionary_put__SWIG_6(swigCPtr, this, key, v);
  }

  public long put(String key, long v) {
    return urbiJNI.UDictionary_put__SWIG_7(swigCPtr, this, key, v);
  }

  public double put(String key, double v) {
    return urbiJNI.UDictionary_put__SWIG_8(swigCPtr, this, key, v);
  }

  public boolean put(String key, boolean v) {
    return urbiJNI.UDictionary_put__SWIG_9(swigCPtr, this, key, v);
  }

  public float put(String key, float v) {
    return urbiJNI.UDictionary_put__SWIG_10(swigCPtr, this, key, v);
  }

  public char put(String key, char v) {
    return urbiJNI.UDictionary_put__SWIG_11(swigCPtr, this, key, v);
  }

  public String toString() {
    return urbiJNI.UDictionary_toString(swigCPtr, this);
  }

}
