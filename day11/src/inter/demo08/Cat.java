package inter.demo08;

/**
 * @ClassName Cat
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 10时37分46秒
 * @Version 1.0
 */
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catchMouse() {
        System.out.println(getAge() + "岁的" + getName() + "正在抓老鼠");
    }

    @Override
    public void eat() {
        System.out.println(getAge() + "岁的" + getName() + "正在吃鱼");
    }
}
