package core;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import game.*; 

public class Main{

	//Delta Time
	public static long last_time = System.nanoTime();
	public static double ns = 1000000000/(double)Preferences.user_fps;
	public static double delta = 0;
	
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
		//creating game loop
		while (true) {
			//FPS ;
			long time = System.nanoTime();
			delta += (int)(time - last_time)/ns;
			last_time = time;
			if(delta>=1) {
				User_Game.Logic();
				jframe.repaint();
				delta--;
			}
		}
	}

}
