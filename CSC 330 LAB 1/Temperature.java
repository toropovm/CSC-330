//This is our class to represent temperature and conversion
public class Temperature {
	private double ftemp;
	
	//constructor
	public Temperature(double temp) {
		ftemp = temp;
	}
	
	//methods
	
	public void setFahrenheit(double temp) {
		ftemp = temp;
	}
	
	public double getFahrenheit() {
		return  ftemp;
	}
	
	public double getCelsius(){
		return ((5.0/9.0)*(ftemp-32.0));
	}
	
	public double getKelvin() {
		double celsius = getCelsius();
		return  (celsius + 273.0);
	}
}
