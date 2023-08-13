package example.set.demo01;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @ClassName SetDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月15日 15时09分01秒
 * @Version 1.0
 *
 * Set接口:
 *      接口的特点
 *          1.Set集合不可以存储重复元素
 *          2.Set集合中既有有序集合,也有无序集合
 *          3.Set集合没有索引
 *          4.Set集合遍历方式有4种
 *      接口的位置
 *          java.util
 *      接口的方法
 *          详见Collection集合的常用方法
 */
public class SetDemo01 {
    public static void main(String[] args) {
        //使用多态的方式创建Set集合对象
        Set<String> set = new LinkedHashSet<>();

        //添加元素
        set.add("abc");
        set.add(new String("abc"));
        set.add("a" + "b" + "c");

        //打印set集合
        System.out.println(set);
    }
}
