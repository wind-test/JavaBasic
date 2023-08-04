package example.integer;

/**
 * @ClassName IntegerDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 16时42分04秒
 * @Version 1.0
 *
 * 基本类型和字符串类型之间的转换
 *
 * 将基本类型的数据转换成字符串类型的对象
 *      1.字符串连接符
 *      2.包装类型的实例方法toString()
 *      3.包装类型以包装类型对应的基本类型作为形参的静态方法toString()
 *      4.String类以基本类型作为形参的静态方法valueOf()(推荐)
 * 将字符串类型的对象转换成基本类型的数据
 *      1.包装类型以字符串为形参的构造器,在进行拆箱操作
 *      2.包装类型以字符串为形参的静态方法parseXxx()(备注:Xxx待装换基本类型)(推荐)
 *
 * 注意事项:
 *      1.将字符串类型的对象转换成基本类型的数据时,""中的内容必须在待转换基本类型的取值范围
 *      2.包装类型Character并没有提供将字符串类型的对象转换成char类型数据的方式
 */
public class IntegerDemo03 {
    public static void main(String[] args) {
        //基本==>字符串1:字符串连接符
        String str1 = 123 + "";
        //String str1 = new StringBuilder().append(123).append("").toString();

        //基本==>字符串2:包装类型的实例方法toString()
        String str2 = new Integer(234).toString();

        //基本==>字符串3:包装类型以包装类型对应的基本类型作为形参的静态方法toString()
        String str3 = Integer.toString(345);

        //基本==>字符串4:String类以基本类型作为形参的静态方法valueOf()
        String str4 = String.valueOf(456);

        System.out.println("======================================");

        //字符串==>基本1:包装类型以字符串为形参的构造器,在进行拆箱操作
        int num1 = new Integer("567").intValue();

        //字符串==?基本2:包装类型以字符串为形参的静态方法parseXxx()(备注:Xxx待装换基本类型)
        int num2 = Integer.parseInt("678");

    }
}
