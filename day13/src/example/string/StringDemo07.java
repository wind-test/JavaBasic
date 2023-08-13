package example.string;

import java.util.Scanner;

/**
 * @ClassName StringDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月11日 11时39分53秒
 * @Version 1.0
 *
 * 统计各类字符的个数
 *      键盘录入一个字符串，统计字符串中大小写字母及数字字符个数
 */
public class StringDemo07 {
    public static void main(String[] args) {
        //method01();
        method02();
    }

    public static void method02() {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();

        //声明并初始化各类字符的计数器变量
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        int otherCount = 0;

        //遍历字符串
        for (int i = 0; i < str.length(); i++) {
            //获取当前正在遍历操作的字符
            char c = str.charAt(i);

            //针对当前正在编译操作的字符进行范围范围
            if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= '0' && c <= '9') {
                numCount++;
            } else {
                otherCount++;
            }
        }

        //打印计数器变量
        System.out.println("大写字符个数:" + bigCount);
        System.out.println("小写字符个数:" + smallCount);
        System.out.println("数字字符个数:" + numCount);
        System.out.println("其它字符个数:" + otherCount);

        //关闭资源
        sc.close();
    }

    public static void method01() {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();

        //声明并初始化各类字符的计数器变量
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        int otherCount = 0;

        //将字符串转换成字符数组
        char[] chars = str.toCharArray();

        //遍历数组
        for (int i = 0; i < chars.length; i++) {
            //获取当前正在遍历操作的字符
            char c = chars[i];

            //针对当前正在编译操作的字符进行范围范围
            if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= '0' && c <= '9') {
                numCount++;
            } else {
                otherCount++;
            }
        }

        //打印计数器变量
        System.out.println("大写字符个数:" + bigCount);
        System.out.println("小写字符个数:" + smallCount);
        System.out.println("数字字符个数:" + numCount);
        System.out.println("其它字符个数:" + otherCount);

        //关闭资源
        sc.close();
    }
}
