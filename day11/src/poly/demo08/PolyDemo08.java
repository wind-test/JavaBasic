package poly.demo08;

/**
 * @ClassName PolyDemo08
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 16时20分09秒
 * @Version 1.0
 *
 * 向上转型和向下转型:
 *      向上转型:
 *          将子类类型的对象转换成父类类型的对象(其实就是多态)
 *      向下转型:
 *          将父类类型的对象转换成子类类型的对象
 *
 * 向下转型的格式:
 *      子类类名 对象名 = (子类类名)父类类型的对象;
 *
 * 向下转型的注意事项:
 *      将父类类型对象向下转型为不是该对象内存中本质类型时,导致"类型转换异常ClassCastException"
 */
public class PolyDemo08 {
    public static void main(String[] args) {
        //创建猫对象
        Animal tom = new Cat(2, "白");

        //进行向下转型
        Cat cat = (Cat)tom;
        cat.catchMouse();

        System.out.println("======================================");

        //宏愿:狗抓老鼠(即将达成)

        //使用多态的形式创建狗对象
        Animal twoHa = new Dog(3, "黑");

        //将多态形式的狗对象向下转型为猫对象
        Cat c = (Cat)twoHa;

        //操作狗抓老鼠
        c.catchMouse();
    }
}
