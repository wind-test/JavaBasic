package example.set.demo03;

//import sun.reflect.generics.tree.Tree;

import java.util.TreeSet;

/**
 * @ClassName SetDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月16日 09时26分00秒
 * @Version 1.0
 *
 * TreeSet类
 *      类的特点
 *          1.TreeSet集合的底层封装了一个TreeMap实例
 *              TreeMap的底层数据结构是"红黑树结构"
 *          2.TreeSet集合是无序的集合
 *              无序:存储元素的顺序和获取元素的顺序不是一致的
 *          3.TreeSet集合可以根据元素的"自然顺序"或"定制顺序"进行排序操作
 *          4.TreeSet集合不可以存储null元素,存储元素是需要进行非空校验,防止往集合中添加元素时出现空指针异常
 *          5.TreeSet集合不是线程安全的,只适用于单线程程序,如果在多线程中进行使用,需要手动添加线程安全
 *      类的位置
 *          java.util
 *      类的构造器
 *          public TreeSet()
 *              构造一个新的空 set，该 set 根据其元素的自然顺序进行排序。
 *          public TreeSet(Comparator<? super E> comparator)
 *              构造一个新的空 TreeSet，它根据指定比较器进行排序。
 *      类的方法
 *          详见Collection集合的常用方法
 */
public class SetDemo03 {
    public static void main(String[] args) {
        //创建TreeSet集合对象
        TreeSet<String> set = new TreeSet<>();

        //添加元素
        //set.add(null);

        //System.out.println(set);

    }
}
