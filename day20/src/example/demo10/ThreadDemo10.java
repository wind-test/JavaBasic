package example.demo10;

/**
 * @ClassName ThreadDemo10
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月20日 14时35分58秒
 * @Version 1.0
 */
public class ThreadDemo10 {
    public static void main(String[] args) {
        //创建线程执行动作对象
        SubRunnable sr = new SubRunnable();

        //创建3条线程对象
        Thread t1 = new Thread(sr);
        Thread t2 = new Thread(sr);
        Thread t3 = new Thread(sr);

        t1.start();
        t2.start();
        t3.start();
    }
}
