package lesson14;

/**
 * Created by Vladimir Trandafilov on 08.11.2019.
 */
public class ThreadTwo implements Runnable {
	@Override
	public void run() {
		System.out.println(ThreadTwo.class.getSimpleName() + " was started...");
	}
}
