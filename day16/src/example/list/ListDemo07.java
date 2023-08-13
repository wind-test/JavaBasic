package example.list;

import java.util.LinkedList;

/**
 * @ClassName LinkedList
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月15日 14时12分58秒
 * @Version 1.0
 *
 * LinkedList类
 *      类的特点
 *          1.LinkedList集合底层的数据结构是"双向链表结构"
 *          2.LinkedList集合是有序的集合
 *          3.LinkedList集合是含有索引的集合
 *          4.LinkedList集合可以存储重复元素
 *          5.LinkedList集合可以存储null元素,当遍历集合中的元素时,需要进行非空校验,防止使用元素时的空指针异常
 *          6.LinkedList集合是线程不安全的,适用于单线程程序,如果在多线程程序中进行使用,需要手动添加线程安全
 *          7.LinkedList集合遍历方式有6种
 *      类的位置
 *          java.util
 *      类的构造器
 *          public LinkedList()构造一个空列表。
 *      类的方法
 *          public void addFirst(E e)
 *              将指定元素插入此列表的开头。
 *          public void addLast(E e)
 *              将指定元素添加到此列表的结尾。
 *          public E removeFirst()
 *              移除并返回此列表的第一个元素。
 *          public E removeLast()
 *              移除并返回此列表的最后一个元素。
 *          public E getFirst()
 *              返回此列表的第一个元素。
 *          public E getLast()
 *              返回此列表的最后一个元素。
 *
 * LinkedList存储元素过程的源码分析:
 */
public class ListDemo07 {
    public static void main(String[] args) {
        //创建LinkedList集合对象
        LinkedList<String> list = new LinkedList<>();

        //添加元素
        list.add("去病");
        list.add("卫小青");
        list.add("张小骞");
        list.add("韩小信");

        System.out.println(list);
    }
}
