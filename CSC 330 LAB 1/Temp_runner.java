import java.util.Scanner;

public class Temp_runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fahrenheitTemp;
		
		
		//user prompt
		System.out.println("PLEASE INPUT TEMPERATURE IN FAHRENHEIT\n");
		Scanner input = new Scanner(System.in);
		
		//input from user
		fahrenheitTemp = input.nextDouble();
		
		
		Temperature temp = new Temperature(fahrenheitTemp);
		
		
		//Printing outputs
		System.out.println("Your temperature in Fahrenheit is: "+ temp.getFahrenheit()+"\n");
		System.out.println("Your temperature in Celsius is: "+ temp.getCelsius()+"\n");
		System.out.println("Your temperature in Kelvin is: "+ temp.getKelvin()+"\n");
	}

}
