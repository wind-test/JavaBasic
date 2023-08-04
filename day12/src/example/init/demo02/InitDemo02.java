package example.init.demo02;

/**
 * @ClassName InitDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 14时08分06秒
 * @Version 1.0
 *
 * 没有继承关系的实例初始化过程
 *      1.隐式加载实例成员和构造器代码块(实例成员和构造器代码块优先级一样,谁在前优先加载谁)
 *      2.构造器中的显式代码(除了显式的super(实参)和this(实参))
 */
public class InitDemo02 {
    public static void main(String[] args) {
        new SubClass();
        /*
            1
            构造器代码块
            2
            无参构造器中的显式代码
            3
        */
    }
}
