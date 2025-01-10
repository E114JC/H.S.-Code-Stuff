import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		 double n1 = scan.nextDouble();
		 System.out.println("Enter a number: ");
		 double n2 = scan.nextDouble();
		 System.out.println("Enter a number: ");
		 double n3 = scan.nextDouble();
		 System.out.println("Enter a number: ");
		 double n4 = scan.nextDouble();
		 System.out.println("Enter a number: ");
		 double n5 = scan.nextDouble();
		 if(n1-n2==n2-n3&&n3-n4==n4-n5||n1+n2==n2+n3&&n3+n4==n4+n5)
			 System.out.println("This sequence is an arithmetic. ");
		 else 
			 System.out.println("This sequence is not an arithmetic. ");
		 
	}

}
