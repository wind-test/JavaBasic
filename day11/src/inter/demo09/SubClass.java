package inter.demo09;

/**
 * @ClassName SubClass
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 11时12分28秒
 * @Version 1.0
 */
public class SubClass implements A,B,C {
    @Override
    public void method () {
        A.super.method();
    }
}
