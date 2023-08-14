package example.io.system;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @ClassName SystemDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月19日 14时13分23秒
 * @Version 1.0
 *
 * 标准输出流
 *
 * PrintStream类
 *      类的特点
 *          针对数据进行快速打印的工具类
 *      类的位置
 *          java.io
 *      类的构造器
 *          public PrintStream(String fileName)
 *              创建具有指定文件名称且不带自动行刷新的新打印流。
 *          public PrintStream(OutputStream out)
 *              创建新的打印流。此流将不会自动刷新。
 *      类的方法
 */
public class SystemDemo02 {
    public static void main(String[] args) throws FileNotFoundException {
        //System.out.println(System.out);

        System.out.println("Hello");

        PrintStream ps = new PrintStream("/Users/winddancer/Documents/MyCodes/JavaBasic/day19/src/example/io/shift/PrintStream.txt");

        ps.println("好好学习,天天向上");

        //重置System类中的输出流
        System.setOut(ps);

        System.out.println("World");

        //关闭资源
        ps.close();
    }
}
