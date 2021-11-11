package com.practice;

public class Circle extends Shape {

	private int radius;
	private static double PI = 3.14;

	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * @return the pI
	 */
	public static double getPI() {
		return PI;
	}

	/**
	 * @param pI the pI to set
	 */
	public static void setPI(double pI) {
		PI = pI;
	}

	@Override
	public double area(double PI, int r) {
		System.out.println("area of circle --" + PI * r * r);
		return PI * r * r;
	}

	@Override
	public void area() {
		this.area(PI, radius);
	}

}
