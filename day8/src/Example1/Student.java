package Example1;

/**
 * @FileName ConstructDemo
 * @Description
 * @Author WindDancer
 * @date 2023-08-01
 **/
public class Student {
  private int a;
  private int b;
  public Student() {
    this(3);
    System.out.println("无参构造器");

  }

  public Student (int a) {
    this(1,2);
    System.out.println("一个参数的构造器");
    this.a = a;
  }

  public Student (int a,int b) {
    //实例成员的初始化
    System.out.println("两个参数的构造器");
    this.a = a;
    this.b = b;
  }

  {
    System.out.println("构造器代码块");
  }

  @Override
  public String toString() {
    return "a = " + this.a + " b = " + this.b;
  }
}
