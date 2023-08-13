package example.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName CollectionsDemo
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月16日 10时47分41秒
 * @Version 1.0
 *
 * Collections类
 *      类的特点
 *          针对Collection集合进行操作的工具类
 *      类的位置
 *          java.util
 *      类的构造器
 *          构造器私有化
 *      类的方法
 *          public static <T> boolean addAll(Collection<? super T> c, T... elements)
 *              将所有指定元素添加到指定 collection 中。
 *          public static void reverse(List<?> list)
 *              反转指定列表中元素的顺序。
 *          public static void shuffle(List<?> list)
 *              使用默认随机源对指定列表进行置换。
 *          public static <T extends Comparable<? super T>> void sort(List<T> list)
 *              根据元素的自然顺序 对指定列表按升序进行排序
 *          public static <T> void sort(List<T> list,Comparator<? super T> c)
 *              根据指定比较器产生的顺序对指定列表进行排序。
 *
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> list = new ArrayList<>();

        //批量将元素添加到集合中
        Collections.addAll(list,"11","22","33","44","55","66","77");

        System.out.println(list);

        //将集合中元素进行反转
        Collections.reverse(list);

        System.out.println(list);

        //将集合中元素的顺序进行打乱
        Collections.shuffle(list);

        System.out.println(list);

        //将集合中元素进行排序
        Collections.sort(list);

        System.out.println(list);
    }
}
