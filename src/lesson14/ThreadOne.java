package lesson14;

/**
 * Created by Vladimir Trandafilov on 08.11.2019.
 */
public class ThreadOne implements Runnable {
	@Override
	public void run() {
		System.out.println(ThreadOne.class.getSimpleName() + " was started...");
	}
}
