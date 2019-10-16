package lesson08;

/**
 * Created by Vladimir Trandafilov on 16.10.2019.
 */
public interface Cell {

	void insertSimCard();

	void call(String number);

	void acceptCall(String number);

	void saveNumber(String number);

	void block();

	void unblock();

	String getCellModel();
}
