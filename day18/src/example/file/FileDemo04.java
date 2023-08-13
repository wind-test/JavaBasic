package example.file;

import java.io.File;

/**
 * @ClassName FileDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月18日 11时22分42秒
 * @Version 1.0
 *
 * 遍历单级文件夹
 */
public class FileDemo04 {
    public static void main(String[] args) {
        File file = new File("D:\\develop\\Java\\jdk1.8.0_202");

        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++) {
            //获取当前正在遍历的File对象路径
            File path = files[i];

            //针对path进行判断
            if (path.isFile()) {
                System.out.println("文件:" + path);
            } else {
                System.out.println("目录:" + path);
            }
        }
    }
}
