package lesson07.b_interface_second_usage;

import lesson07.b_interface_second_usage.defence.Defensible;

/**
 * Created by Vladimir Trandafilov on 09.10.2019.
 */
public abstract class Animal {

	protected String alias;
	protected String color;
	protected int height;
	protected int length;
	protected int weight;
	private Defensible defensible;

	protected Animal() {

	};

	protected Animal(String color, int height, int length, int weight) {
		this(null, color, height, length, weight);
	}

	protected Animal(String alias, String color, int height, int length, int weight) {
		this.alias = alias;
		this.color = color;
		this.height = height;
		this.length = length;
		this.weight = weight;
	}

	public void run(Speed speed) {
		System.out.printf("%s is running with %s km/h%n", getType(), speed.getSpeed());
	}
	public void sleep() {
		System.out.printf("%s is sleeping%n", getType());
	}
	public void eat(String food) {
		System.out.printf("%s is eating %s%n", getType(), food);
	}

	protected abstract String getType();

	public String getColor() {
		return color;
	}

	public int getHeight() {
		return height;
	}

	public Animal setHeight(int height) {
		this.height = height;
		return this;
	}

	public int getLength() {
		return length;
	}

	public Animal setLength(int length) {
		this.length = length;
		return this;
	}

	public int getWeight() {
		return weight;
	}

	public Animal setWeight(int weight) {
		this.weight = weight;
		return this;
	}

	public String getAlias() {
		return alias;
	}

	public Animal setAlias(String alias) {
		this.alias = alias;
		return this;
	}

	public Animal setColor(String color) {
		this.color = color;
		return this;
	}

	public void setDefensible(Defensible defensible) {
		this.defensible = defensible;
	}

	public void defence() {
		defensible.defence();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Animal animal = (Animal) o;

		if (height != animal.height)
			return false;
		if (length != animal.length)
			return false;
		if (weight != animal.weight)
			return false;
		if (alias != null ? !alias.equals(animal.alias) : animal.alias != null)
			return false;
		return color != null ? color.equals(animal.color) : animal.color == null;
	}

	@Override
	public int hashCode() {
		int result = alias != null ? alias.hashCode() : 0;
		result = 31 * result + (color != null ? color.hashCode() : 0);
		result = 31 * result + height;
		result = 31 * result + length;
		result = 31 * result + weight;
		return result;
	}

	@Override
	public String toString() {
		return "Animal{" + "alias='" + alias + '\'' + ", color='" + color + '\'' + ", height=" + height + ", length="
				+ length + ", weight=" + weight + '}';
	}
}
