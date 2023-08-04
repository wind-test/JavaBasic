package poly.demo07;

/**
 * @ClassName PolyDemo07
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 16时16分28秒
 * @Version 1.0
 *
 * 多态的弊端
 *      多态对象无法调用自己的特有方法
 */
public class PolyDemo07 {
    public static void main(String[] args) {
        //创建猫对象
        Animal cat = new Cat(2, "白");

//        cat.catchMouse();
        cat.eat("鱼");
        cat.sleep();
    }
}
