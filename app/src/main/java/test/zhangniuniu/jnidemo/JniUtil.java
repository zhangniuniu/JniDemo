package test.zhangniuniu.jnidemo;

/**
 * Author：zhangyong on 2017/6/7 10:18
 * Email：zhangyonglncn@gmail.com
 * Description：
 */

public class JniUtil {

    //固定写法，表示我们要加载的资源文件为libhello.so
    static {
        System.loadLibrary("hello");
    }

    //声明一个本地方法，用native关键字修饰
    public static native String getStringFromNative();

    //计算输入的字符串长度
    public static native int getLenthStrFromNative(String content);
}
