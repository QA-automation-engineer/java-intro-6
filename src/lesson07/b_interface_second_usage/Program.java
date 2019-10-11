package lesson07.b_interface_second_usage;

import lesson07.b_interface_second_usage.defence.DefenceCat;
import lesson07.b_interface_second_usage.defence.DefenceDog;

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

//		Dolmatin dolmatin1 = new Dolmatin()
//				.setAlias("fsfsdfsdf")
//				.setColor("fsdfsdfsdfsdfsdf")
//				.setHeight(12);
		System.out.println("---------------------------------------------");
		cat.setDefensible(new DefenceCat());
		dolmatin.setDefensible(new DefenceDog());

		cat.defence();
		dolmatin.defence();

		cat.setDefensible( () -> System.out.println("TSHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH"));
		cat.defence();
	}
}
