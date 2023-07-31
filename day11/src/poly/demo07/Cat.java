package poly.demo07;

/**
 * @ClassName Cat
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 15时20分26秒
 * @Version 1.0
 *
 * 行为:eat(String something)方法,逮老鼠catchMouse方法(无参数)
 */
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁" + getColor() + "色的小猫正在吃" + something);
    }

    public void catchMouse () {
        System.out.println(getAge() + "岁" + getColor() + "色的小猫正在抓老鼠");
    }
}
