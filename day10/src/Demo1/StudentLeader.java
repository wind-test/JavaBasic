package Demo1;

/**
 * @FileName StudentLeader
 * @Description
 * @Author WindDancer
 * @date 2023-08-03
 **/
public class StudentLeader extends Student {
  private String job;

  public void meeting() {
    System.out.println(this.getSex() + "学生" + this.getName() +  "正在开会");
  }
}
