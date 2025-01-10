import java.util.Scanner;

public class SequencesandSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #1
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the common difference of an arithmetic sequence: ");
		double cd = scan.nextDouble();
		System.out.println("Enter the first term of an arithmetic sequence: ");
		double ft = scan.nextDouble();
		System.out.println("Enter the nth term: ");
		int n = scan.nextInt();
		double term = ft+ ((n-1)*cd);
		System.out.println("Term " + n + " is " + term);
		double sum = n*((ft+term)/2);
		System.out.println("The sum is " + sum);
		
		//#2
		System.out.println("Enter the common ration of a geometric sequence: ");
		double r = scan.nextDouble();
		System.out.println("Enter the first term of a geometric sequence: ");
		double a1 = scan.nextDouble();
		System.out.println("Enter the number of terms: ");
		int nterm = scan.nextInt();
		double an= a1*Math.pow(r, nterm-1);
		System.out.println("Term " + nterm + " is " + an);
		double s = (a1*(1-Math.pow(r, nterm)))/(1-r);
		System.out.println("The sum is " + s);
		
		//#3
		System.out.println("Enter the common ration of a geometric sequence: ");
		 r = scan.nextDouble();
		System.out.println("Enter the first term of a geometric sequence: ");
		 a1 = scan.nextDouble();
		if(Math.abs(r)>=1)
			System.out.println("The sum does not exist");
		else {
			double ss = a1/(1-r);
			System.out.println("The sum is " + ss);	
		}
			
			
		
	}

}
