package homework.demo2;

/**
 * @FileName Demo2Test
 * @Description
 * @Author WindDancer
 * @date 2023-08-03
 **/
public class Demo2Test {
  public static void main(String[] args) {
    Star star1 = new Star();
    star1.shine();

    Star star2 = new Sun();
    star2.shine();

    if (star2 instanceof Sun) {
      Sun sun = (Sun)star2;
      sun.doAnything();
    } else {
      System.out.println("对象star2在内存中不是Sun类型,无法进行向下转型");
    }
  }
}
