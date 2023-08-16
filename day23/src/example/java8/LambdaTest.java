package example.java8;

import org.junit.Test;
//import sun.util.resources.cldr.ar.CalendarData_ar_YE;

import java.util.Comparator;
import java.util.function.Consumer;

/*
一、Lambda 表达式：Java8中出了一个全新的操作符 "->", 该操作符称为箭头操作符或 Lambda 操作符
                  该操作符将 Lambda 表达式分成两部分：

左侧：函数式接口中抽象方法的参数列表
右侧：函数式接口中抽象方法的实现，即 Lambda 体

Lambda 表达式需要函数式接口的支持！

二、函数式接口：接口中只有一个抽象方法的接口，称为函数式接口。 函数式接口可以使用 @FunctionalInterface 进行注解
               说明该接口必须是函数式接口

Lambda 表达式就是对函数式接口中抽象方法的实现！

三、Lambda 表达式的语法格式

语法格式一：无参数，无返回值
    () -> System.out.println("Java8 的 Lambda 表达式");

语法格式二：有一个参数，无返回值
    (s) -> System.out.println(s);

语法格式三：若Lambda表达式的参数列表只有一个参数时，小括号可以省略不写
    s -> System.out.println(s);

语法格式四：多个参数，有返回值，并且 Lambda 体中有多条语句
    (x, y) -> {
            System.out.println("Lambda体中有多条语句");
            return Integer.compare(x.length(), y.length());
        };

语法格式五：若 Lambda 体中只有一条语句时，大括号和 return 都可以省略不写
    (x, y) -> Integer.compare(x.length(), y.length());

语法格式六：Lambda 表达式参数列表中的数据类型可以省略不写，因为 Java 编译器可以通过上下文推断出对应的数据类型
           即 “类型推断”
    (String x, String y) -> Integer.compare(x.length(), y.length());
 */
public class LambdaTest {

    @Test
    public void test4(){
        Comparator<String> com2 = (String x, String y) -> Integer.compare(x.length(), y.length());

        int c = com2.compare("abc", "hello");
        System.out.println(c);
    }

    @Test
    public void test3(){
        Comparator<String> com1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };

        System.out.println("--------------------------------------------");

        Comparator<String> com2 = (x, y) -> {
            System.out.println("Lambda体中有多条语句");
            return Integer.compare(x.length(), y.length());
        };

        int c = com2.compare("abc", "hello");
        System.out.println(c);
    }

    @Test
    public void test2(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("Hello！");

        System.out.println("-----------------------------------------");

        Consumer<String> con2 = s -> System.out.println(s);
        con2.accept("尚硅谷！");
    }

    @Test
    public void test1(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("原来的匿名内部类");
            }
        };
        r1.run();

        System.out.println("------------------------------------");

        Runnable r2 = () -> System.out.println("Java8 的 Lambda 表达式");
        r2.run();
    }

}
