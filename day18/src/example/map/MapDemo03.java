package example.map;

import java.util.Hashtable;

/**
 * @ClassName MapDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月18日 09时26分11秒
 * @Version 1.0
 *
 * Hashtable类
 *      类的特点
 *          1.Hashtable集合底层的数据结构是"哈希表"
 *          2.Hashtable集合不可以存储null键和null值
 *          3.Hashtable集合是无序的集合
 *          4.Hashtable集合无法保证元素的顺序永远不会改变
 *          5.Hashtable集合是线程安全,只适用于多线程程序,如果在单线程中进行使用,效率过低
 *      类的位置
 *          java.util
 *      类的构造器
 *          public Hashtable()
 *              用默认的初始容量 (11) 和加载因子 (0.75) 构造一个新的空哈希表。
 *      类的方法
 *          详见Map集合的常用方法
 */
public class MapDemo03 {
    public static void main(String[] args) {
        Hashtable<String, String> map = new Hashtable<>();

        //map.put("键",null);
        //map.put(null,"值");
    }
}
