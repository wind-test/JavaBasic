package extend;

/**
 * @FileName Dog
 * @Description
 * @Author WindDancer
 * @date 2023-07-20
 **/
public class Dog extends Animal {
  private String type;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Dog(String name, int age, String type) {
    super(name, age);
    this.type = type;
  }

  public void lookHouse() {
    System.out.println(this.getName() + "正在看家");
  }

  @Override
  public void eat() {
    System.out.println(this.getType() + this.getName() + "正在啃骨头");
  }
}
