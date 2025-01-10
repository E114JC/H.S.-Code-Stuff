import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double num = scan.nextDouble();
		if (num == 0)
			System.out.println("number is zero");
		else if (num %2 == 0)
			System.out.println("numbner is even");
		else 
			System.out.println("number is odd");
		// else if (num > 0)
			//System.out.println("number is positive");
		//else 
			//System.out.println("number is odd");
			
	
	}

}
