package num.dot;
public class Point {
	int x;
	int y;
	public String toString() {
		return "(" + x + "," +y + ")";
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
	public void setXY(Point another) {
		this.x = another.x;
		this.y = another.y;
	}
	public double distance() {
		return Math.sqrt((this.x*this.x)+(this.y*this.y));
	}
	public double distance(int axis) {
		int distance = ((this.x - axis) * (this.x - axis)) + ((this.y - axis) * (this.y - axis));
		return Math.sqrt(distance);
	}
	public double distance(int x,int y) {
		int distance = ((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y));
		return Math.sqrt(distance);
	}
	public double distance(Point another) {
		int distance = ((another.x - this.x) * (another.x - this.x)) + ((another.y - this.y) * (another.y - this.y)); 
		return Math.sqrt(distance);
	}
	public void print() {
		System.out.println("co-ordinates (" + x + "," + y + ")" );
	}
}
