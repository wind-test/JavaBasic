package Demo1;

/**
 * @FileName Person
 * @Description
 * @Author WindDancer
 * @date 2023-08-03
 **/
public abstract class Person {
  enum Sex {
    male, female
  }

  private String name;
  private Sex sex;
  private short age;
  private String nationality;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSex() {
    return this.sex == Sex.female ? "女" : "男";
  }

  public void setSex(Sex sex) {
    this.sex = sex;
  }

  public short getAge() {
    return age;
  }

  public void setAge(short age) {
    this.age = age;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public Person() {}

  public abstract void eat();
  public abstract void sleep();
  public abstract void work();
}
