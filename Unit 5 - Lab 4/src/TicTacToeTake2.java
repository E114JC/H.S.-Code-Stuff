import java.util.Random;

public class TicTacToeTake2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int[][] matrix = new int [3][3]; 
		int r=0;
		int c=0;
		int l=0;
		boolean winner =false;
		while(l<5) {
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
		int win=0;
		l=0;
		for(int row=0; row<matrix.length&&win==0;row++) {
			for(int col=0; col<matrix[row].length; col++) {
				if(matrix[row][col]==1)
					l++;
			}
			if(l==3) {
			
				System.out.println("Player 1 wins!");
			winner=true;
			}

		}

		int w=0;
		int i=0;
		for(int row=0; row<matrix.length&&w==0;row++) {
			for(int col=0; col<matrix[row].length; col++) {
				if(matrix[row][col]==0)
					i++;
			}
			if(i==3) {
				System.out.println("Player 0 wins!");
			winner=true;
			}
			
		}
		if(matrix[0][0]==1&&matrix[1][1]==1&&matrix[2][2]==1||matrix[0][2]==1&&matrix[1][1]==1&&matrix[2][0]==1) {
			System.out.println("Player 1 wins!");
			winner =true;
		}
			
		else if (matrix[0][0]==0&&matrix[1][1]==0&&matrix[2][2]==0||matrix[0][2]==0&&matrix[1][1]==0&&matrix[2][0]==0) {
			System.out.println("Player 0 wins!");
			winner=true;
		}
		if(winner ==false)
			System.out.println("It's a tie");



	}
}





