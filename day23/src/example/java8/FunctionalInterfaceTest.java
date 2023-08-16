package example.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
一、Java8 内置的四大核心函数式接口：

Consumer<T> : 消费型接口
    void accept(T t);

Supplier<T> : 供给型接口
    T get();

Function<T, R> : 函数型接口
    R apply(T t);

Predicate<T> : 断言型接口 / 判断型接口
    boolean test(T t);
 */
public class FunctionalInterfaceTest {

    //Predicate<T> : 断言型接口 / 判断型接口
    //需求：过滤字符串，并存入集合中
    @Test
    public void test4(){
        List<String> list = Arrays.asList("www", "atguigu", "com", "hello", "lambda");

        List<String> strs = filterStr(list, (s) -> s.length() > 3);

        for (String str : strs) {
            System.out.println(str);
        }
    }

    public List<String> filterStr(List<String> list, Predicate<String> pre){
        List<String> newStr = new ArrayList<>();

        for (String s : list) {
            if(pre.test(s)){
                newStr.add(s);
            }
        }

        return newStr;
    }

    //Function<T, R> : 函数型接口
    //需求：处理字符串，生成新字符串
    @Test
    public void test3(){
        String str1 = strHandler("abcde", (s) -> s.toUpperCase());
        System.out.println(str1);

        System.out.println("------------------------------------");

        String str2 = strHandler("我大尚硅谷威武!", (s) -> s.substring(2, 5));
        System.out.println(str2);

    }

    public String strHandler(String str, Function<String, String> fun){
        return fun.apply(str);
    }

    //Supplier<T> : 供给型接口
    //需求：生产整数，并存入集合中
    @Test
    public void test2(){
        List<Integer> list = getNumber(10, () -> (int) (Math.random() * 101));

        for (Integer num : list) {
            System.out.println(num);
        }
    }

    public List<Integer> getNumber(int n, Supplier<Integer> sup){
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sup.get());
        }

        return list;
    }


    //Consumer<T> : 消费型接口
    @Test
    public void test1(){
        happy(10000, (d) -> System.out.println("张楚岚喜欢大宝剑，每次消费 " + d + " 元"));
    }

    public void happy(double money, Consumer<Double> con){
        con.accept(money);
    }
}
