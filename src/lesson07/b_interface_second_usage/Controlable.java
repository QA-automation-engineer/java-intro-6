package lesson07.b_interface_second_usage;

/**
 * Created by Vladimir Trandafilov on 11.10.2019.
 */
public interface Controlable {

	void putOnCollar();

	default void walk() {
		System.out.println( getName() + " is walking...");
	}

	String getName();
}