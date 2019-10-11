package lesson06.a_inheritance;

/**
 * Created by Vladimir Trandafilov on 09.10.2019.
 */
public class Cat extends Animal {

	public Cat(String color, int height, int length, int weight) {
		super(color, height, length, weight);
	}

	@Override
	protected String getType() {
		return "Cat";
	}
}
