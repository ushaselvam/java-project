package org;
import num.cmx.Complex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));	
		System.out.println("Enter the real part");
		int real = Integer.parseInt(bf.readLine());
		int imaginary = Integer.parseInt(bf.readLine());
		Complex complex = new Complex();
		complex = new Complex(real,imaginary);
		complex.set(real1,imaginary1);
		System.out.println("1.Add\t2.Subtract\t3.Multiply With\t4.Divide by");
		System.out.println("USING OBJECTS\n5.Add\t6.Subtract\t7.Multiply With\t8.Divide by");
		int choice = Integer.parseInt(bf.readLine());
		System.out.println("Enter the real part");
		int real1 = Integer.parseInt(bf.readLine());
System.out.println("Enter the imaginary part");
		int imaginary1 = Integer.parseInt(bf.readLine());
		switch(choice) {
			case 1:
			Complex cmp1 = complex.add(real1,imaginary1);
			System.out.println(cmp1);
			break;
			case 2:
			Complex cmp2 = complex.subtract(real1,imaginary1);
			System.out.println(cmp2);
			break;
			case 3:
			Complex cmp3 = complex.multiplyWith(real1,imaginary1);
			System.out.println(cmp3);
			break;
			case 4:
			Complex cmp4 = complex.dividedBy(real1,imaginary1);
			System.out.println(cmp4);
			break;
			case 5:
			Complex cmp5 = new Complex(real1,imaginary1);
			Complex cm5 = complex.add(cmp5);
			System.out.println(cm5);
			break;
			case 6:
			Complex cmp6 = new Complex(real1,imaginary1);
			Complex cm6 = complex.subtract(cmp6);
			System.out.println(cm6);
			break;
			case 7:
			Complex cmp7 = new Complex(real1,imaginary1);
			Complex cm7 = complex.multiplyWith(cmp7);
			System.out.println(cm7);
			break;
			case 8:
			Complex cmp8 = new Complex(real1,imaginary1);
			Complex cm8 = complex.dividedBy(cmp8);
			System.out.println(cm8);
			break;
}
	} 
}
