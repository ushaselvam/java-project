import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Solution {

public static void main(String args[]) throws IOException {

BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the real part of complex number1");

int real1 = Integer.parseInt(bf.readLine());

System.out.println("Enter the imaginary part of complex number1");

int imaginary1 = Integer.parseInt(bf.readLine());

Complex complex = new Complex();

System.out.println("Enter the real part of complex number2");

complex.real2 = Integer.parseInt(bf.readLine());

System.out.println("Enter the imaginary part of complex number2");

complex.imaginary2 = Integer.parseInt(bf.readLine());

System.out.println("1.Show Complex number\n2.Add\t3.Subtract");

System.out.println("4.Multiplty with\t5.Divided by");

System.out.println("6.Is Real\t7.Is Imaginary");

int choice = Integer.parseInt(bf.readLine());

switch(choice) {

case 1:

complex.showComplexNumber(real1,imaginary1);

break;

case 2:

complex.add(real1,imaginary1);

break;

case 3:

complex.subtract(real1,imaginary1);

break;

case 4:

complex.multiplyWith(real1,imaginary1);

break;

case 5:

complex.dividedBy(real1,imaginary1);

break;

case 6:

System.out.println(complex.isReal());

break;

case 7:

System.out.println(complex.isImaginary());

break;

}

}

}
