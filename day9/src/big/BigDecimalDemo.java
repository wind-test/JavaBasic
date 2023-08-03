package big;

import java.math.BigDecimal;

/**
 * @FileName BigDecimalDemo
 * @Description
 * @Author WindDancer
 * @date 2023-07-20
 **/
public class BigDecimalDemo {
  public static void main(String[] args) {
    double var1 = 2.0;
    double var2 = 1.1;
    System.out.println(var1 - var2);

    BigDecimal big1 = new BigDecimal(var1);
    BigDecimal big2 = new BigDecimal(var2);
    System.out.println(big1.subtract(big2));

    BigDecimal big3 = new BigDecimal("2.0");
    BigDecimal big4 = new BigDecimal("1.1");
    System.out.println(big3.subtract(big4));
  }
}
