package core;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyboardInput implements KeyListener {
	
	public static boolean ZERO_KEY_PRESSED=false;
	public static boolean ONE_KEY_PRESSED=false;
	public static boolean TWO_KEY_PRESSED=false;
	public static boolean THREE_KEY_PRESSED=false;
	public static boolean FOUR_KEY_PRESSED=false;
	public static boolean FIVE_KEY_PRESSED=false;
	public static boolean SIX_KEY_PRESSED=false;
	public static boolean SEVEN_KEY_PRESSED=false;
	public static boolean EIGHT_KEY_PRESSED=false;
	public static boolean NINE_KEY_PRESSED=false;
	public static boolean A_KEY_PRESSED=false;
	public static boolean B_KEY_PRESSED=false;
	public static boolean C_KEY_PRESSED=false;
	public static boolean D_KEY_PRESSED=false;
	public static boolean E_KEY_PRESSED=false;
	public static boolean F_KEY_PRESSED=false;
	public static boolean G_KEY_PRESSED=false;
	public static boolean H_KEY_PRESSED=false;
	public static boolean I_KEY_PRESSED=false;
	public static boolean J_KEY_PRESSED=false;
	public static boolean K_KEY_PRESSED=false;
	public static boolean L_KEY_PRESSED=false;
	public static boolean M_KEY_PRESSED=false;
	public static boolean N_KEY_PRESSED=false;
	public static boolean O_KEY_PRESSED=false;
	public static boolean P_KEY_PRESSED=false;
	public static boolean Q_KEY_PRESSED=false;
	public static boolean R_KEY_PRESSED=false;
	public static boolean S_KEY_PRESSED=false;
	public static boolean T_KEY_PRESSED=false;
	public static boolean U_KEY_PRESSED=false;
	public static boolean V_KEY_PRESSED=false;
	public static boolean W_KEY_PRESSED=false;
	public static boolean X_KEY_PRESSED=false;
	public static boolean Y_KEY_PRESSED=false;
	public static boolean Z_KEY_PRESSED=false; 
	
    public KeyboardInput() {
        Main.jframe.addKeyListener(this);
        Main.jframe.setFocusable(true);
    }

    @Override
    public void keyPressed(KeyEvent keycode) {
		switch(keycode.getKeyCode()) {
			
			case KeyEvent.VK_0:
				ZERO_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_1:
				ONE_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_2:
				TWO_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_3:
				THREE_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_4:
				FOUR_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_5:
				FIVE_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_6:
				SIX_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_7:
				SEVEN_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_8:
				EIGHT_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_9:
				NINE_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_A:
				A_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_B:
				B_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_C:
				C_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_D:
				D_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_E:
				E_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_F:
				F_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_G:
				G_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_H:
				H_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_I:
				I_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_J:
				J_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_K:
				K_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_L:
				L_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_M:
				M_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_N:
				N_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_O:
				O_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_P:
				P_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_Q:
				Q_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_R:
				R_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_S:
				S_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_T:
				T_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_U:
				U_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_V:
				V_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_W:
				W_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_X:
				X_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_Y:
				Y_KEY_PRESSED=true;
				break;
			case KeyEvent.VK_Z:
				Z_KEY_PRESSED=true;
				break;
    }
}

    @Override
    public void keyReleased(KeyEvent keycode) {
		switch(keycode.getKeyCode()) {
			case KeyEvent.VK_0:
				ZERO_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_1:
				ONE_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_2:
				TWO_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_3:
				THREE_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_4:
				FOUR_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_5:
				FIVE_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_6:
				SIX_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_7:
				SEVEN_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_8:
				EIGHT_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_9:
				NINE_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_A:
				A_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_B:
				B_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_C:
				C_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_D:
				D_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_E:
				E_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_F:
				F_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_G:
				G_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_H:
				H_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_I:
				I_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_J:
				J_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_K:
				K_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_L:
				L_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_M:
				M_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_N:
				N_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_O:
				O_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_P:
				P_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_Q:
				Q_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_R:
				R_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_S:
				S_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_T:
				T_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_U:
				U_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_V:
				V_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_W:
				W_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_X:
				X_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_Y:
				Y_KEY_PRESSED=false;
				break;
			case KeyEvent.VK_Z:
				Z_KEY_PRESSED=false;
				break;
		}
    }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
    

}
