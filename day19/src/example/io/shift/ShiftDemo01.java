package example.io.shift;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName ShiftDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月19日 10时13分37秒
 * @Version 1.0
 *
 * 乱码出现的原因:
 *      编码方式和解码方式不一致时
 *
 * 学习转换流的目的
 *      在一定程序上解决文本中中文乱码情况
 *
 */
public class ShiftDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/winddancer/Documents/MyCodes/JavaBasic/day19/src/example/io/shift/test.txt");
        //文本编码(gbk)==>读取解码(utf8)==>写入编码(utf8)==>文本解码(utf8)
        int len;
        byte[] bytes = new byte[8192];
        while ((len = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }

        fis.close();

        System.out.println("=============================");

        FileReader fr = new FileReader("/Users/winddancer/Documents/MyCodes/JavaBasic/day19/src/example/io/shift/test.txt");
        //文本编码(gbk)==>读取解码(utf8)==>写入编码(utf8)==>文本解码(utf8)
        int length;
        char[] chars = new char[8192];
        while ((length = fr.read(chars)) != -1) {
            System.out.println(new String(chars,0,length));
        }

        fr.close();
    }
}
