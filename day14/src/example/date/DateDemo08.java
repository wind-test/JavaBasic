package example.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName DateDemo08
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 16时01分18秒
 * @Version 1.0
 *
 * DateTimeFormatter类
 *      类的特点
 *          针对第三代日期时间类进行格式化解析操作的工具类
 *      类的位置
 *          java.time.format
 *      类的构造器
 *          构造器私有化
 *      类的方法
 *          public static DateTimeFormatter ofPattern(String pattern)
 *              创建一个格式化程序使用指定的模式。
 *          public String format(TemporalAccessor temporal)
 *              使用此格式化程序格式的日期时间对象。
 *
 * LocalDateTime类的格式化操作:
 *      1.获取LocalDateTime对象
 *      2.获取DateTimeFormatter对象并指定格式
 *      3.进行格式化操作
 */
public class DateDemo08 {
    public static void main(String[] args) {
        //1.获取LocalDateTime对象
        LocalDateTime ldt = LocalDateTime.now();

        //2.获取DateTimeFormatter对象并指定格式
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

        //3.进行格式化操作
        String format = dtf.format(ldt);

        System.out.println(format);
    }
}
