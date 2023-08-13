package example.io.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName FileDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月18日 15时36分45秒
 * @Version 1.0
 *
 * 文件的续写
 */
public class FileDemo04 {
    public static void main(String[] args) throws IOException {
        //创建文件字节输出流
        FileOutputStream fos = new FileOutputStream("day18_code\\src\\com\\atguigu\\io\\file\\FileOutputStream.txt",true);

        //进行写出操作
        fos.write("尚硅谷".getBytes());

        //关闭资源
        fos.close();
    }
}
