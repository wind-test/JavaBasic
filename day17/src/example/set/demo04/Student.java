package example.set.demo04;

/**
 * @ClassName Student
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月16日 09时47分35秒
 * @Version 1.0
 */
public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int result = this.age - o.age;

        //针对result进行判断
        if (result == 0) {
            result = this.id - o.id;
        }

        return result;
    }
}
