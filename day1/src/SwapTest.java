public class SwapTest {

  public static void main(String[] args) {
    int x = 3, y = 4;
    System.out.println("交换前的值" + "x = " + x + " y = " + y);
    int temp = x;
    x = y;
    y = temp;
    System.out.println("交换后的值" + "x = " + x + " y = " + y);
  }
}
