/*Ronald Noriega-Valdeolla
 * ITSE 2371
 * 10/07/2023
 In this exercise, I wrote a class named Temperature that asks the user for a Fahrenheit temperature
 The program create an instance of the Temperature class, with the value entered by the user passed to the constructor.
  The program call the object's methods to display the temperature in Celsius and Kelvin.
 */

	import java.util.Scanner;
	public class TemperatureDemo {

	public static void main(String[] args) 
	
	{
		
		//1. variables
		double oldfahrenheit = 0.0;
		
		//2.Ask user to enter temperature
		System.out.println("Please enter temperature in Fahrenheit");
		
		
		//3.Store temperature
		double fahrenheit = stopper(oldfahrenheit);
		
		Temperature fixTemp = new Temperature(fahrenheit);
		
		//this are my objects
		double fahren = fixTemp.getFahrenheit(); // fahrenheit
		double cel = fixTemp.calcCelsius();//celsius
		double kel = fixTemp.calcKelvin();// kelvin
		
		// display
		display(fahren, cel, kel);
		
	}
			public static void display(double fahren, double cel, double kel) {
				
				System.out.printf("The temperature in Farenheit temperature is: %.2f", fahren);
				System.out.printf("\nThe temperature in Celcius is: %.2f", cel);
				System.out.printf("\nThe temperature in Kelvin is: %.2f", kel);
				
	}
	
	private static double stopper(double oldfahrenheit) {
		Scanner kb = new Scanner (System.in);
		
		//make sure the user use a proper number
		while(!kb.hasNextInt() || !kb.hasNextDouble() )
		{
			kb.next();
			System.out.println("Please use a number. Try Again!!!");
			
		}
		double f= kb.nextDouble();
		return f;
		
		
		
	}
}
