package example.init.demo03;

/**
 * @ClassName SuperClass
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 14时21分28秒
 * @Version 1.0
 */
public class SubClass extends SuperClass{
    int subNum = getSubNum();

    public int getSubNum () {
        System.out.println("子类的实例变量显式赋值操作");
        return 10;
    }

    public SubClass() {

        System.out.println("子类的无参构造器中显式代码");
    }

    {
        System.out.println("子类的构造器代码块");
    }
}
