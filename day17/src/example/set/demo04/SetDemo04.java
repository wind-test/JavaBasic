package example.set.demo04;

import java.util.TreeSet;

/**
 * @ClassName SetDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月16日 09时40分32秒
 * @Version 1.0
 *
 * 使用TreeSet集合针对自定义对象进行排序
 *      如果存储对象是包装类型,会按照包装类型的数值大小进行升序排序(Boolean除外)
 *      如果存储对象是String类型,会按照Unicode码表对应的数值进行升序排序
 *      如果存储对象是自定义类型,必须手动定义比较器(自然顺序或指定顺序)
 *
 * 自然顺序比较器:
 *      1.比较对象的数据类型实现Comparable<T>接口
 *      2.重写Comparable<T>接口的抽象方法compareTo(T o)
 */
public class SetDemo04 {
    public static void main(String[] args) {
        method03();
    }

    private static void method03() {
        //创建4个学生对象
        Student s1 = new Student(220716003, "城小将", 18);
        Student s2 = new Student(220716001, "唐小妃", 18);
        Student s3 = new Student(220716002, "李小白", 18);
        Student s4 = new Student(220716004, "波斯客", 18);

        //创建集合
        TreeSet<Student> set = new TreeSet<>();

        //添加元素
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        for (Student s : set) {
            System.out.println(s);
        }
    }

    private static void method02() {
        TreeSet<String> set = new TreeSet<>();

        set.add("bca");
        set.add("cba");
        set.add("abc");
        set.add("cab");
        set.add("bac");
        set.add("acb");
        set.add("尚硅谷");
        set.add("0");
        set.add("ABC");

        System.out.println(set);
    }

    private static void method01() {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(55);
        set.add(22);
        set.add(33);
        set.add(11);
        set.add(44);

        System.out.println(set);
    }
}
