import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Unit2Examples {

	public static void main(String[] args) {
		// examples of using objects
//		System.out.println("hello world"); 
//		//System.out is the object for the console window
//		//println is the method
//		System.out.print("bees");
//		System.out.print("monkeys\n");
//	    //print is another method of the System.out object
//	       
//        String bees = "Afghanistan";
//        System.out.println(bees.charAt(3));
//        //object.method()
//        //Java starts counting at 0, not 1
//        System.out.println(bees.toUpperCase());
//       
//        //primitive types
//        //do not have methods
//        //Four just for integer values
//        byte b = 70;
//        //a byte = 1 byte, 1 bit is reserved for sign
//        //possible values between -128 and 127
//       
//        short s = 280;
//        //a short = 2 bytes, 1 bit reserved for sign
//        //possible values between -32,768 and 32,767
//       
//        int i = 25000;
//        //a int = 4 bytes, 1 bit reserved for sign
//        //possible values between -2,147,483,648 to 2,147,483,647
//       
//        long l = 4000000000l;
//        //a long = 8 bytes, 1 bit reserved for sign\
//        //must include the "l" at the end
//        //possible values between +/- 9000 trillion
//       
//        //2 primitive types for decimal values
//        float f = 84.5f;
//        //must include the "f" at the end
//       
//        double d = 84.5;
//        //8 bytes = 64 bits
//        //possible values between +/- 1.7x10^308, with 15 significant digits
//       
//        //characters
//        char letter = '#';
//       
//        //boolean - logical true/false
//        boolean isClassOver = true;
//        
//        //declaring a variable
//        int num0fStudents;
//        //assign a value
//        num0fStudents = 24; 
//        //change the value
//        num0fStudents = 25;
//        num0fStudents = num0fStudents + 1;//+, -, *, /
//        System.out.println(num0fStudents);
//        
//        int x = 7, y = 11;
//        System.out.println(y / x); // only the whole part of the division
//        System.out.println((double) y / x);
//
//        System.out.println(3.0 / 4);
//        
//        int heightInInches = 61;
//        double heightInfeet = heightInInches / 12.0;
//        System.out.println(heightInfeet);
//        
//        int num0fInches = 28;
//        double widthInfeet = num0fInches / 12.0;
//        System.out.println("Width in feet is: " + widthInfeet);
//        
//        heightInfeet = 5.5;
//        heightInInches = (int) (heightInfeet * 12); 
//        System.out.println(heightInInches);
        
//          Scanner scan = new Scanner(System.in);
//          System.out.println("Enter the radius of a circle: ");
//          double radius = scan.nextDouble();
//          double area = 3.14159 * radius * radius;
//          System.out.println("If the radius is  " + radius + " the area of the circle is " + area);
//        
//          System.out.println("Enter your age: ");
//          int age = scan.nextInt();
//          System.out.println("You are " + age + " years old");
//          
//          System.out.println("Enter your name: ");
//          String yourName = scan.nextLine();
//          yourName = scan.nextLine(); //only use this line if necessary
//          System.out.println("Hello " + yourName);
          	//System.out.println("The sum is: " + 10 + 35); makes 1035
          	//System.out.println("The sum is: " + (10 + 35)); makes 45
          	
			//methods form the Math Class (static class, no object necessarcy) 
//			System.out.println(Math.pow(4,3)); //pow = power 4^3
//			double area = Math.PI * Math.pow(5, 2);
//			System.out.println(area);	
//			System.out.println(Math.sqrt(2));
//			
//			// formating output
//			DecimalFormat fmt = new DecimalFormat("0.##");
//			System.out.println(fmt.format(area));
//			
//			NumberFormat money = NumberFormat.getCurrencyInstance();
//			double amount = 27.58;
//			System.out.println(money.format(amount));
//			amount = amount * 1.03;
//			System.out.println(money.format(amount));
			
			//String methods
			String word = "Guam"; //shortcut to create a string
			String word2 = new String("    Sudan"); //long way to create a string
			String word3 = word + word2; //string concatanation
			System.out.println(word3);
			int lengthofword3 = word3.length(); 
			System.out.println(lengthofword3 );
			
			String word4 = "computer";
			System.out.println(word4.replace('t', '*'));
			System.out.println(word4);
			//to overwrite value and save
			word4 = word4.replace('t', '%');
			System.out.println(word4);
			System.out.println(word4.substring(3));
			//inclusive of the first number exclusive of the 2nd
			System.out.println(word4.substring(3,6));

	}

}
