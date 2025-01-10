import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Lab5programms {

	public static void main(String[] args) {
			//one
//		for (int i =0; i<8; i++) {
//			System.out.println("MATES Class of 2025");
//		}
			//two
//		Scanner scan = new Scanner(System.in);
//		int sum =0;
//		for(int i =1; i<=5; i++) {
//			System.out.println("Enter a number: ");
//			int value = scan.nextInt();
//			sum=sum+i;	
//	}
//		System.out.println("The sum of all the numbers is " + sum);
		
			//three
//		for(int i=5; i<=100; i+=5) {
//		System.out.println(i);
//	}
//		
			//four
//		for(int i =1; i<=10; i+=2) {
//		System.out.println(i);
//	}
//		
			//five
//		Scanner scan = new Scanner(System.in);
//		int sum =0;
//		System.out.println("Enter a number: ");
//		int value = scan.nextInt();
//		for(int i =1; i<=value; i++) {
//			sum=sum+i;	
//		}	
//		System.out.println("The sum of the numbers up to the number put in is " + sum);
//		
			//six
//		Random generator = new Random();
//		int heads = 0, tails =0;
//		for(int i =0; i<1000; i++) {
//		int coin = generator.nextInt(2)+1;
//			if (coin==1) 
//				heads++;	
//			else 
//				tails++;
//		}		
//		System.out.println("The coin came up heads " + heads + " times, and tails " + tails + " times");
//		
			//seven
//		Random generator = new Random();
//		int heads = 0, tails =0;
//		int penny = 0;
//		int count =0, c=0; 
//		while (penny<=1000) {	
//			for(int i=0; i<10; i++) {
//				int coin = generator.nextInt(2)+1;
//				if (coin==1) 
//					heads++;	
//				else 
//					tails++;
//		}	
//		penny++;
//		if (heads ==7 && tails==3)
//				count++;
//		else 
//			c++;
//		heads =0;
//		tails=0;
//		}
//		System.out.println("The penny came up heads 7 times and tails 3 times " + count +  " times" );
//		
				//eight
		Random generator = new Random();
		DecimalFormat fmt = new DecimalFormat("0.##");
		int dice = 0;
		double count =0, c=0, ct=0, cc=0, co=0, cou=0, a=0, b=0, l=0, e=0, f=0, g=0, h=0, i=0, j=0; 
		while (dice<=4000) {	
			 int d = generator.nextInt(6)+1;
			 int di = generator.nextInt(6)+1;
		if (d==1&&di==1)
			count++;
		else if(di==1&&d==2||d==1&&di==2)
			e++;
		else if(d==2&&di==2 ||di==3&&d==1||d==3&&di==1)
			c++;
		else if(d==4&&di==1||di==4&&d==1||di==3&&d==2||d==3&&di==2)
			l++;
		else if (d==3&&di==3||d==4&&di==2||di==4&&d==2||di==1&&d==5||di==5&&d==1)
			ct++;
		else if(d==3&&di==4||di==3&&d==4||d==6&&di==1||di==6&&d==1||di==5&&d==2||di==2&&d==5)
			g++;
		else if (d==4&&di==4||di==5&&d==3||d==5&&di==3||di==6&&d==2||d==6&&di==2)
			cc++;
		else if(d==4&&di==5||di==4&&d==5||di==6&&d==3||d==6&&di==3)
			j++;
		else if(d==5&&di==5||d==4&&di==6||di==4&&d==6)
			co++;
		else if (d==6&&di==5||di==6&&d==5)
			a++;
		else 
			b++;
			
		}
		
		System.out.println("The sum was two " + count + " times, three " + e + " times, four " + c + " times, five " + l + " times, six " + co + " times, and twelve " + cou +" times.");
		System.out.println("The percentage for 2 is "  + fmt.format(percent) + "%, "  + fmt.format(p) + "% for 4, " + fmt.format(pp) + "% for 6, " + fmt.format(pt) + "% for 8, " + fmt.format(ppt) + "% for 10, and " + fmt.format(ptt) + "% for 12" );
		
		
		
		
}
}
