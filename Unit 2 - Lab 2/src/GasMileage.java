import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the miles driven and gallons used: ");
		double miles = scan.nextDouble();
		double gallons = scan.nextDouble();
		double mpg = miles/gallons;
		System.out.println("The miles per gallon is " + mpg);
	}

}
