package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import circle.Circle;
import rectangle.Rectangle;
import triangle.Triangle;
import cylinder.Cylinder;

public class Solution {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the color");
		String color = bf.readLine();
		System.out.println("Enter filled or not");
		boolean filled = Boolean.parseBoolean(bf.readLine());
		System.out.println("1. AREA OF CIRCLE");
		System.out.println("2. AREA OF RECTANGLE");
		System.out.println("3. AREA OF TRIANGLE");
		System.out.println("4. AREA OF CYLINDER");
		int choice = Integer.parseInt(bf.readLine());
		switch(choice) {
		case 1:
			System.out.println("Enter the radius");
			double radius = Double.parseDouble(bf.readLine());
			Circle circle = new Circle(color,filled,radius);
			System.out.println("AREA:" + circle.area());
			break;
		case 2:
			System.out.println("Enter the length");
			double length = Double.parseDouble(bf.readLine());
			System.out.println("Enter the breadth");
			double breadth = Double.parseDouble(bf.readLine());
			Rectangle rectangle = new Rectangle(color,filled,breadth,length);
			System.out.println("AREA:" + rectangle.area());
			break;
		case 3:
			System.out.println("Enter the base");
			double base = Double.parseDouble(bf.readLine());
			System.out.println("Enter the height");
			double height = Double.parseDouble(bf.readLine());
			Triangle triangle = new Triangle(color,filled,height,base);
			System.out.println("AREA:" + triangle.area());
			break;
		case 4:
			System.out.println("Enter the radius");
			double radius1 = Double.parseDouble(bf.readLine());
			System.out.println("Enter the length");
			double height1 = Double.parseDouble(bf.readLine());
			Cylinder cylinder = new Cylinder(color,filled,radius1,height1);
			System.out.println("AREA:" + cylinder.area());
			break;
		}
	}
}
