package example.exception.demo10;

import java.util.Scanner;

/**
 * @ClassName ExceptionDemo10
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 11时08分55秒
 * @Version 1.0
 *
 * finally关键字
 *      含义:
 *          必须执行的代码片段
 *      格式:
 *          try {
 *              可能出现异常的代码片段
 *          } catch (捕获异常类型 对象名) {
 *              捕获异常的处理
 *          } finally {
 *              必须执行的代码块
 *          }
 *      场景:
 *          存储关闭资源的代码
 */
public class ExceptionDemo10 {
    public static void main(String[] args) {
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
