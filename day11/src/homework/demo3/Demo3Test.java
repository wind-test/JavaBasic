package homework.demo3;

import java.util.Scanner;

/**
 * @FileName Demo3Test
 * @Description
 * @Author WindDancer
 * @date 2023-08-03
 **/
public class Demo3Test {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String role = "";

    do {
      System.out.println("请选择法师或者战士:");
      role = input.next();

      FightAble fight = Player.select(role);
      if (fight != null) {
        fight.specialFight();
        fight.commonFight();
      } else {
        System.out.println("输入的角色有误！");
      }
    } while (!("q".equals(role)));
  }
}
