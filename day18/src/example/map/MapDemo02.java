package example.map;

import java.util.TreeMap;

/**
 * @ClassName MapDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月18日 09时18分08秒
 * @Version 1.0
 *
 * TreeMap类
 *      类的特点
 *          1.TreeMap类底层的数据结构是"红黑树结构"
 *          2.TreeMap类可以针对集合中的元素按照"自然顺序"或"指定顺序"进行排序操作
 *          3.TreeMap类是无序集合
 *          4.TreeMap类不可以存储null键,但可以存储null值,在存储元素的时候需要针对键和获取元素时需要针对值进行非空判断,防止
 *          空指针异常
 *          5.TreeMap类是线程不安全的,适用于单线程程序,如果在多线程中进行使用,需要手动添加线程安全
 *      类的位置
 *          java.util
 *      类的构造器
 *          public TreeMap()
 *              使用键的自然顺序构造一个新的、空的树映射。插入该映射的所有键都必须实现 Comparable 接口。
 *          public TreeMap(Comparator<? super K> comparator)
 *              构造一个新的、空的树映射，该映射根据给定比较器进行排序
 *      类的方法
 *          详见Map接口的常用方法
 */
public class MapDemo02 {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();

        //map.put(null,"值");
        map.put("键",null);

        System.out.println(map);
    }
}
