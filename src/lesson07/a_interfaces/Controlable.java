package lesson07.a_interfaces;

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