package example.file;

import java.io.File;

/**
 * @ClassName FileDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月18日 10时10分05秒
 * @Version 1.0
 *
 * File类
 *      类的特点
 *          针对文件和目录进行操作的工具类
 *      类的位置
 *          java.io
 *      类的构造器
 *          public File(String pathname)
 *              通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例
 *      类的方法
 *          public String getAbsolutePath()
 *              返回此抽象路径名的绝对路径名字符串。
 *          public String getPath()
 *              将此抽象路径名转换为一个路径名字符串。
 *          public String getName()
 *              返回由此抽象路径名表示的文件或目录的名称
 *          public long length()
 *              返回由此抽象路径名表示的文件的长度。
 *          public boolean exists()
 *              测试此抽象路径名表示的文件或目录是否存在。
 *          public boolean isDirectory()
 *              测试此抽象路径名表示的文件是否是一个目录。
 *          public boolean isFile()
 *              测试此抽象路径名表示的文件是否是一个标准文件。
 *          public boolean createNewFile()
 *              当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
 *          public boolean mkdir()
 *              创建此抽象路径名指定的目录。
 *          public boolean mkdirs()
 *              创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
 *          public File[] listFiles()
 *              返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
 */
public class FileDemo01 {
    public static void main(String[] args) {
        //创建File对象
        File f1 = new File("G:\\abc\\a");
        File f2 = new File("G:\\abc\\a.txt");

        System.out.println(f1);
        System.out.println(f2);
    }
}
