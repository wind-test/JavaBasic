package Demo1;

/**
 * @FileName PersonTest
 * @Description
 * @Author WindDancer
 * @date 2023-08-03
 **/
public class PersonTest {
  public static void main(String[] args) {
    Student student = new Student();
    student.setName("小华");
    student.work();

    Worker worker = new Worker();
    worker.setName("老王");
    worker.work();

    StudentLeader stuLeader = new StudentLeader();
    stuLeader.setName("小霞");
    stuLeader.setSex(Person.Sex.female);
    stuLeader.meeting();
  }
}
