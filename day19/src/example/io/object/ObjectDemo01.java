package example.io.object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @ClassName ObjectDemo01
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月19日 11时08分11秒
 * @Version 1.0
 *
 * 序列化和反序列化
 *      序列化:ObjectOutputStream类
 *      反序列化:ObjectInputStream类
 *
 * ObjectOutputStream类
 *      类的特点
 *          针对对象实现序列化操作的工具类
 *      类的位置
 *          java.io
 *      类的构造器
 *          public ObjectOutputStream(OutputStream out)
 *              创建写入指定 OutputStream 的 ObjectOutputStream。
 *      类的方法
 *          public final void writeObject(Object obj)
 *              将指定的对象写入 ObjectOutputStream。
 *
 *
 * Serializable接口
 *      接口的特点
 *          类通过实现 java.io.Serializable 接口以启用其序列化功能
 *      接口的位置
 *          java.io
 *      接口的方法
 */
public class ObjectDemo01 {
    public static void main(String[] args) throws IOException {
        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/winddancer/Documents/MyCodes/JavaBasic/day19/src/example/io/object/student.txt"));

        //创建学生对象
        Student s = new Student("张三", 18);

        //往序列化文件中
        oos.writeObject(s);

        //关闭资源
        oos.close();
    }
}
