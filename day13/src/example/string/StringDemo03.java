package example.string;

import java.util.Scanner;

/**
 * @ClassName StringDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月11日 10时15分23秒
 * @Version 1.0
 *
 *  登录案例
 */
public class StringDemo03 {
    public static void main(String[] args) {
        //method01();
        method02();
    }

    public static String getCode () {
        //创建验证存储的元素的数组
        String[] arr = new String[62];//26+26+10

        //将验证码内容存储至数组中
        for (int i = 0; i < arr.length; i++) {
            if (i >= 0 && i <= 9) {
                arr[i] = (char)(i + 48) + "";
            } else if (i >= 10 && i <= 35) {
                arr[i] = (char)(i + 55) + "";
            } else {
                arr[i] = (char)(i + 61) + "";
            }
        }

        //声明并初始化验证码变量
        String code = "";

        for (int i = 0; i < 4; i++) {
            int index = (int)(Math.random() * arr.length);
            code += arr[index];
        }


        return code;
    }

    private static void method02() {
        //声明数据库中已存在的用户名和密码
        String databaseUsername = "zhangsan";
        String datebasePassword = "123456";

        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        String databaseCode = getCode();
        System.out.println("验证码:" + databaseCode);
        System.out.println("请输入账号:");
        String username = sc.next();
        System.out.println("请输入密码:");
        String password = sc.next();
        System.out.println("请输入验证码:");
        String code = sc.next();

        //判断是否登录成功
        if (databaseUsername.equalsIgnoreCase(username) && datebasePassword.equals(password) && databaseCode.equalsIgnoreCase(code)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }

        //关闭资源
        sc.close();
    }

    private static void method01() {
        //声明数据库中已存在的用户名和密码
        String databaseUsername = "zhangsan";
        String datebasePassword = "123456";

        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号:");
        String username = sc.next();
        System.out.println("请输入密码:");
        String password = sc.next();

        //判断是否登录成功
        if (databaseUsername.equalsIgnoreCase(username) && datebasePassword.equals(password)) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }

        //关闭资源
        sc.close();
    }
}
