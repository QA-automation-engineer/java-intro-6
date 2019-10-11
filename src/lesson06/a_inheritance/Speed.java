package lesson06.a_inheritance;

/**
 * Created by Vladimir Trandafilov on 09.10.2019.
 */
public enum Speed {
	SLOW(2),
	MEDIUM(5),
	FAST(20);

	private final int speed;

	Speed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}
}
