package example.integer;

/**
 * @ClassName IntegerDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月11日 16时17分08秒
 * @Version 1.0
 *
 * 包装类的笔试题1:
 *      整数类型的包装类型底层缓冲了-128到127的Integer数组
 *          使用valueOf()或自动装箱方式,在这个范围内拿数组已缓冲数据,如果不在直接new
 *      浮点类型的包装类型底层没有缓冲数组
 *      字符类型的包装类型底层缓冲了0~127的Character数组
 *      布尔类型的包装类型底层缓冲了true和false两个包装类型对象
 *
 */
public class IntegerDemo01 {
    public static void main(String[] args) {
        Integer num01 = new Integer(987);
        Integer num02 = new Integer(987);
        System.out.println(num01 == num02);
        System.out.println("=====================");

        int num03 = 654;
        int num04 = 654;
        System.out.println(num03 == num04);
        System.out.println("=====================");

        Integer num05 = 321;
        Integer num06 = 321;
        System.out.println(num05 == num06);
        System.out.println("=====================");

        Integer num07 = 123;
        Integer num08 = 123;
        System.out.println(num07 == num08);
        System.out.println("=====================");

        int num09 = 200;
        Integer num10 = 200;
        System.out.println(num09 == num10);//int Integer (装箱:多个Integer  拆箱:多个int,从简原则)
        System.out.println(num10 == num09);
    }
}
