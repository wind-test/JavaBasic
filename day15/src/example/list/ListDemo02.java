package example.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月14日 15时26分37秒
 * @Version 1.0
 *
 * List接口的常用方法
 */
public class ListDemo02 {
    public static void main(String[] args) {
        //使用多态的形式创建List集合对象
        List<String> list = new ArrayList<>();

        //添加元素
        list.add("abc");
        list.add("def");
        list.add("123");

        System.out.println(list);

        //将指定元素存储到集合的指定索引位置
        list.add(0,"123");

        System.out.println(list);

        //获取指定索引位置上的元素
        System.out.println(list.get(0));

        //获取指定元素在集合中出现的第一次索引
        System.out.println(list.indexOf("123"));
        System.out.println(list.indexOf("HelloWorld"));

        //获取指定元素在集合中出现的最后一次索引
        System.out.println(list.lastIndexOf("123"));
        System.out.println(list.lastIndexOf("HelloWorld"));

        //删除指定索引位置上的元素
        list.remove(0);

        System.out.println(list);

        //将集合中指定的索引位置上的元素进行替换为指定元素
        list.set(2,"ghi");

        System.out.println(list);

        //获取通过指定索引范围截取后的子集合(包含开始,不包含结束)
        System.out.println(list.subList(1,2));
    }
}
