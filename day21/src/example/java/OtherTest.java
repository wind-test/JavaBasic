package example.java;

import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class OtherTest {

    //6. 在云像是获取运行时类的包
    @Test
    public void test6(){
        Class clazz = Person.class;
        Package pk = clazz.getPackage();
        System.out.println(pk);
    }

    //5. 在运行时获取运行时类的接口
    @Test
    public void test5(){
        Class clazz = Person.class;
        Class[] interfaces = clazz.getInterfaces();

        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }
    }

    //4. 在运行时获取运行时类的内部类
    @Test
    public void test4(){
        Class clazz = Person.class;

//        Class[] classes = clazz.getClasses();

        Class[] classes = clazz.getDeclaredClasses();

        for (Class aClass : classes) {
            System.out.println(aClass);
        }
    }

    //3. [重要]在运行时获取带泛型父类的泛型类型
    @Test
    public void test3(){
        Class clazz = Person.class;

        //1. 获取带泛型父类的类型
        Type type = clazz.getGenericSuperclass();

        //2. 参数化类型
        ParameterizedType pt = (ParameterizedType) type;

        //3. 获取所有参数
        Type[] types = pt.getActualTypeArguments();
        System.out.println(types);

        Class c = (Class) types[0];
        System.out.println(c.getName());
    }

    //2. 在运行时获取运行时类的带泛型的父类类型
    @Test
    public void test2(){//example.java.Creature<java.lang.String> c = new Person();
        Class clazz = Person.class;
        Type type = clazz.getGenericSuperclass();
        System.out.println(type);
    }

    //1. 在运行时获取运行时类的父类
    @Test
    public void test1(){
        Class clazz = Person.class;
        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }

}
