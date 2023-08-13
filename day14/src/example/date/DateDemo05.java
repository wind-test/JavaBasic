package example.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 15时08分12秒
 * @Version 1.0
 *
 * Date对象的解析
 *      1.创建存储日期时间的文本
 *      2.根据给定的格式创建SimpleDateFormat对象
 *      3.进行解析操作
 */
public class DateDemo05 {
    public static void main(String[] args) throws ParseException {
        //1.创建存储日期时间的文本
        String dt = "2022年07月12日 15时07分32秒931毫秒";

        //2.根据给定的格式创建SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");

        //3.进行解析操作
        Date parse = sdf.parse(dt);

        System.out.println(parse);
    }
}
