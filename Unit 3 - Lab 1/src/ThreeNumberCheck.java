import java.util.Scanner;

public class ThreeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter a number: ");
		int num2 = scan.nextInt();
		System.out.println("Enter a number: ");
		int num3 = scan.nextInt();
		if (num1 == num2 && num1 == num3 )
			System.out.println("1 unique value ");
		else if (num2 ==num1 || num2 ==num3 || num1 ==num3 )
			System.out.println("2 unique values " );
		else 
			System.out.println("3 unique values");
			
			
	}

}
