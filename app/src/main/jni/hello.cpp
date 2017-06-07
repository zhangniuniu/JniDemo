#include <jni.h>
#include <stdio.h>
#include <test_zhangniuniu_jnidemo_JniUtil.h>

JNIEXPORT jstring JNICALL Java_test_zhangniuniu_jnidemo_JniUtil_getStringFromNative
        (JNIEnv *env, jclass) {
    char *str = "String from native C";
    return (env)->NewStringUTF(str);
}

JNIEXPORT jint JNICALL Java_test_zhangniuniu_jnidemo_JniUtil_getLenthStrFromNative
        (JNIEnv *env, jclass, jstring content) {
    return (env)->GetStringLength(content);
}

