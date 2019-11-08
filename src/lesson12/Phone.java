package lesson12;

/**
 * Created by Vladimir Trandafilov on 01.11.2019.
 */
public class Phone implements Comparable<Phone> {

	private String name;
	private String company;
	private int price;

	public Phone(String name, String comp, int price){
		this.name=name;
		this.company=comp;
		this.price = price;
	}

	public String getName() { return name; }
	public int getPrice() { return price; }
	public String getCompany() { return company; }

	@Override
	public int compareTo(Phone o) {
		return this.price - o.getPrice();
	}
}
