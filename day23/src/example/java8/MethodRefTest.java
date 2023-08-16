package example.java8;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.*;

/*
一、方法引用：若 Lambda 表达式的 Lambda 体中，需要实现的功能，已经有方法提供了实现，我们可以选择使用方法引用
             （可以理解方法引用是 Lambda 表达式的另外一种表现形式）

二、方法引用的格式

对象的引用 :: 实例方法名

类名 :: 静态方法名

类名 :: 实例方法名

三、方法引用的注意：
①方法引用中方法的参数列表与返回值类型必须与 函数式接口中 抽象方法的参数列表和返回值类型保持一致！

②返回值类型相同的情况下，函数式接口中参数列表的第一个参数，是方法引用方法的调用者，第二个参数（或无参）
 是方法引用方法的参数时，可以使用  类名::实例方法名

四、构造器引用

    格式：
        类名::new

注意：构造器引用的参数列表与函数式接口中抽象方法的参数列表保持一致！

五、数组引用
    格式：
        类型[]::new
 */
public class MethodRefTest {

    @Test
    public void test8(){
        Function<Integer, Employee[]> fun = (i) -> new Employee[i];

        System.out.println("---------------------------------");

        Function<Integer, Employee[]> fun2 = Employee[]::new;
        Employee[] emps = fun2.apply(10);
        System.out.println(emps.length);
    }

    @Test
    public void test7(){
        BiFunction<String, Integer, Employee> bf = (s, i) -> new Employee(s, i);

        System.out.println("------------------------------------");

        BiFunction<String, Integer, Employee> bf2 = Employee::new;
        Employee emp = bf2.apply("张三", 18);
        System.out.println(emp);
    }

    //T get();
    //Employee();
    @Test
    public void test6(){
        Supplier<Employee> sup1 = () -> new Employee();

        System.out.println("---------------------------------");

        Supplier<Employee> sup2 = Employee::new;
    }

    //类名 :: 实例方法名
    //String getName()
    //R apply(T t)
    @Test
    public void test5(){
        Function<Employee, String> fun = (e) -> e.getName();

        System.out.println("-----------------------------------");

        Function<Employee, String> fun2 = Employee::getName;

    }

    //boolean equals(Object anObject)
    //boolean test(T t, U u);
    @Test
    public void test4(){
        BiPredicate<String, String> bp = (x, y) -> x.equals(y);

        System.out.println("-------------------------------------------");

        BiPredicate<String, String> bp2 = String::equals;
    }

    //类名 :: 静态方法名
    //int compare(int x, int y)
    //int compare(T o1, T o2);
    @Test
    public void test3(){
        Comparator<Integer> com1 = (x, y) -> Integer.compare(x, y);

        System.out.println("------------------------------------------");

        Comparator<Integer> com2 = Integer::compare;
    }

    //对象的引用 :: 实例方法名
    //String getName()
    //T get();
    @Test
    public void test2(){
        Employee emp = new Employee();

        Supplier<String> sup = () -> emp.getName();

        System.out.println("----------------------------------");

        Supplier<String> sup2 = emp::getName;

    }

    //void println(String x)
    //void accept(T t);
    @Test
    public void test1(){
        PrintStream ps = System.out;
        Consumer<String> con1 = (s) -> ps.println(s);
        con1.accept("abcde");

        System.out.println("----------------------------------");

        Consumer<String> con2 = ps::println;
        con2.accept("abcde");
    }

}
