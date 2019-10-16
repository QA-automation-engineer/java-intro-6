package lesson08;

/**
 * Created by Vladimir Trandafilov on 16.10.2019.
 */
public class IPhone extends BaseCell {

	public IPhone(String model) {
		super(model);
	}

	@Override
	public void insertSimCard() {
		System.out.println("Nano Sim-card was inserted into " + getCellModel());
	}

	@Override
	public void call(String number) {
		System.out.printf("Cell '%s' has typed via touchscreen mob: '%s' and calling... %n", getCellModel(), number);
	}

	@Override
	public void acceptCall(String number) {
		System.out.printf("Cell '%s' has accept call from: '%s' via swipe up%n", getCellModel(), number);
	}

	@Override
	public void saveNumber(String number) {
		System.out.printf("Cell '%s' has typed via touchscreen mob: '%s' and saved it on Apple-Cloud%n", getCellModel(), number);
	}

	@Override
	public void block() {
		System.out.printf("Cell '%s' was blocked via holding of fingerprint on scanner%n", getCellModel());
	}

	@Override
	public void unblock() {
		System.out.printf("Cell '%s' was unblocked via holding of fingerprint on scanner%n", getCellModel());
	}

	@Override
	public String toString() {
		return "IPhone{} extends " + super.toString();
	}
}
