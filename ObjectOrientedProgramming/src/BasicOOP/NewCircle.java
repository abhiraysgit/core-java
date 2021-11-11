package BasicOOP;

public class NewCircle extends NewShape  {
	private double radius;

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void area() {
		double d = 3.14 * radius * radius;
		System.out.println(d);
	}

	public static void main(String[] args) {
		NewCircle c = new NewCircle();
		c.setRadius(7);
		c.area();
		c.setBorderwith(6);
		c.setColor("Green");
		System.out.println(c.getBorderwith());
		System.out.println(c.getColor());
	}

}
