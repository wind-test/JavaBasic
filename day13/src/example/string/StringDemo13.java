package example.string;

/**
 * @ClassName StringDemo13
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月11日 15时54分49秒
 * @Version 1.0
 *
 * String类的笔试题3:String对象个数问题
 */
public class StringDemo13 {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        //String对象个数:1个(常量池)

        String str2 = new String("HelloWorld");
        //String对象个数:2个(一个堆,一个常量池)

        String str3 = "H" + "e" + "l" + "l" + "o" + "W" + "o" + "r" + "l" + "d";
        //String对象个数:1个(常量池)

        String s1 = "H";
        String s2 = "e";
        String s3 = "l";
        String s4 = "l";
        String s5 = "o";
        String s6 = "W";
        String s7 = "o";
        String s8 = "r";
        String s9 = "l";
        String s10 = "d";

        String str4 = s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10;
        //String对象个数:8个(7个常量池,1个堆)
    }
}
