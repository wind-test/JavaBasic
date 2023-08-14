package example.demo11;

/**
 * @ClassName ThreadDemo11
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月20日 15时00分39秒
 * @Version 1.0
 *
 * 使用同步代码块解决单例设计模式线程安全问题
 */
public class ThreadDemo11 {
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
