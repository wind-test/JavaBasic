package Demo2;

/**
 * @FileName Animal
 * @Description
 * @Author WindDancer
 * @date 2023-08-03
 **/
public abstract class Animal {
  enum Color {
    RED, BLACK, BLUE, YELLOW
  }
  private short age;
  private Color color;

  public short getAge() {
    return age;
  }

  public void setAge(short age) {
    this.age = age;
  }

  public String getColor() {
    switch (this.color) {
      case RED:
        return "红色";
      case BLUE:
        return "蓝色";
      case BLACK:
        return "黑色";
      case YELLOW:
        return "黄色";
      default:
        return "不明颜色";
    }
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Animal(short age, Color color) {
    this.age = age;
    this.color = color;
  }

  public abstract void eat(String something);
}
