package lesson03;

/**
 * Created by Vladimir Trandafilov on 27.09.2019.
 */
public class Person {

	String firstName;
	String secondName;
	int age;
	private static int count = 0;

	public Person(final String firstName, String secondName, final int age) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	public Person(String firstName, String secondName) {
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public void doSmth() {
		System.out.printf("%s %s does something...%n", firstName, secondName);
	}

	public static int getCount() {
		return count;
	}

	static {
		System.out.println("First class loading...");
	}

	{
		System.out.println("Class has: " + ++count + " instances");
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Person person = (Person) o;

		if (age != person.age)
			return false;
		if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null)
			return false;
		return secondName != null ? secondName.equals(person.secondName) : person.secondName == null;
	}

	@Override
	public int hashCode() {
		int result = firstName != null ? firstName.hashCode() : 0;
		result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
		result = 31 * result + age;
		return result;
	}

	public static void main(String[] args) {
		final Person p1 = new Person("Roman", "Korotkov", 30);
		Person p2 = new Person("Tetiana", "Sheludenkova");
		Person p3 = new Person("Roman", "Korotkov", 30);
		Person p4 = p1;
//		p1 = p2; doesn't work
		final int sd = 134123;
//		sd = 347476;

		p1.doSmth();
		p2.doSmth();

		System.out.println(Person.getCount());

		System.out.printf("p1 == p3 : %s %n", p1 == p3);
		System.out.printf("p1.equals(p3) : %s %n", p1.equals(p3));
		System.out.printf("p1 == p4 : %s %n", p1 == p4);
		System.out.printf("p1.equals(p4) : %s %n", p1.equals(p4));
	}
}
