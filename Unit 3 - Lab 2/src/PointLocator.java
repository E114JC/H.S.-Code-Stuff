import java.util.Scanner;

public class PointLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the x value of a point on the coordinate plane: ");
		double x = scan.nextDouble();
		System.out.println("Enter the y value of a point on the coordinate plane: ");	
		double y = scan.nextDouble();
		if (x ==0 && y==0)
			System.out.println("The point is the origin");
		else if (x >0 && y>0)
			System.out.println("The point is in Quadrant I");
		else if (x>0 && y<0)
			System.out.println("The point is in Quadrant IV");
		else if (x<0 && y<0)
			System.out.println("The point is in Quadrant III");
		else 
			System.out.println("The point is in Quadrant II");
		
		
		
		
	}

}
