package cn.winddancer.scanner;

/**
 * @FileName Student
 * @Description
 * @Author WindDancer
 * @date 2023-07-20
 **/
public class Student {
  private int id;
  private String name;
  private int age;

  public Student(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public Student() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String print () {
    return id + "=" + name + "=" + age;
  }
}
