package example.java;

import org.junit.Test;

/*
在运行时获取运行时类的实例

newInstance() : 默认调用运行时类的无参构造器
 */
public class NewInstanceTest {

    @Test
    public void test1() throws Exception {
        /*Class clazz = Person.class;
        Person p = (Person)clazz.newInstance();
        System.out.println(p);*/

        Class<Person> clazz = Person.class;
        Person p = clazz.newInstance();
        System.out.println(p);
    }

}
