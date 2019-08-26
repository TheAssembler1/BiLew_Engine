package core;

import javax.swing.JFrame;
import javax.swing.JPanel;

import game.*; 

public class Main{

	//main frame and panel
	public static JFrame jframe;
	public static JPanel jpanel;
	
	int x = 5;
	int enemyx = 5;
	
	public static void main(String[] args) throws InterruptedException {
		//creating frame
		Window window = new Window("BiLewEngine", Preferences.user_window_width, Preferences.user_window_height);
		
		//creating game loop
		while (true) {
			User_Game.Logic();
			jframe.repaint();
			Thread.sleep(10);
		}
	}

}
