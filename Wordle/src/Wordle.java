import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Wordle {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		//load the words from the file
		File myFile = new File("longwordlist.csv");
		Scanner fileScan = new Scanner(myFile);
		String[] wordList = new String[3000];
		int count =0;

		while(fileScan.hasNext()) {
			wordList[count] = fileScan.nextLine();
			count++;
		}
		//System.out.println(Arrays.toString(wordList));

		//pick a random word
		String tryagain = "yes";
		while(tryagain.equalsIgnoreCase("yes")) {
			Random generator = new Random();

			int wordNumber = generator.nextInt(count);
			String secretWord = wordList[wordNumber];
			//System.out.println(secretWord);

			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to Wordle!");
			System.out.println("Please enter a 5 letter word");
			String s = scan.nextLine();
			String sColor = "";	
			boolean found =false;
			boolean right =false;
			int tries =0;

			while(!right) {
				if (s.length()!=secretWord.length()) {
					right =true;
					System.out.println("ERROR! This Word is Not 5 Letters");
					System.out.println("The word you were trying to guess was " + secretWord);
					System.out.println("Do you want to try again with a different word? yes / no" );
					tryagain = scan.nextLine();
					
				}
				if(s.equalsIgnoreCase(secretWord)) {
					right=true;
					System.out.println("You Win! =)>");
					System.out.println("Do you want to try again? yes / no" );
					tryagain = scan.nextLine();
				}
				else if(tries>=5&&!right) {
					right=true;
					System.out.println("You lose. =( The word was " + secretWord);
					System.out.println("Do you want to try again? yes / no" );
					tryagain = scan.nextLine();
				}
				for(int i =0; i<s.length(); i++) {

					if(s.charAt(i)== secretWord.charAt(i)) {

						sColor += "\u001b[1;32m" + s.charAt(i) + "\u001b[0m";
						found = true;
					}
					else if (!found&& s.charAt(i)==secretWord.charAt(0)||s.charAt(i)==secretWord.charAt(1)||s.charAt(i)==secretWord.charAt(2)||s.charAt(i)==secretWord.charAt(3)||s.charAt(i)==secretWord.charAt(4) ) {
						found=true;
						sColor += "\u001b[1;33m" + s.charAt(i) + "\u001b[0m";

					}

					else {
						found=false;
						sColor += s.charAt(i);


					}
					
					
				}
				System.out.println(sColor);
				sColor="";
				tries++;
				if (!right) {
					System.out.println("Please enter a 5 letter word");
					s = scan.nextLine();
					
				}
				
				
			}
		}

	}
}


//		//color code
//		System.out.println("Hello \u001b[1;31mred\u001b[0m world!");
//
//		System.out.println("Hello \u001b[1;32mgreen\u001b[0m world!");
//
//		System.out.println("Hello \u001b[1;33myellow\u001b[0m world!");
//
//		
//
//		String word = "rainbow";
//
//		String coloredWord = "";
//
//		coloredWord += "\u001b[1;30m" + word.charAt(0) + "\u001b[0m"; //black
//
//		coloredWord += "\u001b[1;31m" + word.charAt(1) + "\u001b[0m"; //red
//
//		coloredWord += "\u001b[1;32m" + word.charAt(2) + "\u001b[0m"; //green
//
//		coloredWord += "\u001b[1;33m" + word.charAt(3) + "\u001b[0m"; //yellow
//
//		coloredWord += "\u001b[1;34m" + word.charAt(4) + "\u001b[0m"; //blue
//
//		coloredWord += "\u001b[1;35m" + word.charAt(5) + "\u001b[0m"; //purple
//
//		coloredWord += "\u001b[1;36m" + word.charAt(6) + "\u001b[0m"; //light blue
//
//		
//
//		System.out.println(coloredWord);
//		
//		String practice = "school";
//		String practiceColor ="";
//		//change the color of c to green and first o to yellow
//		boolean found = false;
//		for(int i =0;i<practice.length();i++) {
//			if(practice.charAt(i)== 'c') {
//				practiceColor += "\u001b[1;32m" + practice.charAt(i) + "\u001b[0m";
//			}
//			else if (practice.charAt(i)=='o' &&!found) {
//				found = true;
//			practiceColor += "\u001b[1;33m" + practice.charAt(i) + "\u001b[0m";
//
//		}
//
//		else
//			practiceColor += practice.charAt(i);
//
//	}
//		
//		System.out.println(practiceColor);
//	}



