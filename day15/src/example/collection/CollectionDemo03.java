package example.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName CollectionDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月14日 08时55分45秒
 * @Version 1.0
 *
 * Collection接口
 *      接口的特点
 *          单列集合的顶级接口
 *      接口的位置
 *          java.util
 *      接口的方法
 *          boolean add(E e)
 *              确保此 collection 包含指定的元素（可选操作）
 *          void clear()
 *              移除此 collection 中的所有元素（可选操作）
 *          boolean contains(Object o)
 *              如果此 collection 包含指定的元素，则返回 true
 *          boolean isEmpty()
 *              如果此 collection 不包含元素，则返回 true
 *          Iterator<E> iterator()
 *              返回在此 collection 的元素上进行迭代的迭代器
 *          boolean remove(Object o)
 *              从此 collection 中移除指定元素的单个实例，如果存在的话（可选操作）
 *          int size()
 *              返回此 collection 中的元素数
 *          default Stream<E> stream()
 *              返回一个序列 Stream与集合的来源
 *          default void forEach(Consumer<? super T> action)
 *              执行特定动作的每一个元素的 Iterable直到所有元素都被处理或操作抛出异常。
 */
public class CollectionDemo03 {
    public static void main(String[] args) {
        //使用多态的形式创建Collection对象
        Collection coll = new ArrayList();

        //打印集合对象
        System.out.println(coll);

        //添加元素
        coll.add("abc");
        coll.add("def");
        coll.add("123");
        coll.add(123);

        System.out.println(coll);

        //删除集合的Integer类型123
        coll.remove(123);

        System.out.println(coll);

        //获取集合的长度
        System.out.println(coll.size());

        //判断集合中是否包含指定元素
        System.out.println(coll.contains("def"));
        System.out.println(coll.contains("HelloWorld"));

        //判断集合中元素的个数是否为0
        System.out.println(coll.isEmpty());

        //删除集合中所有元素
        coll.clear();
        System.out.println(coll);

        //判断集合中元素的个数是否为0
        System.out.println(coll.isEmpty());
    }
}
