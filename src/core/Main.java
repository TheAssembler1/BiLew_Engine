package core;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import game.*; 

public class Main{

	//main frame and panel
	public static JFrame jframe;
	public static JPanel jpanel;
	
	int x = 5;
	int enemyx = 5;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		//this is the user start method
		User_Game.start();
		//creating frame
		Window window = new Window("BiLewEngine", Preferences.user_window_width, Preferences.user_window_height);
		//gets the input
		new KeyboardInput();
		//creating game loop
		while (true) {
			User_Game.Logic();
			jframe.repaint();
			Thread.sleep(10);
		}
	}

}
