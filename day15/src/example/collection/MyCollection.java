package example.collection;

import java.util.Collection;

/**
 * @ClassName MyCollection
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月14日 14时14分16秒
 * @Version 1.0
 */
public class MyCollection {
    public static <E> void method01 (Collection<E> coll) {

    }

    public static void method02 (Collection<?> coll) {

    }

    public static void method03 (Collection<? extends B> coll) {

    }

    public static void method04 (Collection<? super B> coll) {

    }

}
