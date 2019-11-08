package lesson14;

import java.lang.management.ThreadInfo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Vladimir Trandafilov on 08.11.2019.
 */
public class ThreadProgram {

	static ThreadLocal<Integer> threadId = new ThreadLocal<>();
	static ConcurrentHashMap<Long, String> var = new ConcurrentHashMap<>();

	public static void main(String[] args) {
		var.put(Thread.currentThread().getId(), "Thread-MAIN");

		Thread t1 = new Thread(() -> {
			var.put(Thread.currentThread().getId(), "Thread-1");
			System.out.println(var.get(Thread.currentThread().getId()));
		});
		Thread t2 = new Thread(() -> {
			var.put(Thread.currentThread().getId(), "Thread-2");
			System.out.println(var.get(Thread.currentThread().getId()));
		});
		Thread t3 = new Thread(() -> {
			var.put(Thread.currentThread().getId(), "Thread-3");
			System.out.println(var.get(Thread.currentThread().getId()));
		});

		t1.setPriority(10);
		t2.setPriority(1);
		t3.setPriority(5);

		t1.start();
		System.out.println(var.get(Thread.currentThread().getId()));
		t2.start();
		System.out.println(var.get(Thread.currentThread().getId()));
		t3.start();
		System.out.println(var.get(Thread.currentThread().getId()));

	}


}
