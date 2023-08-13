package example.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

/**
 * @ClassName ListDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月14日 15时47分20秒
 * @Version 1.0
 *
 * List集合的六种遍历方式
 *      1.迭代器
 *      2.增强for
 *      3.forEach()
 *      4.Stream流的forEach()
 *      5.List集合特有迭代器
 *      6.普通for
 */
public class ListDemo03 {
    public static void main(String[] args) {
        //使用多态的形式创建集合对象
        List<String> list = new ArrayList<>();

        //添加元素
        list.add("城小将");
        list.add("唐小妃");
        list.add("李小白");
        list.add("波斯客");

        //遍历方式1:迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("==========================");

        //遍历方式2:增强for
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("==========================");

        //遍历方式3:forEach()
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("==========================");

        //遍历方式4:Stream流的forEach()
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("==========================");

        //遍历方式5:List集合特有迭代器
        ListIterator<String> li = list.listIterator();

        while (li.hasNext()) {
            System.out.println(li.next());
        }

        System.out.println("==========================");

        //遍历方式6:普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
