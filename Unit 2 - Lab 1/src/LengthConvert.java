import java.util.Scanner;

public class LengthConvert {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length in inches : ");
		double lengthInches = scan.nextDouble();
		double lengthCentimeters = lengthInches * 2.54;
		System.out.println("The length from inches to centimeters is: " + lengthCentimeters);
		
		
		System.out.println("Enter the length in centimeters: ");
		lengthCentimeters = scan.nextDouble(); 
		lengthInches = lengthCentimeters / 2.54;
		System.out.println("The length from centimeters to inches is: " + lengthInches);

}

}