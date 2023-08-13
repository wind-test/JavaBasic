package example.string;

/**
 * @ClassName StringDemo12
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月11日 15时41分41秒
 * @Version 1.0
 *
 * String类的笔试题2:自定义常量地址值问题
 */
public class StringDemo12 {
    public static final String str1 = "HelloWorld";
    public static final String str2 = "HelloWorld";
    public static final String str3 = "Hello";
    public static final String str4 = "World";
    public static final String str5;
    public static final String str6;
    public static final String str7;
    public static final String str8;

    static {
        str5 = "HelloWorld";
        str6 = "HelloWorld";
        str7 = "Hello";
        str8 = "World";
    }

    public static void main(String[] args) {
        System.out.println(str1 == str2);//true
        System.out.println(str5 == str6);//true
        System.out.println(str1 == str5);//true

        System.out.println("==================================");

        System.out.println(str1 == str3 + str4);//编译时期拼接完成
        System.out.println(str5 == str7 + str8);//运行时期拼接完成
    }
}
