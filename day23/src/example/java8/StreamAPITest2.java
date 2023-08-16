package example.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
一、Stream 操作的三个步骤：

1. 创建流

2. "中间操作"

3. 终止操作
 */
public class StreamAPITest2 {

    //测试数据
    List<Employee> list = Arrays.asList(
            new Employee(101, "张三", 18, 9999.99, Employee.Status.FREE),
            new Employee(102, "李四", 20, 5555.55, Employee.Status.BUSY),
            new Employee(103, "王五", 8, 7777.77, Employee.Status.VOCATION),
            new Employee(104, "赵六", 35, 6666.66, Employee.Status.FREE),
            new Employee(105, "田七", 15, 8888.88, Employee.Status.BUSY)
    );

    /*
    排序
    sorted()——自然排序
    sorted(Comparator com)——定制排序
     */
    @Test
    public void test6(){
        list.stream().sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).forEach(System.out::println);
    }

    /*
    映射
    map——接收 Lambda ， 将元素转换成其他形式或提取信息。接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。
     */
    @Test
    public void test5(){
        /*List<String> list = Arrays.asList("www", "atguigu", "com");
        list.stream().map((s) -> s.toUpperCase()).forEach(System.out::println);*/

        System.out.println("---------------------------------------");

        list.stream().map(Employee::getName).forEach(System.out::println);
    }

    /*
    筛选与切片
    filter——接收 Lambda ， 从流中排除某些元素。
    limit——截断流，使其元素不超过给定数量。
    skip(n) —— 跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一个空流。与 limit(n) 互补
    distinct——筛选，通过流所生成元素的 hashCode() 和 equals() 去除重复元素
     */
    @Test
    public void test4(){
        list.stream()
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    public void test3(){
        list.stream()
                .filter((e) -> e.getSalary() > 6000)
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    public void test2(){
        list.stream()
            .filter((e) -> {
                System.out.println("短路！");
                return e.getSalary() > 6000;
            })
            .limit(2)
            .forEach(System.out::println);
    }

    @Test
    public void test1(){
        //中间操作：不会做任何处理
        Stream<Employee> stream = list.stream().filter((e) -> e.getSalary() > 6000);

        //终止操作：一次性处理全部内容，即“惰性求值”或“延迟加载”
        stream.forEach(System.out::println); //内部迭代
    }
}
