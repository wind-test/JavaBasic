package example.list;

import java.util.List;

/**
 * @ClassName StudentInterface
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月14日 16时21分39秒
 * @Version 1.0
 */
public interface StudentInterface {
    //添加学生对象
    boolean addStudent(Student s);
    //删除学生对象
    boolean delStudent(int id);
    //修改学生对象
    boolean updStudent(int id , Student s);
    //查询所有学生
    List<Student> getStudents();
    //查询指定学生
    Student getStudent (int id);
}
