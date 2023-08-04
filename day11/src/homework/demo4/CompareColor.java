package homework.demo4;

import java.util.Objects;

/**
 * @FileName CompareColor
 * @Description
 * @Author WindDancer
 * @date 2023-08-03
 **/
public class CompareColor implements CompareAble{
  @Override
  public Apple compare(Apple a1, Apple a2) {
    if ("红色".equals(a1.getColor())) {
      return a1;
    } else if ("红色".equals(a2.getColor())) {
      return a2;
    } else {
      return null;
    }
  }
}
