package extend;

/**
 * @FileName Animal
 * @Description
 * @Author WindDancer
 * @date 2023-07-20
 **/
public class Animal {
  private int age;
  private String name;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void eat() {
    System.out.println(this.getName() + "正在吃东西");
  }

  public void sleep() {
    System.out.println(this.getName() + "正在睡觉");
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
