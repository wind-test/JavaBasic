package example.list;

import java.util.ArrayList;

/**
 * @ClassName ListDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月15日 11时03分15秒
 * @Version 1.0
 *
 * ArrayList集合存储元素过程的源码分析(基于JDK8.0):
 *      1.ArrayList集合底层数组的初始容量是多少
 *          底层数组的初始容量是多少取决于创建对象时所选择的构造器
 *          (1)ArrayList()
 *              初始容量:0
 *          (2)ArrayList(Collection<? extends E> c)
 *              初始容量:参数集合的长度
 *          (3)ArrayList(int initialCapacity)
 *              初始容量:自定义
 *      2.底层数组的扩容规则:
 *          当底层数组长度为0时,首次添加元素时:
 *              扩容规则:10
 *          非首次添加元素时:
 *              扩容规则:原来底层数组长度 +  (原来底层数组长度 >> 1)
 *      3.JDK6.0(包含)以前和JDK7.0(包含)以后的区别:
 *          (1)无参构造器底层数组的初始容量不同
 *              JDK6.0(包含)以前:
 *                  初始容量:10
 *              JDK7.0(包含)以后:
 *                  初始容量:0
 *          (2)扩容规则不同
 *              JDK6.0(包含)以前:
 *                  扩容规则:(原来底层数组长度 * 3)/2 + 1;
 *              JDK7.0(包含)以后:
 *                  当底层数组长度为0时:
 *                      扩容规则:10
 *                  当底层数组长度非0时:
 *                      扩容规则:原来底层数组长度 +  (原来底层数组长度 >> 1)
 */
public class ListDemo04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("abc");
    }
}
