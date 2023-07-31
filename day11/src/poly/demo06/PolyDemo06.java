package poly.demo06;

/**
 * @ClassName PolyDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 15时47分32秒
 * @Version 1.0
 *
 * 多态在实际开发中的演示:
 */
public class PolyDemo06 {
    public static void main(String[] args) {
        //方式1:接口的基本使用
        Utils.method(new SubClass());

        System.out.println("====================");

        //方式2:匿名内部类(明天讲解)
        Utils.method(new SuperInterface() {
            @Override
            public void print(String str) {
                System.out.println(str);
            }
        });

        System.out.println("====================");

        //方式3:Lambda表达式(day23讲解)
        Utils.method(str -> System.out.println(str));

        System.out.println("====================");

        //方式4:方法引用(day23讲解)
        Utils.method(System.out::println);
    }
}
