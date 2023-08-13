package example.date;

import java.util.Calendar;

/**
 * @ClassName DateDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 15时25分45秒
 * @Version 1.0
 *
 * Calendar类
 *      类的特点
 *          针对第二代日期时间类操作的工具抽象类
 *      类的位置
 *          java.util
 *      类的构造器
 *          该类为抽象类
 *      类的方法
 *          public static Calendar getInstance()
 *              使用默认时区和语言环境获得一个日历。
 *          public int get(int field)
 *              返回给定日历字段的值。
 */
public class DateDemo06 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);

        int month = c.get(Calendar.MONTH);

        int day = c.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "年" + (month + 1) + "月" + day + "日");
    }
}
