package example.demo08;

/**
 * @ClassName Student
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月20日 11时52分37秒
 * @Version 1.0
 */
public class Student implements Runnable {
    private BaoZi bz;

    public Student(BaoZi bz) {
        this.bz = bz;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                //判断包子资源的状态
                if (bz.getFlag()) {
                    //代码执行到这一行,说明有包子资源,学生开始购买和吃包子
                    //获取当前执行线程的名字
                    String name = Thread.currentThread().getName();

                    System.out.println(name + ":开始吃包子了,包子真好吃,再来一个给苗苗老师带回去");

                    //模拟学生吃包子所花费的时间
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //修改包子的状态
                    bz.setFlag(false);

                    //唤醒包子铺线程对象
                    bz.notify();
                } else {
                    //代码执行到这一行,说明没有包子资源,学生开始等待购买包子
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
