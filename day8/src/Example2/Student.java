package Example2;

/**
 * @FileName Student
 * @Description 静态代码块
 * @Author WindDancer
 * @date 2023-08-02
 **/
public class Student {
  private int id;
  private String name;
  private int age;
  static int num = 220704001;

  {
    this.id = num++;
  }

  public Student() {
    //this.id = num++;
  }

  public Student(String name, int age) {
    //this.id = num++;
    this.name = name;
    this.age = age;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

