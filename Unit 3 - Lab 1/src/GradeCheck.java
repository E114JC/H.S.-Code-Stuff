import java.util.Scanner;

public class GradeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your grade: ");
		double grade = scan.nextDouble();
		if (grade >= 90)
			System.out.println("You recived a A");
		else if (grade >=80 && grade < 90)
			System.out.println("You recived a B");
		else if (grade >= 70 && grade <80)
			 System.out.println("You recived a C");
		else if (grade >= 65 && grade<70)
			System.out.println("You recived a D");
		else 
			System.out.println("You recived a F");
	}

}
