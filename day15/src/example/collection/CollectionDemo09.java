package example.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * @ClassName CollectionDemo09
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月14日 11时01分05秒
 * @Version 1.0
 *
 * Collection集合通用方式3:forEach()
 */
public class CollectionDemo09 {
    public static void main(String[] args) {
        //使用多态的形式创建集合对象
        Collection coll = new ArrayList();

        //添加元素
        coll.add("城小将");
        coll.add("唐小妃");
        coll.add("李小白");
        coll.add("波斯客");

        coll.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });

    }
}
