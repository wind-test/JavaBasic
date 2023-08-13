package example.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName CollectionDemo13
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月14日 14时20分36秒
 * @Version 1.0
 *
 * 泛型的高级应用:
 *      泛型的通配符
 *
 * 泛型的通配符:
 *      含义:
 *          当方法的形参是含有泛型的类或者接口,可以使用泛型的通配符进行简化
 *      声明格式:
 *          简化前:
 *              修饰符 <泛型> 返回类型 方法名 (接口名<泛型>或者类名<泛型> 对象名) {}
 *          简化后:
 *              修饰符 返回类型 方法名 (接口名<?>或者类名<?> 对象名) {}
 *
 * 泛型通配符的受限:
 *      通配符的上限:
 *          格式:
 *              <? extends 泛型>
 *          含义:
 *              只能是泛型类型的本身或者其子类类型
 *      通配符的下限:
 *          格式:
 *              <? super 泛型>
 *          含义:
 *              只能是泛型类型的本身或者其父类类型
 */
public class CollectionDemo13 {
    public static void main(String[] args) {
        //创建5个集合对象
        Collection<Object> obj = new ArrayList<>();
        Collection<String> str = new ArrayList<>();
        Collection<A> a = new ArrayList<>();
        Collection<B> b = new ArrayList<>();
        Collection<C> c = new ArrayList<>();

        //调用含有泛型的方法method01(Collection<E> coll)
        MyCollection.method01(obj);
        MyCollection.method01(str);
        MyCollection.method01(a);
        MyCollection.method01(b);
        MyCollection.method01(c);

        System.out.println("=======================");

        //调用method02(Collection<?> coll)
        MyCollection.method02(obj);
        MyCollection.method02(str);
        MyCollection.method02(a);
        MyCollection.method02(b);
        MyCollection.method02(c);

        System.out.println("=======================");

        //调用method03 (Collection<? extends B> coll)
        //MyCollection.method03(obj);
        //MyCollection.method03(str);
        //MyCollection.method03(a);
        MyCollection.method03(b);
        MyCollection.method03(c);

        System.out.println("=======================");

        //调用method04 (Collection<? super B> coll)
        MyCollection.method04(obj);
        //MyCollection.method04(str);
        MyCollection.method04(a);
        MyCollection.method04(b);
        //MyCollection.method04(c);
    }
}
