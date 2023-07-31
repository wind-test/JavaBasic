package inter.demo07;

/**
 * @ClassName InterfaceDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 10时27分36秒
 * @Version 1.0
 *
 * 接口中的默认方法(JDK8.0)
 *      含义:
 *          多个实现类中共同含有且不需要重写以默认方法的形式存储在接口中的实例方法
 *      格式:
 *          public default 返回类型 方法名 () {}
 *      注意:
 *          public可以省略不写,如果省略JVM的编译器会在编译时期自动补全
 */
public class InterfaceDemo07 {
    public static void main(String[] args) {
        SubClass sc = new SubClass();

        sc.method();
    }
}
