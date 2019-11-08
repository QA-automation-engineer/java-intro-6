package lesson09.cellable_person_with_generics;

/**
 * Created by Vladimir Trandafilov on 16.10.2019.
 */
public interface Cell extends Ringable, Blockable {

	void insertSimCard();

	void saveNumber(String number);

	String getCellModel();
}
