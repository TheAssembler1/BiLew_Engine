package core;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyboardInput implements KeyListener {

    public KeyboardInput() {
        Main.jframe.addKeyListener(this);
        Main.jframe.setFocusable(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    	KeyJustPressed(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
    	KeyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
    	KeyReleased(e);
    }
    
    //says if key has been hit once
    public static KeyEvent KeyJustPressed(KeyEvent e) {
    	return e;
    }

    //says if key has been held down
    public static KeyEvent KeyPressed(KeyEvent e) {
    	return e;
    }
    
    //says if key has been released
    public static KeyEvent KeyReleased(KeyEvent e) {
    	return e;
    }
    
}
