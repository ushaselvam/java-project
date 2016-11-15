public class Complex {

int real,real2;

int imaginary,imaginary2;

void showComplexNumber(int real1,int imaginary1) {

if(imaginary1<0)

System.out.println("COMPLEX NUMBER1 " + real1 + "-i" + ((-1) * imaginary1));

else

System.out.println("COMPLEX NUMBER1 " + real1 + "+i" + imaginary1);

if(imaginary2<0)

System.out.println("COMPLEX NUMBER2 " + real2+"-i"+((-1) * imaginary2));

else

System.out.println("COMPLEX NUMBER2 " + real2 + "+i" + imaginary2);

}

void add(int real1,int imaginary1) {

System.out.print("ADITTION OF ");

real = real1 + real2;

imaginary = imaginary1 + imaginary2;

print();

}

void subtract(int real1,int imaginary1) {

System.out.print("SUBTRACTION OF ");

real = real1 - real2;

imaginary = imaginary1 - imaginary2;

print();

}

void multiplyWith(int real1,int imaginary1) {

System.out.print("MULTIPLICATION OF ");

real = (real1 * real2) - (imaginary1 * imaginary2);

imaginary = (real1 * imaginary2) + (real2 * imaginary1);

print();

}

boolean isReal() {

if(real2 !=0 )

return true;

else

return false;

}

boolean isImaginary() {

if(imaginary2 != 0)

return true;

else

return false;

}

void dividedBy(int real1,int imaginary1) {

System.out.print("MULTIPLICATION OF ");

real = (real1 * real2) - (imaginary1 * ((-1)*imaginary2));

imaginary = (real1 * ((-1)*imaginary2)) + (real2 * imaginary1);

int divide = (real2 * real2) + (imaginary2 * imaginary2);

if(imaginary<0)

System.out.println("COMPLEX NUMBER " + real + "-i" + ((-1) * imaginary) +

"/" + divide);

else

System.out.println("COMPLEX NUMBER " + real + "+i" + imaginary + "/" +

divide);

}

void print() {

if(imaginary<0)

System.out.println("COMPLEX NUMBER " + real + "-i" + ((-1) * imaginary));

else

System.out.println("COMPLEX NUMBER " + real + "+i" + imaginary);

}

}
