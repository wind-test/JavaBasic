package example.exception.demo01;

/**
 * @ClassName ExceptionDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 08时34分47秒
 * @Version 1.0
 *
 * 异常和异常处理
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        System.out.println("开始");

        try {
            System.out.println(1/0);
        } catch (Exception e) {
            System.out.println("出现该异常的解决方案");
        }

        System.out.println("结束");
    }
}
