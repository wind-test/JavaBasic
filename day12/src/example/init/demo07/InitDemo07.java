package example.init.demo07;

/**
 * @ClassName InitDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 15时38分37秒
 * @Version 1.0
 *
 * 没有继承关系的类初始化过程
 *      静态成员和静态代码块加载的优先级一样,谁在前就优先加载谁
 */
public class InitDemo07 {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
    }
}
