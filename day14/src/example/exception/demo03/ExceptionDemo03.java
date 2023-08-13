package example.exception.demo03;

/**
 * @ClassName ExceptionDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月12日 08时59分02秒
 * @Version 1.0
 *
 * 异常:
 *      含义:
 *          在程序编译或运行的过程中,代码没有出现语法格式问题,但发生了非正常情况,导致编译报错或运行报错
 *      分类:
 *          编译时异常
 *          运行时异常
 *      注意:
 *          无论编译时异常还是运行时异常,都必须进行异常的处理
 *
 * 编译时异常:
 *      含义:
 *          在程序编译的过程中,代码没有出现任何语法格式问题,但发生了编译报错
 *      位置:
 *          java.lang.Exception类及其子类(RuntimeException类及其子类除外)
 *      处理:
 *          必须由程序员手动进行处理(声明处理和捕获处理二选一)
 *
 * 运行时异常:
 *      含义:
 *          在程序运行的过程中,diam没有出现任何语法格式问题,但发生了运行报错
 *      位置:
 *          java.lang.RuntimeException类及其子类除外
 *      处理:
 *          可以由程序员手动进行处理(声明处理和捕获处理二选一)
 *          程序员也可以不处理,如果程序不进行处理,JVM会自行处理
 *              JVM的处理方案:
 *                  (1)终止JVM(2)终止的同时调用Throwable类中printStackTrace()
 */
public class ExceptionDemo03 {
    public static void main(String[] args) {
        System.out.println("开始");
        System.out.println(1/0);
        System.out.println("结束");
    }
}
