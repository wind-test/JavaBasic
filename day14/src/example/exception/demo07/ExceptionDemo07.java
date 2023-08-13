package example.exception.demo07;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName ExceptionDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 10时00分01秒
 * @Version 1.0
 *
 * 异常声明处理的注意事项:继承
 *      声明的异常类存在子父类继承关系
 *          1.进行异常声明处理时,存在子父类继承关系的异常类没有声明先后顺序之分
 *          2.进行含有子父类继承关系的异常类声明时,直接声明异常父类即可
 *      异常所在的类存在子父类继承关系
 *          1.异常在父类被重写的方法中
 *              子类重写父类含有异常的方法时,无需处理该异常信息
 *          2.异常在子类重写后的方法中
 *              处理异常的方案只有唯一的一种:异常捕获处理
 *
 */
public class ExceptionDemo07 {
    public static void main(String[] args) {

    }

    private static void method(int a, int b) throws IOException{
        if (a == 1) {
            throw new FileNotFoundException("自定义文件没有找到异常对象");
        }

        if (b == 1) {
            throw new IOException("自定义IO异常对象");
        }
    }
}
