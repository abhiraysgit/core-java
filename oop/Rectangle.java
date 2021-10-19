package BasicOOP;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double area() {
		return length * width;
	}

	public static void main(String[] args) {
		Rectangle s = new Rectangle();
		s.setBorderwidth(7);
		s.setColor("Green");

		s.setLength(5);
		s.setWidth(6);
		System.out.println(s.getLength());
		System.out.println(s.getWidth());
		System.out.println(s.area());
		System.out.println(s.getColor());
		System.out.println(s.getBorderwidth());
		
	}

}
