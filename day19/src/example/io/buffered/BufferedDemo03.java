package example.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName BufferedDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月19日 09时43分34秒
 * @Version 1.0
 *
 * BufferedWriter类(缓冲字符输出流)
 *      类的特点
 *          针对另外字符输出流对象添加缓冲功能,从而使其可以达到高效写入操作的工具类
 *      类的位置
 *          java.io
 *      类的构造器
 *          public BufferedWriter(Writer out)
 *              创建一个使用默认大小输出缓冲区的缓冲字符输出流。
 *      类的方法
 *          public void newLine()
 *              写入一个行分隔符。
 *
 */
public class BufferedDemo03 {
    public static void main(String[] args) throws IOException {
        //创建缓冲字符输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("day19_code\\src\\com\\example\\io\\buffered\\BufferedWriter.txt"));

        bw.write("尚");
        bw.newLine();
        bw.write("硅");
        bw.newLine();
        bw.write("谷");


        //关闭资源
        bw.close();
    }
}
