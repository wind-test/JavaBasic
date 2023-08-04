package example.innerclass.demo05;

/**
 * @ClassName InnerClass05
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 09时35分34秒
 * @Version 1.0
 *
 * 标准局部内部类(局部内部类)
 *      目的:
 *          1.学习标准局部内部类为了学习匿名局部内部类做铺垫
 *          2.笔试题
 *      权限:
 *          只能缺省
 *      格式:
 *          public class 外部类类名 {
 *              修饰符 返回类型 方法名 () {
 *                  class 内部类类名 {
 *
 *                  }
 *              }
 *          }
 *      注意
 *          1.标准局部内部类可以使用abstract或final进行修饰,不能使用static进行修饰
 *          2.创建标准局部内部类对象只能在标准局部内部类所属方法中,且创建对象的代码必须在标准局部内部类的下面
 *          3.当标准局部内部类的实例变量或局部变量和标准局部内部类所属方法的外部类局部变量发生同名的时候,在标准局部内部类中
 *          无法获取该同名的外部类局部变量
 *          4.外部类的局部变量如果在所属方法的标准局部内部类中进行使用,该外部类局部变量无法在方法中进行更改,一旦在局部内部类
 *          中进行使用,JVM的编译器隐式添加final关键字进行修饰
 */
public class InnerClassDemo05 {
    public static void main(String[] args) {
        new Outer().method();
    }
}
