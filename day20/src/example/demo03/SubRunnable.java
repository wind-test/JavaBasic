package example.demo03;

/**
 * @ClassName SubRunnable
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月20日 09时08分36秒
 * @Version 1.0
 */
public class SubRunnable implements Runnable {
    @Override
    public void run() {
        //获取当前线程对象的名字
        String name  = Thread.currentThread().getName();

        for (int i = 1; i <= 30; i++) {
            System.out.println(name + ":" + i);
        }
    }
}
