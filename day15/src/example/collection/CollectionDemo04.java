package example.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName CollectionDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月14日 09时14分52秒
 * @Version 1.0
 *
 * Collection面试题:
 *      使用多态的形式创建Collection集合对象,如果使用对象调用方法,先虚调用Collection接口中的方法(判断Collection接口是否存在
 *      该方法),如果存在,实调用Collection接口实现类重写后的方法,目前使用Collection接口的多态对象调用toString(),先虚调用
 *      Collection接口中的toString方法(判断Collection接口是否存在toString方法),通过查看源码发现Collection接口及其父接口
 *      没有发现toString方法,多态对象无法调用子类或者实现类特有方法,理论上应该编译报错,但实际上没有报错,为什么?
 *          答案:所有的接口都直接或间接继承Object类的接口形式,从而所有的接口中包含Object类中方法的抽象形式
 *
 */
public class CollectionDemo04 {
    public static void main(String[] args) {
        //使用多态的形式创建Collection对象
        Collection coll = new ArrayList();

        //添加元素
        coll.add("abc");
        coll.add("def");
        coll.add("ghi");

        //打印集合对象
        System.out.println(coll.toString());
    }
}
