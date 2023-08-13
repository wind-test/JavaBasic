package example.string;

/**
 * @ClassName StringDemo08
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月11日 14时02分40秒
 * @Version 1.0
 *
 * StringBuffer类和StringBuilder类相同点和不同点:
 *      相同点:
 *          1.二者共同继承AbstractStringBuilder类
 *          2.二者都是可变的字符串
 *          3.二者拥有相同的功能的方法
 *      不同点:
 *          1.StringBuffer虽然和StringBuilder类的功能方法相同,但是方法都被synchronized关键字进行修饰
 *          2.StringBuffer类是线程安全的,适用于多线程程序,如果在单线程程序中使用,StringBuffer类执行效率要比StringBuilder更低
 *          3.StringBuilder类是线程不安全,适用于单线程程序,如果在多线程程序中使用,需要手动添加线程安全
 */
public class StringDemo08 {
    public static void main(String[] args) {
    }
}
