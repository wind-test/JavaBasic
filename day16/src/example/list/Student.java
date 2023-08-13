package example.list;

/**
 * @ClassName Student
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月14日 16时16分39秒
 * @Version 1.0
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String phone;

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Student.num = num;
    }

    private static int num = 220714001;

    public Student() {
    }

    public Student(String name, int age, String gender, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }

    {
        this.id = num++;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
