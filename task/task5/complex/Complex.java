package num.cmx;
public class Complex {
	int real;
	int imaginary;
	public Complex() {
		real = 0;
		imaginary = 0;
	}
	public Complex(int real,int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	public void set(int real,int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	public String toString() {
		return this.real + "+" + this.imaginary + "j";
	}
	public Complex add(int real,int imaginary) {
		Complex output;
		int real1 = this.real + real;
		int imaginary1 = this.imaginary + imaginary;
		output = new Complex(real1,imaginary1);
		return output;
	}
	public Complex subtract(int real,int imaginary) {
		Complex output;
		int real1 = this.real - real;
		int imaginary1 = this.imaginary - imaginary;
		output = new Complex(real1,imaginary1);
		return output;
	}
	public Complex multiplyWith(int real,int imaginary) {
		Complex output;
		int real1 = this.real * real - this.imaginary * imaginary;
    	int imaginary1 = this.real * imaginary + this.imaginary * real;
    	output = new Complex(real1,imaginary1);
		return output;
	}
	public Complex dividedBy(int real,int imaginary) {
		Complex output;
		int real1 = this.real / real - this.imaginary / imaginary;
    	int imaginary1 = this.real / imaginary + this.imaginary / real;
		output = new Complex(real1,imaginary1);
		return output;
	}
	public Complex add(Complex another) {
		Complex output;
		real = this.real + another.real;
		imaginary = this.imaginary + another.imaginary;
		output = new Complex(real,imaginary);
		return output;
	}
	public Complex subtract(Complex another) {
		Complex output;
		int real1 = this.real - another.real;
		int imaginary1 = this.imaginary - another.imaginary;
		output = new Complex(real1,imaginary1);
		return output;
	}
	public Complex multiplyWith(Complex another) {
		Complex output;
		int real1 = this.real * another.real - this.imaginary * another.imaginary;
    	int imaginary1 = this.real * another.imaginary + this.imaginary * another.real;
    	output = new Complex(real1,imaginary1);
		return output;
	}
	public Complex dividedBy(Complex another) {
		Complex output;
		int real1 = this.real / another.real - this.imaginary / another.imaginary;
    	int imaginary1 = this.real / another.imaginary + this.imaginary / another.real;
		output = new Complex(real1,imaginary1);
		return output;
	}
	public boolean isReal() {
		if(real != 0)
			return true;
		else
			return false;
	}
	public boolean isImaginary() {
		if(imaginary != 0)
			return true;
		else
			return false;
	}
}
