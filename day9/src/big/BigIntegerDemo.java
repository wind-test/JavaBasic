package big;

import java.math.BigInteger;

/**
 * @FileName BigIntegerDemo
 * @Description BigInteger演示
 * @Author WindDancer
 * @date 2023-07-20
 **/
public class BigIntegerDemo {
  public static void main(String[] args) {
    //创建BigInteger对象
    BigInteger big1 = new BigInteger("12345678901234567890");
    BigInteger big2 = new BigInteger("1");

    BigInteger result = big1.add(big2);

    System.out.println(result);
  }
}
