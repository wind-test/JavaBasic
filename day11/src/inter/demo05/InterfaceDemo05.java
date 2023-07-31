package inter.demo05;

/**
 * @ClassName InterfaceDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 10时02分23秒
 * @Version 1.0
 *
 * 接口中的静态常量
 *      含义:
 *          声明在接口中的静态常量
 *      格式:
 *          public static final 数据类型 常量名 = 初始化值;
 *      调用:
 *          接口名.静态常量名
 *      注意:
 *          1.接口中的静态常量不可以先声明后初始化,因为接口中不能使用静态代码块
 *          2.public,static,final这三个关键字缺少哪个,JVM的编译器会在编译时自动进行补全
 *
 */
public class InterfaceDemo05 {
    public static void main(String[] args) {
        System.out.println(SuperInterface.NUM);
    }
}
