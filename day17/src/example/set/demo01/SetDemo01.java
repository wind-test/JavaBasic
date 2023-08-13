package example.set.demo01;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @ClassName SetDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月16日 08时34分45秒
 * @Version 1.0
 *
 * LinkedHashSet类:
 *      类的特点
 *          1.LinkedHashSet类是HashSet类的子类
 *          2.LinkedHashSet类是有序的集合
 *          3.LinkedHashSet类底层封装了一个LinkedHashMap对象
 *              LinkedHashMap类底层数据结构是"哈希表 + 链表"
 *              哈希表:用来存储元素的链表对象或者红黑树对象
 *              链表:维护元素的有序性
 *          4.LinkedHashSet类可以存储null元素,获取元素的需要进行非空校验,防止使用元素时出现空指针异常
 *          5.LinkedhashSet类是线程不安全的,适用于单线程程序,如果在多线程中进行使用,需要手动添加线程安全
 *      类的位置
 *          java.util
 *      类的构造器
 *          public LinkedHashSet()构造一个带默认初始容量 (16) 和加载因子 (0.75) 的新空链接哈希 set。
 *      类的方法
 *          详见Collection集合的特有方法
 */
public class SetDemo01 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("郭靖");
        set.add("杨过");
        set.add("张无忌");
        set.add(null);

        System.out.println(set);

        System.out.println("=============================");

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("郭靖");
        hashSet.add("杨过");
        hashSet.add("张无忌");

        System.out.println(hashSet);
    }
}
