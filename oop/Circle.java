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
		double d= 3.14 * radius * radius;
		System.out.println(d);
	}

	public static void main(String[] args) {
		Shape s=new Circle();
		s.setBorderwidth(3);
		s.setColor("red");
		System.out.println(s.getColor());
		System.out.println(s.getBorderwidth());
	
		Circle c = new Circle();
		c.setRadius(5);
		c.area();
	
		System.out.println(c.radius);
		System.out.println();
	}

}
