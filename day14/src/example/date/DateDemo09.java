package example.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName DateDemo09
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 16时09分26秒
 * @Version 1.0
 *
 * LocalDateTime类的解析操作:
 *      1.创建存储日期时间的文本
 *      2.获取DateTimeFormatter对象并指定格式
 *      3.进行解析操作
 */
public class DateDemo09 {
    public static void main(String[] args) {
        //1.创建存储日期时间的文本
        String dt = "2022年07月12日 15时07分32秒931毫秒";

        //2.获取DateTimeFormatter对象并指定格式
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");

        //3.进行解析操作
        LocalDateTime parse = LocalDateTime.parse(dt, dtf);

        System.out.println(parse);


    }
}
