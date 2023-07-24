package cn.winddancer.extend;

/**
 * @FileName Cat
 * @Description
 * @Author WindDancer
 * @date 2023-07-20
 **/
public class Cat extends Animal {
  private String type;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Cat(String name, int age, String type) {
    super(name, age);
    this.type = type;
  }

  public void catchMouse() {
    System.out.println(this.getName() + "正在抓老鼠");
  }
}
