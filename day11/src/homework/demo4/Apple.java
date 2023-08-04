package homework.demo4;

/**
 * @FileName Apple
 * @Description
 * @Author WindDancer
 * @date 2023-08-03
 **/

enum Color {
  RED{
    public String getColor() {
      return "红色";
    }
  },
  GREEN{
    public String getColor() {
      return "绿色";
    }
  },
  ORANGE{
    public String getColor() {
      return "橙色";
    }
  };
  public abstract String getColor();//定义抽象方法
}
public class Apple {
  private int size;
  private Color color;

  public Apple() {}

  public Apple(int size, Color color) {
    this.size = size;
    this.color = color;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public String getColor() {
    return color.getColor();
  }

  public void setColor(Color color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Apple{" +
      "size=" + size +
      ", color=" + color.getColor() +
      '}';
  }
}
