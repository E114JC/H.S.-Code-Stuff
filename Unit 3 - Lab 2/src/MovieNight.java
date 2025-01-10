import java.util.Random;
import java.util.Scanner;

public class MovieNight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int num = generator.nextInt(10)+1;	
		System.out.println(num);
		String movie = "";
		switch (num) {
		case 1:
			System.out.println("Watch Legally Blonde");
			break;
		case 2: 
			System.out.println("Watch Mean Girls");
			break;
		case 3:
			System.out.println("Watch Weekend at Bernie's");
			break;
		case 4:
			System.out.println("Watch A New Hope");
			break;
		case 5:
			System.out.println("Watch The Empire Strikes Back");
			break;
		case 6:
			System.out.println("Watch Return of the Jedi");
			break;
		case 7:
			System.out.println("Watch The Phantom Menance");
			break; 
		case 8:
			System.out.println("Watch Attack of the Clones");
			break;
		case 9:
			System.out.println("Watch Revenge of the Sith");
			break;
		case 10:
			System.out.println("Watch Pulp Fiction");
		
		}
	}

}
