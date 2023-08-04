package example.init.demo06;

/**
 * @ClassName SuperClass
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 15时03分25秒
 * @Version 1.0
 */
public class SuperClass {
    int num = 10;

    public SuperClass() {
        method();
    }

    public void method () {
        System.out.println("num = " + num);
    }
}
