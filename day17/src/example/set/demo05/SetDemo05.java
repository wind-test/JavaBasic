package example.set.demo05;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @ClassName SetDemo05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月16日 10时18分39秒
 * @Version 1.0
 *
 * 指定顺序比较器:
 *      1.创建TreeSet集合对象时给其指定顺序比较器Comparator<T>接口的实现类对象
 *      2.在实现类中重写compare(T o1,T o2)
 */
public class SetDemo05 {
    public static void main(String[] args) {


         //创建4个学生对象
        Student s1 = new Student(220716003, "城小将", 18);
        Student s2 = new Student(220716001, "唐小妃", 18);
        Student s3 = new Student(220716002, "李小白", 18);
        Student s4 = new Student(220716004, "波斯客", 18);

        //创建集合
        TreeSet<Student> set = new TreeSet<>(new Comparator<Student>(){
            @Override
            public int compare (Student stu1,Student stu2) {
                return stu1.getId() - stu2.getId();
            }
        });

        //添加元素
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        //遍历集合
        for (Student s : set) {
            System.out.println(s);
        }



    }
}
