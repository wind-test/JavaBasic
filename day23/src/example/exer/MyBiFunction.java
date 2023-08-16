package example.exer;

@FunctionalInterface
public interface MyBiFunction<T, R> {

    public R op(T l1, T l2);

}
