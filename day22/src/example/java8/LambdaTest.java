package example.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {

    @Test
    public void test1(){
        //匿名内部类
        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };

        System.out.println("-------------------------------------");

        //Java8 的 Lambda 表达式
        Comparator<String> com2 = (x, y) -> Integer.compare(x.length(), y.length());
    }

    //测试数据
    List<Employee> list = Arrays.asList(
            new Employee(101, "张三", 18, 9999.99),
            new Employee(102, "李四", 20, 5555.55),
            new Employee(103, "王五", 8, 7777.77),
            new Employee(104, "赵六", 35, 6666.66),
            new Employee(105, "田七", 15, 8888.88)
    );

    //需求：获取公司中所有工资大于 6000 的员工信息
    /*public List<Employee> filterEmployeeBySalary(List<Employee> emps){
        List<Employee> employees = new ArrayList<>();

        for (Employee emp : emps) {
            if(emp.getSalary() > 6000){
                employees.add(emp);
            }
        }

        return employees;
    }

    //需求：获取公司员工中年龄大于25的员工信息
    public List<Employee> filterEmployeeByAge(List<Employee> emps){
        List<Employee> employees = new ArrayList<>();

        for (Employee emp : emps) {
            if(emp.getAge() > 25){
                employees.add(emp);
            }
        }

        return employees;
    }

    @Test
    public void test2(){
        *//*List<Employee> employees = filterEmployeeBySalary(list);

        for (Employee e : employees) {
            System.out.println(e);
        }*//*

        List<Employee> employees = filterEmployeeByAge(list);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }*/

    //优化方式一：策略设计模式
    public List<Employee> filterEmployees(List<Employee> employees, MyPredicate<Employee> mp){
        List<Employee> emps = new ArrayList<>();

        for (Employee e : employees) {
            if(mp.test(e)){
                emps.add(e);
            }
        }

        return emps;
    }

    @Test
    public void test3(){
        List<Employee> employees = filterEmployees(list, new FilterEmployeeBySalary());

        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("----------------------------------");

        List<Employee> employees1 = filterEmployees(list, new FilterEmployeeByAge());

        for (Employee employee : employees1) {
            System.out.println(employee);
        }
    }

    //优化方式二：匿名内部类+匿名对象
    @Test
    public void test4(){
        List<Employee> employees = filterEmployees(list, new MyPredicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getSalary() > 6000;
            }
        });

        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    //优化方式三：Lambda 表达式
    @Test
    public void test5(){
        List<Employee> employees = filterEmployees(list, (e) -> e.getSalary() > 6000);
        employees.forEach(System.out::println);
    }

    //优化方式四：强大的 Stream API
    @Test
    public void test6(){
        list.stream().filter((e) -> e.getSalary() > 6000).forEach(System.out::println);

        System.out.println("----------------------------------------");

        list.stream().map(Employee::getName).limit(2).forEach(System.out::println);
    }
}
