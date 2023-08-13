package example.io.file;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName FileDemo09
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月18日 16时57分57秒
 * @Version 1.0
 *
 * FileWriter类(文件字符输出流)
 *      类的特点
 *          针对文件以字符为单位进行写出操作的工具类
 *      类的位置
 *          java.io
 *      类的构造器
 *          public FileWriter(File file)
 *              根据给定的 File 对象构造一个 FileWriter 对象。
 *          public FileWriter(File file,boolean append)
 *              根据给定的 File 对象构造一个 FileWriter 对象。如果第二个参数为 true，则将字节写入文件末尾处，而不是写入文件开始处。
 *          public FileWriter(String fileName)
 *              根据给定的文件名构造一个 FileWriter 对象。
 *          public FileWriter(String fileName,boolean append)
 *              根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。
 *      类的方法
 *          public void close()
 *              关闭此流，但要先刷新它。
 *          public void flush()
 *              刷新该流的缓冲。
 *          public void write(int c)
 *              写入单个字符
 *          public void write(char[] cbuf)
 *              写入字符数组。
 *          public void write(char[] cbuf,int off,int len)
 *              写入字符数组的某一部分。
 *          public void write(String str)
 *              写入字符串。
 *          public void write(String str,int off,int len)
 *              写入字符串的某一部分。
 */
public class FileDemo09 {
    public static void main(String[] args) throws IOException {
        //创建文件字符输出流对象
        FileWriter fw = new FileWriter("day18_code\\src\\com\\atguigu\\io\\file\\FileWriter.txt");

        //写入单个字符
        fw.write(97);
        fw.write(98);
        fw.write(99);

        fw.write("\r\n");

        //写入字符数组
        char[] chars = {'a','b','c','d','e','f','g'};
        fw.write(chars);

        fw.write("\r\n");

        //写入指定范围的字符数组
        fw.write(chars,3,3);

        fw.write("\r\n");

        //写入字符串
        fw.write("abcdefg");

        fw.write("\r\n");

        //写入指定范围的字符串
        fw.write("abcdefg",3,3);



        //如果后续需要再次使用fw对象,先进行刷新,不进行关闭
        //fw.flush();

        //关闭资源
        fw.close();
    }
}
