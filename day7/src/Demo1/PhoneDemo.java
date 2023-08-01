package Demo1;

/**
 * @FileName Demo1.PhoneDemo
 * @Description
 * @Author WindDancer
 * @date 2023-08-01
 **/
public class PhoneDemo {
  public static void main(String[] args) {
    Phone xiaomi = new Phone();
    xiaomi.setBrand("小米");
    xiaomi.setPrice(2999);
    xiaomi.sendMessage();

    Phone iphone = new Phone(5999, "iPhone");
    iphone.playGame();
  }
}
