package example.java;


import org.junit.Test;

/*
一、
Java 程序的运行分为两种状态：
编译时: 通过 javac 命令，生成一个或多个 .class 字节码文件。（每个类对应着一个 .class）
运行时: 通过 java 命令，将生成 .class 字节码文件加载到内存中。（由JVM提供的类加载器）

二、
类用于描述现实生活中的一类事物，类是抽象的，通过 new 关键字创建对象，操作其属性，调用其方法。
（在编译时可以明确知道创建什么类对象、操作什么属性、调用什么方法）

某种情况下，我们需要得知并使用一个在编译时完全未知的类，创建其对象，操作其属性，调用其方法

三、反射机制：被视为动态语言的关键，可以在运行时创建任意类的对象，操作任意对象的属性，调用任意对象的方法

Class 是开启反射的源头！

四、如何获取 Class 实例
       //1. 通过运行时类的 class 属性

        //2. 通过运行时类对象的 getClass() 方法

        //3. 通过 Class 类中的静态方法 forName(String className)

        //4. （了解）通过类加载器
 */
public class ReflectionTest {

    @Test
    public void test2() throws ClassNotFoundException {
        //1. 通过运行时类的 class 属性
        Class clazz1 = Person.class;
        System.out.println(clazz1);

        //2. 通过运行时类对象的 getClass() 方法
        Person p = new Person();
        Class clazz2 = p.getClass();
        System.out.println(clazz2);

        //3. 通过 Class 类中的静态方法 forName(String className)
        String className = "example.java.Person";
        Class clazz3 = Class.forName(className);
        System.out.println(clazz3);

        //4. （了解）通过类加载器
        ClassLoader cl = ReflectionTest.class.getClassLoader();
        Class clazz4 = cl.loadClass(className);
        System.out.println(clazz4);
    }

    //通用查询数据库
    /*public <T> T get(){
        //N行查询语句

        return 反射机制;
    }*/

    @Test
    public void test1(){
        Person p = new Person("张三", 18);
        Class cls = p.getClass();
        System.out.println(p);
        System.out.println(cls);
    }

}
