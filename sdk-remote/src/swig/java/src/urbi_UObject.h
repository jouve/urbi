/*
 * Copyright (C) 2010, Gostai S.A.S.
 *
 * This software is provided "as is" without warranty of any kind,
 * either expressed or implied, including but not limited to the
 * implied warranties of fitness for a particular purpose.
 *
 * See the LICENSE file for more information.
 */

/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class liburbi_main_UObjectJava */

#ifndef _Included_urbi_UObject
#define _Included_urbi_UObject
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     urbi_UObject
 * Method:    registerNotifyOnRequest
 * Signature: (JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
 */
JNIEXPORT void JNICALL Java_urbi_UObject_registerNotifyOnRequest
  (JNIEnv *, jobject, jlong, jstring, jboolean, jstring, jstring, jstring, jstring, jint, jobjectArray);

/*
 * Class:     urbi_UObject
 * Method:    registerNotifyChange
 * Signature: (JLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
 */
JNIEXPORT void JNICALL Java_urbi_UObject_registerNotifyChange
  (JNIEnv *, jobject, jlong, jstring, jboolean, jstring, jstring, jstring, jstring, jint, jobjectArray);

/*
 * Class:     urbi_UObject
 * Method:    registerFunction
 * Signature: (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
 */
JNIEXPORT void JNICALL Java_urbi_UObject_registerFunction
(JNIEnv *, jobject, jobject, jstring, jstring, jstring, jstring, jint, jobjectArray);

/*
 * Class:     urbi_UObject
 * Method:    registerTimerFunction
 * Signature: (Ljava/lang/Object;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
 */
JNIEXPORT jstring JNICALL Java_urbi_UObject_registerTimerFunction
  (JNIEnv *, jobject, jobject, jstring, jdouble, jstring, jstring, jstring, jint);


#ifdef __cplusplus
}
#endif
#endif
