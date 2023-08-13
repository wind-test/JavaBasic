package example.exception.demo05;

/**
 * @ClassName ExceptionDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 09时29分42秒
 * @Version 1.0
 *
 * throw关键字
 *      含义:
 *          抛出异常对象
 *      格式:
 *          throw new 异常类名(实参);
 */
public class ExceptionDemo05 {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        //throw new IOException("自定义IO异常对象");
    }
}
