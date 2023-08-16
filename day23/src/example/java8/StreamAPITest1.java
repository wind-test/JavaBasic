package example.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
一、Stream 操作的三个步骤：

1. “创建流”

2. 中间操作

3. 终止操作

 */
public class StreamAPITest1 {

    @Test
    public void test1(){
        //1. 通过 Collection 系列集合的方法 stream()
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        //2. 通过 Arrays 类中的静态方法 stream()
        Integer[] array = new Integer[10];
        Stream<Integer> stream2 = Arrays.stream(array);

        //3. 通过 Stream 类中的静态方法 of()
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);

        //4. 创建无限流
        //迭代
        Stream<Integer> stream4 = Stream.iterate(0, (x) -> x + 2);
        stream4.limit(10)  //中间操作
               .forEach(System.out::println); //终止操作

        System.out.println("---------------------------------");

        //生成
        Stream<Double> stream5 = Stream.generate(Math::random);
        stream5.limit(5).forEach(System.out::println);
    }

}
