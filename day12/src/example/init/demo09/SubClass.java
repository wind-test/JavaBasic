package example.init.demo09;

/**
 * @ClassName SuperClass
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 15时43分07秒
 * @Version 1.0
 */
public class SubClass extends SuperClass{
    int subVar = getSubVar();
    static int subNum = getSubNum();
    static SubClass sc = new SubClass();

    public int getSubVar () {
        System.out.println("子类的实例变量显式赋值操作");
        return 10;
    }

    public static int getSubNum () {
        System.out.println("子类的静态变量显式赋值操作");
        return 10;
    }

    public SubClass() {
        System.out.println("子类的无参构造器中显式代码");
    }

    {
        System.out.println("子类的构造器代码块");
    }

    static {
        System.out.println("子类的静态代码块");
    }
}
