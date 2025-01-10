import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class ArrayListLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String quit= "quit";
		String s = "";
		ArrayList<String> n = new ArrayList<String>();
		//while loop to get all the names
		while(!s.equals(quit)) {
			System.out.println("Enter a name (type quit to quit): ");
			s=scan.nextLine();
			n.add(s);
			n.remove(quit);
		}
		//for-each loop that prints all the names out
		for(String name: n) {
				System.out.println(name);
			}
		//prints out size
		System.out.println("The size of the list is " + n.size());
		
		//random number generator/name picked
		Random generator = new Random();
		int winner = generator.nextInt(n.size())+1;
		System.out.println("The winner is " + n.get(winner));
		
		//Alphabetical Sort
		Collections.sort(n);
		System.out.println(n);
		
		
		
		
		
	}
}
