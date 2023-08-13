package example.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月14日 15时12分29秒
 * @Version 1.0
 *
 * List接口
 *      接口的特点
 *          1.List集合是有序的集合
 *              有序:存储元素的顺序和获取元素的顺序是一致的
 *              无序:存储元素的顺序和获取元素的数据不是一致的
 *          2.List集合是含有索引的集合
 *          3.List集合可以存储重复元素
 *          4.List集合中提供了四种索引的实现方式(涉及四种数据结构)
 *              数组结构
 *              链表结构
 *              队列结构(暂不涉及)
 *              栈结构(暂不涉及)
 *          5.List集合含有特有迭代器ListIterator
 *      接口的位置
 *          java.util
 *      接口的方法
 *          void add(int index,E element)
 *              在列表的指定位置插入指定元素（可选操作）。
 *          E get(int index)
 *              返回列表中指定位置的元素。
 *          int indexOf(Object o)
 *              返回此列表中第一次出现的指定元素的索引；如果此列表不包含该元素，则返回 -1。
 *          int lastIndexOf(Object o)
 *              返回此列表中最后出现的指定元素的索引；如果列表不包含此元素，则返回 -1。
 *          ListIterator<E> listIterator()
 *              返回此列表元素的列表迭代器（按适当顺序）。
 *          E remove(int index)
 *              移除列表中指定位置的元素（可选操作）。将所有的后续元素向左移动（将其索引减 1）。
 *          E set(int index,E element)
 *              用指定元素替换列表中指定位置的元素（可选操作）。
 *          List<E> subList(int fromIndex,int toIndex)
 *              返回列表中指定的 fromIndex（包括 ）和 toIndex（不包括）之间的部分视图
 */
public class ListDemo01 {
    public static void main(String[] args) {
        //使用多态的形式创建List集合对象
        List<Integer> list = new ArrayList<>();

        list.add(33);
        list.add(11);
        list.add(44);
        list.add(55);
        list.add(22);
        list.add(22);

        System.out.println(list);
    }
}
