package example.file;

import java.io.File;

/**
 * @ClassName FileDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月18日 10时23分23秒
 * @Version 1.0
 *
 * 绝对路径,相对路径,构造路径
 *      构造路径:
 *          调用构造器时实参的路径,该路径可能是"绝对路径"或"相对路径"
 *      绝对路径:
 *          从盘符开始的路径,是完整的路径
 *      相对路径:
 *          路径不是从盘符开始,是不完整的,相对于项目的路径
 */
public class FileDemo02 {
    public static void main(String[] args) {
        //创建File对象
        File f1 = new File("G:\\abc");
        File f2 = new File("abc");

        //获取构造路径
        System.out.println(f1.getPath());
        System.out.println(f2.getPath());

        System.out.println("=======================");

        //获取绝对路径
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());
    }
}
