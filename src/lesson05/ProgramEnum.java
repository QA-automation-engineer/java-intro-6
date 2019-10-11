package lesson05;

/**
 * Created by Vladimir Trandafilov on 07.10.2019.
 */
public class ProgramEnum {

	public static void main(String[] args) {

		for (Modifier modifier : Modifier.values()) {
			System.out.printf("Modifier #%d: %s%n", modifier.ordinal(), modifier);
		}

		printModifierCode(Modifier.DEFAULT);

		Modifier modifier = Modifier.valueOf("PUBLIC");
	}

	private static void printModifierCode(Modifier modifier) {
		System.out.printf("Modifier '%s' has code: %d%n", modifier, modifier.getModifierCode());
	}
}
