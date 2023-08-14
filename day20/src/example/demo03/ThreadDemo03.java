package example.demo03;

/**
 * @ClassName ThreadDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月20日 09时07分54秒
 * @Version 1.0
 *
 * 线程开启方式2:实现Runnable接口
 *      1.声明Runnable接口的实现类
 *      2.重写Runnable接口中的run(),run()就是创建线程对象的执行动作
 *      3.创建Runnable接口的实现类对象
 *      4.需要多条执行线程对象,就在测试类中使用Runnable实现类对象作为实参创建多少个Thread对象
 *      5.开启线程
 */
public class ThreadDemo03 {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        SubRunnable sub = new SubRunnable();

        //创建Thread线程对象
        Thread t1 = new Thread(sub,"自定义线程对象1");
        Thread t2 = new Thread(sub,"自定义线程对象2");

        //开启线程
        t1.start();
        t2.start();
    }
}
