package example.string;

/**
 * @ClassName StringDemo10
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月11日 14时35分31秒
 * @Version 1.0
 *
 * StringBuilder类的存储过程的源码分析
 *      1.StringBuilder类底层数组的初始容量是多少?
 *          StringBuilder类底层数组的初始容量是多少取决于创建对象时选择的构造器
 *          (1)StringBuilder()
 *              初始容量:16
 *          (2)StringBuilder(CharSequence seq)
 *              初始容量:参数长度 + 16
 *          (3)StringBuilder(int capacity)
 *              初始容量:自定义
 *          (4)StringBuilder(String str)
 *              初始容量:参数长度 + 16
 *      2.StringBuilder类底层数组的扩容规则是什么?
 *          JDK8.0(包含)以后:
 *              扩容规则:(原来底层数组长度 << 1) + 2;
 *          JDK7.0(包含):
 *              扩容规则: 原来底层数组长度 * 2 + 2;
 *          JDK6.0(包含)以前:
 *              扩容规则:(原来底层数组长度 + 1) * 2
 *      3.StringBuilder类底层数组扩容规则为什么+2?
 *          防止特殊情况下的扩容,底层数组长度为0时
 */
public class StringDemo10 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("HelloWorld");
        sb.append("atguigu");

        System.out.println(sb);
    }
}
