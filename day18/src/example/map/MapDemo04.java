package example.map;

import java.util.Hashtable;

/**
 * @ClassName MapDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月18日 09时32分32秒
 * @Version 1.0
 *
 * HashMap集合和Hashtable集合区别:
 *      1.null键和null值存储不同
 *          HashMap集合:可以存储null键和null值
 *          Hashtable集合:不可以存储null键和null值
 *      2.线程安全性不同
 *          HashMap集合:线程不安全
 *          Hashtable集合:线程安全
 *      3.无参构造器的初始容量不同
 *          HashMap集合:16
 *          Hashtable集合:11
 *      4.底层数组的扩容规则不同:
 *          HashMap集合:
 *              JDK7.0(包含)以前:
 *                  2*原来底层数组长度
 *              JDK8.0(包含)以后:
 *                  原来底层数组长度 << 1
 *          Hashtable集合:
 *              JDK6.0(包含)以前:
 *                  原来底层数组长度*2 + 1
 *              JDK7.0(包含)以后
 *                  (原来底层数组长度 << 1) + 1;
 *      5.底层数组的桶元素不同:
 *          HashMap集合:
 *              JDK7.0(包含)以前:桶元素是null或链表对象
 *              JDK8.0(包含)以后:桶元素是null,链表对象或红黑树对象
 *          Hashtable集合:
 *              桶元素是null或链表对象
 */
public class MapDemo04 {
    public static void main(String[] args) {

    }
}
