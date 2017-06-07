# JniDemo
Jni开发步骤
1.官网下载ndk或在Android Studio-->preference-->Android SDK-->SDK tools 勾选ndk进行瞎子啊


2.local.properties 文件加入ndk.dir=具体路径  sdk.dir=具体路径，或者在项目的File-->Project Structure-->SDK location 设置ndk的位置


3.在Module的build.gradle中加入一下代码
       ndk {
       			//在JNI打log 必须加上log,否则会报错log函数未定义,
                   ldLibs "log"
                   //指定生成模块名字,也就是最终的动态库名hello,相应库文件名libaplex.so moduleName "hello"
                   moduleName "hello"
                   // 指定生成哪些处理器架构的动态库文件，如果要运行在x86架构处理器一定需要指定 abiFilters "armeabi" , "x86"
                   abiFilters "armeabi", "x86", "armeabi-v7a"
               }
4.在制定位置下，加入加载 so 文件的 工具类，"hello"为gradle中定义的moduleName，表示加载的哪个so
                             static {
                                 System.loadLibrary("hello");
                             }     
用 public static native 格式声明关联so文件内的方法

5.在java下创建jni文件夹 cd 到java目录下，执行 javah -d ../jni  包名.类名   在main/jni目录下会生成对应的.h文件

6.在main/jni下新建cpp文件，复制.h中的方法，进行实现
   
