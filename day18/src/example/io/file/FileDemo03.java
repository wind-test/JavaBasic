package example.io.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @ClassName FileDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月18日 15时14分10秒
 * @Version 1.0
 *
 * FileOutputStream类(文件字节输出流)
 *      类的特点
 *          针对文件以字节为单位进行写出操作的工具类
 *      类的位置
 *          java.io
 *      类的构造器
 *          public FileOutputStream(File file)
 *              创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
 *          public FileOutputStream(File file,boolean append)
 *              创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
 *          public FileOutputStream(String name)
 *              创建一个向具有指定名称的文件中写入数据的输出文件流
 *          public FileOutputStream(String name,boolean append)
 *              创建一个向具有指定 name 的文件中写入数据的输出文件流。
 *      类的方法
 *          public void close()
 *              关闭此文件输出流并释放与此流有关的所有系统资源
 *          public void write(int b)
 *              将指定字节写入此文件输出流
 *          public void write(byte[] b)
 *              将 b.length 个字节从指定 byte 数组写入此文件输出流中。
 *          public void write(byte[] b,int off,int len)
 *              将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。
 */
public class FileDemo03 {
    public static void main(String[] args) throws IOException {
        //创建文件字节输出流对象
        FileOutputStream fos = new FileOutputStream("day18_code\\src\\com\\atguigu\\io\\file\\FileOutputStream.txt");

        //以单个字节的方式写出内容
        fos.write(97);
        fos.write(98);
        fos.write(99);

        //以字节数组的方式写出内容
        fos.write("尚硅谷".getBytes());

        //以指定范围的字节数组方式写出内容
        fos.write("abcdefg".getBytes(),3,3);//def

        //关闭资源
        fos.close();
    }
}
