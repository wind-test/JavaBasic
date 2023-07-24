package cn.winddancer.abs;

/**
 * @FileName Cat
 * @Description
 * @Author WindDancer
 * @date 2023-07-21
 **/
public class Cat extends Animal {
  private String type;

  public Cat(String name, int age, String type) {
    super(name, age);
    this.type = type;
  }

  @Override
  public void eat() {
    System.out.println(this.getType() + "-" + this.getName() + "正在吃饭");
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
