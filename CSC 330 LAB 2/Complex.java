//Complex number manipulation class

public class Complex {
	
	//private data members
	private double real;
	private double imag;
	
	//constructors
	
	//default
	public Complex() {}
	
	//initializing 
	public Complex(double real, double imag) {
		this.real = real;
		this.imag = imag;	
	}
	
	
	//accessor methods
	public double getReal() {
		return real;
	}
	
	public double getImag() {
		return imag;
	}
	
	//mutator methods
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public void setImag(double imag) {
		this.imag = imag;
	}
	
	//****************************************************************
	//complex number manipulation
	//****************************************************************
	
	//function for addition of complex numbers
	public void addComplex(Complex  numSet2) {
		setReal(getReal() + numSet2.getReal());
		setImag(getImag() + numSet2.getImag());
		
		
		//print function call
		print("addition");
	}
	
	//function for subtraction of complex numbers
	public void subtractComplex(Complex  numSet2) {
		setReal(getReal() - numSet2.getReal());
		setImag(getImag() - numSet2.getImag());
		
		
		//print function call
		print("subtraction");
	}
	
	//function for multiplication of complex numbers
	public void multiplyComplex(Complex  numSet2) {
		//temp variables to hold the soon to be overwritten getReal()/getImag()
		double temp1 = getReal();
		double temp2 = getImag();
		
		//first
		setReal(getReal() * numSet2.getReal());
		
		//last
		setImag(getImag() * numSet2.getImag() * -1);
		
		//then set to real
		setReal(getReal() + getImag());
		
		//outer and inner then set to imag
		setImag((temp1 * numSet2.getImag()) + (temp2 * numSet2.getReal()));
		
		
		//print function call
		print("multiplication");
		
	}
	
	
	//*************************************************************
	//printing function
	//*************************************************************
	public void print(String printWhat) {
		
		if(printWhat == "addition") {
			System.out.println("Addition output : \n" + getReal() + " + " + getImag() + "i\n");
		}
		
		else if(printWhat == "subtraction") {
			System.out.println("Subtraction output : \n" + getReal() + " + " + getImag() + "i\n");
		}
		
		else if(printWhat == "multiplication") {
			System.out.println("Multiplication output : \n" + getReal() + " + " + getImag() + "i"  + "\n");
		}
		
		
	}
	
	
}
