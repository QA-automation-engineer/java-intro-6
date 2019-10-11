package lesson07.b_interface_second_usage;

/**
 * Created by Vladimir Trandafilov on 09.10.2019.
 */
public class Dolmatin extends Animal implements Controlable {

	private int spotsQuantity;

	public Dolmatin() {}

	public Dolmatin(String color, int height, int length, int weight) {
		super(color, height, length, weight);
	}

	public Dolmatin(String alias, String color, int height, int length, int weight) {
		super(alias, color, height, length, weight);
	}

	public Dolmatin(String alias, String color, int height, int length, int weight, int spotsQuantity) {
		super(alias, color, height, length, weight);
		this.spotsQuantity = spotsQuantity;
	}

	@Override
	protected String getType() {
		return this.getClass().getSimpleName();
	}

	@Override
	public String toString() {
		return "Dolmatin{" + "spotsQuantity=" + spotsQuantity + "} extends class " + super.toString();
	}

	@Override
	public void putOnCollar() {
		System.out.println("Put on metal collar");
	}

	@Override
	public String getName() {
		return getAlias();
	}
}
