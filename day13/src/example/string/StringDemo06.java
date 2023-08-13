package example.string;

import java.util.Arrays;

/**
 * @ClassName StringDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月11日 11时31分06秒
 * @Version 1.0
 *
 * String类分割功能的方法
 *      public String[] split(String regex)
 *          根据给定"内容"的匹配拆分此字符串。
 *
 * 注意事项:
 *      1."分割规则"在分割后不复存在
 *      2."分割规则"如果在最后,忽略不计
 */
public class StringDemo06 {
    public static void main(String[] args) {
        String str1 = "abc@def@g";
        String[] arr1 = str1.split("@");
        System.out.println(Arrays.toString(arr1));

        String str2 = "abc@@@def@g";
        String[] arr2 = str2.split("@");
        System.out.println(Arrays.toString(arr2));

        String str3 = "@@abc@def@g@@@";
        String[] arr3 = str3.split("@");
        System.out.println(Arrays.toString(arr3));
    }
}
