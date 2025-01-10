import java.util.Scanner;

public class QuadraticSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value for a: ");
		double a = scan.nextDouble();
		System.out.println("Enter a value for b: ");
		double b = scan.nextDouble();
		System.out.println("Enter a value for c: ");
		double c = scan.nextDouble();
		if ((b*b) - (4*a*c) <0 )
			System.out.println("No real solutions");
		else if ((b*b) - (4*a*c) >0 )
			System.out.println("The answer to the quadratic equation is " + (-1 *b +Math.sqrt(b*b -(4*a*c))) / (2*a) + " or " + (-1 *b -Math.sqrt(b*b -(4*a*c))) / (2*a) + ".");
		else 
			System.out.println("The answer to the quadratic equation is " + (-1 *b +Math.sqrt(b*b -(4*a*c))) / (2*a) + ".");
		
	}

}
