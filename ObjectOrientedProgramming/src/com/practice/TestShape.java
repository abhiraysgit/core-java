package com.practice;

public class TestShape {

	public static void main(String[] args) {

		Shape[] shape1 = new Shape[2];
		shape1[0] = new Circle();
		shape1[1] = new Triangle();

		double y = shape1[0].area(15.12, 5);
		double d = shape1[1].area(15.12, 5);

		System.out.println(y + d);
	}

}
