package Demo2;

/**
 * @FileName Cat
 * @Description
 * @Author WindDancer
 * @date 2023-08-03
 **/
public class Cat extends Animal{
  public Cat(short age, Color color) {
    super(age, color);
  }

  @Override
  public void eat(String something) {
    System.out.println(this.getColor() + "的小猫正在吃" + something);
  }

  public void catchMouse() {
    System.out.println(this.getColor() + "的小猫正在抓老鼠");
  }
}
