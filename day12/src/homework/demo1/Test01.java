package homework.demo1;
/*
 * 多态性现象：编译时类型与运行时类型不一致
 * 但是多态性是针对方法来说，方法有动态绑定一说。
 * 属性没有多态性。属性都是按照编译时类型处理的。
 */
public class Test01 {
  public static void main(String[] args) {
    A a = new B();
    System.out.println(a.num);  // 1
    System.out.println(((B)a).num); // 2
    System.out.println(((A)((B)a)).num);  // 1
    System.out.println("-------------------");
    B b = new B();
    System.out.println(b.num); // 2
    System.out.println(((A)b).num); // 1
    System.out.println(((B)((A)b)).num); // 2
  }
}
class A{
  int num = 1;
}
class B extends A{
  int num = 2;
}
