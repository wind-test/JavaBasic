package example.exer;

import example.java8.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
1.	调用 Collections.sort() 方法，通过定制排序比较两个 Employee (先按年龄比，年龄相同按姓名比)，
使用 Lambda 作为参数传递。
2.	①声明函数式接口，接口中声明抽象方法，public String getValue(String str);
②声明类 TestLambda ，类中编写方法使用接口作为参数，将一个字符串转换成大写，并作为方法的返回值。
③再将一个字符串的第2个和第4个索引位置进行截取子串。
3.	①声明一个带两个泛型的函数式接口，泛型类型为<T, R>  T 为参数，R 为返回值
②接口中声明对应抽象方法
③在 TestLambda 类中声明方法，使用接口作为参数，计算两个 long 型参数的和。
④再计算两个 long 型参数的乘积。
 */
public class LambdaExer {

    @Test
    public void test3(){
        Long l1 = getValue(10L, 20L, (x, y) -> x + y);
        System.out.println(l1);

        Long l2 = getValue(10L, 20L, (x, y) -> x * y);
        System.out.println(l2);
    }

    public Long getValue(Long l1, Long l2, MyBiFunction<Long, Long> mf){
        return mf.op(l1, l2);
    }

    @Test
    public void test2(){
        String str1 = strHandler("abcde", (s) -> s.toUpperCase());
        System.out.println(str1);

        System.out.println("---------------------------------");

        String str2 = strHandler("我大尚硅谷威武!", (s) -> s.substring(2, 5));
        System.out.println(str2);
    }

    public String strHandler(String str, MyFunction mf){
        return mf.getValue(str);
    }

    //测试数据
    List<Employee> list = Arrays.asList(
            new Employee(101, "张三", 18, 9999.99),
            new Employee(102, "李四", 20, 5555.55),
            new Employee(103, "王五", 8, 7777.77),
            new Employee(104, "赵六", 35, 6666.66),
            new Employee(105, "田七", 15, 8888.88)
    );

    @Test
    public void test1(){
        Collections.sort(list, (x, y) -> {
            if(x.getAge().equals(y.getAge())){
                return x.getName().compareTo(y.getName());
            }else{
                return -x.getAge().compareTo(y.getAge());
            }
        });

        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
