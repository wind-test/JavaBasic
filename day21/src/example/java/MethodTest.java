package example.java;

import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodTest {

    //1. 在运行时获取运行时类的方法
    @Test
    public void test1(){
        Class clazz = Person.class;

        //getMethods() : 获取所有 public 修饰的方法，包括父类的
        Method[] methods_1 = clazz.getMethods();

        //getDeclaredMethods() : 获取本类所有的方法，包括私有的，不包括父类的
        Method[] methods_2 = clazz.getDeclaredMethods();

        for (Method method : methods_1) {
            System.out.println(method.getName());
        }

        System.out.println("------------------");

        for (Method method : methods_2) {
            System.out.println(method.getName());
        }
    }

    //2. 在运行时获取运行时类方法的完整结构。 修饰符 返回值类型 方法名(参数类型1 参数名1, 参数类型2 参数名2, ……)
    @Test
    public void test2(){
        Class clazz = Person.class;

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            //①修饰符
            String mod = Modifier.toString(method.getModifiers());
            System.out.print(mod + "\t");

            //②返回值类型
            Class returnType = method.getReturnType();
            System.out.print(returnType.getName() + "\t");

            //③方法名
            System.out.print(method.getName() + "(");

            //④参数列表
            Class[] parameterTypes = method.getParameterTypes();

            for (Class parameterType : parameterTypes) {
                System.out.print(parameterType.getName() + ",");
            }

            System.out.println(")");

            //⑤异常
            Class<?>[] exceptionTypes = method.getExceptionTypes();

            for (Class<?> exceptionType : exceptionTypes) {
                System.out.println(exceptionType.getName());
            }
        }
    }

    //3. 在运行时获取并调用运行时类对象的方法
    @Test
    public void test3() throws Exception {
        Class<Person> clazz = Person.class;

        Person person = clazz.newInstance();

        Method method = clazz.getMethod("eat");

        method.invoke(person);

        System.out.println("------------------------------------");

        Method method2 = clazz.getMethod("setName", String.class, double.class, int.class);
        Object obj = method2.invoke(person, "张三", 99.99, 18);
        System.out.println(obj);

        System.out.println("------------------------------------");

        Method method3 = clazz.getDeclaredMethod("sleep");

        method3.setAccessible(true);//忽略访问权限

        Object obj2 = method3.invoke(person);
        System.out.println(obj2);
    }
}
