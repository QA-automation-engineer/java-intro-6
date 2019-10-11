package lesson02;

/**
 * Created by Vladimir Trandafilov on 23.09.2019.
 */
public class MyFirstProgram {

	public static void main(String[] args) {
		byte by = 127;
		long l = 141l;
		by = (byte) l;
		System.out.println(by);

		float pi = (float) 3.14;

		System.out.println("" + 2 + 2); //"22"

		System.out.println(2 + 2 + ""); //"4"

		String a = "Privet";
		String b = "Privet";
		String c = new String("Privet");

		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(c.equals(a));
	}
}
