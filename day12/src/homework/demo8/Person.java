package homework.demo8;
/*
 * 考核知识点：继承，super，static
 */

public class Person{
  public Person(){
    System.out.println("this is a Person.");
  }
}
class Teacher extends Person{
  private String name = "tom";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Teacher(){
    super();
    System.out.println("this is a teacher.");
//    super();  // 错误，super()必须在构造器首行
  }
  public static void main(String[] args){
    Teacher tea = new Teacher();
//    System.out.println(this.name);  // 错误，static方法中不能使用this
    System.out.println(tea.name);
  }
}
