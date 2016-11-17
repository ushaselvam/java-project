package cylinder;

import circle.Circle;

public class Cylinder extends Circle {
	private double height;
	public Cylinder() {
		super();
		this.height = 0.0;
	}
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	public Cylinder(String color, boolean filled, double radius, double height) {
		super(color, filled, radius);
		this.height = height;
	}
	public Cylinder(double height) {
		super();
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double area() {
		return super.area() * this.height;
	}
}
