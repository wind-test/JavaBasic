package example.collection;

/**
 * @ClassName CollectionDemo12
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月14日 13时58分18秒
 * @Version 1.0
 *
 * 泛型的基础应用:
 *      含有泛型的接口
 *      含有泛型的类
 *      含有泛型的方法
 *
 * 含有泛型的接口:
 *      声明格式:
 *          public interface 接口名<泛型> {}
 *      确认时机:
 *          (1)创建接口的实现类对象时
 *          (2)声明某个类实现含有泛型接口时
 *      确认格式:
 *          (1)接口名<泛型类型> 对象名 = new 接口的实现类名<>(实参);
 *          (2)public class 接口实现类名 implements 接口名<泛型类型> {
 *
 *          }
 *
 * 含有泛型的类:
 *      声明格式:
 *          public class 类名<泛型> {
 *
 *          }
 *      确认时机:
 *          创建该类的对象时
 *      确认格式:
 *          类名<泛型类型> 对象名 = new 类名<>();
 *
 * 含有泛型的方法:
 *      声明格式:
 *          修饰符 <泛型> 返回类型 方法名 () {}
 *      确认时机:
 *          调用方法时
 *
 */
public class CollectionDemo12 {
    public static void main(String[] args) {
        //MyCollection.method();
    }
}
