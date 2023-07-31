package inter.demo13;

/**
 * @ClassName InterfaceDemo13
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 11时52分45秒
 * @Version 1.0
 *
 * 接口中的私有方法:
 *      含义:
 *          声明在接口中的私有方法
 *      格式:
 *          private 返回类型 方法名 () {}
 *          private static 返回类型 方法名 () {}
 *
 */
public class InterfaceDemo13 {
    public static void main(String[] args) {
        SubClass sc = new SubClass();

        sc.method01();

        System.out.println("====================");

        sc.method02();

        System.out.println("====================");

        //sc.method();
    }
}
