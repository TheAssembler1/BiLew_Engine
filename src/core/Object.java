package core;

import java.awt.Graphics;

public abstract class Object {
	
	//used to draw object
	public void Draw(Graphics g) {}
	
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
