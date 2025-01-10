import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature in Farenheit: ");
		double tempF = scan.nextDouble();
		double tempC = (tempF - 32) * 5/9;
		System.out.println("The temperature from Farenheit to Celcius is: " + tempC);
				
		System.out.println("Enter the temperature in Celsius: ");
		tempC = scan.nextDouble();
		tempF = (tempC * 9/5) + 32;
		System.out.println("The temperature from Celsius to Fahrenhit is: " + tempF);
	}


}