package homework.demo1;

public interface InterfaceA {
  abstract void showA();
  default void showB() {
    System.out.println("BBBB");
  }
}
