package game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import core.Main;

public abstract class User_Game{

	//change these variables to your preference
	public static int user_window_xsize = 500;
	public static int user_window_ysize = 500;
	public static String user_window_title = "Title";
	
	//defautl BiLew_Engine sprite
	static BufferedImage blue;
	
	public static void Sprites() throws IOException {
		blue = ImageIO.read(new File("/home/noah/eclipse-workspace/BilLew_Engine/src/game/blue.png"));
	}
	
	//render things here
	public static void Draw(Graphics2D g2d) {
		g2d.drawImage(blue, 50, 50, null);
	}
	
	//do logic here
	public static void Logic() {

	}
}
