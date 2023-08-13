package example.date;

import java.util.Date;

/**
 * @ClassName DateDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 14时16分36秒
 * @Version 1.0
 *
 * Date类
 *      类的特点
 *          类 Date 表示特定的瞬间，精确到毫秒。
 *      类的位置
 *          java.util
 *      类的构造器
 *          public Date()
 *              分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
 *          public Date(long date)
 *              分配 Date 对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数。
 *      类的方法
 *          public long getTime()
 *              返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
 */
public class DateDemo02 {
    public static void main(String[] args) {
        //创建Date对象
        Date d1 = new Date();
        //获取该Date对象的毫秒值
        System.out.println(d1.getTime());

        //创建Date对象
        Date d2 = new Date(0L);
        System.out.println(d2);
    }
}
