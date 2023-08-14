package example.thread;

/**
 * @ClassName ThreadDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月19日 16时28分31秒
 * @Version 1.0
 *
 * Thread类
 *      类的特点
 *          程序中的执行线程
 *      类的位置
 *          java.lang
 *      类的构造器
 *          public Thread()
 *              分配新的 Thread 对象。
 *          public Thread(String name)
 *              分配新的 Thread 对象。
 *          public Thread(Runnable target)
 *              分配新的 Thread 对象。
 *          public Thread(Runnable target,String name)
 *              分配新的 Thread 对象。
 *      类的方法
 *          public static Thread currentThread()
 *              返回对当前正在执行的线程对象的引用。
 *          public final String getName()
 *              返回该线程的名称。
 *          public static void sleep(long millis)
 *              在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作受到系统计时器和调度程序精度和准确性的影响。
 *          public void start()
 *              使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
 *          public void run()
 *              如果该线程是使用独立的 Runnable 运行对象构造的，则调用该 Runnable 对象的 run 方法；否则，该方法不执行任何操作并返回。
 *              Thread 的子类应该重写该方法。
 */
public class ThreadDemo02 {
    public static void main(String[] args) throws InterruptedException {
        //获取当前正在执行的线程对象
        Thread t = Thread.currentThread();

        //获取线程的名字
        System.out.println(t.getName());

        System.out.println("开始签到啦");

        for (int i = 15; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("签到结束!!!");
    }
}
