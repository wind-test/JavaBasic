package example.exception.demo12;

import java.util.Scanner;

/**
 * @ClassName ExceptionDemo12
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 11时46分27秒
 * @Version 1.0
 *
 * JDK7.0新增的异常捕获处理
 *      含义:
 *          针对含有关闭资源代码的try...catch...finally的简化
 *      格式:
 *          try (
 *              创建需要关闭资源的对象
 *          ) {
 *              可能发生异常的代码
 *          } catch (捕获异常类型 对象名) {
 *              捕获异常对象的解决方案
 *          }
 */
public class ExceptionDemo12 {
    public static void main(String[] args) {
        method02();
    }

    private static void method02() {
        try (
            //声明并初始化Scanner对象
            Scanner sc = new Scanner(System.in);
        ) {
            //扫描键盘录入的整数数据
            System.out.println("请输入一个整数:");
            int num = sc.nextInt();

            System.out.println("num = " + num);
        } catch (Exception e) {
            System.out.println("Scanner异常的解决方案");
        }
    }

    private static void method01() {
        //声明Scanner对象变量
        Scanner sc = null;

        try {
            //初始化Scanner对象变量
            sc = new Scanner(System.in);

            //扫描键盘录入的整数数据
            System.out.println("请输入一个整数:");
            int num = sc.nextInt();

            System.out.println("num = " + num);
        } catch (Exception e) {
            System.out.println("Scanner异常的解决方案");
        } finally {
            //关闭资源
            if (sc != null) {
                System.out.println("关闭资源");
                sc.close();
            }
        }
    }
}
