import java.util.Scanner;

public class DivisionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the dividend and divisor: ");
		int dividend = scan.nextInt();
		int divisor = scan.nextInt();
		double quotient = dividend / divisor;
		double remainder = dividend % divisor;
		System.out.println("The division problem is: " + dividend + " / " + divisor + " = " + quotient + " and the remainder is: " + remainder);
		
		
	}
}
