package lesson07.a_interfaces;

/**
 * Created by Vladimir Trandafilov on 09.10.2019.
 */
public class Program {

	public static void main(String[] args) {
		Cat cat = new Cat("Barsik","grey", 25, 45, 3);
		Dolmatin dolmatin = new Dolmatin("Pesik","black", 50, 100, 16, 49);

		dolmatin.run(Speed.FAST);
		cat.run(Speed.SLOW);
		dolmatin.eat("meat");
		cat.eat("milk");
		dolmatin.sleep();
		cat.sleep();

		System.out.println(cat);
		System.out.println(dolmatin);

		cat.putOnCollar();
		cat.walk();
		dolmatin.putOnCollar();
		dolmatin.walk();
	}
}
