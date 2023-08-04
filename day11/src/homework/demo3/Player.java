package homework.demo3;

/**
 * @FileName Player
 * @Description
 * @Author WindDancer
 * @date 2023-08-03
 **/
public class Player {
  public static FightAble select(String str) {
    if ("战士".equals(str)) {
      return new Warrior();
    } else if ("法师".equals(str)) {
      return new Magician();
    } else {
      return null;
    }
  }
}
