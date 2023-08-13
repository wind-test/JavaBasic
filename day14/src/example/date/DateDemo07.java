package example.date;

import java.time.LocalDateTime;

/**
 * @ClassName DateDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 15时35分11秒
 * @Version 1.0
 *
 * LocalDateTime类
 *      类的特点
 *          针对第三代日期时间操作的工具类
 *      类的位置
 *          java.time
 *      类的构造器
 *          构造器私有化
 *      类的方法
 *          public static LocalDateTime now()
 *              从默认时区中的系统时钟中获取当前日期时间
 *          public int getXxx()
 *              获取日期时间对应的字段。
 *          public static LocalDateTime parse(CharSequence text,DateTimeFormatter formatter)
 *              获得 LocalDateTime实例从使用特定格式的文本字符串。
 */
public class DateDemo07 {
    public static void main(String[] args) {
        //获取LocalDateTime对象
        LocalDateTime ldt = LocalDateTime.now();

        int year = ldt.getYear();
        int month = ldt.getMonthValue();
        int day = ldt.getDayOfMonth();

        System.out.println(year + "年" + month + "月" + day + "日");

    }
}
