package example.java;

import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

public class ClassLoaderTest {

    //使用 Properties 操作属性文件
    @Test
    public void test2() throws IOException {
        Properties props = new Properties();
        //props.load(new FileInputStream("./jdbc.properties"));

        //利用类加载器加载属性文件
        props.load(this.getClass().getClassLoader().getResourceAsStream("example/java/jdbc.properties"));

        String username = props.getProperty("username");
        String password = props.getProperty("password");

        System.out.println(username);
        System.out.println(password);
    }

    //了解
    @Test
    public void test1() throws ClassNotFoundException {
        ClassLoader cl = this.getClass().getClassLoader();
        System.out.println(cl);

        /*ClassLoader cl2 = cl.getParent();
        System.out.println(cl2);

        ClassLoader cl3 = cl2.getParent();
        System.out.println(cl3);*/

        String className = "java.example.Person";
        Class clazz = Class.forName(className);
        ClassLoader cl4 = clazz.getClassLoader();
        System.out.println(cl4);
    }

}
