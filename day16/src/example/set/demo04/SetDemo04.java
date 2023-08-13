package example.set.demo04;

import java.util.HashSet;

/**
 * @ClassName SetDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月15日 16时47分07秒
 * @Version 1.0
 *
 * 使用HashSet集合存储自定义对象
 */
public class SetDemo04 {
    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student(220715001,"去病",18);
        Student s2 = new Student(220715002,"卫小青",18);
        Student s3 = new Student(220715003,"张小骞",18);
        Student s4 = new Student(220715004,"韩小信",18);
        Student s5 = new Student(220715001,"去病",18);

        System.out.println(s1.hashCode());
        System.out.println(s5.hashCode());

        //创建存储学生对象的集合
        HashSet<Student> set = new HashSet<>();

        //将学生对象存储到集合
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        //遍历集合
        for (Student s : set) {
            System.out.println(s);
        }
    }
}
