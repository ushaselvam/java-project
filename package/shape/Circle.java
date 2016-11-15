package shape;
public class Circle {
	double radius;
	static double pi;
	public static void setPI(double pi) {
		Circle.pi = pi;	
	}
	static {
		Circle.setPI(3.14);
	}
	public Circle() {
		this.radius=2.13;
		this.area();
	}
	public Circle(double radius) {
		this.radius = radius;
		this.area();
	}
	void area() {
		System.out.println(String.format("AREA OF CIRCLE IS : %.2f",(this.pi*this.radius*this.radius)));
	}
}
