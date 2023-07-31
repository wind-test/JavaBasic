package poly.demo05;

/**
 * @ClassName PolyDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 15时17分24秒
 * @Version 1.0
 *
 * 多态的好处:
 *      当声明某个类的重载方法时,这些重载方法的形参列表的数据类型都继承某一个父类或实现某个父接口,将其进行简化,无需声明这么
 *      多的重载方法了,直接声明一个父类或父接口作为形参的方法接口,再调用方式时,只需要传递给该父类的子类对象或该父接口的实现
 *      类对象即可,多态的出现,提高方法内容的复用性,从而提高开发效率
 *
 */
public class PolyDemo05 {
    public static void main(String[] args) {
        //创建Person对象
        Person p = new Person("张三", 18);

        //创建猫对象和狗对象
        Cat cat = new Cat(2, "白");
        Dog dog = new Dog(3, "黑");

        //执行操作
        cat.catchMouse();
        p.keepPet(cat,"鱼");
        cat.sleep();

        System.out.println("=========================");

        dog.lookHome();
        p.keepPet(dog,"骨头");
        dog.sleep();

        System.out.println();
    }
}
