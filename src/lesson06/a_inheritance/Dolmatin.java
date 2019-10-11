package lesson06.a_inheritance;

/**
 * Created by Vladimir Trandafilov on 09.10.2019.
 */
public class Dolmatin extends Animal {

	public Dolmatin(String color, int height, int length, int weight) {
		super(color, height, length, weight);
	}

	@Override
	protected String getType() {
		return this.getClass().getSimpleName();
	}
}
