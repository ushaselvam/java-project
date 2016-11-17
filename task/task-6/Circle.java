package circle;

import shape.Shape;

public class Circle extends Shape {
	private double radius;
	private static final double PI = 3.14; 
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}
	public Circle() {
		super();
		this.radius = 0.0;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public static double getPi() {
		return PI;
	}
	public double area() {
		return this.radius * this.radius * Circle.PI;
	}
}
