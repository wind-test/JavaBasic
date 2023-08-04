package example.en.demo02;

/**
 * @ClassName EnumDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 11时17分43秒
 * @Version 1.0
 *
 * 枚举类的格式:
 *      public enum 枚举类类名 {
 *          枚举对象名1(实参),枚举对象名2(实参),......,枚举对象名n(实参);
 *      }
 */
public class EnumDemo02 {
    public static void main(String[] args) {
        Gender boy1 = Gender.BOY;
        Gender boy2 = Gender.BOY;

        System.out.println(boy1 == boy2);
    }
}
