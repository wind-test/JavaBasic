package inter.demo09;

/**
 * @ClassName InterfaceDemo09
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 11时07分21秒
 * @Version 1.0
 *
 * 默认方法的注意事项:
 *      1.当子类同时继承和实现,父类中的实例方法和父接口中的默认方法发生同名的时候,当子类对象调用这个方法时,继承的是父类的实例
 *      方法
 *      2.当子类不继承父类,但实现多个父接口,多个父接口中出现了同名的默认方法,子类需要以实例方法形式重写该默认方法
 *      3.如果在重写的默认方法中调用某个接口被重写的默认方法,需要使用"接口名.super.默认方法名"
 */
public class InterfaceDemo09 {
    public static void main(String[] args) {
        SubClass sc = new SubClass();

        sc.method();
    }
}
