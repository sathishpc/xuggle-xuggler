/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.37
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.xuggle.xuggler;
import com.xuggle.ferry.*;
/**
 * Maps from int return codes to defined Error values.  
 * <p>  
 * This class is used to map from Xuggler return codes  
 * (for example on {@link IContainer#readNextPacket(IPacket)}  
 *  
 * </p><p>  
 * WARNING: Do not write code that depends on the integer values  
 * returned from Xuggler; instead use the integer value to create  
 * one of these objects. That's because integer values returned  
 * from methods can have different meanings on different OS systems 
 *  
 * (for example, ERROR_AGAIN is -11 on Linux, but a different  
 * value on MacOS). This class maps the error to a os-type-safe  
 * value.  
 * </p><p>  
 * Also, do not depend on the string messages staying constant. They 
 *  
 * are for debugging purposes only. And we can't control whether or 
 *  
 * not they are localized -- that's up to your OS. Sorry.  
 * </p>  
 */
public class IError extends RefCounted {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  protected IError(long cPtr, boolean cMemoryOwn) {
    super(XugglerJNI.SWIGIErrorUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  public static long getCPtr(IError obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  public long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new IError object that is actually referring to the
   * exact same underlying Native object.
   *
   * This method increases the ref count of the underlying Native object.
   *
   * @return the new Java object.
   */
  public IError copyReference() {
    if (swigCPtr == 0)
      return null;
    else
    {
      IError retval = new IError(swigCPtr, false);
      retval.acquire();
      return retval;
    }
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof IError)
      equal = (((IError)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      throw new UnsupportedOperationException("C++ destructor does not have public access");
    }
    swigCPtr = 0;
    super.delete();
  }


  /**
   * Return a string representation of this error
   * 
   * @return the error as a string
   */
  public String toString()
  {
    return getDescription();
  }

/**
 * Get the OS-independent Xuggler type for this error.  
 * @return	the type.  
 */
  public IError.Type getType() {
    return IError.Type.swigToEnum(XugglerJNI.IError_getType(swigCPtr, this));
  }

/**
 * Get a text description for this error.  
 * The description returned will be in whatever language  
 * the underlying OS decides to use, and no, we can't  
 * support localization here if the OS hasn't already done it.  
 * Sorry.  
 * @return	the description.  
 */
  public String getDescription() {
    return XugglerJNI.IError_getDescription(swigCPtr, this);
  }

/**
 * Return the raw integer value that Xuggler returned and  
 * was used to create this IError.  
 * Note that this value can have different meanings on  
 * different operating systems. Use {@link #getType()}  
 * instead for programmatic decisions.  
 * @return	the native error number.  
 */
  public int getErrorNumber() {
    return XugglerJNI.IError_getErrorNumber(swigCPtr, this);
  }

/**
 * Create a new IError object from a return value passed in from Xuggler. 
 *  
 * @param	errorNumber The error number as returned from another  
 * Xuggler call. ErrorNumber must be < 0.  
 * @return	a new IError, or null on error.  
 */
  public static IError make(int errorNumber) {
    long cPtr = XugglerJNI.IError_make__SWIG_0(errorNumber);
    return (cPtr == 0) ? null : new IError(cPtr, false);
  }

/**
 * Create a new IError object from an IError.Type enum value.  
 * @param	type The type to use for creation.  
 * @return	a new IError, or null on error.  
 */
  public static IError make(IError.Type type) {
    long cPtr = XugglerJNI.IError_make__SWIG_1(type.swigValue());
    return (cPtr == 0) ? null : new IError(cPtr, false);
  }

  public enum Type {
  /**
   * A set of errors that Xuggler knows about.
   */
    ERROR_UNKNOWN,
    ERROR_IO,
    ERROR_NUMEXPECTED,
    ERROR_INVALIDDATA,
    ERROR_NOMEM,
    ERROR_NOFMT,
    ERROR_NOTSUPPORTED,
    ERROR_NOENT,
    ERROR_EOF,
    ERROR_RANGE,
    ERROR_AGAIN,
    ERROR_PATCHWELCOME;

    public final int swigValue() {
      return swigValue;
    }

    public static Type swigToEnum(int swigValue) {
      Type[] swigValues = Type.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (Type swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + Type.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private Type() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private Type(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private Type(Type swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
