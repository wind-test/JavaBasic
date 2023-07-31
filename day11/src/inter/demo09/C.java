package inter.demo09;

/**
 * @ClassName SuperInterface
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 11时11分49秒
 * @Version 1.0
 */
public interface C {
    default void method() {
        System.out.println("接口C的默认方法");
    }
}
