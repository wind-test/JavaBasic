package Demo2;

import java.math.BigDecimal;

/**
 * @FileName Manager
 * @Description
 * @Author WindDancer
 * @date 2023-08-01
 **/
public class Manager {
  private String name;
  private String id;
  private BigDecimal salary;
  private BigDecimal bonus;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }

  public BigDecimal getBonus() {
    return bonus;
  }

  public void setBonus(BigDecimal bonus) {
    this.bonus = bonus;
  }

  public Manager() {}
  public Manager(String name, String id, BigDecimal salary, BigDecimal bonus) {
    this.name = name;
    this.id = id;
    this.salary = salary;
    this.bonus = bonus;
  }

  public void manage() {
    System.out.println("工号为" + this.getId() + "基本工资为" + this.getSalary() + "奖金为" + this.getBonus() + "的项目经理" + this.getName() + "正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
  }
}
