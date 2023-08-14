package example.demo11;

/**
 * @ClassName CEO
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月20日 14时36分09秒
 * @Version 1.0
 */
public class CEO {
    private static CEO ceo;

    private CEO() {
    }

    public static CEO getCEO() {

        if (ceo == null) {
            //线程1 线程2 线程3
            synchronized (CEO.class) {
                if (ceo == null) {
                    ceo = new CEO();
                }
            }
        }

        return ceo;
    }
}
