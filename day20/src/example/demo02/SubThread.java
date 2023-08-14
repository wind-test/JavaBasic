package example.demo02;

/**
 * @ClassName SubThread
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月20日 08时56分14秒
 * @Version 1.0
 */
public class SubThread extends Thread {
    public SubThread() {
    }

    public SubThread(String name) {
        super(name);
    }

    @Override
    public void run () {
        //获取当前线程对象的名字
        String name  = getName();

        for (int i = 1; i <= 30; i++) {
            System.out.println(name + ":" + i);
        }
    }
}
