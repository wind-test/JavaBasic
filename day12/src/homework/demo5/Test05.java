package homework.demo5;

/*
 * 考核知识点：多态、重载、重写
 */
public class Test05 {
  public static void main(String[] args) {
    A a1 = new A();
    A a2 = new B();
    B b = new B();
    C c = new C();
    D d = new D();
    System.out.println("(1)" + a1.show(b));  // (1)A and A
    System.out.println("(2)" + a2.show(d));  // (2)B and A
    System.out.println("(3)" + b.show(c));   // (3)A and C
    System.out.println("(4)" + b.show(d));   // (4)B and B
  }
}
class A {
  public String show(C obj) {
    return ("A and C");
  }
  public String show(A obj) {
    return "A and A";
  }
}
class B extends A {
  public String show(B obj) {
    return "B and B";
  }
  public String show(A obj) {
    return "B and A";
  }
}
class C extends B {
}
class D extends B {
}
