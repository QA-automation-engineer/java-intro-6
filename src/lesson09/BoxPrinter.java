package lesson09;

import lesson08.BaseCell;
import lesson08.IPhone;
import lesson08.OldCell;

/**
 * Created by Vladimir Trandafilov on 21.10.2019.
 */
public class BoxPrinter<T> {

	private T value;

	public BoxPrinter(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "BoxPrinter{" + "value=" + value + '}';
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public static <K> K getMiddle(K... args) {
		return args[args.length / 2];
	}

	public static <K extends BaseCell> K getMiddleCell(K... args) {
		return args[args.length / 2];
	}

	public static void main(String[] args) {
		BoxPrinter<Integer> boxPrinter1 = new BoxPrinter<>(56);
		System.out.println("value1 = " + boxPrinter1.getValue());
		System.out.println(boxPrinter1);

		BoxPrinter<String> boxPrinter2 = new BoxPrinter<>("Hello world!");
		System.out.println("value2 = " + boxPrinter2.getValue());
		System.out.println(boxPrinter2);

//		boxPrinter1 = boxPrinter2; incompatible types

		String mid1 = getMiddle("Hello", "World", "!");
		int mid2 = getMiddle(5, 6, 7);

//		String mid3 = getMiddle(5, 6, 7); incompatible types

		System.out.println("mid1 = " + mid1);
		System.out.println("mid2 = " + mid2);

		System.out.println(getMiddleCell(new IPhone("5s"), new OldCell("Nokia 3210"), new IPhone("10s")));
	}
}
