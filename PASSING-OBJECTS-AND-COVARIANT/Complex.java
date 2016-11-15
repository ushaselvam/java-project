package comp;
public class Complex {
	int real;
	int imaginary;
	public Complex(int real,int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	public String toString() {
		return this.real + "+" + this.imaginary + "j";
	}
	public Complex add(Complex another) {
		Complex output;
		real = this.real + real;
		imaginary = this.imaginary + imaginary;
		output = new Complex(real,imaginary);
		return output;
	}
} 
