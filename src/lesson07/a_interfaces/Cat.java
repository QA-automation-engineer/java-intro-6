package lesson07.a_interfaces;

/**
 * Created by Vladimir Trandafilov on 09.10.2019.
 */
public class Cat extends Animal implements Controlable{

	public Cat(String color, int height, int length, int weight) {
		super(color, height, length, weight);
	}

	public Cat(String alias, String color, int height, int length, int weight) {
		super(alias, color, height, length, weight);
	}

	@Override
	protected String getType() {
		return "Cat";
	}

	@Override
	public void putOnCollar() {
		System.out.println("Put on gum collar");
	}

	@Override
	public String getName() {
		return getAlias();
	}

	@Override
	public String toString() {
		return "Cat{} extends class " + super.toString();
	}
}
