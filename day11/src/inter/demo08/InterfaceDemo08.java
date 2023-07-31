package inter.demo08;

/**
 * @ClassName InterfaceDemo08
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 10时34分30秒
 * @Version 1.0
 *
 * 猫狗案例(接口版)
 */
public class InterfaceDemo08 {
    public static void main(String[] args) {
        //创建猫对象
        Cat cat = new Cat("Tom", 2);

        cat.catchMouse();
        cat.eat();
        cat.sleep();

        System.out.println("==============================");

        //创建狗对象
        Dog dog = new Dog("TwoHa", 3);

        dog.lookHome();
        dog.eat();
        dog.sleep();
    }
}
