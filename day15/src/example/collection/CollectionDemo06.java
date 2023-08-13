package example.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName CollectionDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月14日 10时11分44秒
 * @Version 1.0
 *
 * 迭代器的注意事项:
 *      1.迭代器对象只能遍历唯一的一次,如果需要二次遍历,要重新获取迭代器对象,否则会发生"NoSuchElementException没有元素异常"
 *      2.迭代器迭代的过程中针对集合中元素的个数不推荐修改,可能发生"ConcurrentModificationException并发修改异常"
 */
public class CollectionDemo06 {
    public static void main(String[] args) {
        //使用多态的形式创建集合对象
        Collection coll = new ArrayList();

        //添加元素
        coll.add("城小将");
        coll.add("唐小妃");
        coll.add("李小白");
        coll.add("波斯客");



        //获取迭代器对象
        Iterator it = coll.iterator();

        coll.add("不倒翁小姐姐");

        //考虑到无法获取迭代的次数,选择while语句
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
