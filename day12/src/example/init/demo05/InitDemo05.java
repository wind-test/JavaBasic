package example.init.demo05;

/**
 * @ClassName InitDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 14时49分35秒
 * @Version 1.0
 *
 * this关键字的第三种用法
 *      场景:
 *          父类的构造器中或实例方法中,成员
 *      格式:
 *          this.实例变量名;
 *          this.实例方法名(实参);
 *      作用:
 *          多态形式的子类对象
 *      含义:
 *          该this关键字就代表所在父类类型的子类对象
 *
 */
public class InitDemo05 {
    public static void main(String[] args) {
        SubClass sc = new SubClass();
    }
}
