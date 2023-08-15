package example.java;

public class Person extends Creature<String> implements Comparable, MyInterface{

    public String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name, Integer age, double score) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, double score, int age) {
        System.out.println(name);
        System.out.println(score);
        System.out.println(age);
        System.out.println("setName方法运行了……");
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    private String sleep() throws RuntimeException{
        System.out.println("睡觉");

        return "哈哈哈";
    }

    public class Computer{

    }

    private class Head{

    }
}
