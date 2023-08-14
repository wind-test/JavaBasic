package example.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName BufferedDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月19日 09时31分51秒
 * @Version 1.0
 *
 * BufferedReader类(缓冲字符输入流)
 *      类的特点
 *          针对另外字符输入流对象添加缓冲功能,从而使其可以达到高效读取操作的工具类
 *      类的位置
 *          java.io
 *      类的构造器
 *          public BufferedReader(Reader in)
 *              创建一个使用默认大小输入缓冲区的缓冲字符输入流。
 *      类的方法
 *          public String readLine()
 *              读取一个文本行。
 */
public class BufferedDemo02 {
    public static void main(String[] args) throws IOException {
        //创建缓冲字符输入流对象
        BufferedReader fr = new BufferedReader(new FileReader("day19_code\\src\\com\\example\\io\\buffered\\BufferedReader.txt"));

        //读取操作
        String len;
        while ((len = fr.readLine()) != null) {
            System.out.println(len);
        }

        //关闭资源
        fr.close();
    }
}
