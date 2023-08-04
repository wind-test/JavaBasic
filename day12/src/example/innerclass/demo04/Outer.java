package example.innerclass.demo04;

/**
 * @ClassName Outer
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 09时31分47秒
 * @Version 1.0
 */
public class Outer {

    private static class Inner {
        int a = 10;
        static int b = 10;
    }

    public void method () {
        Inner inner = new Inner();
    }
}
