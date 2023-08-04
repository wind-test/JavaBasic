package homework.demo4;

/**
 * @FileName Demo4Test
 * @Description
 * @Author WindDancer
 * @date 2023-08-03
 **/
public class Demo4Test {
  public static void main(String[] args) {
    Worker w = new Worker();
    Apple a1 = new Apple(5, Color.RED);
    Apple a2 = new Apple(8, Color.GREEN);

    w.pickApple(new CompareBig(), a1, a2);
    w.pickApple(new CompareColor(), a1, a2);
  }
}
