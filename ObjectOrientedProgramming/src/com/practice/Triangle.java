package com.practice;

public class Triangle extends Shape {

	@Override
	public void area() {

	}

	@Override
	public double area(double b, int h) {

		System.out.println("area of triangle --" + b * h * .5);
		return b * h * .5;
	}

}
