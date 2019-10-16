package lesson08;

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
		System.out.printf("Cell '%s' has typed mob: '%s' and calling... %n", getCellModel(), number);
	}

	@Override
	public void acceptCall(String number) {

	}

	@Override
	public void saveNumber(String number) {

	}

	@Override
	public void block() {

	}

	@Override
	public void unblock() {

	}
}
