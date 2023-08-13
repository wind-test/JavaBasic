package example.list;

import java.util.Scanner;

/**
 * @ClassName ListDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月14日 16时43分35秒
 * @Version 1.0
 */
public class ListDemo04 {
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
        System.out.println("查询指定学生");
    }

    private static void getStudents() {
        System.out.println("查询学生列表");
    }

    private static void updStudent() {
        System.out.println("修改学生");
    }

    private static void delStudent() {
        System.out.println("删除学生");
    }

    private static void addStudent() {
        System.out.println("添加学生");
    }
}
