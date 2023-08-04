package example.en.demo01;

/**
 * @ClassName Gender
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月09日 11时10分34秒
 * @Version 1.0
 */
public class Gender {
    private static Gender boy;
    private static Gender girl;

    private Gender () {}

    public static Gender getBoy() {

        if (boy == null) {
            boy = new Gender();
        }

        return boy;
    }

    public static Gender getGirl() {

        if (girl == null) {
            girl = new Gender();
        }

        return girl;
    }
}
