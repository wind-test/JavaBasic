package inter.demo13;

/**
 * @ClassName SuperInterface
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 11时53分47秒
 * @Version 1.0
 */
public interface SuperInterface {
    default void method01 () {
        /*System.out.println("你好");
        System.out.println("我好");
        System.out.println("大家好");*/
        //method();
        System.out.println("苗苗老师好");
    }

    default void method02 () {
        /*System.out.println("你好");
        System.out.println("我好");
        System.out.println("大家好");*/
        //method();
        System.out.println("沙沙老师好");
    }

    /*private void method () {
        System.out.println("你好");
        System.out.println("我好");
        System.out.println("大家好");
    }*/
}
