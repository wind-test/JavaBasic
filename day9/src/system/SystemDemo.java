package system;

/**
 * @FileName SystemDemo
 * @Description
 * @Author WindDancer
 * @date 2023-07-20
 **/
public class SystemDemo {
  public static void main(String[] args) {
    //获取此时的时间
    long start = System.nanoTime();
    System.out.println("开始时间：" + start);

    for (int i = 0; i < 10000; i++) {

    }

    long end = System.nanoTime();
    System.out.println("结束时间：" + end);

    System.out.println("总用时" + (end - start));
  }
}
