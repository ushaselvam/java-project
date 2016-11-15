package main;
import comp.Complex;
public class Solution {
	public static void main(String args[]) {
		Complex cmp1 = new Complex(4,2);
		Complex cmp2 = new Complex(3,8);
		System.out.println(cmp1);
		System.out.println(cmp1);
		Complex cmp3 = cmp1.add(cmp2);
		System.out.println(cmp1);
	}
}
