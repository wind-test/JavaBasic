package poly.demo04;

/**
 * @ClassName PolyDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 15时02分04秒
 * @Version 1.0
 *
 * Java中的方法调用:
 *      虚调用:判断该方法是否存在,存在执行后续操作,不存在编译报错
 *      实调用:执行具体的方法体内容
 *
 * 多态关系中实例方法的特点
 *      多态对象调用方法,先虚调用父类的该方法(判断父类中是否存在该方法),
 *          如果虚调用成功,再执行子类重写后的方法;
 *          如果虚调用失败,编译报错
 */
public class PolyDemo04 {
    public static void main(String[] args) {
        //父类new父类
        SuperClass superClass = new SuperClass();
        superClass.method();

        System.out.println("==========================");

        //子类new子类
        SubClass subClass = new SubClass();
        subClass.method();

        System.out.println("==========================");

        //父类new子类(多态)
        SuperClass sc = new SubClass();
        sc.method();
    }
}
