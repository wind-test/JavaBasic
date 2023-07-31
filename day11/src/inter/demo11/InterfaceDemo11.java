package inter.demo11;



/**
 * @ClassName InterfaceDemo11
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 11时35分51秒
 * @Version 1.0
 *
 * 接口中的静态方法:
 *      含义:
 *          声明在接口中的静态方法
 *      格式:
 *          public static 返回类型 方法名 () {}
 *      调用:
 *          接口名.静态方法名(实参);
 *      注意:
 *          public关键字可以省略不写,如果不写,JVM的编译器在编译时期自动补全
 *
 *
 */
public class InterfaceDemo11 {
    public static void main(String[] args) {
        SuperInterface.method();
    }
}
