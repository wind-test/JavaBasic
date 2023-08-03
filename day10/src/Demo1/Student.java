package Demo1;

/**
 * @FileName Student
 * @Description
 * @Author WindDancer
 * @date 2023-08-03
 **/
public class Student extends Person{
  private String school;
  private String stuNumber;

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public String getStuNumber() {
    return stuNumber;
  }

  public void setStuNumber(String stuNumber) {
    this.stuNumber = stuNumber;
  }

  public Student() {}

  @Override
  public void eat() {
    System.out.println("学生" + this.getName() + "正在吃饭");
  }

  @Override
  public void sleep() {
    System.out.println("学生" + this.getName() + "正在睡觉");
  }

  @Override
  public void work() {
    System.out.println("学生" + this.getName() + "需要学习");
  }
}
