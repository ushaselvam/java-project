package triangle;

import shape.Shape;

public class Triangle extends Shape {
	private double height;
	private double base;
	private static final double HALF = 0.5;
	public Triangle() {
		super();
		this.height = 0.0;
		this.base = 0.0;
	}
	public Triangle(double height, double base) {
		super();
		this.height = height;
		this.base = base;
	}
	public Triangle(String color, boolean filled, double height, double base) {
		super(color, filled);
		this.height = height;
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public static double getHalf() {
		return HALF;
	}
	public double area() {
		return this.height * this.base * Triangle.HALF;
	}
}
