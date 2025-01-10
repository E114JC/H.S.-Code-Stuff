import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scan.nextLine();
		String reverse = "";
		for (int i = word.length()-1; i >=0; i--) {
			reverse +=word.charAt(i);
		}
		if(word.equals(reverse))
			System.out.println(word + " is a palindrome");
		else
			System.out.println(word + " is not a palindrome");
	}

}
