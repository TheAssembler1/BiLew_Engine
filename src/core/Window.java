package core;                         

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Window{
	
	public Window(String title, int width, int height){
		
		//settings window properties
		Main.jframe = new JFrame(title);
		Main.jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Main.jframe.setSize(width, height);
        Main.jframe.setLocationRelativeTo(null);
        Main.jframe.add(Panel());
		//draws the character
		Drawing draw = new Drawing(); 
		Main.jframe.setVisible(true);
	}

	private JPanel Panel() {
		Main.jpanel = new JPanel();
		Main.jpanel.setBackground(Color.black);
		return Main.jpanel;
	}
}
