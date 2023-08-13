package example.exception.demo11;

/**
 * @ClassName ExceptionDemo11
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 11时31分01秒
 * @Version 1.0
 *
 * finally关键字的注意事项:
 *      在try,catch,finally避免使用return
 */
public class ExceptionDemo11 {
    public static void main(String[] args) {
        int result = method05();
        System.out.println("result = " + result);
    }

    private static int method05() {
        int a = 10;
        int b = 20;

        try {
            System.out.println("try");
            return a;
        } catch (Exception e) {
            System.out.println("catch");
            return b;
        } finally {
            System.out.println("finally");
            a = a + b; //a += b;
        }
    }

    private static int method04() {
        int a = 10;
        int b = 20;

        try {
            System.out.println("try");
            return a;
        } catch (Exception e) {
            System.out.println("catch");
            return b;
        } finally {
            System.out.println("finally");
        }
    }

    private static int method03() {
        int a = 10;
        int b = 20;

        try {
            System.out.println("try");
            return a;
        } catch (Exception e) {
            System.out.println("catch");
            return b;
        } finally {
            System.out.println("finally");
            return a + b;
        }
    }

    private static int method02() {
        try {
            System.out.println("try");
            return 10;//执行return 10,finally预警,将10存储到栈内存中返回区,等待finally执行完毕
        } catch (Exception e) {
            System.out.println("catch");
            return 20;
        } finally {
            System.out.println("finally");
            return 30;
        }
    }

    private static int method01() {
        try {
            System.out.println("try");
            return 10;
        } catch (Exception e) {
            System.out.println("catch");
            return 20;
        }
    }
}
