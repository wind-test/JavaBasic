package example.io.file;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName FileDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月18日 15时41分30秒
 * @Version 1.0
 *
 * 输出回车换行符
 */
public class FileDemo05 {
    public static void main(String[] args) throws IOException {
        //创建文件字节输出流
        FileOutputStream fos = new FileOutputStream("day18_code\\src\\com\\atguigu\\io\\file\\FileOutputStream.txt");

        //进行写出操作
        fos.write("尚".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("硅".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("谷".getBytes());

        //关闭资源
        fos.close();
    }
}
