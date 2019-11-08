package lesson09.cellable_person_with_generics;

/**
 * Created by Vladimir Trandafilov on 16.10.2019.
 */
public class Program {

	public static void main(String[] args) {
		Human<OldCell> oldMan = new Human("Vova", "Trandafilov", 65);
		Human<IPhone> teenager = new Human("Vika", "Mogilnaja", 38);
		IPhone iPhone = new IPhone("iPhone XI");
		OldCell nokia = new OldCell("Nokia 3310");

		oldMan.takeCell(nokia);
		oldMan.insertSimCard();
		oldMan.unblock();
		oldMan.saveNumber("+380503473586");
		oldMan.call("+380503473586");
		oldMan.acceptCall("+380637887898");
		oldMan.block();

		System.out.print("\n");
		teenager.takeCell(iPhone, 566);
		teenager.insertSimCard();
		teenager.unblock();
		teenager.saveNumber("+380503473586");
		teenager.call("+380503473586");
		teenager.acceptCall("+380637887898");
		teenager.block();

		System.out.print("\n");
//		oldMan.takeCell(iPhone);
		oldMan.insertSimCard();
		oldMan.unblock();
		oldMan.saveNumber("+380503473586");
		oldMan.call("+380503473586");
		oldMan.acceptCall("+380637887898");
		oldMan.block();
	}
}
