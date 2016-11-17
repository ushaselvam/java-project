package org.opt;
import num.dot.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int x;
		int y;
		System.out.println("Enter the point");
		x = Integer.parseInt(bf.readLine());
		y = Integer.parseInt(bf.readLine());
		System.out.println("1.Modify using Object");
		System.out.println("2.Modify using arguements");
		System.out.println("3.Distance from (0,0)");
		System.out.println("4.Distance from (x)");	
		System.out.println("5.Distance from (x,y)");
		System.out.println("6.Distance from (another)\n7.Print");
		int choice = Integer.parseInt(bf.readLine());
		Point point = new Point();
		switch(choice) {
			case 1:
				point = new Point(x,y);
				point.setXY(x,y);
				break;
			case 2:
				point = new Point(x,y);
				point.setXY(point);
			case 3:
				point = new Point(x,y);
				point.setXY(x,y);
				System.out.println("DISTANCE IS " + point.distance());
				break;
			case 4:
				point = new Point(x);
				point.setXY(x,x);
				System.out.println("Enter the value of x");
				int axis = Integer.parseInt(bf.readLine());
				System.out.println("DISTANCE IS " + point.distance(axis));
				break;
			case 5:
				point = new Point(x,y);
				point.setXY(x,y);
				System.out.println("Enter the point");
				int x1 = Integer.parseInt(bf.readLine());
				int y1 = Integer.parseInt(bf.readLine());
				System.out.println("DISTANCE IS " + point.distance(x1,y1));
				break;
			case 6:
				point = new Point(x,y);
				point.setXY(point);
				System.out.println("Enter the point");
				int x2 = Integer.parseInt(bf.readLine());
				int y2 = Integer.parseInt(bf.readLine());
				Point point1 = new Point(x2,y2);
				System.out.println("DISTANCE IS " + point.distance(point1));
				break;
			case 7:
				point = new Point(x,y);
				point.print();
				break;
		} 
		System.out.println(point);
	}
}
