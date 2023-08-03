package Example2;

/**
 * @FileName StudentTest
 * @Description
 * @Author WindDancer
 * @date 2023-08-02
 **/
public class StudentTest {
  public static void main(String[] args) {
    Student s1 = new Student("去病", 18);
    Student s2 = new Student("卫小青", 18);
    Student s3 = new Student("张小骞", 18);
    Student s4 = new Student();
    s4.setName("韩小信");
    s4.setAge(18);

    System.out.println(Student.num + s1.print());
    System.out.println(Student.num + s2.print());
    System.out.println(Student.num + s3.print());
    System.out.println(Student.num + s4.print());
  }
}
