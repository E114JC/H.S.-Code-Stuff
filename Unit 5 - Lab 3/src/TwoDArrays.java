import java.util.Random;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//multiplication table
		Random generator = new Random();
		int sum =0;
	//	int[][] matrix = new int [6][6]; 
//		for(int row = 0; row<matrix.length;row++) {
//			for(int col = 0; col<matrix.length; col++) {
//				matrix[row][col]=(row+1)*(col+1);
//			}
//		}
//		for(int row = 0; row<matrix.length;row++) {
//			for(int col = 0; col<matrix[row].length; col++) {
//				System.out.print(matrix[row][col] + "\t");
//	}
//
//	System.out.println();
//	}

		//random numbers
		int[][] m = new int [4][5]; 
		for(int row = 0; row<m.length;row++) {
			for(int col = 0; col<m[row].length; col++) {
				m[row][col]=generator.nextInt(10)+1;
			}
		}
		for(int row = 0; row<m.length;row++) {
			for(int col = 0; col<m[row].length; col++) {
				System.out.print(m[row][col] + "\t");
	}

	System.out.println();
	}
//		for(int row = 0; row<m.length;row++) {
//			sum=0;
//			for(int col = 0; col<m[row].length; col++) {
//			sum+=m[row][col];
//		}
//			
//			System.out.println("The sum of row " + (row+1) + " is " + sum);
//		}
		
		
		//columns sum
	for(int col = 0; col<m[0].length; col++) {
		sum=0;
		for(int row = 0; row<m.length;row++) {
		sum+=m[row][col];
	}
		
		System.out.println("The sum of column " + (col+1) + " is " + sum);
	}
		
		
		
		
				
		
	}
}