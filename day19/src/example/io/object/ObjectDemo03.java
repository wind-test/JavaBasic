package example.io.object;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName ObjectDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月19日 11时39分53秒
 * @Version 1.0
 *
 * 对象流的注意事项:
 *      1.实现序列化和反序列化操作过程中,对象的类型必须是Serializable接口实现类
 *      2.实现序列化和反序列化操作过程中,处理的对象建议只处理唯一的对象,如果有多个对象,可以将其存储到集合对象中,再针对集合对象
 *      进行序列化和反序列化的操作
 *      3.实现序列化和反序列化操作过程中,针对序列化操作的JavaBean不能进行任何修改
 *      4.实现序列化和反序列化操作过程中,针对序列化文件不能进行任何修改
 *      5.实现序列化和反序列化操作过程中,针对序列化对象的某些属性不想被序列化操作时,将其"瞬态化"(被transient关键字进行修饰)
 *          transient关键字:
 *              含义:
 *                  瞬态的
 *              特点:
 *                  被transient关键字修饰的属性不可以被序列化操作
 *              格式:
 *                  修饰符 transient 数据类型 变量名;
 */
public class ObjectDemo03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writer();
        read();
    }

    private static void read() throws IOException, ClassNotFoundException {
        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/winddancer/Documents/MyCodes/JavaBasic/day19/src/example/io/object/student.txt"));

        //读取对象
        Object o = ois.readObject();

        //针对序列化对象进行向下转型
        if (o instanceof ArrayList<?>) {
            ArrayList<Student> list = (ArrayList<Student>)o;

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }

    private static void writer() throws IOException {
        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/winddancer/Documents/MyCodes/JavaBasic/day19/src/example/io/object/student.txt"));

        //创建学生对象
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 18);
        Student s3 = new Student("王五", 18);

        //将学生对象存储到集合中
        ArrayList<Student> list = new ArrayList<>();

        Collections.addAll(list,s1,s2,s3);

        //往序列化文件中写入对象
        oos.writeObject(list);

        //关闭资源
        oos.close();
    }
}
