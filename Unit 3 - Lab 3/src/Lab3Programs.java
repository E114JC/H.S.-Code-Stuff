import java.text.NumberFormat;
import java.util.Scanner;

public class Lab3Programs {

	public static void main(String[] args) {
		
//		// TODO Auto-generated method stub
//		int count = 0;
//		while (count<8) {
//			System.out.println("MATES Class of 2025");
//			count++;
//	}

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter a string: ");
//		String s = scan.nextLine();
//		System.out.println("Please enter a number: ");
//		int num = scan.nextInt();
//		int base=0;
//		while(base<num) {
//			System.out.println(s);
//			base++;
//		}
		
//		Scanner scan = new Scanner(System.in);
////		System.out.println("Enter an odd number: ");
//		int odnum = 1;
//		while(odnum<=19 ) {
//			System.out.println(odnum);
//			odnum+=2;
//		}
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a positive number to continue or a negative number to quit: ");
//		int num = scan.nextInt();
//		int total = 0;
//		while (num>=0) {
//			System.out.println("Enter a positive number to continue or a negative number to quit: ");
//			num = scan.nextInt();
//			
//			total++;			
//		}
//		System.out.println("You continued " + total + " times");
//		System.out.println("You decided to quit. Goodbye.");
		
////		
//		Scanner scan = new Scanner(System.in);
//		int outstanding =0;
//		int satisfactory =0;
//		int unsatisfactory =0;
//		int total =0;
//		
//		while (total ==0) {
//			System.out.println("Please enter a test score (negative value to quit): ");
//			double score = scan.nextDouble();
//			if (score >=90)
//				outstanding++;
//			else if (score>=70 && score<=89)
//				satisfactory++;
//			else if (score >=0 &&score <=69)
//				unsatisfactory++;
//			else 
//				total++;
//		
//			
//		}
//		
//		System.out.println("Number of outstanding scores " + outstanding);
//		System.out.println("Number of satisfactory scores " + satisfactory );
//		System.out.println("Number of unsatisfactory scores " + unsatisfactory);
//	}
//	
//}
//		NumberFormat money = NumberFormat.getCurrencyInstance();
//		double m = 1000.00;
//		int total=4;
//		while(total<5) {
//			System.out.println("After year 1: " + money.format(m *1.02));
//			System.out.println("After year 2: " + money.format(m *1.02*1.02));
//			System.out.println("After year 3: " + money.format(m *1.02*1.02*1.02));
//			System.out.println("After year 4: " + money.format(m *1.02*1.02*1.02*1.02));
//			System.out.println("After year 5: " + money.format(m *1.02*1.02*1.02*1.02*1.02));
//			total+=1;
//		}
//		
//		
//		
//		
//	}
//}
//		
		
		Scanner scan = new Scanner(System.in);
		String yes="yes";
		double a;
		double b;
		double c;
		while (yes.equalsIgnoreCase("yes")) {
		System.out.println("Enter a value for a: ");
		a = scan.nextDouble();
		System.out.println("Enter a value for b: ");
		 b = scan.nextDouble();
		System.out.println("Enter a value for c: ");
		 c = scan.nextDouble();
		if ((b*b) - (4*a*c) <0 )
		System.out.println("No real solutions");
		else if ((b*b) - (4*a*c) >0 )
		System.out.println("The answer to the quadratic equation is " + (-1 *b +Math.sqrt(b*b -(4*a*c))) / (2*a) + " or " + (-1 *b -Math.sqrt(b*b -(4*a*c))) / (2*a) + ".");
		else 
		System.out.println("The answer to the quadratic equation is " + (-1 *b +Math.sqrt(b*b -(4*a*c))) / (2*a) + ".");
		System.out.println("Do you want to continue (yes/no) ?");
		yes = scan.nextLine();
		yes = scan.nextLine();
	}
	}
		
		
	}
