package lesson04;

/**
 * Created by Vladimir Trandafilov on 04.10.2019.
 */
public class Program {

	public static void main(String[] args) {
		String d = "My string";
		String c = d;

		System.out.printf("String.replace() returns new String: %s %n", d.replace("string","program"));

		System.out.printf("d == c : %s%n", d == c); // was true
		d = "New string";
		System.out.printf("d == c : %s%n", d == c); // becomes false

		System.out.printf("String d = %s %n", d); // got new value "New string"
		System.out.printf("String c = %s %n", c); // still has old value "My string"

		int a = 1;
		int b = a;
		a = 2;
		System.out.printf("int a = %d %n", a); // got new value 2
		System.out.printf("int b = %d %n", b); // still has old value 1

		Math.abs(-125); // abs() method is static and we can use it just via Math.class without its instances
	}
}
