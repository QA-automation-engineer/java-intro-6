package lesson11;

/**
 * Created by Vladimir Trandafilov on 28.10.2019.
 */
public class ExpHelper {

	public static boolean isEven(int i) {
		return i%2 == 0;
	}

	public static boolean isOdd(int i) {
		return !isEven(i);
	}
}
