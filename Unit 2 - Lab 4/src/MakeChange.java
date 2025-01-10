import java.text.NumberFormat;
import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an amount of money: ");
		NumberFormat money = NumberFormat.getCurrencyInstance();
		double amount = scan.nextDouble();
		int dollars = (int) amount; 
		int tenbill = dollars / 10; 
		int tf = dollars %10;
		int fivebil = tf /5;
		int onebill =  tf;
		int cents =  (int) ((amount - dollars)*100);
		int c = cents ;
		
		int quart = c / 25;
		int cf = c % 25;
		int dimes = cf / 10;
		cf = cf%10;
		int nickles = cf / 5;
		cf = cf%5;
		int pennies = cf;
		System.out.println("The amount of money is " + tenbill + " ten dollar bills, " 
		+ fivebil + " five dollar bills, "
		+ onebill +" one dollar bills, " + quart + " quarters, " + dimes + " dimes, " + nickles + " nickles, and " + pennies + " pennies");
		
		
		

	}

}
