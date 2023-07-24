package cn.winddancer.abs;

/**
 * @FileName AbstractTest
 * @Description
 * @Author WindDancer
 * @date 2023-07-21
 **/
public class AbstractTest {
  public static void main(String[] args) {
    Cat cat = new Cat("mimi", 3, "波斯猫");
    cat.sleep();
    cat.eat();
  }
}
