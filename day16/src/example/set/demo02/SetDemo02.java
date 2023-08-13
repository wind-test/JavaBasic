package example.set.demo02;

import java.util.HashSet;

/**
 * @ClassName SetDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月15日 15时16分31秒
 * @Version 1.0
 *
 * HashSet类
 *      类的特点
 *          1.HashSet集合底层封装一个HashMap实例
 *              HashMap集合底层数据结构是"哈希表结构"
 *              哈希表结构:
 *                  JDK7.0(包含)以前:
 *                      哈希表结构是存储链表对象的数组
 *                  JDK8.0(包含)以后:
 *                      哈希表结构是存储链表对象或红黑树对象的数组
 *          2.HashSet集合是无序的集合
 *          3.HashSet集合无法保证存储集合中元素的顺序永远不会改变
 *              原因:元素的顺序和底层数组的长度有关,一旦底层数组长度改变,元素在集合中的位置就有可能发生变化
 *          4.HashSet集合可以存储null元素,获取集合中元素时需要进行非空校验,防止使用元素时出现空指针异常
 *          5.HashSet集合是线程不安全,适用于单线程程序,如果在多线程中进行使用需要手动添加线程安全
 *      类的位置
 *          java.util
 *      类的构造器
 *          public HashSet()
 *              构造一个新的空 set，其底层 HashMap 实例的默认初始容量是 16，加载因子是 0.75。
 *      类的方法
 *          详见Collection接口的常用方法
 */
public class SetDemo02 {
    public static void main(String[] args) {
        //创建HashSet实例
        HashSet<String> set = new HashSet<>();

        //添加元素
        while (set.size() < 12) {
            String str = "元素" + (int)(Math.random() * 100);
            set.add(str);
        }

        System.out.println("扩容前:" + set);

        set.add("元素666");

        System.out.println("扩容后:" + set);
    }
}
