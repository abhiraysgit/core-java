package BasicOOP;

public class Triangle extends Shape {
	private int base;
	private int hight;

		/**
	 * @return the base
	 */
	public int getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(int base) {
		this.base = base;
	}

	/**
	 * @return the hight
	 */
	public int getHight() {
		return hight;
	}

	/**
	 * @param hight the hight to set
	 */
	public void setHight(int hight) {
		this.hight = hight;
	}
public double area() {
	return 0.5*base*hight;
}

		public static void main(String[] args) {
		Triangle t=new Triangle();
		t.setColor("Green");
		t.setBorderwidth(7);
		t.setBase(5);
		t.setHight(8);
		System.out.println(t.getBase());
		System.out.println(t.getHight());
		System.out.println(t.area());
		
		System.out.println(t.getBorderwidth());
		System.out.println(t.getColor());
		
	}

}
