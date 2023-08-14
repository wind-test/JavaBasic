package example.demo06;

/**
 * @ClassName ThreadDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月20日 10时19分20秒
 * @Version 1.0
 *
 * 线程安全问题处理:
 *      1.同步
 *      2.Lock锁(暂不涉及)
 *
 * synchronized关键字
 *      含义:
 *          同步
 *      特点:
 *          被同步修饰的内容只能被多线程中的一条线程进行访问,其它线程在同步修饰内容的外面进行阻塞,等待访问同步内容的线程对象
 *          执行完毕后再进行抢夺资源
 *      修饰:
 *          同步代码块(重点),同步方法
 *
 * 同步代码块
 *      含义:
 *          被synchronized关键字修饰的代码块
 *      格式:
 *          synchronized (同步对象) {
 *              可能存在线程安全的代码
 *          }
 *      特点:
 *          多条线程执行程序,遇到同步代码块进行同步对象(必须唯一)的抢夺,其它没有抢夺到同步对象资源的线程在同步代码块外进行
 *          阻塞,等待同步对象资源使用完毕
 *      注意:
 *          1.多条线程执行同步代码块,抢夺的同步对象资源必须相同,也就是同一个同步对象
 *          2.当多条线程处理同一资源数据时,且多条线程执行线程动作相同,同步对象就是执行动作对象(run()中的this)
 *            当多条线程处理同一资源对象时,且多条线程执行线程动作不同,同步对象就是同一资源对象
 *            当多条线程处理同一字节码时,同步对象就是该字节码文件的对象(Class类型)
 *
 */
public class ThreadDemo06 {
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
