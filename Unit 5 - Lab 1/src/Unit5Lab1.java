import java.util.Arrays;

public class Unit5Lab1 {

	
		// TODO Auto-generated method stub
		public static double getAverage(int[] arr) {
			int sum = 0;
			for(int i =0; i<arr.length; i++) {
				sum += arr[i];
			}
			double average = sum/(double)arr.length;
			return average;
		}
				
		
		public static void main(String[] args) {
				//1. calculate and print the average
				int[] nums = {32, 29, 10, 3, 27, 81, 15, 10, 14};
				System.out.println("The average is " + getAverage(nums));
				
				//2. find what position the value 27 is in - print the position
				for(int i=0; i<nums.length; i++) {
					if(nums[i]==27) {
						System.out.println("27 is in position " + i);
					}
				}
				
				//3. find and print the lowest value
				int low = 700;
				for (int i=0; i<nums.length;i++) {
					if(nums[i]<low) {
					 low = nums[i];	
					} 
				}
				System.out.println("The lowest number is " + low);
				//4. find and print the highest value
				int high = 0;
				for (int i=0; i<nums.length;i++) {
					if(nums[i]>high) {
					 high = nums[i];	
					} 
				}
				System.out.println("The lowest number is " + high);
				
				
				
				//5. calculate and print the standard deviation
				double s =0;
				double sd =0;
				for (int i=0; i<nums.length;i++) {
				s += Math.pow((nums[i]-getAverage(nums)),2);
				}
				sd=Math.sqrt(s/(nums.length-1));
				System.out.println("The standard deviation is " + sd);
				
				
				
				//6. calculate the z-score for each value
				//hint - make a new array to hold the z-scores
				//print the new array using the Arrays.toString method
				double[] zscore =new double[nums.length];
				int n =0;
				for (int i=0; i<nums.length;i++) {
					zscore[i] =(nums[i]-getAverage(nums))/sd;
					}		
			
				System.out.println("The z-score is " + Arrays.toString(zscore));
				
				
				
				
				
				//7. how many z-scores are within [-2, 2]
				//what percent of values is that?
				//code this using a loop, do not just count them yourself
				int count =0;
				int c =0;
				for (int i=0; i<nums.length;i++) {
					if(zscore[i]<2 && zscore[i]>-2) {
						count++;
					}
						
				}
				System.out.println(count + " z-scores were within a [-2, 2] deviation.");
						System.out.println("This is " +  100.0* count/nums.length + " percent");
				
				//bonus - find and print the mode
				

	}

}
