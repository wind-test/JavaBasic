package example.exception.demo09;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName ExceptionDemo09
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 10时57分46秒
 * @Version 1.0
 *
 * 异常捕获处理的注意事项:继承
 *      抛出的异常类存在子父类继承关系
 *          分别捕获,分别处理
 *              场景:每个异常信息都是独立解决,互不影响
 *          一起捕获,分别处理
 *              场景:每个异常信息都是独立解决,互有影响
 *              注意:处理异常时,先处理异常子类,再处理异常父类
 *          一起捕获,一起处理
 *              场景:每个异常信息处理方法相同
 *      异常所在的类存在子父类继承关系
 *          1.异常在父类被重写的方法中
 *              子类重写父类含有异常的方法时,无需处理该异常信息
 *          2.异常在子类重写后的方法中
 *              处理异常的方案只有唯一的一种:异常捕获处理
 */
public class ExceptionDemo09 {
    public static void main(String[] args) {

    }

    public static void method03 (int a , int b) {
        try {
            if (a == 1) {
                throw new FileNotFoundException("自定义文件找不到异常对象");
            }

            if (b == 1) {
                throw new IOException("自定义IO异常对象");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method02 (int a , int b) {
        try {
            if (a == 1) {
                throw new FileNotFoundException("自定义文件找不到异常对象");
            }

            if (b == 1) {
                throw new IOException("自定义IO异常对象");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method01 (int a , int b) {
        if (a == 1) {
            try {
                throw new FileNotFoundException("自定义文件找不到异常对象");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        if (b == 1) {
            try {
                throw new IOException("自定义IO异常对象");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*public static void method (int a , int b) {
        if (a == 1) {
            throw new FileNotFoundException("自定义文件找不到异常对象");
        }

        if (b == 1) {
            throw new IOException("自定义IO异常对象");
        }
    }*/
}
