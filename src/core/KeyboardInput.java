package core;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyboardInput implements KeyListener {
	
	public static boolean ZERO_KEY_PRESSED=false;public static boolean ZERO_KEY_JUST_PRESSED=false;
	public static boolean ONE_KEY_PRESSED=false;public static boolean ONE_KEY_JUST_PRESSED=false;
	public static boolean TWO_KEY_PRESSED=false;public static boolean TWO_KEY_JUST_PRESSED=false;
	public static boolean THREE_KEY_PRESSED=false;public static boolean THREE_KEY_JUST_PRESSED=false;
	public static boolean FOUR_KEY_PRESSED=false;public static boolean FOUR_KEY_JUST_PRESSED=false;
	public static boolean FIVE_KEY_PRESSED=false;public static boolean FIVE_KEY_JUST_PRESSED=false;
	public static boolean SIX_KEY_PRESSED=false;public static boolean SIX_KEY_JUST_PRESSED=false;
	public static boolean SEVEN_KEY_PRESSED=false;public static boolean SEVEN_KEY_JUST_PRESSED=false;;
	public static boolean EIGHT_KEY_PRESSED=false;public static boolean EIGHT_KEY_JUST_PRESSED=false;
	public static boolean NINE_KEY_PRESSED=false;public static boolean NINE_KEY_JUST_PRESSED=false;
	public static boolean A_KEY_PRESSED=false;public static boolean A_KEY_JUST_PRESSED=false;
	public static boolean B_KEY_PRESSED=false;public static boolean B_KEY_JUST_PRESSED=false;
	public static boolean C_KEY_PRESSED=false;public static boolean C_KEY_JUST_PRESSED=false;
	public static boolean D_KEY_PRESSED=false;public static boolean D_KEY_JUST_PRESSED=false;
	public static boolean E_KEY_PRESSED=false;public static boolean E_KEY_JUST_PRESSED=false;
	public static boolean F_KEY_PRESSED=false;public static boolean F_KEY_JUST_PRESSED=false;
	public static boolean G_KEY_PRESSED=false;public static boolean G_KEY_JUST_PRESSED=false;
	public static boolean H_KEY_PRESSED=false;public static boolean H_KEY_JUST_PRESSED=false;
	public static boolean I_KEY_PRESSED=false;public static boolean I_KEY_JUST_PRESSED=false;
	public static boolean J_KEY_PRESSED=false;public static boolean J_KEY_JUST_PRESSED=false;
	public static boolean K_KEY_PRESSED=false;public static boolean K_KEY_JUST_PRESSED=false;
	public static boolean L_KEY_PRESSED=false;public static boolean L_KEY_JUST_PRESSED=false;
	public static boolean M_KEY_PRESSED=false;public static boolean M_KEY_JUST_PRESSED=false;
	public static boolean N_KEY_PRESSED=false;public static boolean N_KEY_JUST_PRESSED=false;
	public static boolean O_KEY_PRESSED=false;public static boolean O_KEY_JUST_PRESSED=false;
	public static boolean P_KEY_PRESSED=false;public static boolean P_KEY_JUST_PRESSED=false;
	public static boolean Q_KEY_PRESSED=false;public static boolean Q_KEY_JUST_PRESSED=false;
	public static boolean R_KEY_PRESSED=false;public static boolean R_KEY_JUST_PRESSED=false;
	public static boolean S_KEY_PRESSED=false;public static boolean S_KEY_JUST_PRESSED=false;
	public static boolean T_KEY_PRESSED=false;public static boolean T_KEY_JUST_PRESSED=false;
	public static boolean U_KEY_PRESSED=false;public static boolean U_KEY_JUST_PRESSED=false;
	public static boolean V_KEY_PRESSED=false;public static boolean V_KEY_JUST_PRESSED=false;
	public static boolean W_KEY_PRESSED=false;public static boolean W_KEY_JUST_PRESSED=false;
	public static boolean X_KEY_PRESSED=false;public static boolean X_KEY_JUST_PRESSED=false;
	public static boolean Y_KEY_PRESSED=false;public static boolean Y_KEY_JUST_PRESSED=false;
	public static boolean Z_KEY_PRESSED=false;public static boolean Z_KEY_JUST_PRESSED=false;
	
    public KeyboardInput() {
        Main.jframe.addKeyListener(this);
        Main.jframe.setFocusable(true);
    }

    @Override
    public void keyTyped(KeyEvent keycode) {
		switch(keycode.getKeyCode()) {
			case KeyEvent.VK_0:
				ZERO_KEY_PRESSED=true;ZERO_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_1:
				ONE_KEY_PRESSED=true;ONE_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_2:
				TWO_KEY_PRESSED=true;TWO_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_3:
				THREE_KEY_PRESSED=true;THREE_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_4:
				FOUR_KEY_PRESSED=true;FOUR_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_5:
				FIVE_KEY_PRESSED=true;FIVE_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_6:
				SIX_KEY_PRESSED=true;SIX_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_7:
				SEVEN_KEY_PRESSED=true;SEVEN_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_8:
				EIGHT_KEY_PRESSED=true;EIGHT_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_9:
				NINE_KEY_PRESSED=true;NINE_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_A:
				A_KEY_PRESSED=true;A_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_B:
				B_KEY_PRESSED=true;B_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_C:
				C_KEY_PRESSED=true;C_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_D:
				D_KEY_PRESSED=true;D_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_E:
				E_KEY_PRESSED=true;E_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_F:
				F_KEY_PRESSED=true;F_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_G:
				G_KEY_PRESSED=true;G_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_H:
				H_KEY_PRESSED=true;H_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_I:
				I_KEY_PRESSED=true;I_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_J:
				J_KEY_PRESSED=true;J_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_K:
				K_KEY_PRESSED=true;K_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_L:
				L_KEY_PRESSED=true;L_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_M:
				M_KEY_PRESSED=true;M_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_N:
				N_KEY_PRESSED=true;N_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_O:
				O_KEY_PRESSED=true;O_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_P:
				P_KEY_PRESSED=true;P_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_Q:
				Q_KEY_PRESSED=true;Q_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_R:
				R_KEY_PRESSED=true;R_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_S:
				S_KEY_PRESSED=true;S_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_T:
				T_KEY_PRESSED=true;T_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_U:
				U_KEY_PRESSED=true;U_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_V:
				V_KEY_PRESSED=true;V_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_W:
				W_KEY_PRESSED=true;W_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_X:
				X_KEY_PRESSED=true;X_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_Y:
				Y_KEY_PRESSED=true;Y_KEY_JUST_PRESSED=false;
				break;
			case KeyEvent.VK_Z:
				Z_KEY_PRESSED=true;Z_KEY_JUST_PRESSED=false;
				break;
    }
}

    @Override
    public void keyPressed(KeyEvent keycode) {
		
		switch(keycode.getKeyCode()) {
			case KeyEvent.VK_0:
				ZERO_KEY_JUST_PRESSED = true;
				break;
			case KeyEvent.VK_1:
				ONE_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_2:
				TWO_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_3:
				THREE_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_4:
				FOUR_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_5:
				FIVE_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_6:
				SIX_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_7:
				SEVEN_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_8:
				EIGHT_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_9:
				NINE_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_A:
				A_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_B:
				B_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_C:
				C_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_D:
				D_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_E:
				E_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_F:
				F_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_G:
				G_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_H:
				H_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_I:
				I_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_J:
				J_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_K:
				K_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_L:
				L_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_M:
				M_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_N:
				N_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_O:
				O_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_P:
				P_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_Q:
				Q_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_R:
				R_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_S:
				S_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_T:
				T_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_U:
				U_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_V:
				V_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_W:
				W_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_X:
				X_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_Y:
				Y_KEY_JUST_PRESSED=true;
				break;
			case KeyEvent.VK_Z:
				Z_KEY_JUST_PRESSED=true;
				break;
		}
}

    @Override
    public void keyReleased(KeyEvent keycode) {
		switch(keycode.getKeyCode()) {
			case KeyEvent.VK_0:
				ZERO_KEY_PRESSED=false;ZERO_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_1:
				ONE_KEY_PRESSED=false;ONE_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_2:
				TWO_KEY_PRESSED=false;TWO_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_3:
				THREE_KEY_PRESSED=false;THREE_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_4:
				FOUR_KEY_PRESSED=false;FOUR_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_5:
				FIVE_KEY_PRESSED=false;FIVE_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_6:
				SIX_KEY_PRESSED=false;SIX_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_7:
				SEVEN_KEY_PRESSED=false;SEVEN_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_8:
				EIGHT_KEY_PRESSED=false;EIGHT_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_9:
				NINE_KEY_PRESSED=false;NINE_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_A:
				A_KEY_PRESSED=false;A_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_B:
				B_KEY_PRESSED=false;B_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_C:
				C_KEY_PRESSED=false;C_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_D:
				D_KEY_PRESSED=false;D_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_E:
				E_KEY_PRESSED=false;E_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_F:
				F_KEY_PRESSED=false;F_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_G:
				G_KEY_PRESSED=false;G_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_H:
				H_KEY_PRESSED=false;H_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_I:
				I_KEY_PRESSED=false;I_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_J:
				J_KEY_PRESSED=false;J_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_K:
				K_KEY_PRESSED=false;K_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_L:
				L_KEY_PRESSED=false;L_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_M:
				M_KEY_PRESSED=false;M_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_N:
				N_KEY_PRESSED=false;N_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_O:
				O_KEY_PRESSED=false;O_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_P:
				P_KEY_PRESSED=false;P_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_Q:
				Q_KEY_PRESSED=false;Q_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_R:
				R_KEY_PRESSED=false;R_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_S:
				S_KEY_PRESSED=false;S_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_T:
				T_KEY_PRESSED=false;T_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_U:
				U_KEY_PRESSED=false;U_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_V:
				V_KEY_PRESSED=false;V_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_W:
				W_KEY_PRESSED=false;W_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_X:
				X_KEY_PRESSED=false;X_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_Y:
				Y_KEY_PRESSED=false;Y_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_Z:
				Z_KEY_PRESSED=false;Z_KEY_JUST_PRESSED=false;
		}
    }
    

}
