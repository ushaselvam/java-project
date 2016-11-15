package org;
import circle.Circle;
import rectangle.Rectangle;
import triangle.Triangle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution {
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Circle 2.Rectangle 3.Triangle");
		System.out.println("Enter Choice ");
		int choice = Integer.parseInt(bf.readLine());
		switch(choice) {
			case 1:
				System.out.println("CIRCLE--- Enter radius ");
				Circle circle = new Circle();
				circle.radius = Double.parseDouble(bf.readLine());
				circle.area();
				break;
			case 2:
				System.out.println("RECTAGLE--- Enter length and breadth");
				Rectangle rectangle = new Rectangle();
				rectangle.length = Double.parseDouble(bf.readLine());
				rectangle.breadth = Double.parseDouble(bf.readLine());
				rectangle.area();
				break;
			case 3:
				System.out.println("TRIANGLE--- Enter base and height ");
				Triangle triangle = new Triangle();
				triangle.base = Double.parseDouble(bf.readLine());
				triangle.height = Double.parseDouble(bf.readLine());
				triangle.area();
				break;
		}
	}
}
