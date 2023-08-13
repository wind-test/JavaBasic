package example.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName CollectionDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月14日 10时00分43秒
 * @Version 1.0
 *
 * Collection集合通用方式1:迭代器
 *      原理:
 *          迭代器本身是对象,将集合所有元素给到迭代器,从而一个一个进行迭代
 *      步骤:
 *          1.通过单列集合的iterator()获取迭代器对象
 *          2.通过while循环针对迭代器对象进行迭代操作
 *
 * Iterator接口
 *      接口的特点:
 *          对 Collection 进行迭代的迭代器
 *      接口的位置:
 *          java.util
 *      接口的方法:
 *          boolean hasNext()
 *              如果仍有元素可以迭代，则返回 true。
 *          E next()
 *              返回迭代的下一个元素。
 *          void remove()
 *              从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。
 */
public class CollectionDemo05 {
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

        //考虑到无法获取迭代的次数,选择while语句
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
