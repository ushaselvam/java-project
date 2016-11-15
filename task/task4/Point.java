package opt;
public class Point {
	int x;
	int y;
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	public Point() {
		x = 0;
		y = 0;
	}
	public Point(int axis) {
		this.x = axis;
		this.y = axis;
	}
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
  	public void setXY(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public double distance() {
		return Math.sqrt((x*x)+(y*y));
	}
	public double distance(int axis) {
		int distance = ((x - axis) * (x - axis)) + ((y - axis) * (y - axis));
		return Math.sqrt(distance);
	}
	public double distance(int x1,int y1) {
		int distance = ((x1 - x) * (x1 - x)) + ((y1 - y) * (y1 - y));
		return Math.sqrt(distance);
	}
}
