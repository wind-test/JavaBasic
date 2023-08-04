package homework.demo4;

/**
 * @FileName Worker
 * @Description
 * @Author WindDancer
 * @date 2023-08-03
 **/
public class Worker {
  public void pickApple(CompareAble c, Apple a1, Apple a2) {
    Apple apple = c.compare(a1, a2);
    System.out.println(apple);
  }
}
