import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Unit5Examples {
////	//method to find average
////	public static double getAverage(int[] arr) {
////		int sum = 0;
////		for(int i =0; i<arr.length; i++) {
////			sum += arr[i];
////		}
////		double average = sum/arr.length;
////		return average;
////	}
////
		public static void main(String[] args) {
////		// TODO Auto-generated method stub
////		//how to create an array and how to use them
////		
////		//create an array to hold daily temperatures 
////		int[] temps = new int[5]; //create a blank array of five integers 
////		
////		//assign values via direct assignment 
////		temps[0]=50;
////		temps[1]=48;
////		temps[2]=30;
////		temps[3]=18;
////		temps[4]=39;
////		
////		//search through array and count how many freezing days
////		int freezing =0;
////		for(int i =0; i< temps.length; i++) {
////			if(temps[i]<=32)
////				freezing++;
////		}
////		System.out.println("There were " + freezing + " cold days out of " + temps.length + " days.");
////		
////		//create and initialize an array at the same time
////		int[] grades = {62, 75, 35, 100, 36, 94, 82, 74, 68, 12, 92};
////		
////		//to change a value, use direct assignment
////		grades[2] = 37; 
////		grades[grades.length-1] =0;
////		
////		//find average test score
////		
////		System.out.println(getAverage(grades));
////		
////		//change grades to a minimum grade of 60
////		for(int i =0; i<grades.length;i++) {
////			if(grades[i]<60)
////				grades[i]=60;
////		}
////		System.out.println(getAverage(grades));
////		
////		//print an array
////		System.out.println(grades);//memory address
////		System.out.println(Arrays.toString(grades)); //prints the value
////		
////		//change the first and last and save in a new array
////		int[] nums = {8,17,6};
////		int[] result = {nums[2], nums[1], nums[0]};
////		
////		//switch the first and last but keep the same array
////		if (nums.length>1) {
////		int temp = nums[0];
////		nums[0] = nums[nums.length-1];
////		nums[nums.length-1] = temp;
////		
////		}
////		
////		//a non-integer array
////		String[] dinner = {"Koi Hibachi", "McDonalds", "Taco Bell", "Waffle House", "Rainforest Cafe", "Hard Rock Cafe", "IKEA", "Costco", "Old Causeway", "Denny's", "Five Guy's"};
////		Random generator = new Random();
////		int choice = generator.nextInt(dinner.length);
////		System.out.println(dinner[choice]);
////		
//
//	//create an ArrayList
//		ArrayList<String> cars = new ArrayList<String>();
//	
//		//added values to ArrayList
//		cars.add("Honda Civic");
//		cars.add("ferrari f40");
//		cars.add("truck");
//		cars.add("ford bronco");
//		cars.add("ford focus");
//		cars.add("ford focus");
//		cars.add("ford focus");
//		cars.add("ford focus");
//		cars.add("ford escape");
//		cars.add("1940 marceades");
//		cars.add("1967 Chevorlet Empala");
//		
//		System.out.println(cars);
//		
//		//remove by position or value
//		cars.remove(2);
//		System.out.println(cars);
//		
//		cars.remove("ford focus");//will remove first occurrence 
//		cars.removeAll(Arrays.asList("ford focus"));//will remove all occurrences 
//		
//		cars.addAll(Arrays.asList("generic", "hummer" , "kia forte"));
//		System.out.println(cars);
//		
//		//sort an ArrayList
//		Collections.sort(cars);//numbers before letters then alphabetical 
//		System.out.println(cars);
//	
//		System.out.println(cars.get(3));
//		
//		//for-each loop
//		for(String name: cars) {
//			System.out.println(name);
//			name = "hello!"; //will not change the value in the ArrayList
//		}
//		System.out.println(cars);
//		
//		//check the size / length of an ArrayList 
//		System.out.println(cars.size());
//		
//		
//		//delete all items
//		cars.clear();
//		System.out.println(cars);
//	
	
			//declare a 2D array
		int[][] matrix = new int [4][5]; //4 rows 5 columns 
		
		//print the number of rows
		System.out.println(matrix.length);
		
		//print the number of columns
		System.out.println(matrix[0].length);
		
		//fill the array with 11
		for(int row = 0; row<matrix.length;row++) {
			for(int col = 0; col<matrix[row].length; col++) {
				matrix[row][col]=11;
			}
		}
			//print the array
			for(int row = 0; row<matrix.length;row++) {
				for(int col = 0; col<matrix[row].length; col++) {
					System.out.print(matrix[row][col] + "\t");
		}
	
		System.out.println();
	
	
	}
		}
}

