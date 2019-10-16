package lesson08;

/**
 * Created by Vladimir Trandafilov on 16.10.2019.
 */
public class Human {
	private String name;
	private String surname;
	private int age;
	private Cell cell;

	public Human(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void takeCell(Cell cell) {
		this.cell = cell;
	}

	public void insertSimCard() {
		cell.insertSimCard();
	}

	public void call(String number) {
		cell.call(number);
	}

	public void acceptCall(String number) {
		cell.acceptCall(number);
	}

	public void saveNumber(String number) {
		cell.saveNumber(number);
	}

	public void block() {
		cell.block();
	}

	public void unblock() {
		cell.unblock();
	}

	public String getCellModel() {
		return cell.getCellModel();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Human human = (Human) o;

		if (age != human.age)
			return false;
		if (name != null ? !name.equals(human.name) : human.name != null)
			return false;
		if (surname != null ? !surname.equals(human.surname) : human.surname != null)
			return false;
		return cell != null ? cell.equals(human.cell) : human.cell == null;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (surname != null ? surname.hashCode() : 0);
		result = 31 * result + age;
		result = 31 * result + (cell != null ? cell.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Human{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", age=" + age + ", cell=" + cell
				+ '}';
	}
}
