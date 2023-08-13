package example.list;

import java.util.Vector;

/**
 * @ClassName ListDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月15日 11时34分44秒
 * @Version 1.0
 *
 * Vector集合存储元素过程的源码分析:
 *      1.Vector集合底层数组的初始容量和初始增量是多少
 *          底层数组的初始容量和初始增量是多少取决于创建对象时所选择的构造器
 *          (1)Vector():
 *              初始容量:10
 *              初始增量:0
 *          (2)Vector(Collection<? extends E> c)
 *              初始容量:参数集合的长度
 *              初始增量:0
 *          (3)Vector(int initialCapacity)
 *              初始容量:自定义
 *              初始增量:0
 *          (4)Vector(int initialCapacity, int capacityIncrement)
 *              初始容量:自定义
 *              初始增量:自定义
 *      2.Vector集合底层数组的扩容扩展:
 *          当初始增量为小于等于0时:
 *              扩容规则:原来底层数组长度 + 原来底层数组长度
 *          当初始增量大于0时:
 *              扩容规则:原来底层数组长度 + 初始增量
 */
public class ListDemo06 {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();

        list.add("abc");
    }
}
