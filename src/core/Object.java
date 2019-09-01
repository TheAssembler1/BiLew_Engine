package core;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Object {
	
	private int x;
	private int y;
	private int width;
	private int height;
	private BufferedImage file;
	
	//fill in this when you instantiate object
	public Object(int x, int y, int width, int height, String filepath) throws IOException {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.file = ImageIO.read(new File(filepath));
		if(this.file == null) {
			System.out.println("MESSAGE::FAILED TO FIND FILE");
			
			
		}
	}
	
	
	//gets the x and y
	public int GetPosX() {
		return this.x;
	}
	
	public int GetPosY() {
		return this.y;
	}
	
	//increases the x and y
	public void ChangePosXY(int xchange, int ychange) {
		this.x += xchange * Main.delta;
		this.y += ychange * Main.delta;
	}
	
	//sets the x and y
	public void SetPosXY(int xpos, int ypos) {
		this.x = xpos;
		this.y = ypos;
	}
	
	public int GetWidht() {
		return width;
	}
	
	public int GetHeight() {
		return height;
	}
	
	public void Draw(Graphics2D g) {
		g.drawImage(this.file, this.x, this.y, this.width, this.height, null);
	}
}
