package example.java8;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import example.java8.Employee.*;

/*
一、Stream 操作的三个步骤：

1. 创建流

2. 中间操作

3. "终止操作"
 */
public class StreamAPITest3 {
    //测试数据
    List<Employee> list = Arrays.asList(
            new Employee(101, "张三", 18, 9999.99, Status.FREE),
            new Employee(102, "李四", 20, 5555.55, Status.BUSY),
            new Employee(103, "王五", 8, 7777.77, Status.VOCATION),
            new Employee(104, "赵六", 35, 6666.66, Status.FREE),
            new Employee(105, "田七", 15, 8888.88, Status.BUSY)
    );

    /*
    收集
    collect——将流转换为其他形式。接收一个 Collector接口的实现，用于给Stream中元素做汇总的方法
     */
    @Test
    public void test9(){
        String str = list.stream().map(Employee::getName).collect(Collectors.joining(",", "===", "==="));
        System.out.println(str);
    }

    @Test
    public void test8(){
        Map<Boolean, List<Employee>> map = list.stream().collect(Collectors.partitioningBy((e) -> e.getSalary() > 6000));

        System.out.println(map);
    }

    @Test
    public void test7(){
        Map<Status, List<Employee>> map = list.stream().collect(Collectors.groupingBy((e) -> e.getStatus()));

        Set<Map.Entry<Status, List<Employee>>> set = map.entrySet();

        for (Map.Entry<Status, List<Employee>> entry : set) {
            Status key = entry.getKey();
            System.out.println(key);

            List<Employee> values = entry.getValue();

            for (Employee e : values) {
                System.out.println(e);
            }

            System.out.println("---------------------------------");
        }
    }

    @Test
    public void test6(){
        DoubleSummaryStatistics dss = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println(dss.getSum());
        System.out.println(dss.getAverage());
        System.out.println(dss.getCount());
        System.out.println(dss.getMax());
        System.out.println(dss.getMin());
    }

    @Test
    public void test5(){
        Set<String> set = list.stream().map(Employee::getName).collect(Collectors.toSet());
        set.forEach(System.out::println);

        System.out.println("----------------------------------------------");

        List<String> newList = list.stream().map(Employee::getName).collect(Collectors.toList());

        System.out.println("----------------------------------------------");

        HashSet<String> hs = list.stream().map(Employee::getName).collect(Collectors.toCollection(HashSet::new));
    }

    /*
    归约
    reduce(T identity, BinaryOperator) / reduce(BinaryOperator) ——可以将流中元素反复结合起来，得到一个值。
     */
    @Test
    public void test4(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Integer num = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println(num);

        System.out.println("--------------------------------------");

        Optional<Integer> op = list.stream().reduce((x, y) -> x + y);

    }

    /*
    查找与匹配
    allMatch——检查是否匹配所有元素
    anyMatch——检查是否至少匹配一个元素
    noneMatch——检查是否没有匹配所有元素
    findFirst——返回第一个元素
    findAny——返回当前流中的任意元素
    count——返回流中元素的总个数
    max——返回流中最大值
    min——返回流中最小值
     */
    @Test
    public void test3(){
        long count = list.stream().map(Employee::getSalary).count();
        System.out.println(count);

        Optional<Employee> op = list.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(op.get());

        Optional<Double> op2 = list.stream().map(Employee::getSalary).min(Double::compare);
        System.out.println(op2.get());
    }

    @Test
    public void test2(){
        Optional<Employee> op1 = list.stream().sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).findFirst();
        Employee emp = op1.get();
        System.out.println(emp);

        System.out.println("------------------------------------------");

        Optional<Employee> op2 = list.parallelStream().sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).findAny();
        System.out.println(op2.get());
    }

    @Test
    public void test1(){
        boolean b1 = list.stream().allMatch((e) -> e.getStatus().equals(Status.FREE));
        System.out.println(b1);

        boolean b2 = list.stream().anyMatch((e) -> e.getStatus().equals(Status.FREE));
        System.out.println(b2);

        boolean b3 = list.stream().noneMatch((e) -> e.getStatus().equals(Status.FREE));
        System.out.println(b3);
    }

}
