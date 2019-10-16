package lesson08;

/**
 * Created by Vladimir Trandafilov on 16.10.2019.
 */
public class Program {

	public static void main(String[] args) {
		Human oldMan = new Human("Vova", "Trandafilov", 31);
		OldCell nokia = new OldCell("Nokia 3310");

		oldMan.takeCell(nokia);

		oldMan.insertSimCard();
		oldMan.call("+380503473585");
	}
}
