package lesson05;

import java.util.Arrays;

/**
 * Created by Vladimir Trandafilov on 07.10.2019.
 */
public class Program {
	public static void main(String[] args) {
		int[] arr1 = {50, 40, 30, 20, 10};
		int[] arr2 = {100, 200, 300, 400, 500};
		int[] arr3 = arr1.clone();

		Arrays.equals(arr1, arr2);
		Arrays.sort(arr1);

		System.out.println(arr1);

		for (int el : arr1)
			System.out.println(el);

		for (int el : arr3)
			System.out.println(el);

	}
}
