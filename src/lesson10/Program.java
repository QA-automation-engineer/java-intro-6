package lesson10;

/**
 * Created by Vladimir Trandafilov on 23.10.2019.
 */
public class Program {

	public static void main(String[] args) {
		sleepWithTryCatch(3000);
	}

	private static void sleepWithTryCatch(long timeout) {
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void sleepWithRethrowing(long timeout) throws InterruptedException {
		Thread.sleep(timeout);
	}
}
