package example.string;

/**
 * @ClassName StringDemo11
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月11日 15时18分19秒
 * @Version 1.0
 *
 * String类的笔试题1:地址值比较问题
 *
 * 常量池:
 *      位置:方法区中
 *      含义:存储常量的内存区域
 *      分类:
 *          字符串常量池
 *              存储字符串的字面值常量
 *          整数常量池
 *              除了short取值范围内的65536个数据外
 *          浮点常量池
 *      特点:
 *          提高数据的复用性,如果常量池中没有,在常量池中进行创建,如果常量池中已有,拿已有数据进行复用
 *      好处:
 *          提高数据的复用性,节约内存空间
 */
public class StringDemo11 {
    public static void main(String[] args) {
        String str1 = new String("HelloWorld");
        String str2 = new String("HelloWorld");
        System.out.println(str1 == str2);//false

        System.out.println("=========================");

        String str3 = "HelloWorld";//字符串常量池
        String str4 = "HelloWorld";//字符串常量池
        System.out.println(str3 == str4);//true

        System.out.println("=========================");

        String str5 = new String("Hello");
        String str6 = new String("World");
        System.out.println(str1 == str5 + str6);//false

        System.out.println("=========================");

        String str7 = "Hello";
        String str8 = "World";
        System.out.println(str3 == str7 + str8);//false

        System.out.println("=========================");

        System.out.println(str3 == "Hello" + "World");//str3 == "HelloWorld"
    }
}
