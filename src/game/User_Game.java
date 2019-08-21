package game;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public abstract class User_Game{

	//change these variables to your preference
	public static int user_window_xsize = 500;
	public static int user_window_ysize = 500;
	public static String user_window_title = "Title";

	
	//default BiLew_Engine sprite
	static BufferedImage blue;
	
	public static void Sprites() throws IOException {

		//BiLew_Engine defualt sprite
		blue = ImageIO.read(new File("src/game/Sprites/blue.png"));

			
	}
	
	//render things here
	public static void Draw(Graphics2D g2d) {
		g2d.drawImage(blue, 0, 0, null);
	}
	
	//do logic here
	public static void Logic() {

	}
}
