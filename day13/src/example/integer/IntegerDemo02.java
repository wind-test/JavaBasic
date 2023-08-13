package example.integer;

/**
 * @ClassName IntegerDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月11日 16时42分07秒
 * @Version 1.0
 *
 * 包装类型的笔试题2:
 */
public class IntegerDemo02 {
    public static final Integer num1 = 200;
    public static final Integer num2 = 200;
    public static final Integer num3 = 123;
    public static final Integer num4 = 77;
    public static final Integer num5;
    public static final Integer num6;
    public static final Integer num7;
    public static final Integer num8;

    static {
        num5 = 200;
        num6 = 200;
        num7 = 123;
        num8 = 77;
    }

    public static void main(String[] args) {
        System.out.println(num1 == num2);//false
        System.out.println(num3 == num7);//true
        System.out.println(num4 == num8);//true

        System.out.println("=======================");

        System.out.println(num1 == num3 + num4);
        /*
            Integer = Integer + Integer
            Integer = int + int
            Integer = int
            int = int

        */

        System.out.println(num5 == num7 + num8);
    }
}
