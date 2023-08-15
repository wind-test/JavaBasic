package example.java;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldTest {

    //1. 在运行时获取运行时类的属性
    @Test
    public void test1(){
        Class clazz = Person.class;

        //getFields() : 获取所有 public 修饰的属性，包括父类的
        Field[] fields_1 = clazz.getFields();

        //getDeclaredFields() : 获取本类所有的属性，包括私有的，不包括父类的
        Field[] fields_2 = clazz.getDeclaredFields();

        for (Field field : fields_1) {
            System.out.println(field.getName());
        }

        System.out.println("----------------------");

        for (Field field : fields_2) {
            System.out.println(field.getName());
        }
    }

    //2. 在运行时获取运行时类属性的完整结构。 修饰符 数据类型 属性名;
    @Test
    public void test2(){
        Class clazz = Person.class;

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            //①修饰符
            int m = field.getModifiers();
            String strMod = Modifier.toString(m);
            System.out.print(strMod + "\t");

            //②数据类型
            Class type = field.getType();
            System.out.print(type.getName() + "\t");

            //③属性名
            System.out.println(field.getName());
        }
    }

    //3. 在运行时获取并操作运行时类对象的属性。
    @Test
    public void test3() throws Exception {
        Class<Person> clazz = Person.class;

        Person person = clazz.newInstance();

        Field name = clazz.getField("name");

        //①设置属性值
        name.set(person, "张三");

        //②获取属性值
        Object obj = name.get(person);
        System.out.println(obj);

        System.out.println("---------------------------------");

        Field age = clazz.getDeclaredField("age");

        age.setAccessible(true);//忽略访问权限

        age.set(person, 18);
        Object obj2 = age.get(person);
        System.out.println(obj2);
    }
}
