package example.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    @Before
    public void before(){
        System.out.println("---之前----");
    }

    @Test
    public void testSetName(){
        System.out.println("HelloWorld");
    }

    @Test
    public void testSetAge(){
        System.out.println("abcde");
    }

    @After
    public void after(){
        System.out.println("---之后---");
    }
}
