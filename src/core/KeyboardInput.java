package core;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyboardInput implements KeyListener {
	
	//variables that equals keycode
	static private int e_key_just_pressed;
	static private int e_key_pressed;
	static private int e_key_released;
	
    public KeyboardInput() {
        Main.jframe.addKeyListener(this);
        Main.jframe.setFocusable(true);
    }

    @Override
    public void keyTyped(KeyEvent keycode) {
    	e_key_just_pressed = keycode.getKeyCode();
    }

    @Override
    public void keyPressed(KeyEvent keycode) {
    	e_key_pressed = keycode.getKeyCode();
    }

    @Override
    public void keyReleased(KeyEvent keycode) {
    	e_key_released = keycode.getKeyCode();
    }
    

	/*THIS IS THE INPUT SECTION*/
	/*-------------------------*/
    
    //says if key has been hit once
    public static int KeyJustPressed() {
    	return e_key_just_pressed;
    }

    //says if key has been held down
    public static int KeyPressed() {
    	return e_key_pressed;
    }
    
    //says if key has been released
    public static int KeyReleased() {
    	return e_key_released;
    }
}
