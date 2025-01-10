import java.util.Random;

public class TTTPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int[][] matrix = new int [3][3]; 
		int r=0;
		int c=0;
		int l=0;
		while(1<5) {
			r=generator.nextInt(3);
			c=generator.nextInt(3);
			if(matrix[r][c]==0) {
				matrix[r][c]=1;
				l++;
			}

		}
		
		for(int row=0; row<matrix.length;row++) {
			for(int col=0; col<matrix[row].length; col++) {
				System.out.print(matrix[row][col] + "\t");
			}

			System.out.println();
		}

	}		









}


