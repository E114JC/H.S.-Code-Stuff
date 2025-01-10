import java.util.Scanner;

public class Read10Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double max = 0;
		double min = 0;
		double s = 0;
		for(double i =0; i<10; i++) {
			System.out.println("Enter a number: ");
			s=scan.nextDouble();
			if ( s>=max)
				max =s;
			else if ( s<=min)
				min=s;
		}
		System.out.println("The maximum number is " + max + ", and the minimum number is " + min);
	}

}
