package example.exception.demo02;

/**
 * @ClassName ExceptionDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 08时39分29秒
 * @Version 1.0
 *
 * Throwable类
 *      类的特点
 *          Throwable 类是 Java 语言中所有错误或异常的父类
 *          错误(Error):程序在运行过程中出现了无法预判的问题,无法事前避免,只能事后处理.举例:堆栈内存溢出错误
 *          异常(Exception):程序在运行过程中出现了可以预判的问题,可以进行事前避免,无需事后处理.
 *      类的位置
 *          java.lang
 *      类的构造器
 *          public Throwable()
 *              构造一个将 null 作为其详细消息的新 throwable。
 *          public Throwable(String message)
 *              构造带指定详细消息的新 throwable。
 *      类的方法
 *          public void printStackTrace()
 *              将此 throwable 及其追踪输出至标准错误流。
 *          public String getMessage()
 *              返回此 throwable 的详细消息字符串。
 */
public class ExceptionDemo02 {
    public static void main(String[] args) {
        //创建Throwable对象
        Throwable t = new Throwable("自定义Throwable对象");

        //打印异常的详细信息(给程序员看的)
        t.printStackTrace();

        //获取异常的详细信息(给用户看的)
        System.out.println(t.getMessage());
    }
}
