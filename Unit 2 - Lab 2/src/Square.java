import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the square's side: ");
		double side = scan.nextDouble();
		double perimeter = side * 4.0;
		double area = side * side;
		System.out.println("The perimeter of the square is " + perimeter + " and the area is " + area);
	
}
}