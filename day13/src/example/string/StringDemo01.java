package example.string;

/**
 * @ClassName StringDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月11日 08时39分18秒
 * @Version 1.0
 *
 * String类
 *      类的特点
 *          1.String类代表字符串
 *          2.Java程序中的所有字符串字面值都是String对象,包括""
 *          3.Java程序中的所有字符串是常量,一旦初始化不能发生改变
 *          4.String类底层的数据结构是"数组结构"
 *          5.String类底层的数组结构是被final修饰,无法进行动态扩容
 *          6.String类底层数组的数据类型:
 *              JDK8.0(包含)以前:char[]
 *              JDK9.0(包含)以后:byte[]
 *          7.String类为什么将底层char[]的数组修改为byte[]的数组?
 *              从"时间复杂度"分析:
 *                  如果底层数组是char[],进行数组元素操作时,先将char类型元素转换为字节数据,再由字节转换为二进制数据
 *                  如果底层数组是byte[],进行数组元素操作时,可以将byte类型元素直接转换为二进制数据
 *              从"空间复杂度"分析:
 *                  如果底层数组是char[],会根据"内码规则"进行字符和字节的转换:
 *                      字符串存储内容"abc",将"abc"拆分成3个字符存储到数组中,每个字符占2个字节,总共占用6个字节
 *                      字符串存储内容"尚硅谷",将"尚硅谷"拆分成3个字符存储到数组中,每个字符占2个字节,总共占用6个字节
 *                  如果底层数组是byte[],会根据"开发编码环境"进行字符和字节转换
 *                      当编码环境为GBK时,字符串存储内容"abc",在GBK编码中每个字母字符占2个字节,总共占用6个字节
 *                      当编码环境为GBK时,字符串存储内容"尚硅谷",在GBK编码中每个中文字符占2个字节,总共占用6个字节
 *                      当编码环境为utf8时,字符串存储内容"abc",在utf8编码中每个字母字符占1个字节,总共占用3个字节
 *                      当编码环境为utf8时,字符串存储内容"尚硅谷",在utf8编码中每个中文字符占3个字节,总共占用9个字节
 *          8.String为什么可以存储中文?
 *              JVM的底层是UTF-16的编码方式,只要是Unicode码表中的中文都支持
 *          9.String内容的最大长度是多少?
 *              65535
 *      类的位置
 *          java.lang
 *      类的构造器
 *          public String()
 *              初始化一个新创建的 String 对象，使其表示一个空字符序列。
 *          public String(byte[] bytes)
 *              通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String
 *          public String(byte[] bytes,int offset,int length)
 *              通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String
 *          public String(char[] value)
 *              分配一个新的 String，使其表示字符数组参数中当前包含的字符序列
 *          public String(char[] value,int offset,int count)
 *              分配一个新的 String，它包含取自字符数组参数一个子数组的字符。
 *          public String(String original)
 *              初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列
 *          public String(StringBuffer buffer)
 *              分配一个新的字符串，它包含字符串缓冲区参数中当前包含的字符序列。
 *          public String(StringBuilder builder)
 *              分配一个新的字符串，它包含字符串生成器参数中当前包含的字符序列。
 *      类的方法
 *          判断功能的方法
 *          获取功能的方法
 *          转换功能的方法
 *          分割功能的方法
 *
 * String对象创建方式:
 *      1.字符串字面值直接初始化
 *      2.通过new和构造器的方式
 *
 */
public class StringDemo01 {
    public static void main(String[] args) {
        //字符串字面值直接初始化
        String str1 = "abcdefg";
        System.out.println("str1 = " + str1);

        //通过无参构造器创建对象
        String str2 = new String();
        System.out.println("str2 = " + str2);//类似于"",有本质的不同

        //通过字节数组创建String对象
        byte[] bytes = {97,98,99,100,101,102,103};
        String str3 = new String(bytes);
        System.out.println("str3 = " + str3);

        //通过指定范围的字节数组创建String对象
        String str4 = new String(bytes,3,3);
        System.out.println("str4 = " + str4);

        //通过字符数组创建String对象
        char[] chars = {'a','b','c','d','e','f','g'};
        String str5 = new String(chars);
        System.out.println("str5 = " + str5);

        //通过指定范围的字节数组创建String对象
        String str6 = new String(chars,3,3);
        System.out.println("str6 = " + str6);

        //通过指定字符串对象创建字符串对象
        String str7 = new String("abcdefg");
        System.out.println("str7 = " + str7);
    }
}
