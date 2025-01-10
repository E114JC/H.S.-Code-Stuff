import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of hours, minutes, and seconds: ");
		int hours = scan.nextInt();
		int minutes = scan.nextInt();
		int seconds = scan.nextInt();
		int fulltime = ((hours * 60*60) + (minutes * 60) + seconds);  
		System.out.println("The amount of time in seconds is " + fulltime);
	}

}
