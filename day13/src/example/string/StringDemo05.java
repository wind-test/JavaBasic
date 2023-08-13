package example.string;

import java.util.Arrays;

/**
 * @ClassName StringDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月11日 11时10分14秒
 * @Version 1.0
 *
 * String类转换功能的方法
 *      public byte[] getBytes()
 *          使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
 *      public char[] toCharArray()
 *          将此字符串转换为一个新的字符数组。
 *      public String toLowerCase()
 *          使用默认语言环境的规则将此 String 中的所有字符都转换为小写。
 *      public String toUpperCase()
 *          使用默认语言环境的规则将此 String 中的所有字符都转换为大写。
 */
public class StringDemo05 {
    public static void main(String[] args) {
        String str = "abcdefg";

        //将字符串转换成字节数组
        System.out.println(Arrays.toString(str.getBytes()));
        System.out.println(Arrays.toString("尚硅谷".getBytes()));

        //将字符串转换字符数组
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(Arrays.toString("尚硅谷".toCharArray()));

        //将字符串中所有字母内容转换成小写
        System.out.println("HelloWorld".toLowerCase());
        System.out.println("壹贰叁肆伍".toLowerCase());//一二三四五

        //将字符串中所有字母内容转换成大写
        System.out.println("HelloWorld".toUpperCase());
    }
}
