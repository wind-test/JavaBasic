package example.exception.demo13;

/**
 * @ClassName MyRuntimeException
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 14时07分27秒
 * @Version 1.0
 */
public class MyRuntimeException extends RuntimeException {
    public MyRuntimeException() {
    }

    public MyRuntimeException(String message) {
        super(message);
    }
}
