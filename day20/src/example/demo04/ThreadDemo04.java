package example.demo04;

/**
 * @ClassName ThreadDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月20日 09时30分20秒
 * @Version 1.0
 *
 * 使用匿名内部类简化线程开启方式2
 */
public class ThreadDemo04 {
    public static void main(String[] args) {
        //使用匿名内部类的方式创建Runable接口的实现类对象,并重写方法
        Runnable run = new Runnable() {
            @Override
            public void run() {
                //获取当前执行线程的名字
                String name = Thread.currentThread().getName();

                for (int i = 1; i <= 30; i++) {
                    System.out.println(name + ":" + i);
                }
            }
        };

        //创建线程对象
        Thread t1 = new Thread(run, "自定义线程对象1");
        Thread t2 = new Thread(run, "自定义线程对象2");

        //开启线程
        t1.start();
        t2.start();
    }
}
