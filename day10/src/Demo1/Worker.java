package Demo1;

/**
 * @FileName Worker
 * @Description
 * @Author WindDancer
 * @date 2023-08-03
 **/
public class Worker extends Person{
  private String unit;
  private short workAge;

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public short getWorkAge() {
    return workAge;
  }

  public void setWorkAge(short workAge) {
    this.workAge = workAge;
  }

  public Worker() {}

  @Override
  public void eat() {
    System.out.println("工人" + this.getName() + "正在吃饭");
  }

  @Override
  public void sleep() {
    System.out.println("工人" + this.getName() + "正在睡觉");
  }

  @Override
  public void work() {
    System.out.println("工人" + this.getName() + "需要工作");
  }
}
