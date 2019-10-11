package lesson05;

/**
 * Created by Vladimir Trandafilov on 07.10.2019.
 */
public enum Modifier {
	PUBLIC(25),
	DEFAULT(35),
	PROTECTED(45),
	PRIVATE(55, "Private");

	private final int modifierCode;
	private final String modifierName ;

	Modifier(int modifierCode) {
		this(modifierCode, "DEFAULT_NAME");
	}

	Modifier(int modifierCode, String modifierName) {
		this.modifierCode = modifierCode;
		this.modifierName = modifierName;
	}

	public int getModifierCode() {
		return modifierCode;
	}
}
