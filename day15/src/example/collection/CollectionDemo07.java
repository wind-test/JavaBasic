package example.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName CollectionDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月14日 10时21分39秒
 * @Version 1.0
 *
 * Collection集合通用方式2:增强for(JDK5.0)
 *      原理:
 *          底层其实就是迭代器
 *      格式:
 *          for (容器中元素数据类型 元素名 : 容器名) {
 *              循环体语句
 *          }
 *      好处:
 *          增强for的出现,将手动获取迭代器对象改为底层自动获取,避免使用迭代器过程中的"NoSuchElementException没有元素异常"
 */
public class CollectionDemo07 {
    public static void main(String[] args) {
        //使用多态的形式创建集合对象
        Collection coll = new ArrayList();

        //添加元素
        coll.add("城小将");
        coll.add("唐小妃");
        coll.add("李小白");
        coll.add("波斯客");


        //使用增强for遍历集合
        for (Object obj: coll) {
            System.out.println(obj);
        }
    }
}
