package example.exception.demo06;

import java.io.IOException;

/**
 * @ClassName ExceptionDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 09时50分29秒
 * @Version 1.0
 *
 * 异常声明处理:
 *      含义:
 *          在异常发生代码所在的方法上进行声明,交给该方法的调用者进行解决
 *      格式:
 *          修饰符 返回类型 方法名 () throws 异常类名1,异常类名2,......,异常类名n {
 *
 *          }
 *
 */
public class ExceptionDemo06 {
    public static void main(String[] args) throws IOException {
        method();
    }

    private static void method() throws IOException{
        throw new IOException("自定义IO异常对象");
    }
}
