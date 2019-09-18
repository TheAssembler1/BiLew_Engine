package game;

import java.awt.Graphics2D;
import java.io.IOException;
import core.KeyboardInput;

public class User_Game {
	
	/*THIS IS WHERE YOU MAKE ALL YOU CHARACTER CLASSES*/
	/*------------------------------------------------*/
	static TestCharacter spaceship;
	public static void start() throws IOException {
		spaceship = new TestCharacter(0, 100);
		
	}
	
	/*THIS IS THE LOGIC AND DRAWING SECTION*/
	/*-------------------------------------*/
	
	//user draws sprites here
	public static void Draw(Graphics2D g){
		spaceship.Draw(g);
	}
	
	public static void Logic() {
	
		if(KeyboardInput.A_KEY_PRESSED && KeyboardInput.D_KEY_PRESSED) {
			spaceship.ChangePosXY(0, 0);
		}
		else if(KeyboardInput.A_KEY_PRESSED) {
			spaceship.ChangePosXY(-2, 0);
		}
		else if (KeyboardInput.D_KEY_PRESSED) {
			spaceship.ChangePosXY(2, 0);
		}

	}
    
}
