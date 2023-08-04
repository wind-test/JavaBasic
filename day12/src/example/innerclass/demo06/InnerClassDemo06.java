package example.innerclass.demo06;

/**
 * @ClassName InnerClassDemo06
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 10时22分43秒
 * @Version 1.0
 *
 * 匿名局部内部类(匿名内部类)
 *      目的:
 *          1.针对接口的使用进行简化操作
 *          2.学习匿名内部类是学习"Lambda表达式"的前提条件
 *      格式:
 *          接口名 接口实现类对象名 = new 接口名(){
 *              接口实现类的类体
 *          };
 *      注意:
 *          匿名内部类匿名的是"接口的实现类"
 *      好处:
 *          在实际应用中,调用抽象父类或者父接口作为形参的方法时,无需声明该抽象父类的子类或该接口的实现类,直接传递给抽象父类或
 *          父接口的匿名内部类即可,匿名内部类即该抽象父类的子类对象或该父接口的实现类对象;
 */
public class InnerClassDemo06 {
    public static void main(String[] args) {
        //使用多态的形式创建接口的实现类对象
        SuperInterface si1 = new SubClass();
        si1.method();

        System.out.println("=======================");

        SuperInterface si2 = new SuperInterface(){
            @Override
            public void method () {
                System.out.println("HelloWorld");
            }

        };

        System.out.println(si2);

        //多态对象调用方法
        si2.method();

       /* SuperInterface si3 = new SuperInterface(){
            @Override
            public void method() {
                System.out.println("HelloWorld");
            }
        };

        System.out.println(si3);*/
    }
}
