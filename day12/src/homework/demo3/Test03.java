package homework.demo3;

/*
 * 考核知识点：多态，重写，实例初始化过程
 * 输出结果：100 100 70
 */
public class Test03 {
  public static void main(String[] args) {
    Base b1 = new Base();
    Base b2 = new Sub();
  }
}
class Base {
  Base() {
    method(100);
  }
  public void method(int i) {
    System.out.println("base : " + i);
  }
}

class Sub extends Base {
  Sub() {
    super.method(70);
  }
  public void method(int j) {
    System.out.println("sub : " + j);
  }
}
