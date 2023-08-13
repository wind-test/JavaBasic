package example.string;

/**
 * @ClassName StringDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月11日 10时57分54秒
 * @Version 1.0
 *
 * String类的获取功能方法
 *      public int length ()
 *          返回此字符串的长度。
 *      public String concat (String str)
 *          将指定的字符串连接到该字符串的末尾
 *      public char charAt (int index)
 *          返回指定索引处的 char值
 *      public int indexOf (String str)
 *          返回指定子字符串第一次出现在该字符串内的索引。
 *      public int lastIndexOf(String str)
 *          返回指定子字符串在此字符串中最右边出现处的索引。
 *      public String substring (int beginIndex)
 *          返回一个子字符串，从beginIndex开始截取字符串到字符串结尾。
 *      public String substring (int beginIndex, int endIndex)
 *          返回一个子字符串，从beginIndex到endIndex截取字符串。含beginIndex，不含endIndex。
 *      public String replace(CharSequence target,CharSequence replacement)
 *          使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
 */
public class StringDemo04 {
    public static void main(String[] args) {
        String str = "abcdefg";

        //获取字符串的长度
        System.out.println(str.length());

        //将指定的字符串追加至字符串的结尾,获取新字符串
        System.out.println(str.concat("HelloWorld"));

        //获取字符串对象指定索引处的char值
        System.out.println(str.charAt(0));

        //获取指定字符串在字符串对象中出现的第一次索引
        System.out.println(str.indexOf("def"));
        System.out.println(str.indexOf("HelloWorld"));

        //获取指定字符串在字符串对象中出现的最后一次索引
        System.out.println(str.lastIndexOf("def"));
        System.out.println(str.lastIndexOf("HelloWorld"));

        //根据指定索引进行截取,获取截取后的新字符串
        System.out.println(str.substring(3));

        //根据指定索引范围进行截取,获取截取后的新字符串
        System.out.println(str.substring(3,6));

        //使用指定字符串替换字符串中指定的内容,获取新的字符串
        System.out.println(str.replace("def","HelloWorld"));
    }
}
