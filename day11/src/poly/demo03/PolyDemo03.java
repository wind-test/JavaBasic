package poly.demo03;

/**
 * @ClassName PolyDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 14时32分47秒
 * @Version 1.0
 *
 * 多态关系中实例变量的特点
 *      和之前变量的使用一模一样,没有任何改变
 *          补充:变量的结果最终是什么,不是取决于最开始的初始化值,而是取决于数据的数据类型
 */
public class PolyDemo03 {
    public static void main(String[] args) {
        //父类new父类
        SuperClass superClass = new SuperClass();
        System.out.println(superClass);
        System.out.println(superClass.num);//10

        System.out.println("=============================");

        //子类new子类
        SubClass subClass = new SubClass();
        System.out.println(subClass);
        System.out.println(subClass.num);//20

        System.out.println("=============================");

        //父类new子类(多态)
        SuperClass sc = new SubClass();
        System.out.println(sc);
        System.out.println(sc.num);//10

        System.out.println("=============================");

        char var1 = 97;
        System.out.println(var1);//'a'

        int var2 = 'a';
        System.out.println(var2);//97

        double var3 = 4;
        System.out.println(var3);//4.0
    }
}
