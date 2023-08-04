package example.init.demo02;

/**
 * @ClassName SubClass.java
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 14时08分49秒
 * @Version 1.0
 */
public class SubClass {
    int num = getNum();

    public int getNum () {
        System.out.println("实例变量的显式赋值操作");
        return 10;
    }

    public SubClass() {
        System.out.println("无参构造器中的显式代码");
    }

    {
        System.out.println("构造器代码块");
    }


}
