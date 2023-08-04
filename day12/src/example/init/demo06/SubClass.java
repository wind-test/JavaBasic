package example.init.demo06;

/**
 * @ClassName SubClass
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 15时04分07秒
 * @Version 1.0
 */
public class SubClass extends SuperClass {
    int num = 20;

    public SubClass() {
        super();
    }

    public void method () {
        System.out.println("num = " + num);
    }
}
