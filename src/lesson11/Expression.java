package lesson11;

/**
 * Created by Vladimir Trandafilov on 28.10.2019.
 */
@FunctionalInterface
public interface Expression<T> {

	boolean isEqual(T t);

}
