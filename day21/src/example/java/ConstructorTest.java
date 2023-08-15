package example.java;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class ConstructorTest {

    //在运行时获取并调用运行时类的构造器
    @Test
    public void test1() throws Exception {
        Class<Person> clazz = Person.class;

        Constructor<Person> constructor_1 = clazz.getConstructor(String.class, Integer.class);
        Person p = constructor_1.newInstance("张三", 18);
        System.out.println(p);

        Constructor<Person> constructor_2 = clazz.getDeclaredConstructor(String.class, Integer.class, double.class);
        // 指示反射的对象在使用时取消访问权限检查
        constructor_2.setAccessible(true);
        Person p2 = constructor_2.newInstance("张三", 18, 99.99);
        System.out.println(p2);
    }

}
