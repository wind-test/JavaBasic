package example.demo08;

/**
 * @ClassName ThreadDemo08
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月20日 11时31分14秒
 * @Version 1.0
 *
 * 线程间通信(等待唤醒机制):
 *      含义:
 *          线程间进行内在联系,可以进行有规则的执行
 *      分类:
 *          生产者线程
 *              负责生产同一资源对象的线程
 *          消费者线程
 *              负责消费同一资源对象的线程
 *      依赖:
 *          public final void notify()
 *              唤醒在此对象监视器上等待的单个线程。
 *          public final void notifyAll()
 *              唤醒在此对象监视器上等待的所有线程
 *          public final void wait()
 *              在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。
 */
public class ThreadDemo08 {
    public static void main(String[] args) {
        //创建包子资源对象
        BaoZi bz = new BaoZi();

        //创建包子铺和学生的线程对象
        Thread bzp = new Thread(new BaoZiPu(bz), "包子铺");
        Thread stu = new Thread(new Student(bz), "学生");

        //开启线程
        bzp.start();
        stu.start();
    }
}
