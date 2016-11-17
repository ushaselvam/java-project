package rectangle;

import shape.Shape;

public class Rectangle extends Shape {
	private double breadth;
	private double length;
	public Rectangle() {
		super();
		this.breadth = 0.0;
		this.length = 0.0;
	}
	public Rectangle(double breadth, double length) {
		super();
		this.breadth = breadth;
		this.length = length;
	}
	public Rectangle(String color, boolean filled, double breadth, double length) {
		super(color, filled);
		this.breadth = breadth;
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double area() {
		return this.length * this.breadth;
	}
	

}
