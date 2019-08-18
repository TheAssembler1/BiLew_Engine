package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import core.*;


@SuppressWarnings("serial")
public class Game extends JPanel{
	
	//gets the input
	public Game() {
		
		System.out.println("MESSAGE::CREATED OBJECT FOR INPUT");
		
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
		requestFocus();
	}
	
	//game_running boolean
	private static boolean game_running = true;
	
	public static void main(String[] args) {
		
		//creates thread and window
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	
        		//creates the window
        		@SuppressWarnings("unused")
        		Window window = new Window("BilLew_Engine", 500, 500);
        		
        		while (!game_running) {
        			
        			//runs the users logic
        			UserGame.Logic();
        			
        		}
        		
            }
        });
		
	}

}