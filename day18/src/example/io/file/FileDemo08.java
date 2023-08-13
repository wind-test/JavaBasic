package example.io.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName FileDemo08
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月18日 16时33分26秒
 * @Version 1.0
 *
 * 学习文件字符流的目的:
 *      避免编码和解码的过程中出现转换乱码情况
 *          编码:文本==>字节
 *          解码:字节==>文本
 *
 * 文件字节流:
 *      适用于读写操作视频,音频,图片等
 * 文件字符流:
 *      适用于读写文本文件
 *
 * FileReader类(文件字符输入流)
 *      类的特点
 *          针对文件以字符为单位进行读取操作的工具类
 *      类的位置
 *          java.io
 *      类的构造器
 *          public FileReader(File file)
 *              在给定从中读取数据的 File 的情况下创建一个新 FileReader。
 *          public FileReader(String fileName)
 *              在给定从中读取数据的文件名的情况下创建一个新 FileReader。
 *      类的方法
 *          public void close()
 *              关闭该流并释放与之关联的所有资源。
 *          public int read()
 *              读取单个字符。
 *          public int read(char[] cbuf)
 *              将字符读入数组。
 */
public class FileDemo08 {
    public static void main(String[] args) throws IOException {
        //创建文件字符输入流对象
        FileReader fr = new FileReader("day18_code\\src\\com\\atguigu\\io\\file\\FileReader.txt");

        //以单个字符读取操作
        /*int len;
        while ((len = fr.read()) != -1) {
            System.out.println((char)len);
        }*/

        //以字符数组的方式读取操作
        int len;
        char[] chars = new char[8192];
        while ((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }

        //关闭资源
        fr.close();
    }
}
