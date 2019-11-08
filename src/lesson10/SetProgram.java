package lesson10;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vladimir Trandafilov on 25.10.2019.
 */
public class SetProgram {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("A");
		set.add("B");
		set.add("C");
		set.add("C");

		for (String obj : set) {
			System.out.println(obj);
		}
	}
}
