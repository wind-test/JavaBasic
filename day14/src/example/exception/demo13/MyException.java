package example.exception.demo13;

/**
 * @ClassName MyException
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 14时05分47秒
 * @Version 1.0
 */
public class MyException extends Exception{
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
