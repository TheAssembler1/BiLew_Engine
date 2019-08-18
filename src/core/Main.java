package core;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import game.User_Game;

@SuppressWarnings("serial")
public class Main extends JPanel{
	
	//sets up listeners and function call backs
	public Main() {
		KeyListener listener = new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				Input.Key_Just_Pressed(e);
			}

			@Override
			public void keyPressed(KeyEvent e) {
				Input.Key_Pressed(e);
			}

			@Override
			public void keyReleased(KeyEvent e) {
				Input.Key_Released(e);
			}
		};
		addKeyListener(listener);
		setFocusable(true);
	}
	
	//overrides the paint method
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		
		//this is the users paint method
		User_Game.Draw();
	}
	
	//entry point to the program
	public static void main(String[] args) throws InterruptedException {
		//creating the frame
		JFrame frame = new JFrame(User_Game.user_window_title);
		Main main = new Main();
		frame.add(main);
		frame.setSize(User_Game.user_window_xsize, User_Game.user_window_ysize);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//creating the game loop variable
		boolean game_run = true;
		
		//this is the actual game loop
		while (game_run) {
			
			//this is the user logic
			User_Game.Logic();
			
			main.repaint();
			Thread.sleep(10);
		}
	}

}