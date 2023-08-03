package Demo2;

/**
 * @FileName Person
 * @Description
 * @Author WindDancer
 * @date 2023-08-03
 **/
public class Person {
  private String name;
  private short age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public short getAge() {
    return age;
  }

  public void setAge(short age) {
    this.age = age;
  }

  public Person(String name, short age) {
    this.name = name;
    this.age = age;
  }

  public void keepCat(Cat cat, String something) {
    System.out.println(this.getName() + "正在喂养" + cat.getColor() + "的小猫吃" + something);
  }

  public void keepDog(Dog dog, String something) {
    System.out.println(this.getName() + "正在喂养" + dog.getColor() + "的小狗吃" + something);
  }
}
