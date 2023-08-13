package example.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName CollectionDemo11
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月14日 11时21分13秒
 * @Version 1.0
 *
 * 泛型(JDK5.0):
 *      含义:
 *          未知的数据类型(类似于小学时期的设变量x)
 *      好处:
 *          将程序运行时期可能发生的问题,前提至编译时期
 *      声明:
 *          泛型如果使用必须提前在声明类,接口,方法时进行声明
 *          <泛型>
 *      注意:
 *          1.使用含有泛型的类,接口,方法必须在合适的时机确认泛型,如果不确认,JVM会将其确认为Object类型
 *          2.泛型在确认时前后必须一致,否则编译报错
 *
 * 集合确认泛型的时机:
 *      创建集合对象时
 * 集合确认泛型的格式:
 *      完整版(JDK5.0和6.0)
 *          集合类型<泛型类型> 对象名 = new 集合类型<泛型类型>();
 *      简化版(JDK7.0以后):
 *          集合类型<泛型类型> 对象名 = new 集合类型<>();
 */
public class CollectionDemo11 {
    public static void main(String[] args) {
        //使用多态的形式创建集合对象
        Collection<String> coll = new ArrayList<>();

        coll.add("马伟杰");
        coll.add("马化腾");
        coll.add("马云");
        //coll.add(123);
        coll.add("马伊琍");
        coll.add("刘云翔");
        coll.add("古晓杰");


        //获取班级姓马且3个字的同学
        for (String name : coll) {
            if (name.startsWith("马") && name.length() == 3) {
                System.out.println(name);
            }
        }

        /*for (Object obj : coll) {
            //针对Object类型的对象进行"向下转型"
            if (obj instanceof String) {
                String name = (String)obj;

                //针对名字进行判断
                if (name.startsWith("马") && name.length() == 3) {
                    System.out.println(name);
                }
            }
        }*/
    }
}
