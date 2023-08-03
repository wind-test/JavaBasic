package scanner;

import java.util.Scanner;

/**
 * @FileName ScannerDemo
 * @Description
 * @Author WindDancer
 * @date 2023-07-20
 **/
public class ScannerDemo {
  public static void main(String[] args){
//    method01();
//    method02();
    method03();
  }

  public static void method04 () {
    //创建Scanner对象
    Scanner sc = new Scanner(System.in);

    System.out.println("请输入学生对象的学号:");
    int id = sc.nextInt();
    System.out.println("请输入学生对象的姓名:");
    String name = sc.nextLine();
    System.out.println("请输入学生对象的年龄:");
    int age = sc.nextInt();

    //通过键盘录入的数据创建学生对象
    Student s = new Student(id, name, age);

    System.out.println(s.print());
  }

  public static void method03 () {
    //创建Scanner对象
    Scanner sc = new Scanner(System.in);

    System.out.println("请输入学生对象的学号:");
    int id = sc.nextInt();
    System.out.println("请输入学生对象的姓名:");
    String name = sc.next();
    System.out.println("请输入学生对象的年龄:");
    int age = sc.nextInt();

    //通过键盘录入的数据创建学生对象
    Student s = new Student(id, name, age);

    System.out.println(s.print());
  }

  public static void method02() {
    Scanner sc = new Scanner(System.in);

    System.out.println("请输入待扫描的字符串:");
    String str = sc.nextLine();
    System.out.println("str = " + str);

    sc.close();
  }

  public static void method01() {
    Scanner sc = new Scanner(System.in);

    System.out.println("请输入待扫描的字符串:");
    String str = sc.next();
    System.out.println("str = " + str);

    sc.close();
  }
}
