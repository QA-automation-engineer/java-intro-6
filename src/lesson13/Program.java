package lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;

import javax.security.auth.Subject;

/**
 * Created by Vladimir Trandafilov on 04.11.2019.
 */
public class Program {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		Optional<Integer> optional1 = getMax(list);
		ifPresentOrElse(
				optional1,
				System.out::println,
				() -> System.out.println("Nothing was found")
		);

		list.add(1);
		list.add(3);
		list.add(3242);
		Optional<Integer> optional2 = getMax(list);
		ifPresentOrElse(
				optional2,
				System.out::println,
				() -> System.out.println("Nothing was found")
		);
		Random random = new Random();

		System.out.println(orElseGet(optional1, random::nextInt));
	}

	private static Optional<Integer> getMax(List<Integer> list) {
		return list.stream().max(Integer::compare);
	}

	static <T> void ifPresentOrElse(Optional<T> optional, Consumer<T> consumer, Runnable runnable) {
		if (optional.isPresent()) {
			consumer.accept(optional.get());
		} else {
			runnable.run();
		}
	}

	static <T> T orElseGet(Optional<T> o, Supplier<T> s) {
		if (o.isPresent()) {
			return o.get();
		} else {
			return s.get();
		}
	}
}
