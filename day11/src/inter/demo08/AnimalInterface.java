package inter.demo08;

/**
 * @ClassName AnimalInterface
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月08日 10时35分04秒
 * @Version 1.0
 *
 * 动物行为的接口
 */
public interface AnimalInterface {
    //需要子类们进行重写
    void eat();

    //不需要子类们进行重写
    default void sleep () {
        System.out.println("睡觉觉");
    }
}
