package core;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import game.*; 

public class Main{

	//main frame and panel
	public static JFrame jframe;
	public static JPanel jpanel;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		//this is the user start method
		User_Game.start();
		//creating frame
		Window window = new Window("BiLewEngine", Preferences.user_window_width, Preferences.user_window_height);
		//gets the input
		new KeyboardInput();
		//FPS variables
		long lastTime = System.nanoTime();
		double ns = 1000000000 / Preferences.user_fps;
		double delta = 0;
		//creating game loop
		while (true) {
			User_Game.Logic();
			jframe.repaint();
			//FPS ;
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			if(delta >= 1) {
				delta--;
			}
		}
	}

}
