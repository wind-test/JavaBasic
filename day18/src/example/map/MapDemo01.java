package example.map;

import java.util.LinkedHashMap;

/**
 * @ClassName MapDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月18日 08时56分06秒
 * @Version 1.0
 *
 * LinkedHashMap类
 *      类的特点
 *          1.LinkedHashMap类是HashMap类的子类
 *          2.LinkedHashMap类底层数据结构是"哈希表 + 链表"
 *              链表:维护集合中映射关系的有序性
 *          3.LinkedHashMap类是有序的集合
 *          4.LinkedHashMap类是线程不安全,适用于单线程程序,如果在多线程中进行使用,需要手动添加线程安全
 *      类的位置
 *          java.util
 *      类的构造器
 *          public LinkedHashMap()
 *              构造一个带默认初始容量 (16) 和加载因子 (0.75) 的空插入顺序 LinkedHashMap 实例。
 *          public LinkedHashMap(int initialCapacity,float loadFactor,boolean accessOrder)
 *              构造一个带指定初始容量、加载因子和排序模式的空 LinkedHashMap 实例。
 *      类的方法
 *          详见Map集合的常用方法
 */
public class MapDemo01 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        map.put("郭靖","");
        map.put("杨过","");
        map.put("张无忌","");

        System.out.println(map);
    }
}
