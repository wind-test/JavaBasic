package example.io.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName SystemDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月19日 14时03分49秒
 * @Version 1.0
 *
 * 标准输入流:
 *      System.in
 * 标准输出流:
 *      System.out
 */
public class SystemDemo01 {
    public static void main(String[] args) throws IOException {
        //键盘录入字符串

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入字符串:");
        String str = br.readLine();

        System.out.println(str);
    }
}
