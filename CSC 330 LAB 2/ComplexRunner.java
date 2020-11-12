
//Runner file for complex number manipulator
public class ComplexRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creation of 2 objects
		Complex set1 = new Complex(7, 4);
		Complex set2 = new Complex(23, -12);
		
		//perform addition
		set1.addComplex(set2);
		
		
		//creation of 2 more objects
		Complex set3 = new Complex(7, 4);
		Complex set4 = new Complex(23, -12);
		
		//perform subtraction
		set3.subtractComplex(set4);
		
		
		//creation of 2 more objects
		Complex set5 = new Complex(7, 4);
		Complex set6 = new Complex(23, -12);
		
		//perform multiplication
		set5.multiplyComplex(set6);
		
		
	}

}