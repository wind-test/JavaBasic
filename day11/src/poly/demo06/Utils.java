package poly.demo06;

/**
 * @ClassName Utils
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 15时48分58秒
 * @Version 1.0
 *
 * 该类用来表示API提供含有接口作为方法形参的工具类
 */
public class Utils {
    private Utils () {}


    public static void method (SuperInterface si) {
        si.print("HelloWorld");
    }
}
