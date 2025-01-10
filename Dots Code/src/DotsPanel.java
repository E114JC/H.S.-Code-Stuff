//********************************************************************
//  DotsPanel.java       Author: Lewis/Loftus
//
//  Represents the primary panel for the Dots program.
//********************************************************************

import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class DotsPanel extends JPanel implements MouseListener{
	
	private final int SIZE = 6;

	private ArrayList<Point> pointList;
	
	//private Image background; 

	
	//-----------------------------------------------------------------
	//  Sets up this panel to listen for mouse events.
	//-----------------------------------------------------------------
	public DotsPanel() {
		pointList = new ArrayList();

		addMouseListener(this);
		
		//background = Toolkit.getDefaultToolkit().createImage("YOUR FILE NAME HERE");

		setBackground(Color.black);
		setPreferredSize(new Dimension(300,200));
	}

	//-----------------------------------------------------------------
	//  Draws all of the dots stored in the list.
	//-----------------------------------------------------------------
	public void paintComponent (Graphics page){
		super.paintComponent(page);

		//page.drawImage(background, 0, 0, this);
		
		page.setColor(Color.green);

		
		for(Point spot : pointList)
			page.fillOval (spot.x-SIZE, spot.y-SIZE, SIZE*2, SIZE*2);

		page.drawString("Count: " + pointList.size(), 5, 15);
	}

	//--------------------------------------------------------------
	//  Adds the current point to the list of points and redraws
	//  the panel whenever the mouse button is pressed.
	//--------------------------------------------------------------
	public void mousePressed (MouseEvent event){
		pointList.add (event.getPoint());
		repaint();
	}

	//-----------------------------------------------------------------
	//  Provide empty definitions for unused MouseListener methods.
	//-----------------------------------------------------------------
	public void mouseClicked (MouseEvent event) {}
	public void mouseReleased (MouseEvent event) {}
	public void mouseEntered (MouseEvent event) {}
	public void mouseExited (MouseEvent event) {}

}
