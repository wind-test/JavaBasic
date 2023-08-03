package extend;

/**
 * @FileName ExtendDemo
 * @Description
 * @Author WindDancer
 * @date 2023-07-20
 **/
public class ExtendDemo {
  public static void main(String[] args) {
    Cat cat = new Cat("mimi", 4, "波斯猫");
    cat.eat();
    cat.catchMouse();

    Dog dog = new Dog("xiaobai", 5, "中华田园犬");
    dog.eat();
    dog.lookHouse();
  }
}
