package BasicOOP;

public class ShapeTest {
	public static void main(String[] args) {

		Shape s = new Shape();
		s.setColor("red");
		s.setBorderwidth(5);
		System.out.println(s.getColor());
		System.out.println(s.getBorderwidth());

		/*
		 * Shape s=new Shape("red"); Shape ss=new Shape(5);
		 * 
		 * System.out.println(s.getColor()); System.out.println(ss.getBorderwidth());
		 */
	}
}
