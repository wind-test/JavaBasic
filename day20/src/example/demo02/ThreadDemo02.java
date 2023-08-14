package example.demo02;

/**
 * @ClassName ThreadDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月20日 08时55分32秒
 * @Version 1.0
 *
 * 线程开启方式1:继承Thread类
 *      1.声明Thread类的子类
 *      2.根据Thread类生成合适的构造器
 *      3.重写Thread类中的run(),run()就是创建线程对象的执行动作
 *      4.需要多条执行线程对象,就在测试类中创建多少个Thread类的子类对象
 *      5.开启线程
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        SubThread sub1 = new SubThread("自定义线程对象1");
        SubThread sub2 = new SubThread("自定义线程对象2");

        //开启线程
        sub1.start();
        sub2.start();
    }
}
