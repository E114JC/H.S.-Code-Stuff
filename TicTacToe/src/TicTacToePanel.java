/* Mrs. Colon
 * This class extends JPanel and includes the code necessary to play the game
 * Students need to finish the win method
 * Other additional modification ideas:
 * Make it so larger boards can be used
 * Develop a computer player - could choose random moves, or try to apply a strategy
 * Use pictures instead of text
 */
import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;

public class TicTacToePanel extends JPanel{

	//class level variables
	private static JButton[][] board;
	private static boolean xTurn;
	private final static int ROWS = 3;
	private final static int COLUMNS = ROWS;
	private static int w;
	private static int wn;
	private static int t;
	int ti;
	//constructor - used to setup the tic-tac-toe board 
	public TicTacToePanel(){
		setLayout(new GridLayout(ROWS, COLUMNS, 4, 4));  //rows, columns, horizontal gap, vertical gap

		board = new JButton[ROWS][COLUMNS];
		Font myFont=new Font("Forte", Font.CENTER_BASELINE, 60);  //can also use BOLD or ITALIC, number is font size
		
		//create and add buttons to the JPanel
		for(int row = 0;  row <board.length; row++){
			for(int col = 0; col < board[row].length; col++) {
				board[row][col] = new JButton("");
				board[row][col].setBackground(Color.BLACK);
				board[row][col].addActionListener(new ButtonListener()); //add a listener so that something happens when the button is clicked
				board[row][col].setFont(myFont); //set the font
				board[row][col].setSize(200,200); //set the size of the button
				add(board[row][col]); //add the board to the panel
				//note that the add method is not called on an object because the class extends JPanel, so the object constructed through the constructor is a JPanel
			}
		}
		board[0][1].setForeground(Color.WHITE);
		board[1][0].setForeground(Color.WHITE);
		board[1][2].setForeground(Color.WHITE);
		board[2][1].setForeground(Color.WHITE);
		board[0][2].setForeground(Color.MAGENTA);
		board[0][0].setForeground(Color.MAGENTA);
		board[2][2].setForeground(Color.MAGENTA);
		board[1][1].setForeground(Color.CYAN);
		board[2][0].setForeground(Color.MAGENTA);
		xTurn = true; //let player x go first
		setSize(600,600); //set the size of the JPanel (see note above on how the class extends JPanel)
	}

	//method to clear the board for a new game
	public static void resetBoard(){
		for(int row = 0; row < board.length; row++){
			for(int col = 0; col <board[row].length; col++)
				board[row][col].setText("");
			xTurn = true;
		}
	}

	//method to display stats
	public static void s() {
		JOptionPane.showMessageDialog(null, "X wins: " + wn + "\nO wins: " + w + "\nTies: " + t);
	}
	//method to check to see if there is a winner

	public boolean win(){
		//write code to see if a player won
		//hint - use .getText() to get the text value of the button
		for(int i =0;i<board.length;i++) {
			for(int l=0;l<3;l++) {
				if(!board[l][0].getText().equals("")&&board[l][0].getText().equals(board[l][1].getText())&&board[l][0].getText().equals(board[l][2].getText())) 
					return true;
				else if(!board[0][l].getText().equals("")&&board[0][l].getText().equals(board[1][l].getText())&&board[1][l].getText().equals(board[2][l].getText())) 
					return true;

			}

		}
		if (!board[0][0].getText().equals("")&&board[0][0].getText().equals(board[1][1].getText())&&board[1][1].getText().equals(board[2][2].getText())) 
			return true;
		else if(!board[0][2].getText().equals("")&&board[0][2].getText().equals(board[1][1].getText())&&board[1][1].getText().equals(board[2][0].getText())) 
			return true; 
		//if you want the option of a bigger board, try to make it that if ROWS and COLUMNS are changed, the code still works
		else 
			return false;

	}

	//will execute when a button is clicked, as long as the listener was added to the button
	public class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JButton current = (JButton)e.getSource(); //get the source of the event and cast it to a JButton
			if (current.getText().equals("")){ //add an X or an O if the button is blank
				if(xTurn){
					current.setText("X");
					xTurn = false;
					ti++;

				}
				else{
					current.setText("O");
					xTurn = true;
					ti++;
				}

				if(win()) {
					if(xTurn) {//if xTurn is true, then O just played
						JOptionPane.showMessageDialog(null, "O wins!!"); //display a pop up window when a player wins
						ti=0;
						w++;
						TicTacToePanel.resetBoard();
					}
					else {

						JOptionPane.showMessageDialog(null, "X wins!!"); //display a pop up window when a player wins
						ti=0;
						wn++;
						TicTacToePanel.resetBoard();
					}


				}


			}
			if(!win()&&ti==9)	{
				ti=0;
				t++;
				JOptionPane.showMessageDialog(null, "It's a tie" );
				TicTacToePanel.resetBoard();
			}

		}		

	}
} 

