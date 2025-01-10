import java.util.Random;

public class RandomNumberPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		double potatoe = generator.nextDouble()*1;
		System.out.println(potatoe);
		if (potatoe < .25)
			System.out.println("Lucky you!");
		else if (potatoe >= .25 && potatoe <= .75)
			System.out.println("Good luck!");
		else
			System.out.println("Sorry!");
//		if (potatoe ==1)
//			System.out.println("We will watch option 1, A New Hope");
//		else if (potatoe == 2)
//			System.out.println("We will watch option 2, Lord of the Rings");
//		else if (potatoe == 3)
//			System.out.println("We will watch option 3, Mean Girls");
//		else if (potatoe == 4)
//			System.out.println("We will watch option 4, Legally Blond");
//		else
//			System.out.println("We will watch option 5, Weekend at Berney's");
//		
//		System.out.println(potatoe);
//		if (potatoe%3 ==0)
//			System.out.println("The number is divisible by 3");
//		else if (potatoe %5 ==0)
//			System.out.println("The number is divisible by 5");
//		else if (potatoe %5==0 && potatoe %3==0)
//			System.out.println("The number is divisible by both 3 and 5");
//		else 
//			System.out.println("The number is not divisible by 3 or 5");
//		
	}

}
