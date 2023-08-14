package example.demo10;

/**
 * @ClassName SubClass
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月20日 14时37分19秒
 * @Version 1.0
 */
public class SubRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(CEO.getCEO());
    }
}
