package Gamee;
//control the window of your game

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class framedemo {
	public static void main(String args[]) {
		JFrame myFrame = new JFrame("Sample Frame");
		myFrame.setSize(300, 400);
		myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
	}
}