package example.set.demo03;

import java.util.HashSet;

/**
 * @ClassName SetDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月15日 15时36分59秒
 * @Version 1.0
 *
 * HashSet集合面试题1:HashSet集合如何保证元素的唯一性
 *      1.和存储元素对象的地址值无关
 *      2.重写Object类的hashCode();
 *      3.重写Object类的equals();
 *
 * HashSet集合面试题2:String类重写hashCode方法时,计算的中间量为什么是31?
 *      1.该数不宜过大,也不宜过小(过小增大hashCode重复概率,过大增加计算量)
 *      2.该数的因数不宜过多,推荐质数
 *      3.通过"泊松分布",获取到质数29和31是较为合适的数字
 *      4.因为29可以改写成2^5-3,31可以改写为2^5-1,更符合整数取值范围的格式,最终确定为31
 */
public class SetDemo03 {
    public static void main(String[] args) {
        //创建HashSet集合
        HashSet<String> set = new HashSet<>();

        String str1 = new String("abc");
        String str2 = new String("abc");

        //添加元素
        /*
            往集合set中添加元素str1,底层获取str1的hashCode值96354,将hashCode重新计算成hash值96355,根据hash值和数组的长度
            计算str1在底层数组中存储的索引位置3,获取索引3处的元素(可能:null,链表对象,红黑树对象)为null,将str1封装成链表对象
            存储至索引3处
        */
        set.add(str1);


         /*
            往集合set中添加元素str2,底层获取str2的hashCode值96354,将hashCode重新计算成hash值96355,根据hash值和数组的长度
            计算str2在底层数组中存储的索引位置3,获取索引3处的元素(可能:null,链表对象,红黑树对象)为链表对象,将str2的hash值
            依次和链表对象每个链表对象的hash值进行一一比较,通过比较发现链表对象中元素str1和str2的hash值冲突(碰撞),调用str2的
            equals()判断二者的内容是否相同,通过判断返回true,程序认定为同一个元素,不会将str2存储到底层数组的索引3处
        */

        set.add(str2);

        System.out.println(set);

        System.out.println(str1 == str2);//二者地址值不同

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println("=============================================================");

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());

        /*
            往集合set中添加元素"重地",底层获取"重地"的hashCode值1179395,将hashCode重新计算成hash值1179410,根据hash值和数
            组的长度计算"重地"在底层数组中存储的索引位置2,获取索引2处的元素(可能:null,链表对象,红黑树对象)为null,将"重地"封
            装成链表对象存储至索引2处
        */

        set.add("重地");

        /*
            往集合set中添加元素"通话",底层获取"通话"的hashCode值1179395,将hashCode重新计算成hash值1179410,根据hash值和数
            组的长度计算"通话"在底层数组中存储的索引位置2,获取索引2处的元素(可能:null,链表对象,红黑树对象)为链表对象,将"通话"
            的hash值依次和链表对象每个链表对象的hash值进行一一比较,通过比较发现链表对象中元素"重地"和"通话"的hash值冲突(碰撞),
            调用"通话"的equals()判断二者的内容是否相同,通过判断返回false,程序认定不是同一个元素,将"通话"封装成链表对象存储至
            底层数组索引2处链表对象的最后一位
        */

        set.add("通话");

        System.out.println(set);
    }
}
