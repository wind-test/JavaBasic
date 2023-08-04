package example.init.demo07;

/**
 * @ClassName SubClass
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 15时38分59秒
 * @Version 1.0
 */
public class SubClass {
    static int num = method();

    public static int method () {
        System.out.println("静态变量的显式赋值操作");
        return 10;
    }

    static {
        System.out.println("静态代码块");
    }
}
