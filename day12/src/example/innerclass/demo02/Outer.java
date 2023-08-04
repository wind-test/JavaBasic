package example.innerclass.demo02;

/**
 * @ClassName Outer
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 08时48分07秒
 * @Version 1.0
 */
public class Outer extends SuperOuter {
    //外部类的实例变量
    int num = 20;


    private class Inner {
        private int a = 10;
        int b = 10;
        //static int c = 10;
        //内部类的实例变量
        int num = 30;

        public void show () {
            //内部类的局部变量
            int num = 40;
            System.out.println(num);//40
            System.out.println(this.num);//30
            System.out.println(Outer.this.num);//20
            System.out.println(Outer.super.num);//10
        }
    }

    public void method () {
        Inner inner = new Inner();
        //System.out.println(inner.a);

        inner.show();
    }
}
