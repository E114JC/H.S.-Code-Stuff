import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String word = scan.nextLine();
	for(int i=1; i<word.length(); i+=2) {
		System.out.println(word.charAt(i));
	}
	
}
}