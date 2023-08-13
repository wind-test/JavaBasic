package example.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName CollectionDemo08
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月14日 10时30分20秒
 * @Version 1.0
 *
 * 增强for的注意事项:
 *      1.增强for迭代的过程中针对集合中元素的个数不能修改,否则发生"ConcurrentModificationException并发修改异常"
 *      2.增强for既可以遍历单列集合,也可以遍历数组,但是不推荐使用增强for遍历数组
 *          如果使用增强for遍历基本类型元素的数组,JVM的编译器会自动将增强for修改为普通for;
 *          如果使用增强for遍历引用类型元素的数组,JVM的编译器会自动将其转换为集合,在进行迭代器;
 *
 */
public class CollectionDemo08 {
    public static void main(String[] args) {
        //使用多态的形式创建集合对象
        Collection coll = new ArrayList();

        //添加元素
        coll.add("城小将");
        coll.add("唐小妃");
        coll.add("李小白");
        coll.add("波斯客");

        for (Object o : coll) {
            System.out.println(o);
        }

        System.out.println("=============================");

        int[] ints = {11,22,33,44,55};

        for (int i : ints) {
            System.out.println(i);
        }
    }
}
