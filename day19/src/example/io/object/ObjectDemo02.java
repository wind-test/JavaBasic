package example.io.object;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @ClassName ObjectDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月19日 11时22分39秒
 * @Version 1.0
 *
 * ObjectInputStream类
 *      类的特点
 *          针对对象实现反序列化操作的工具类
 *      类的位置
 *          java.io
 *      类的构造器
 *          public ObjectInputStream(InputStream in)
 *              创建从指定 InputStream 读取的 ObjectInputStream。从流读取序列化头部并予以验证
 *      类的方法
 *          public final Object readObject()
 *              从 ObjectInputStream 读取对象。
 */
public class ObjectDemo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/winddancer/Documents/MyCodes/JavaBasic/day19/src/example/io/object/student.txt"));

        //读取对象
        Object o = ois.readObject();

        //打印对象
        System.out.println(o);
    }
}
