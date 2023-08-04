package example.init.demo03;

/**
 * @ClassName InitDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 14时21分10秒
 * @Version 1.0
 *
 * 含有继承关系的实例初始化过程
 *      1.显式或隐式的super(实参)
 *      2.隐式加载实例成员和构造器代码块(实例成员和构造器代码块优先级一样,谁在前优先加载谁)
 *      3.构造器中的显式代码(除了显式的super(实参)和this(实参))
 */
public class InitDemo03 {
    public static void main(String[] args) {
        SubClass sc = new SubClass();
    }
}
