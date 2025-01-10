import java.util.Scanner;

public class LoanInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an amount of money: ");
		double p =scan.nextDouble();
		System.out.println("Enter annual interest rate: ");
		double r = scan.nextDouble();
		 r =r/12;
		System.out.println("Enter time to pay back the loan: ");
		double n = scan.nextDouble();
		n=n*12;
		double M = (p*r*(Math.pow(1+r, n)))/(Math.pow(1+r, n)-1);
		double roundOff = Math.round(M* 100.0) / 100.0;
		System.out.println("The monthly payment is " + roundOff);
		
		double a =p;
		for(int i=1;i<=12;i++) {
			a =a*(1+r)-roundOff;
		}
		a = Math.round(a* 100.0) / 100.0;
		System.out.println("You still owe " + a + " after 1 year");
		
		
		for(int i=1;i<=60;i++) {
			a =a*(1+r)-roundOff;
		}
		a = Math.round(a* 100.0) / 100.0;
		System.out.println("You still owe " + a + " after 5 years");
	}

}
