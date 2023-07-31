package inter.demo06;

/**
 * @ClassName InterfaceDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 10时09分25秒
 * @Version 1.0
 *
 * 接口中的抽象方法
 *      含义:
 *          声明在接口中的抽象方法
 *      格式
 *          public abstract 返回类型 方法名 ();
 *      注意:
 *          public和abstract这两个关键字缺少哪个,JVM的编译器会在编译时自动进行补全
 *
 */
public class InterfaceDemo06 {
    public static void main(String[] args) {
        //创建接口的实现类对象
        SubClass sc = new SubClass();

        sc.method();
    }
}
