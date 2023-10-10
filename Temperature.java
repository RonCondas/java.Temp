
public class Temperature {
	
	private double ftemp; // Instance variable
	
	public Temperature(double t) // Temperature constructor that receive one parameter
	
	{
		
		this.ftemp = t;
	}
	
	//method that set the Farenheit temperature
	public void setFahrenheit(double t)
	
	{
		this.ftemp = t;
	}
	//method that get the Farenheit temperature
	public double getFahrenheit()
	{
		
		
		
		return ftemp;
	}
	//method that get the Celsius temperature
	public double calcCelsius() {
		
		double celsius = 0.0;
		celsius = (ftemp - 32.0) * (5.0/9.0) ;
		
		return celsius;
	}
	//method that get the Kelvin temperature
	public double calcKelvin() {
		
		
		double kelvin = 0.0;
		kelvin = ((ftemp-32.0) * (5.0/9.0))+273.0;
		
		return kelvin;
	}
	
	
}
