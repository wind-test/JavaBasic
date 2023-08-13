package example.list;

import java.util.List;
import java.util.Scanner;

/**
 * @ClassName ListDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月14日 16时43分35秒
 * @Version 1.0
 */
public class ListDemo01 {
    private static Scanner sc = new Scanner(System.in);
    //创建学生操作实现类对象
    private static SutdentInterfaceImpl sil = new SutdentInterfaceImpl();

    public static void main(String[] args) {
        //声明并初始化循环变量
        boolean flag = true;

        while (flag) {
            System.out.println("========欢迎使用JavaSE版的学习管理系统========");
            System.out.println("\t\t\t\t1.添加学生");
            System.out.println("\t\t\t\t2.删除学生");
            System.out.println("\t\t\t\t3.修改学生");
            System.out.println("\t\t\t\t4.查询学生列表");
            System.out.println("\t\t\t\t5.查询指定学生");
            System.out.println("\t\t\t\t6.退出");
            System.out.println("\t\t\t\t请选择功能:");
            int key = sc.nextInt();

            //针对key进行判断
            switch (key) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    delStudent();
                    break;
                case 3:
                    updStudent();
                    break;
                case 4:
                    getStudents();
                    break;
                case 5:
                    getStudent();
                    break;
                case 6:
                    flag = false;
                    sc.close();
                    break;
                default:
                    System.out.println("输入功能按键有误,请重新输入......");
                    break;
            }

        }
    }

    private static void getStudent() {
        //键盘录入查询学生对象的ID
        System.out.println("请输入查询学生对象的ID:");
        int id = sc.nextInt();

        //根据学生的ID获取查询的学生对象
        Student student = sil.getStudent(id);

        //针对待修改学生对象进行健壮性判断
        if (student == null) {
            System.out.println("查询失败:通过ID没有查找到学生对象");
            return;
        } else {
            System.out.println(student);
        }
    }

    private static void getStudents() {
        //获取学生对象集合
        List<Student> students = sil.getStudents();

        //遍历集合信息
        for (Student s : students) {
            System.out.println(s);
        }
    }

    private static void updStudent() {
        //键盘录入修改学生对象的ID
        System.out.println("请输入修改学生对象的ID:");
        int id = sc.nextInt();

        //根据学生的ID获取待修改的学生对象
        Student student = sil.getStudent(id);

        //针对待修改学生对象进行健壮性判断
        if (student == null) {
            System.out.println("修改失败:通过ID没有查找到学生对象");
            return;
        }

        //显示学生原来的信息
        System.out.println("学生原有信息如下:");
        System.out.println(student);

        //键盘录入学生对象的修改后的数据
        System.out.println("请输入学生姓名:");
        String name = sc.next();
        System.out.println("请输入学生年龄:");
        int age = sc.nextInt();
        System.out.println("请输入学生性别:");
        String gender = sc.next();
        System.out.println("请输入学生手机:");
        String phone = sc.next();
        //使用修改后的数据创建学生对象
        Student s = new Student(name,age,gender,phone);
        s.setId(student.getId());

        //为了减少num的浪费,进行学号回收
        Student.setNum(Student.getNum() - 1);

        //替换集合中的学生对象
        boolean result = sil.updStudent(id, s);

        if (result) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }

    private static void delStudent() {
        //键盘录入删除学生对象的ID
        System.out.println("请输入删除学生对象的ID:");
        int id = sc.nextInt();

        //根据学生的学号删除索引对象
        boolean result = sil.delStudent(id);

        if (result) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    private static void addStudent() {
        //键盘录入创建学生对象所需的数据
        System.out.println("请输入学生姓名:");
        String name = sc.next();
        System.out.println("请输入学生年龄:");
        int age = sc.nextInt();
        System.out.println("请输入学生性别:");
        String gender = sc.next();
        System.out.println("请输入学生手机:");
        String phone = sc.next();

        //创建学生对象
        Student s = new Student(name,age,gender,phone);

        //将学生对象进行添加
        boolean result = sil.addStudent(s);

        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }
}
