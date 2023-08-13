package example.string;

/**
 * @ClassName StringDemo09
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月11日 14时17分43秒
 * @Version 1.0
 *
 * StringBuilder类
 *      类的特点
 *          1.StringBuilder类是可变的字符串
 *              原因:底层数组没有被final进行修饰
 *          2.StringBuilder类是线程不安全,适用于单线程程序,如果在多线程程序中使用,需要手动添加线程安全
 *      类的位置
 *          java.lang
 *      类的构造器
 *          public StringBuilder()
 *              构造一个不带任何字符的字符串生成器，其初始容量为 16 个字符。
 *      类的方法
 *          public StringBuilder append(String str)
 *              将指定的字符串追加到此字符序列。
 *          public StringBuilder insert(int offset,String str)
 *              将字符串插入此字符序列。
 *          public StringBuilder reverse()
 *              将此字符序列用其反转形式取代。
 *
 */
public class StringDemo09 {
    public static void main(String[] args) {
        String s = new String();
        //在字符串的结尾处追加"HelloWorld"
        s.concat("HelloWorld");
        System.out.println(s);

        System.out.println("=============================");

        StringBuilder sb = new StringBuilder();
        //在字符串的结尾处追加"HelloWorld"
        sb.append("HelloWorld");
        System.out.println(sb);

        System.out.println("=============================");

        //在可变字符串指定索引位置处插入指定的字符串
        sb.insert(5,"Java");
        System.out.println(sb);

        System.out.println("=============================");

        //针对可变的字符串进行反转
        sb.reverse();
        System.out.println(sb);
    }
}
