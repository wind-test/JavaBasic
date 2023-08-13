package example.io.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName FileDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月18日 15时47分09秒
 * @Version 1.0
 *
 * 文件的复制:
 *    以单个字节为单位复制文件
 *    以字节数组为单位复制文件
 */
public class FileDemo06 {
    public static void main(String[] args) throws IOException {
        //创建文件字节输入流和文件字节输出流
        FileInputStream fis = new FileInputStream("G:\\20220623\\day18\\resources\\girl2.mp4");
        FileOutputStream fos = new FileOutputStream("G:\\20220623\\day18\\resources\\copy.mp4");

        //以单个字节为单位进行文件的复制
        int len;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }

        //关闭资源(先开后关,后开先关)
        fos.close();
        fis.close();
    }
}
