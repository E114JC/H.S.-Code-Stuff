/* Mrs. Colon
 * Basis for the tic-tac-toe program
 * Introduces JButton and ActionListener
 * Student needs to implement win checking */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe{

	public static void main(String[] args){

		JFrame f = new JFrame("Tic Tac Toe"); //create a JFrame and title it
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminates the program when the frame is closed
		JPanel p = new TicTacToePanel(); //create a new panel using the TicTacToePanel class
		f.getContentPane().add(p); //add the panel to the frame

		JMenu fileMenu = new JMenu("File"); //create a menu for the top of the frame
		JMenuItem newGame = new JMenuItem("New Game");
		newGame.addActionListener(new ActionListener(){ //add a listener to the menu item
			public void actionPerformed(ActionEvent e){
				TicTacToePanel.resetBoard();
			}
		});


		fileMenu.add(newGame);
		JMenuBar bar = new JMenuBar();
		bar.add(fileMenu);
		f.setJMenuBar(bar);
		//f.pack();
		f.setSize(600,600);
		f.setVisible(true);

		JMenuItem diss = new JMenuItem("Stats");
		diss.addActionListener(new ActionListener(){ //add a listener to the menu item
			public void actionPerformed(ActionEvent e){
				TicTacToePanel.s();
			}
		});


		fileMenu.add(diss);
		JMenuBar bar2 = new JMenuBar();
		bar2.add(fileMenu);
		f.setJMenuBar(bar2);
		//f.pack();
		f.setSize(600,600);
		f.setVisible(true);
	}
}







