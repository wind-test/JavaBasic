package example.list;

import java.util.Vector;

/**
 * @ClassName ListDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月15日 11时26分43秒
 * @Version 1.0
 *
 * Vector类:
 *      类的特点
 *          1.Vector集合底层的数据结构是"数组结构"
 *          2.Vector集合是有序的集合
 *          3.Vector集合是含有索引的集合
 *          4.Vector集合可以存储重复元素
 *          5.Vector集合可以存储null元素,当遍历集合中的元素时,需要进行非空校验,防止使用元素时的空指针异常
 *          6.Vector集合是线程安全的,适用于多线程程序,如果在单线程程序中进行使用,效率过低
 *          7.Vector集合遍历方式有6种
 *      类的位置
 *          java.util
 *      类的构造器
 *          public Vector()
 *              构造一个空向量，使其内部数据数组的大小为 10，其标准容量增量为零。
 *      类的方法
 *          详见Collection集合和List集合的常用方法
 *      应用场景:
 *          适用于针对集合中元素做"查询操作"较多的情况,且仅使用与多线程环境
 */
public class ListDemo05 {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();

        list.add(null);

        System.out.println(list);
    }
}
