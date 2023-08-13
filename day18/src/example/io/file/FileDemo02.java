package example.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName FileDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月18日 14时25分39秒
 * @Version 1.0
 *
 * FileInputStream类(文件字节输入流)
 *      类的特点
 *          针对文件以字节为单位进行读取操作的工具类
 *      类的位置
 *          java.io
 *      类的构造器
 *          public FileInputStream(File file)
 *              通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。
 *          public FileInputStream(String name)
 *              通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。
 *      类的方法
 *          public void close()
 *              关闭此文件输入流并释放与此流有关的所有系统资源。
 *          public int read()
 *              从此输入流中读取一个数据字节。
 *          public int read(byte[] b)
 *              从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。
 */
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        //创建文件字节输入流对象
        FileInputStream fis = new FileInputStream("day18_code\\src\\com\\atguigu\\io\\file\\FileInputStream.txt");

        //以单个字节读取操作
        /*System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());*/

        /* int len;

        while ((len = fis.read()) != -1) {
            System.out.println(len);
        }
        */

        //以字节数组的方式读取操作
        int len;
        byte[] bytes = new byte[2];//在实际开发中,推荐1024的整数倍,往往使用8192(时间成本和空间成本的折中方案)

        while ((len = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }

        // 第一次,将a存储索引0,将b存储索引1,[a,b]
        // 第二次,将c存储索引0,[c,b]

        //关闭资源
        fis.close();
    }
}
