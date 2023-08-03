package Example4;

/**
 * @FileName SingleClass
 * @Description 单例模式
 * @Author WindDancer
 * @date 2023-08-02
 **/
public class CEO {
  private static CEO ceo;

  private CEO () {}

  public static CEO getCEO() {

    if (ceo == null) {
      ceo = new CEO();
    }

    return ceo;
  }
}
