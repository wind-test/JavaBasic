package Demo2;

import java.math.BigDecimal;

/**
 * @FileName DemoTest
 * @Description
 * @Author WindDancer
 * @date 2023-08-01
 **/
public class DemoTest {
  public static void main(String[] args) {
    Manager manager = new Manager("王校长", "000001", new BigDecimal(20000), new BigDecimal(5000));

    Coder coder = new Coder();
    coder.setName("小赵");
    coder.setId("327651");
    coder.setSalary(new BigDecimal(10000));

    manager.manage();
    coder.work();
  }
}
