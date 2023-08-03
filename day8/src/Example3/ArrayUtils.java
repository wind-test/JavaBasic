package Example3;

/**
 * @FileName ArrayUtils
 * @Description 静态方法创建工具类
 * @Author WindDancer
 * @date 2023-08-02
 **/
public class ArrayUtils {
  public ArrayUtils() {}

  public static void print(int... array) {
    if (array == null) {
      System.out.println("输入的数组有误，不得为null！");
      return;
    }

    if (array.length == 0) {
      System.out.println("数组：[]");
      return;
    }

    String result = "数组：[";
    for (int i = 0; i < array.length; i++) {
      if (i == array.length - 1) {
        result = result + i + "]";
      } else {
        result = result + i + ",";
      }
    }
    System.out.println(result);
  }
}
