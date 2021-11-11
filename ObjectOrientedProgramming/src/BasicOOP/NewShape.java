package BasicOOP;

public abstract class NewShape {
	private String color;
	private int borderwith;

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the borderwith
	 */
	public int getBorderwith() {
		return borderwith;
	}

	/**
	 * @param borderwith the borderwith to set
	 */
	public void setBorderwith(int borderwith) {
		this.borderwith = borderwith;
	}

	public abstract void area();

}
