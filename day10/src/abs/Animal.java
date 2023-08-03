package abs;

/**
 * @FileName Animal
 * @Description
 * @Author WindDancer
 * @date 2023-07-21
 **/
public abstract class Animal {
  private int age;
  private String name;

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

  public Animal() {}

  public Animal(String name, int age) {
    this.age= age;
    this.name= name;
  }

  // 抽象方法
  public abstract void eat();

  public void sleep() {
    System.out.println(this.name + "正在睡觉");
  }
}
