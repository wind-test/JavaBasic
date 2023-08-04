package homework.demo7;
/*
 * 考核知识点：权限修饰符
 */

public class Father{
  private String name = "atguigu";
  int age = 0;

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
}
class Child extends Father{
  public String grade;

  public static void main(String[] args){
    Father f = new Child();
//    System.out.println(f.name);
    System.out.println(f.getName());
  }
}
