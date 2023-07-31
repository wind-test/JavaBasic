package poly.demo05;

/**
 * @ClassName Person
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 15时24分46秒
 * @Version 1.0
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*//功能：喂养宠物猫，something表示喂养的东西
    public void keepPet(Cat cat,String something) {
        System.out.println(getAge() + "岁的主人" + getName() + "拿来了" + something);
        cat.eat(something);
    }

    //功能：喂养宠物狗，something表示喂养的东西
    public void keepPet(Dog dog,String something) {
        System.out.println(getAge() + "岁的主人" + getName() + "拿来了" + something);
        dog.eat(something);
    }*/

    //功能：喂养宠物动物，something表示喂养的东西
    public void keepPet(Animal a,String something) {
        System.out.println(getAge() + "岁的主人" + getName() + "拿来了" + something);
        a.eat(something);
    }
}
