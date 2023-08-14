package example.demo09;

/**
 * @ClassName ThreadDemo09
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月20日 14时05分53秒
 * @Version 1.0
 */
public class ThreadDemo09 {
    public static void main(String[] args) {
        //创建包子资源对象
        BaoZi bz = new BaoZi();

        //创建包子铺和学生的线程对象
        Thread bzp = new Thread(new BaoZiPu(bz), "包子铺");

        //创建学生对象执行动作对象
        Student s = new Student(bz);

        Thread stu1 = new Thread(s, "学生1");
        Thread stu2 = new Thread(s, "学生2");
        Thread stu3 = new Thread(s, "学生3");

        //开启线程
        bzp.start();
        stu1.start();
        stu2.start();
        stu3.start();
    }
}
