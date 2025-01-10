

	// ************************************************************
	// Student.java
	//
	// Define a student class that stores name, score on test 1, and
	// score on test 2. Methods prompt for and read in grades,
	// compute the average, and return a string containing student's info.
	// ************************************************************
	import java.util.Scanner;
	 
	public class Student {
		
	   	//declare instance data
	   	private String name;
	   	private double scorefortest1;
	   	private double scorefortest2;
	   	
	   	//constructor
	   	public Student(String studentName) {
	   		name =studentName;
	   		
	   	}
	   	
	   	//inputGrades: prompt for (use Scanner) and read in student's grades for test1 and test2.
	   	//Use name in prompts, e.g., "Enter's Joe's score for test1".
	   	public void inputGrades() {
	   		Scanner scan = new Scanner(System.in);
	   		System.out.println("Enter grade one: ");
	   		scorefortest1 = scan.nextDouble();
	   		System.out.println("Enter grade two: ");
	   		scorefortest2 = scan.nextDouble();
	   		
	   	}
	   	
	   	public String toString() {
	   		return("Name: " + name + " Test1: " + scorefortest1 + " Test2: " + scorefortest2);
	   		
	   		
	   		
	   		
	   	}
	   	
	   	//getAverage: compute and return the student's test average
	   	//add header for getAverage
	   	public double getAverage(){
	        return (scorefortest1 + scorefortest2) /2;
	   	}
	   	
	   	
	   	//getName: return the student's name
	   	//add header for getName
	   public String getName()	{
	          	return name;
	   	}
	}
	 
	 


