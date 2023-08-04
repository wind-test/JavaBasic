package example.innerclass.demo05;

/**
 * @ClassName Outer
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 09时41分53秒
 * @Version 1.0
 */
public class Outer {
    //外部类的实例变量
    int a = 10;
    int num = 10;

    public void method () {
        //外部类的局部变量
        int b = 20;
        int num = 20;

        int var = 20;
        var = 22;

        //b = 22;


        class Inner {
            //内部类的实例变量
            int c = 30;
            int num = 30;

            public void show () {
                //内部类的局部变量
                int d = 40;
                int num = 40;

                System.out.println(d);
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);

                System.out.println("====================");

                System.out.println(num);//40
                System.out.println(this.num);//30
                //System.out.println(method.num);//20 外部类局部变量
                System.out.println(Outer.this.num);//10

                System.out.println("====================");

                d = 44;
                c = 33;
                //b = 22;
                a = 11;
            }
        }

        Inner inner = new Inner();
        inner.show();
    }
}
