package example.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SutdentInterfaceImpl
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月14日 16时26分27秒
 * @Version 1.0
 */
public class SutdentInterfaceImpl implements StudentInterface {
    //声明存储学生对象的集合
    private List<Student> list = new ArrayList<>();

    @Override
    public boolean addStudent(Student s) {
        //针对待添加学生对象进行非空校验
        if (s == null) {
            return false;
        }

        //添加学生到集合中
        list.add(s);
        return true;
    }

    @Override
    public boolean delStudent(int id) {
        /*//遍历学生集合
        for (int i = 0; i < list.size(); i++) {
            //获取当前遍历学生的学号
            int sid = list.get(i).getId();
            if (sid == id) {
                list.remove(i);
                return true;
            }
        }*/

        //获取待删除学生索引
        int index = getIndex(id);

        //针对索引进行健壮性判断
        if (index == -1) {
            return false;
        } else {
            list.remove(index);
            return true;
        }
    }

    @Override
    public boolean updStudent(int id, Student s) {
        //针对新学生对象进行非空校验
        if (s == null) {
            return false;
        }

        int index = getIndex(id);

        //针对索引进行健壮性判断
        if (index == -1) {
            return false;
        } else {
            list.set(index,s);
            return true;
        }
    }

    private int getIndex(int id) {
        int index = -1;

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //获取当前遍历学生的学号
            int sid = list.get(i).getId();

            if (sid == id) {
                index = i;
                break;
            }
        }

        return index;
    }

    @Override
    public List<Student> getStudents() {
        return list;
    }

    @Override
    public Student getStudent(int id) {

        //根据id获取查询学生索引
        int index = getIndex(id);

        //针对索引进行健壮性判断
        if (index == -1) {
            return null;
        } else {
            return list.get(index);
        }
    }
}
