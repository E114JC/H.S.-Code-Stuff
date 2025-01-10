import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double numb = scan.nextDouble();
		if (numb <0)
			System.out.println("The square root is " +Math.sqrt(numb*-1));
		else
			System.out.println("The square root is " + Math.sqrt(numb) );
	}

}
