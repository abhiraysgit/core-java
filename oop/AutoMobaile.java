package BasicOOP;

public class AutoMobaile {
	private String color = null;
	private String make = null;
	private int speed = 00;

	public AutoMobaile(String color, String make, int speed) {
		this.color = color;
		this.make = make;
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	/*
	 * public void setColor(String color) { this.color = color; }
	 */

	public String getMake() {
		return make;
	}

	/*
	 * public void setMake(String make) { this.make = make; }
	 */

	public int getSpeed() {
		return speed;
	}

	/*
	 * public void setSpeed(int speed) { this.speed = speed; }
	 */
}
