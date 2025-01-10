import java.util.Scanner;

public class StringperLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String q = scan.nextLine();
		int loq = q.length();
		int c = 0;
	for(int i=0; i<loq; i++) {
			if(q.charAt(i)=='e')
			c++;
		}
				
		System.out.println("There were " + c + " e's in the string");

}
}

  
