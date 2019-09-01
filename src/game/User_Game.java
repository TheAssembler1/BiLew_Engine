package game;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.io.IOException;
import core.KeyboardInput;

public class User_Game {
	
	/*THIS IS WHERE YOU MAKE ALL YOU CHARACTER CLASSES*/
	/*------------------------------------------------*/
	static TestCharacter character;
	static TestCharacter a;
	public static void start() throws IOException {
		character = new TestCharacter(0, 0);
		a = new TestCharacter(100, 100);
		
	}
	
	/*THIS IS THE LOGIC AND DRAWING SECTION*/
	/*-------------------------------------*/
	
	//user draws sprites here
	public static void Draw(Graphics2D g){
		character.Draw(g);
		a.Draw(g);
	}
	
	public static void Logic() {

	}
    
}
