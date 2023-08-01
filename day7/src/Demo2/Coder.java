package Demo2;

import java.math.BigDecimal;

/**
 * @FileName Coder
 * @Description
 * @Author WindDancer
 * @date 2023-08-01
 **/
public class Coder {
  private String name;
  private String id;
  private BigDecimal salary;

  public Coder() {}
  public Coder(String name, String id, BigDecimal salary) {
    this.name = name;
    this.id = id;
    this.salary = salary;
  }

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

  public void work() {
    System.out.println("工号为" + this.getId() + "基本工资为" + this.getSalary() + "的程序员" + this.getName() + "正在努力的写着代码......");
  }
}
