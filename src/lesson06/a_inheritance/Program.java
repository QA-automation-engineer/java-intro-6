package lesson06.a_inheritance;

/**
 * Created by Vladimir Trandafilov on 09.10.2019.
 */
public class Program {

	public static void main(String[] args) {
		Cat cat = new Cat("grey", 25, 45, 3);
		Dolmatin dolmatin = new Dolmatin("black", 50, 100, 16);

		dolmatin.run(Speed.FAST);
		cat.run(Speed.SLOW);
		dolmatin.eat("meat");
		cat.eat("milk");
		dolmatin.sleep();
		cat.sleep();
	}
}
