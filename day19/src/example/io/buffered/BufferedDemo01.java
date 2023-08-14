package example.io.buffered;

import java.io.*;

/**
 * @ClassName BufferedDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月19日 08时57分21秒
 * @Version 1.0
 *
 * BufferedInputStream类(缓冲字节输入流)
 *      类的特点
 *          针对另外字节输入流对象添加缓冲功能,从而使其可以达到高效读取操作的工具类
 *      类的位置
 *          java.io
 *      类的构造器
 *          public BufferedInputStream(InputStream in)
 *              创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
 *      类的方法
 *          详见InputStream常用方法
 *
 * BufferedOutputStream类(缓冲字节输出流)
 *      类的特点
 *          针对另外字节输出流对象添加缓冲功能,从而使其可以达到高效写入操作的工具类
 *      类的位置
 *          java.io
 *      类的构造器
 *          public BufferedOutputStream(OutputStream out)
 *              创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
 *      类的方法
 *          详见OutputStream常用方法
 *
 * 缓冲字节流的注意事项:
 *      1.缓冲流之所以高效因为底层封装了一个长度为8192的字节数组
 *      2.针对文件复制操作的实际开发中不推荐使用缓冲字节流,更推荐使用文件字节流以长度为8192的字节数组方式
 */
public class BufferedDemo01 {
    public static void main(String[] args) throws IOException {
        //获取此时的纳秒时间
        long start = System.nanoTime();

        //使用文件字节流以单个字节为单位进行文件复制
        //method01();//约为16.5分钟
        //使用缓冲字节流以单个字节为单位进行文件复制
        //method02();//约为1.89秒

        //使用文件字节流以长度1024字节数组为单位进行文件复制
        //method03();//约为1.29秒
        //使用缓冲字节流以长度1024字节数组为单位进行文件复制
        //method04();//约为0.31秒

        //使用文件字节流以长度8192字节数组为单位进行文件复制
        //method05();//约为0.29秒
        //使用缓冲字节流以长度8192字节数组为单位进行文件复制
        //method06();//约为0.29秒

        //使用文件字节流以长度1024*1024字节数组为单位进行文件复制
        //method07();//约为0.19秒
        //使用缓冲字节流以长度1024*1024字节数组为单位进行文件复制
        //method08();//约为0.19秒

        //获取此时的纳秒时间
        long end = System.nanoTime();

        //获取程序执行的时间
        System.out.println(end - start);
    }

    private static void method08() throws IOException {
        //创建文件字节输入和输出流对象
        FileInputStream fis = new FileInputStream("G:\\jdk-8u202-windows-x64.exe");
        FileOutputStream fos = new FileOutputStream("G:\\jdk.exe");
        //创建缓冲字节输入和输出流对象
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //进行文件的读写操作
        int len;
        byte[] bytes = new byte[1024*1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }

        //关闭资源
        bos.close();
        bis.close();
        fos.close();
        fis.close();
    }

    private static void method07() throws IOException {
        //创建文件字节输入和输出流对象
        FileInputStream fis = new FileInputStream("G:\\jdk-8u202-windows-x64.exe");
        FileOutputStream fos = new FileOutputStream("G:\\jdk.exe");

        //进行文件的读写操作
        int len;
        byte[] bytes = new byte[1024*1024];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }

        //关闭资源
        fos.close();
        fis.close();
    }

    private static void method06() throws IOException {
        //创建文件字节输入和输出流对象
        FileInputStream fis = new FileInputStream("G:\\jdk-8u202-windows-x64.exe");
        FileOutputStream fos = new FileOutputStream("G:\\jdk.exe");
        //创建缓冲字节输入和输出流对象
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //进行文件的读写操作
        int len;
        byte[] bytes = new byte[8192];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }

        //关闭资源
        bos.close();
        bis.close();
        fos.close();
        fis.close();
    }

    private static void method05() throws IOException {
        //创建文件字节输入和输出流对象
        FileInputStream fis = new FileInputStream("G:\\jdk-8u202-windows-x64.exe");
        FileOutputStream fos = new FileOutputStream("G:\\jdk.exe");

        //进行文件的读写操作
        int len;
        byte[] bytes = new byte[8192];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }

        //关闭资源
        fos.close();
        fis.close();
    }

    private static void method04() throws IOException {
        //创建文件字节输入和输出流对象
        FileInputStream fis = new FileInputStream("G:\\jdk-8u202-windows-x64.exe");
        FileOutputStream fos = new FileOutputStream("G:\\jdk.exe");
        //创建缓冲字节输入和输出流对象
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //进行文件的读写操作
        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }

        //关闭资源
        bos.close();
        bis.close();
        fos.close();
        fis.close();
    }

    private static void method03() throws IOException {
        //创建文件字节输入和输出流对象
        FileInputStream fis = new FileInputStream("G:\\jdk-8u202-windows-x64.exe");
        FileOutputStream fos = new FileOutputStream("G:\\jdk.exe");

        //进行文件的读写操作
        int len;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }

        //关闭资源
        fos.close();
        fis.close();
    }

    private static void method02() throws IOException {
        //创建文件字节输入和输出流对象
        FileInputStream fis = new FileInputStream("G:\\jdk-8u202-windows-x64.exe");
        FileOutputStream fos = new FileOutputStream("G:\\jdk.exe");
        //创建缓冲字节输入和输出流对象
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //进行文件的读写操作
        int len;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }

        //关闭资源
        bos.close();
        bis.close();
        fos.close();
        fis.close();
    }

    private static void method01() throws IOException {
        //创建文件字节输入和输出流对象
        FileInputStream fis = new FileInputStream("G:\\jdk-8u202-windows-x64.exe");
        FileOutputStream fos = new FileOutputStream("G:\\jdk.exe");

        //进行文件的读写操作
        int len;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }

        //关闭资源
        fos.close();
        fis.close();
    }
}
