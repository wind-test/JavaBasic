package example.demo05;

/**
 * @ClassName ThreadDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月20日 09时35分14秒
 * @Version 1.0
 *
 * 线程安全问题:
 *      1.出现了不存在的数据
 *      2.出现了重复数据
 */
public class ThreadDemo05 {
    public static void main(String[] args) {
        //创建卖票的执行动作对象
        Ticket ticket = new Ticket();

        //创建三条线程进行卖票
        Thread t1 = new Thread(ticket,"窗口1");
        Thread t2 = new Thread(ticket,"窗口2");
        Thread t3 = new Thread(ticket,"窗口3");

        //开启线程
        t1.start();
        t2.start();
        t3.start();
    }
}
