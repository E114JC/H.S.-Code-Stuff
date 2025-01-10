import java.util.Scanner;

public class AvgOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num1 = scan.nextInt();
		System.out.println("Enter an integer: ");
		int num2 = scan.nextInt();
		System.out.println("Enter an integer: ");
		int num3 = scan.nextInt();
		double avofno = (num1 + num2 +num3) / 3.0;
		System.out.println("The average of the numbers is: " + avofno);
	}

}
