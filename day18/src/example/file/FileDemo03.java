package example.file;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName FileDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月18日 10时45分20秒
 * @Version 1.0
 */
public class FileDemo03 {
    public static void main(String[] args) throws IOException {
        //创建File对象
        File f1 = new File("G:\\abc\\a");//真实存在的文件夹
        File f2 = new File("G:\\abc\\a.txt");//真实存在的文件
        File f3 = new File("G:\\abc\\b");//不存在的文件夹
        File f4 = new File("G:\\abc\\b.txt");//不存在的文件
        File f5 = new File("G:\\abc\\a\\b\\c");

        //获取文件或目录的名字
        System.out.println(f1.getName());
        System.out.println(f2.getName());
        System.out.println(f3.getName());
        System.out.println(f4.getName());

        System.out.println("===============================");

        //获取文件的大小
        System.out.println(f1.length());
        System.out.println(f2.length());
        System.out.println(f3.length());
        System.out.println(f4.length());

        System.out.println("===============================");

        //判断文件或目录是否存在
        System.out.println(f1.exists());
        System.out.println(f2.exists());
        System.out.println(f3.exists());
        System.out.println(f4.exists());

        System.out.println("===============================");

        //判断File是否为真实存在的目录
        System.out.println(f1.isDirectory());
        System.out.println(f2.isDirectory());
        System.out.println(f3.isDirectory());
        System.out.println(f4.isDirectory());

        System.out.println("===============================");

        //判断File是否为真实存在的文件
        System.out.println(f1.isFile());
        System.out.println(f2.isFile());
        System.out.println(f3.isFile());
        System.out.println(f4.isFile());

        System.out.println("===============================");

        //将File构造路径中的不是真实存在的文件进行创建
        /*System.out.println(f1.createNewFile());
        System.out.println(f2.createNewFile());
        System.out.println(f3.createNewFile());
        System.out.println(f4.createNewFile());*/

        System.out.println("===============================");

        //将File构造路径中的不是真实存在的单级文件夹进行创建
        /*System.out.println(f1.mkdir());
        System.out.println(f2.mkdir());
        System.out.println(f3.mkdir());
        System.out.println(f4.mkdir());
        System.out.println(f5.mkdir());*/

        System.out.println("===============================");

        //将File构造路径中的不是真实存在的单级或多级文件夹进行创建
        System.out.println(f1.mkdirs());
        System.out.println(f2.mkdirs());
        System.out.println(f3.mkdirs());
        System.out.println(f4.mkdirs());
        System.out.println(f5.mkdirs());
    }
}
