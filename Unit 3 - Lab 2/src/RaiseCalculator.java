import java.text.NumberFormat;
import java.util.Scanner;

public class RaiseCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println("Enter the current salary of an employee: ");
		double s = scan.nextDouble();
		System.out.println("Enter the preformance rate of an employee: ");
		int r = scan.nextInt();
		if (r==1) 
			System.out.println("The employee will get a raise of 1% which is " + money.format(s- s*.01 )+ " and go from " + money.format(s) + " to " + money.format(s*1.01) + "." );
		else if (r==2)
			System.out.println("The employee will get a raise of 3% which is " + money.format(s- s*.03)+ " and go from " + money.format(s) + " to " + money.format(s*1.03) + "." );
		else
			System.out.println("The employee will get a raise of 6% which is " + money.format(s -s*.06)+ " and go from " + money.format(s) + " to " + money.format(s*1.06) + "." );
		
	}

}
