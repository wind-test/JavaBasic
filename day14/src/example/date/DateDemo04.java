package example.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 14时58分32秒
 * @Version 1.0
 *
 * Date类的格式化:
 *      1.创建Date对象
 *      2.根据给定的格式创建SimpleDateFormat对象
 *      3.进行格式化操作
 */
public class DateDemo04 {
    public static void main(String[] args) {
        //1.创建Date对象
        Date date = new Date();

        //2.根据给定的格式创建SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");

        //3.进行格式化操作
        String format = sdf.format(date);

        System.out.println(format);
    }
}
