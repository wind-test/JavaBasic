package inter.demo04;

/**
 * @ClassName InterfaceDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 09时35分00秒
 * @Version 1.0
 *
 * 接口的注意事项:
 *      1.接口中没有构造器,无法实例化对象
 *      2.类,接口间的三种关系:
 *          类与类之间的关系:单继承关系
 *          类与接口之间的关系:多实现关系
 *          接口与接口之间的关系:多继承关系
 *              格式:
 *                  public interface 接口名 extends 父接口名1,父接口名2,......,父接口名n {}
 *      3.如果遇到接口,无法直接进行使用,需要声明接口的实现类
 *      4.接口中的成员最多支持六大成员,除了六大成员外,其它内容无法在接口中进行声明
 *
 */
public class InterfaceDemo04 {
    public static void main(String[] args) {

        //SuperInterface si = new SuperInterface();
    }
}
