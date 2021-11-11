package BasicOOP;

public class Circle extends Shape {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void area() {
		double d = 3.14 * radius * radius;
		System.out.println(d);
	}

	public static void main(String[] args) {
		Circle s = new Circle();
		s.setBorderwidth(3);
		s.setColor("red");
		System.out.println(s.getColor());
		System.out.println(s.getBorderwidth());

		s.setRadius(5);
		s.area();

		System.out.println(s.radius);
		System.out.println();
	}

}
