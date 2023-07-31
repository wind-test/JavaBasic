package poly.demo06;

/**
 * @ClassName SubClass
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 15时52分32秒
 * @Version 1.0
 */
public class SubClass implements SuperInterface {
    @Override
    public void print(String str) {
        System.out.println(str);
    }
}
