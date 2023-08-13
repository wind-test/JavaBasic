package example.exception.demo08;

import java.io.IOException;

/**
 * @ClassName ExceptionDemo08
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 10时30分38秒
 * @Version 1.0
 *
 * 异常捕获处理:
 *      含义:
 *          针对程序中的异常信息进行捕获,再进行处理,从而保障程序后续可以正常运行
 *      格式:针对单个异常进行捕获处理
 *          try {
 *              可能出现异常的代码
 *          } catch (捕获异常类名 对象名) {
 *              该捕获到异常的后续处理方案
 *          }
 *
 */
public class ExceptionDemo08 {
    public static void main(String[] args)  {

        System.out.println("开始");

        method(1);

        System.out.println("结束");
    }

    private static void method(int a) {

        try {
            if (a == 1) {
                throw new IOException("自定义IO异常对象");
            }
        } catch (IOException e) {
            System.out.println("IO异常的解决方案");
            e.printStackTrace();
        }
    }
}
