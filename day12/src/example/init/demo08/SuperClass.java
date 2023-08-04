package example.init.demo08;

/**
 * @ClassName SuperClass
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 15时43分07秒
 * @Version 1.0
 */
public class SuperClass {
    static int superNum = getSuperNum();

    public static int getSuperNum () {
        System.out.println("父类的静态变量显式赋值操作");
        return 10;

    }

    static {
        System.out.println("父类的静态代码块");
    }
}
