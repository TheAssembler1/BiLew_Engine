package core;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import game.*;

public class Window {

	public Window(String title, int width, int height) {
		
		System.out.println("MESSAGE::CREATINGWINDOW");
		
		//using this to set window to middle of the screen
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		
		//settings properties for the window
		JFrame frame = new JFrame(UserGame.window_title);
		frame.setSize(UserGame.window_width, UserGame.window_height);
		frame.setVisible(true);
		
		//this centers the window
	    int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
	    frame.setLocation(x, y);
	    
	    //adding game to frame-this is for user input mainly
	    Game game = new Game();
	    frame.add(game);
	    
	    //adding panel to the frames
	    frame.add(new MyPanel());
	    frame.pack();
	    
	    //allows closing the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

@SuppressWarnings("serial")
class MyPanel extends JPanel {

    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public Dimension getPreferredSize() {
        return new Dimension(UserGame.window_width, UserGame.window_height);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);       
        
        //UserGame draw method
        UserGame.Draw();
    }  
}

