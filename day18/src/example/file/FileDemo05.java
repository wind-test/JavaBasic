package example.file;

import java.io.File;

/**
 * @ClassName FileDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月18日 11时39分33秒
 * @Version 1.0
 *
 * 遍历多级文件夹
 */
public class FileDemo05 {
    public static void main(String[] args) {
        File file = new File("D:\\develop\\Java\\jdk1.8.0_202");

        printPath(file);
    }

    /*
        声明遍历单级文件夹的方法
    */
    public static void printPath (File path) {
        //针对path进行非空判断
        if (path == null) {
            return;
        }

        //获取path路径下单级所有的文件及文件夹
        File[] files = path.listFiles();

        //遍历files数组
        for (int i = 0; i < files.length; i++) {
            //获取当前正在遍历操作的File对象
            File file = files[i];

            //针对file对象进行判断
            if (file.isFile()) {
                System.out.println("文件:" + file);
            } else {
                System.out.println("目录:" + file);
                printPath(file);
            }
        }
    }
}
