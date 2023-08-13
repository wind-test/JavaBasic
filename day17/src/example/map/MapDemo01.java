package example.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName MapDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月16日 11时11分11秒
 * @Version 1.0
 *
 * Map接口
 *      接口的特点
 *          1.Map集合以"键值对"的形式进行存储,一个key(键),一个值(value)
 *          2.key和value之间的关系是映射关系
 *          3.Map集合的key和value的泛型可以一样,也可以不一样
 *          4.Map集合中key不能重复,每个keyi最多只能映射到一个value
 *          5.Map集合中value可以重复
 *          6.Map集合中提供了三种单列集合,分别是键集,值集,键值对集
 *      接口的位置
 *          java.util
 *      接口的方法
 *          V put(K key,V value)
 *              将指定的值与此映射中的指定键关联（可选操作）。
 *          void clear()
 *              从此映射中移除所有映射关系（可选操作）
 *          boolean containsKey(Object key)
 *              如果此映射包含指定键的映射关系，则返回 true。
 *          boolean containsValue(Object value)
 *              如果此映射将一个或多个键映射到指定值，则返回 true。
 *          V get(Object key)
 *              返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。
 *          boolean isEmpty()
 *              如果此映射未包含键-值映射关系，则返回 true。
 *          V remove(Object key)
 *              如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
 *          int size()
 *              返回此映射中的键-值映射关系数。
 *          Set<K> keySet()
 *              返回此映射中包含的键的 Set 视图。
 *          Collection<V> values()
 *              返回此映射中包含的值的 Collection 视图。
 *          Set<Map.Entry<K,V>> entrySet()
 *              返回此映射中包含的映射关系的 Set 视图
 */
public class MapDemo01 {
    public static void main(String[] args) {
        //使用多态的形式创建Map集合对象
        Map<String,String> map = new LinkedHashMap<>();

        //添加元素
        map.put("郭靖","华筝");
        map.put("杨过","小龙女");
        map.put("张无忌","赵敏");

        map.put("郭靖","黄蓉");
        map.put("尹志平","小龙女");

        System.out.println(map);

        System.out.println("======================");

        //判断集合中是否包含指定的key
        System.out.println(map.containsKey("郭靖"));
        System.out.println(map.containsKey("韦小宝"));

        System.out.println("======================");

        //判断集合中是否包含指定的value
        System.out.println(map.containsValue("黄蓉"));
        System.out.println(map.containsValue("华筝"));

        System.out.println("======================");

        //根据指定的key获取指定value
        System.out.println(map.get("郭靖"));
        System.out.println(map.get("韦小宝"));

        System.out.println("======================");

        System.out.println("删除前:" + map);

        //根据指定key删除映射关系
        map.remove("尹志平");

        System.out.println("删除后:" + map);

        System.out.println("======================");

        //获取集合的长度(获取集合中映射关系的对数)
        System.out.println(map.size());

        System.out.println("======================");

        //获取所有键的集合
        Set<String> keys = map.keySet();
        System.out.println(keys);

        System.out.println("======================");

        //获取所有值的集合
        Collection<String> values = map.values();
        System.out.println(values);

        System.out.println("======================");

        //获取所有映射关系(键值对)的集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);

        System.out.println("======================");

        //判断集合的长度是否为0
        System.out.println(map.isEmpty());

        System.out.println("======================");

        //移除map集合中所有的映射关系
        map.clear();
        System.out.println(map);

        System.out.println("======================");

        //判断集合的长度是否为0
        System.out.println(map.isEmpty());
    }
}
