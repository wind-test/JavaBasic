package example.en.demo01;

/**
 * @ClassName EnumDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 11时08分43秒
 * @Version 1.0
 *
 * 枚举类(JDK5.0)
 *      含义:
 *          创建固定数量对象简化方式
 *
 */
public class EnumDemo01 {
    public static void main(String[] args) {
        Gender boy1 = Gender.getBoy();
        Gender boy2 = Gender.getBoy();
        System.out.println(boy1 == boy2);
    }
}
