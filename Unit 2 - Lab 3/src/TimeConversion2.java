import java.util.Scanner;

public class TimeConversion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of seconds: ");
		int sec = scan.nextInt();
		int hours = sec / 60/60;
		int min = ((sec / 60)  - (hours* 60));
		sec = (sec - (hours *60*60) - (min * 60));
		System.out.println("The number of hours is " + hours + ", the number of minutes is " + min + ", and the number of seconds is " + sec + ".");
	}

}
