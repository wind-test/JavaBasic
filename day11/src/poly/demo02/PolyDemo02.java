package poly.demo02;

/**
 * @ClassName PolyDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 14时23分38秒
 * @Version 1.0
 *
 * 多态关系中构造器的特点
 *      和之前的构造器使用或执行顺序一模一样,没有任何改变
 */
public class PolyDemo02 {
    public static void main(String[] args) {
        //父类new父类
        SuperClass superClass = new SuperClass();
        System.out.println(superClass);

        System.out.println("=======================");

        //子类new子类
        SubClass subClass = new SubClass();
        System.out.println(subClass);

        System.out.println("=======================");

        //父类new子类(多态)
        SuperClass sc = new SubClass();
        System.out.println(sc);
    }
}
