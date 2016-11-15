package org;
import opt.Point;
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
		System.out.println("1.Distance from (0,0)");
		System.out.println("2.Distance from (x)");	
		System.out.println("3.Distance from (x,y)");
		int choice = Integer.parseInt(bf.readLine());
		Point point = new Point();
		switch(choice) {
			case 1:
				point = new Point(x,y);
				point.setXY(x,y);
				System.out.println("DISTANCE IS " + point.distance());
				break;
			case 2:
				point = new Point(x);
				point.setXY(x,x);
				System.out.println("Enter the value of x");
				int axis = Integer.parseInt(bf.readLine());
				System.out.println("DISTANCE IS " + point.distance(axis));
				break;
			case 3:
				point = new Point(x,y);
				point.setXY(x,y);
				System.out.println("Enter the point");
				int x1 = Integer.parseInt(bf.readLine());
				int y1 = Integer.parseInt(bf.readLine());
				System.out.println("DISTANCE IS " + point.distance(x1,y1));
				break;
		} 
		System.out.println(point);
	}
}
