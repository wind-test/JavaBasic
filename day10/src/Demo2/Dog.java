package Demo2;

/**
 * @FileName Dog
 * @Description
 * @Author WindDancer
 * @date 2023-08-03
 **/
public class Dog extends Animal{
  public Dog(short age, Color color) {
    super(age, color);
  }

  @Override
  public void eat(String something) {
    System.out.println(this.getColor() + "的小狗正在吃" + something);
  }

  public void lookHome() {
    System.out.println(this.getColor() + "的小狗正在看门");
  }
}
