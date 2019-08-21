package core;

import java.awt.Graphics;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public abstract class Object extends JFrame{
	
    @Override
    public void paint(Graphics g) {}
	
	//for updating player setttings
	public void Update() {}
	
	//gets the xposition
	public void Get_Xpos() {}
	
	//gets the yposition
	public void Get_Ypos() {}
	
	//sets the xposition
	public void Set_Xpos() {}
	
	//sets the y position
	public void Set_Ypos() {}
}
