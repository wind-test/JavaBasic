package example.io.shift;

import java.io.*;

/**
 * @ClassName ShiftDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月19日 10时25分58秒
 * @Version 1.0
 *
 * InputStreamReader类(转换输入流)
 *      类的特点
 *          InputStreamReader是字节流通向字符流的桥梁：它使用指定的"字符编码"读取字节并将其解码为字符。
 *      类的位置
 *          java.io
 *      类的构造器
 *          public InputStreamReader(InputStream in)
 *              创建一个使用默认字符集的 InputStreamReader。
 *          public InputStreamReader(InputStream in,String charsetName)
 *              创建使用指定字符集的 InputStreamReader。
 *      类的方法
 *
 * OutputStreamWriter类(转换输出流)
 *      类的特点
 *          OutputStreamWriter 是字符流通向字节流的桥梁：可使用指定的"字符编码"将要写入流中的字符编码成字节
 *      类的位置
 *          java.io
 *      类的构造器
 *          public OutputStreamWriter(OutputStream out)
 *              创建使用默认字符编码的 OutputStreamWriter。
 *          public OutputStreamWriter(OutputStream out,String charsetName)
 *              创建使用指定字符集的 OutputStreamWriter。
 *      类的方法
 *
 * 需求:
 *      读取本地磁盘中utf8编码的文本文件,并以utf8编码进行文本文件复制,过程中需要保证文本文件中的内容"尚硅谷"不能出现乱码
 *      读取本地磁盘中utf8编码的文本文件,并以gbk编码进行文本文件复制,过程中需要保证文本文件中的内容"尚硅谷"不能出现乱码
 *      读取本地磁盘中gbk编码的文本文件,并以utf8编码进行文本文件复制,过程中需要保证文本文件中的内容"尚硅谷"不能出现乱码
 *      读取本地磁盘中gbk编码的文本文件,并以gbk编码进行文本文件复制,过程中需要保证文本文件中的内容"尚硅谷"不能出现乱码
 *
 */
public class ShiftDemo02 {
    public static void main(String[] args) throws IOException {
        //读取本地磁盘中utf8编码的文本文件,并以utf8编码进行文本文件复制,过程中需要保证文本文件中的内容"尚硅谷"不能出现乱码
        //method01();
        //读取本地磁盘中utf8编码的文本文件,并以gbk编码进行文本文件复制,过程中需要保证文本文件中的内容"尚硅谷"不能出现乱码
        //method02();
        //读取本地磁盘中gbk编码的文本文件,并以utf8编码进行文本文件复制,过程中需要保证文本文件中的内容"尚硅谷"不能出现乱码
        //method03();
        //读取本地磁盘中gbk编码的文本文件,并以gbk编码进行文本文件复制,过程中需要保证文本文件中的内容"尚硅谷"不能出现乱码
        method04();
    }

    private static void method04() throws IOException {
        //文本编码(gbk)==>读取解码(gbk)==>写入编码(gbk)==>文本解码(gbk)
        //创建转换输入输出流对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("G:\\20220623\\day19\\resources\\gbk.txt"),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("G:\\20220623\\day19\\resources\\gbk_gbk.txt"),"gbk");

        //进行读写操作
        int len;
        char[] chars = new char[8192];
        while ((len = isr.read(chars)) != -1) {
            osw.write(chars,0,len);
        }

        //关闭资源
        osw.close();
        isr.close();
    }

    private static void method03() throws IOException {
        //文本编码(gbk)==>读取解码(gbk)==>写入编码(utf8)==>文本解码(utf8)
        //创建转换输入输出流对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("G:\\20220623\\day19\\resources\\gbk.txt"),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("G:\\20220623\\day19\\resources\\gbk_utf8.txt"));

        //进行读写操作
        int len;
        char[] chars = new char[8192];
        while ((len = isr.read(chars)) != -1) {
            osw.write(chars,0,len);
        }

        //关闭资源
        osw.close();
        isr.close();
    }

    private static void method02() throws IOException {
        //文本编码(utf8)==>读取解码(utf8)==>写入编码(gbk)==>文本解码(gbk)
        //创建转换输入输出流对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("G:\\20220623\\day19\\resources\\utf8.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("G:\\20220623\\day19\\resources\\utf8_gbk.txt"),"gbk");

        //进行读写操作
        int len;
        char[] chars = new char[8192];
        while ((len = isr.read(chars)) != -1) {
            osw.write(chars,0,len);
        }

        //关闭资源
        osw.close();
        isr.close();
    }

    private static void method01() throws IOException {
        //文本编码(utf8)==>读取解码(utf8)==>写入编码(utf8)==>文本解码(utf8)
        //创建转换输入输出流对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("G:\\20220623\\day19\\resources\\utf8.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("G:\\20220623\\day19\\resources\\utf8_utf8.txt"));

        //进行读写操作
        int len;
        char[] chars = new char[8192];
        while ((len = isr.read(chars)) != -1) {
            osw.write(chars,0,len);
        }

        //关闭资源
        osw.close();
        isr.close();
    }
}
