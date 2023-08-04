package example.integer;

/**
 * @ClassName IntegerDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 16时27分47秒
 * @Version 1.0
 *
 * 基本类型和包装类型之间的转换(装箱和拆箱)
 *      装箱:
 *          将基本类型的数据转换成包装类型的对象
 *      拆箱:
 *          将包装类型的对象转换成基本类型的数据
 *
 * 装箱方式:
 *      1.包装类型以基本类型作为形参的构造器
 *      2.包装类型以基本类型作为形参的静态方法valueOf()
 *      3.自动装箱(JDK5.0)(推荐)
 *          由JVM隐式调用包装类型以基本类型作为形参的静态方法valueOf()
 *
 * 拆箱方式:
 *      1.包装类型的实例方法xxxValue()(备注:xxx包装类型对应基本类型)
 *      2.自动拆箱(JDK5.0)(推荐)
 *          由JVM隐式调用包装类型的实例方法xxxValue()
 */
public class IntegerDemo02 {
    public static void main(String[] args) {
        //装箱1:包装类型以基本类型作为形参的构造器
        Integer num1 = new Integer(123);
        System.out.println(num1);

        //装箱2:包装类型以基本类型作为形参的静态方法valueOf()
        Integer num2 = Integer.valueOf(234);
        System.out.println(num2);

        //装箱3:自动装箱
        Integer num3 = 345;
        System.out.println(num3);

        System.out.println("============================================");

        //拆箱1:包装类型的实例方法xxxValue(备注:xxx包装类型对应基本类型)
        int num4 = new Integer(456).intValue();
        System.out.println(num4);


        //拆箱2:自动拆箱
        int num5 = new Integer(567);
        System.out.println(num5);
    }
}
