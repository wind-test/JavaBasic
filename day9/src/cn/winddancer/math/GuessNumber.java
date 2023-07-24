package cn.winddancer.math;

import java.util.Scanner;

/**
 * @FileName GuessNumber
 * @Description
 * @Author WindDancer
 * @date 2023-07-20
 **/
public class GuessNumber {
  public static void main(String[] args) {
    int random = (int)(Math.random() * 100 + 1);
    Scanner sc = new Scanner(System.in);

    int start = 1;
    int end = 100;

    while(true) {
      System.out.println("请输入一个 " + start + " ~ " + end + "之间的数：");
      int number = sc.nextInt();

      if (number < start || number > end) {
        System.out.println("你输入的数字不对，请重新输入！");
        continue;
      }

      if (number > random) {
        System.out.println("你输入的数字偏大，请重新输入！");
        end = number - 1;
      } else if (number < random) {
        System.out.println("你输入的数字偏小，请重新输入！");
        start = number + 1;
      } else {
        System.out.println("恭喜你答对了！");
        break;
      }
    }
    sc.close();
  }
}
