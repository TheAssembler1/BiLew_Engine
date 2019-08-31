package game;

import java.awt.Graphics2D;
import java.io.IOException;
import core.KeyboardInput;

public class User_Game {
	
	/*THIS IS WHERE YOU MAKE ALL YOU CHARACTER CLASSES*/
	/*------------------------------------------------*/
	static TestCharacter character;
	public static void start() throws IOException {
		character = new TestCharacter();
	}
	
	/*THIS IS THE LOGIC AND DRAWING SECTION*/
	/*-------------------------------------*/
	
	//user draws sprites here
	public static void Draw(Graphics2D g){
		character.Draw(g);
	}
	
	//user does his logic here
	public static void Logic() {

	}
    
}
