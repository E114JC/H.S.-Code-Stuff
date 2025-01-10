import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();;
		int comp =0;
		String word;
		String w;
		while(comp==0) {	
			int onetothree = generator.nextInt(3)+1;
			System.out.println("Make a choice:" + " \n1. Rock" +  "	\n2. Paper" + "	\n3. Scissors  ");
			int choice =scan.nextInt();
			if (choice == 1)
				word = "rock";
			else if (choice ==2)
				word = "paper";
			else 
				word = "scissors";
			if (onetothree == 1)
				w = "rock";
			else if (onetothree ==2)
				w= "paper";
			else 
				w = "scissors";
			if (choice ==1 && onetothree ==1 || choice ==2 && onetothree ==2 || choice == 3 && onetothree==3)
				System.out.println("You chose " + word + ", the computer chose " + w + "\nYou tie");
			else if (choice ==1 && onetothree==3 || choice==2 && onetothree==1 || choice ==3 && onetothree==2)
				System.out.println("You chose " + word + ", the computer chose " + w + " \nYou win");
			else if (choice ==1 && onetothree ==2 || choice ==2 && onetothree==3 || choice==3 &&onetothree == 1)
				System.out.println("You chose " + word + ", the computer chose " + w + " \nYou lose");
					System.out.println("Do you want to play again? \n 1. yes \n 2. no ");
						int yes =scan.nextInt();	
			if (yes==2)
				comp++;
	}
			
			System.out.println("Thanks for playing");
}
}