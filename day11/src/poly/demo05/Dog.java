package poly.demo05;

/**
 * @ClassName Cat
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 15时20分26秒
 * @Version 1.0
 *
 * eat(String something)方法,看家lookHome方法(无参数)
 */
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁" + getColor() + "色的小狗正在吃" + something);
    }

    public void lookHome () {
        System.out.println(getAge() + "岁" + getColor() + "色的小狗正在看家");
    }
}
