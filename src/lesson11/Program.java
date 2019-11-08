package lesson11;

/**
 * Created by Vladimir Trandafilov on 28.10.2019.
 */
public class Program {
	public static void main(String[] args) {
		int[] arr = {-5, -4, -3, -2, -1 , 0, 1, 2, 3, 4, 5};

		Expression<Integer> exp1 = i -> i>0;
		Expression<Integer> exp2 = ExpHelper::isEven;

		System.out.println( sum(arr, exp1) );
		System.out.println( sum(arr, exp2) );

		System.out.println( sum(arr, i -> i<0) );
		System.out.println( sum(arr, ExpHelper::isOdd) );
		System.out.println( sum(arr, i -> i>=3) );

	}

	private static int sum(int[] arr, Expression<Integer> exp) {
		int result = 0;

		for(int el : arr) {
			if (exp.isEqual(el)) {
				result += el;
			}
			//result += exp.isEqual(el) ? el : 0; // ternary operator
		}

		return result;
	}
}
