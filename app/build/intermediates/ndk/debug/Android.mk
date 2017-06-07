LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := hello
LOCAL_LDFLAGS := -Wl,--build-id
LOCAL_SRC_FILES := \
	/Users/zhangyong/Documents/GitHub/JniDemo2/app/src/main/jni/hello.cpp \

LOCAL_C_INCLUDES += /Users/zhangyong/Documents/GitHub/JniDemo2/app/src/main/jni
LOCAL_C_INCLUDES += /Users/zhangyong/Documents/GitHub/JniDemo2/app/src/debug/jni

include $(BUILD_SHARED_LIBRARY)
