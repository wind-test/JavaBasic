package example.map;

import java.util.HashMap;

/**
 * @ClassName MapDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月16日 14时06分28秒
 * @Version 1.0
 *
 * HashMap集合存储元素过程的源码分析(基于JDK8.0)
 *      1.分析源码时的名词解释
 *          初始容量:底层数组的初始容量
 *          加载因子:获取阈值的重要参数
 *              加载因子过高虽然减少了空间开销,但同时也增加了查询成本
 *              加载因子过低虽然减少了查询成本,但同时也增加了空间开销
 *              默认加载因子 (0.75) 在时间和空间成本上寻求一种折衷
 *          桶元素:底层数组中的元素,可能为:null,链表对象,红黑树对象
 *          阈值:底层数组进行扩容前的标准(阈值的下一位就是扩容标准)
 *              阈值 = (int)(底层数组长度 * 加载因子)
 *      2.HashMap集合成员常量,成员变量,局部变量的备忘录
 *          成员变量和成员常量:
 *              serialVersionUID(long):API中针对类的编号
 *              DEFAULT_INITIAL_CAPACITY(int):底层数组默认的初始化长度
 *              MAXIMUM_CAPACITY(int):底层数组默认最大的长度
 *              DEFAULT_LOAD_FACTOR(float):默认加载因子
 *              TREEIFY_THRESHOLD(int):底层数组中链表对象进行红黑树化的标准之一
 *              UNTREEIFY_THRESHOLD(int):底层数组中红黑树对象进行链表化的标准
 *              MIN_TREEIFY_CAPACITY(int):底层数组中链表对象进行红黑树化的标准之一
 *              table(Node<K,V>[]):底层数组
 *              entrySet(Set<Map.Entry<K,V>>):键值对集合
 *              size(int):桶元素中映射关系的个数
 *              modCount(int):桶元素中映射关系操作的计数器变量
 *              threshold(int):底层数组的阈值
 *              loadFactor(float):加载因子变量
 *          putVal():
 *              hash(int):key的hashCode计算后hash值
 *              key(泛型):待添加元素的key
 *              value(泛型):待添加元素的value
 *              tab(Node<K,V>[]):添加元素时进行操作的底层数组变量
 *              p(Node<K,V>):待添加元素在底层数组中待存储索引位置上的桶元素
 *              n(int):添加元素时进行操作的底层数组长度变量
 *              i(int):待添加元素在底层数组中存储的索引位置变量
 *              e(Node<K,V>):待添加元素在存储数组中待存储索引位置上桶元素的下一个链表对象
 *              k(泛型):待添加元素在存储数组中待存储索引位置上桶元素的key
 *          resize():
 *              oldTab(Node<K,V>[]):重置底层数组长度前进行操作的底层数组变量
 *              oldCap(int):重置底层数组长度前进行操作的底层数组长度变量
 *              oldThr(int):重置底层数组长度前进行操作的底层数组阈值变量
 *              newCap(int):重置底层数组长度时即将重置的底层数组长度变量
 *              newThr(int):重置底层数组长度时即将重置的底层数组阈值变量
 *              newTab (Node<K,V>[]):重置底层数组长度后进行操作的底层数组变量
 *          treeifyBin():
 *              tab(Node<K,V>[]):准备红黑树化前的待操作底层数组变量
 *              hash(int):添加元素的hash值
 *              n(int):准备红黑树化前的待操作底层数组长度变量
 *
 *      3.HashMap集合底层数组的初始容量以及加载因子
 *          HashMap集合底层数组的初始容量以及加载因子取决于创建HashMap对象时所选择的构造器
 *          (1)HashMap()
 *              初始容量:创建对象时没有进行初始化,第一次添加元素时初始化16
 *              加载因子:0.75
 *          (2)HashMap(int initialCapacity)
 *              初始容量:自定义
 *              加载因子:0.75
 *          (3)HashMap(int initialCapacity, float loadFactor)
 *              初始容量:自定义
 *              加载因子:自定义
 *          (4)HashMap(Map<? extends K,? extends V> m)
 *              初始容量:参数集合的长度
 *              加载因子:0.75
 *      4.HashMap集合首次添加元素的扩容规则
 *          创建HashMap对象时底层数组没有进行初始化,第一次添加元素时初始化16
 *      5.HashMap集合如何确认待存储元素的索引位置
 *          (1)根据key的hashCode值计算hash值
 *              代码:key.hashCode() ^ (key.hashCode() >>> 16)
 *              描述:将key的hashCode值与key的hashCode值无符号右移16位后的值进行按位异或
 *              分析:
 *                  hash值的高16位:
 *                      与hashCode值的高16位相同
 *                  hash值的低16位:
 *                      hashCode值的低16位与hashCode值的高16位进行按位异或
 *              目的:
 *                  将待添加元素可以更加均匀的分布到各桶元素之间
 *          (2)根据key的hash值和底层数组长度-1的值进行按位与获取索引
 *              代码:(底层数组长度 - 1) & hash
 *      6.HashMap集合非首次添加元素的扩容规则
 *          扩容规则:原来底层数组长度 << 1
 *      7.HashMap集合底层数组中的链表对象红黑树化标准
 *          (1)链表对象长度达到8时
 *          (2)底层数组长度达到64时
 *      8.HashMap集合底层数组中的红黑树对象链表化标准
 *          红黑树结点对象降到6个时
 *      9.HashMap集合JDK7.0(包含)以前和JDK8.0(包含)以后源码区别
 *          (1)使用无参构造器底层数组初始时机不同:
 *              JDK7.0(包含)以前:
 *                  直接初始化长度为16的底层数组
 *              JDK8.0(包含)以后:
 *                  创建HashMap对象时底层数组没有进行初始化,第一次添加元素时初始化16
 *          (2)底层哈希表结构不同:
 *              JDK7.0(包含)以前:
 *                  存储链表对象的数组
 *              JDK8.0(包含)以后:
 *                  存储链表对象或者红黑树对象的数组
 *          (3)扩容规则:
 *              JDK7.0(包含)以前:
 *                  2 * 原来底层数组长度
 *              JDK8.0(包含)以后:
 *                  原来底层数组长度 << 1
 *          (4)hash算法不同:
 *              JDK7.0(包含)以前:
 *                  h ^= k.hashCode();
 *                  h ^= (h >>> 20) ^ (h >>> 12);
 *                  h ^ (h >>> 7) ^ (h >>> 4)
 *              JDK8.0(包含)以后:
 *                  key.hashCode() ^ (key.hashCode() >>> 16)
 */
public class MapDemo06 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        for (int i = 1; i <= 12; i++) {
            map.put("键" + i , "值" + i);
        }

        map.put("键13","值13");
        System.out.println(map);
    }
}
