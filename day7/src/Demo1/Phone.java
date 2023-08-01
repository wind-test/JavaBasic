package Demo1;

/**
 * @FileName Demo1.Phone
 * @Description
 * @Author WindDancer
 * @date 2023-08-01
 **/
public class Phone {
  private int price;
  private String brand;

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Phone() {}

  public Phone(int price, String brand) {
    this.price = price;
    this.brand = brand;
  }

  public String getPhoneInfo() {
    return "正在使用价格为" + this.getPrice() + "元的" + this.getBrand();
  }

  public void call() {
    System.out.println( this.getPhoneInfo() + "品牌的手机打电话....");
  }

  public void sendMessage() {
    System.out.println( this.getPhoneInfo() + "品牌的手机发短信....");
  }

  public void playGame() {
    System.out.println( this.getPhoneInfo() + "品牌的手机玩游戏....");
  }
}
