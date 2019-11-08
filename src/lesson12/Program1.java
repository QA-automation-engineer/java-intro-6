package lesson12;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Vladimir Trandafilov on 01.11.2019.
 */
public class Program1 {

	public static void main(String[] args) {
		Phone phone1 = new Phone("iPhone X", "Apple", 20000);
		Phone phone2 = new Phone("G5s", "Moto", 8000);
		Phone phone3 = new Phone("Mi4", "Xiaomi", 4000);
		Phone phone4 = new Phone("iPhone XI", "Apple", 28000);

		System.out.println("---------------UNSORTED---------------");
		Stream.of(phone1, phone2, phone3, phone4)
				.forEach(p -> System.out.printf("%d hrn for %s %s%n", p.getPrice(), p.getCompany(), p.getName()));

		System.out.println("---------------SORTED via COMPARABLE---------------");
		Stream.of(phone1, phone2, phone3, phone4)
				.sorted()
				.forEach(p -> System.out.printf("%d hrn for %s %s%n", p.getPrice(), p.getCompany(), p.getName()));

		System.out.println("---------------SORTED via COMPARATOR---------------");
		Stream.of(phone1, phone2, phone3, phone4)
				.sorted(new PhonesComparator())
				.forEach(p -> System.out.printf("%d hrn for %s %s%n", p.getPrice(), p.getCompany(), p.getName()));

		System.out.println("---------------SORTED via LAMBDA---------------");
		Stream.of(phone1, phone2, phone3, phone4)
				.sorted((p1, p2) -> p1.getCompany().toUpperCase().compareTo(p2.getCompany().toUpperCase()))
				.forEach(p -> System.out.printf("%d hrn for %s %s%n", p.getPrice(), p.getCompany(), p.getName()));
	}
}
