package example.demo08;

/**
 * @ClassName BaoZiPu
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月20日 11时43分50秒
 * @Version 1.0
 */
public class BaoZiPu implements Runnable {
    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                //针对包子资源的状态进行判断
                if (bz.getFlag()) {
                    //代码执行到这一行,说明有包子资源,包子铺可以休息一会
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    //代码执行到这一行,说明没有包子资源,包子开始做包子
                    //获取线程的名字
                    String name = Thread.currentThread().getName();

                    System.out.println(name + ":开始做包子,包子做好了,开始吆喝卖包子啦......");

                    //模拟做包子所花费的时间
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //修改包子资源的状态
                    bz.setFlag(true);

                    //开始吆喝卖包子啦
                    bz.notify();
                }
            }
        }
    }
}
