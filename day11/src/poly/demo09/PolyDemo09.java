package poly.demo09;

/**
 * @ClassName PolyDemo09
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 16时38分38秒
 * @Version 1.0
 *
 * instanceof关键字:
 *      含义:
 *          包含
 *      格式:
 *          对象名 instanceof 类名
 *      作用:
 *          判断对象在内存中的本质是否为该类型本身或者其子类类型,如果是,返回true,如果不是,返回false
 */
public class PolyDemo09 {
    public static void main(String[] args) {
        //创建猫对象
        Animal tom = new Cat(2, "白");

        if (tom instanceof Cat) {
            //进行向下转型
            Cat cat = (Cat)tom;
            cat.catchMouse();
        } else {
            System.out.println("对象tom在内存中不是Cat类型,无法进行向下转型");
        }

        System.out.println("======================================");

        //宏愿:狗抓老鼠(即将达成)

        //使用多态的形式创建狗对象
        Animal twoHa = new Dog(3, "黑");

        if (twoHa instanceof Cat) {
            //将多态形式的狗对象向下转型为猫对象
            Cat c = (Cat)twoHa;

            //操作狗抓老鼠
            c.catchMouse();
        } else {
            System.out.println("对象twoHa在内存中不是Cat类型,无法进行向下转型");
        }
    }
}
