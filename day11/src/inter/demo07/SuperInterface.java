package inter.demo07;

/**
 * @ClassName SuperInterface
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 10时31分33秒
 * @Version 1.0
 */
public interface SuperInterface {
    public default void method () {
        System.out.println("多个子类含有的共同方法,且不需要重写");
    }
}
