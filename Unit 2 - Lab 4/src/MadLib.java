import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter you name:");
		String name = scan.nextLine();		
		System.out.println("Enter your age: ");
		String age = scan.nextLine();
		System.out.println("Enter your school: ");
		
		String school = scan.nextLine();
		System.out.println("Enter your hometown: ");
		String hometown = scan.nextLine();
		System.out.println("Enter one of your hobbies: ");
		String hobbies = scan.nextLine();
		
		System.out.println("My name is " + name + " and I am " + age + " years old. I go to " + school + " and I live in " + hometown + ". "  + "My favorite thing to do is " + hobbies + ".");
	}

}
