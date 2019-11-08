package lesson09.cellable_person_with_generics;

/**
 * Created by Vladimir Trandafilov on 16.10.2019.
 */
public class OldCell extends BaseCell {

	public OldCell(String model) {
		super(model);
	}

	@Override
	public void insertSimCard() {
		System.out.println("Standard Sim-card was inserted into " + getCellModel());
	}

	@Override
	public void call(String number) {
		System.out.printf("Cell '%s' has typed manually mob: '%s' and calling... %n", getCellModel(), number);
	}

	@Override
	public void acceptCall(String number) {
		System.out.printf("Cell '%s' has accept call from: '%s' via green button%n", getCellModel(), number);
	}

	@Override
	public void saveNumber(String number) {
		System.out.printf("Cell '%s' has typed manually mob: '%s' and saved it on SIM-card%n", getCellModel(), number);
	}

	@Override
	public void block() {
		System.out.printf("Cell '%s' was blocked via holding of button '*'%n", getCellModel());
	}

	@Override
	public void unblock() {
		System.out.printf("Cell '%s' was unblocked via holding of button '*'%n", getCellModel());
	}

	@Override
	public String toString() {
		return "OldCell{} extends " + super.toString();
	}
}
