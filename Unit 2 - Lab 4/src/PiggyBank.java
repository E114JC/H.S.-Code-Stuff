import java.text.NumberFormat;
import java.util.Scanner;

public class PiggyBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println("Enter the number of quarters: ");
		int qut = scan.nextInt();
		System.out.println("Enter the number of dimes: ");
		int dm =  scan.nextInt();
		System.out.println("Enter the number of nickles: ");
		int ni =  scan.nextInt();
		System.out.println("Enter the number of pennies: ");
		int p =  scan.nextInt();
		double dollars = (qut / 4.0) + (dm / 10.0) + (ni / 20.0) + (p / 100.0);
		System.out.println("The amount in dollars is: " + money.format(dollars));


	}

}
