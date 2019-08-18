package core;

import java.awt.event.KeyEvent;

public abstract class Input {
	
	
	public abstract static class Keys{
		 //creates key booleans
		static boolean ZERO_KEY_PRESSED=false;static boolean ZERO_KEY_JUST_PRESSED=false;static boolean ZERO_KEY_RELEASED=false;
		boolean ONE_KEY_PRESSED=false;boolean ONE_KEY_JUST_PRESSED=false;boolean ONE_KEY_RELEASED=false;
		boolean TWO_KEY_PRESSED=false;boolean TWO_KEY_JUST_PRESSED=false;boolean TWO_KEY_RELEASED=false;
		boolean THREE_KEY_PRESSED=false;boolean THREE_KEY_JUST_PRESSED=false;boolean THREE_KEY_RELEASED=false;
		boolean FOUR_KEY_PRESSED=false;boolean FOUR_KEY_JUST_PRESSED=false;boolean FOUR_KEY_RELEASED=false;
		boolean FIVE_KEY_PRESSED=false;boolean FIVE_KEY_JUST_PRESSED=false;boolean FIVE_KEY_RELEASED=false;
		boolean SIX_KEY_PRESSED=false;boolean SIX_KEY_JUST_PRESSED=false;boolean SIX_KEY_RELEASED=false;
		boolean SEVEN_KEY_PRESSED=false;boolean SEVEN_KEY_JUST_PRESSED=false;boolean SEVEN_KEY_RELEASED=false;
		boolean EIGHT_KEY_PRESSED=false;boolean EIGHT_KEY_JUST_PRESSED=false;boolean EIGHT_KEY_RELEASED=false;
		boolean NINE_KEY_PRESSED=false;boolean NINE_KEY_JUST_PRESSED=false;boolean NINE_KEY_RELEASED=false;
		boolean A_KEY_PRESSED=false;boolean A_KEY_JUST_PRESSED=false;boolean A_KEY_RELEASED=false;
		boolean B_KEY_PRESSED=false;boolean B_KEY_JUST_PRESSED=false;boolean B_KEY_RELEASED=false;
		boolean C_KEY_PRESSED=false;boolean C_KEY_JUST_PRESSED=false;boolean C_KEY_RELEASED=false;
		boolean D_KEY_PRESSED=false;boolean D_KEY_JUST_PRESSED=false;boolean D_KEY_RELEASED=false;
		boolean E_KEY_PRESSED=false;boolean E_KEY_JUST_PRESSED=false;boolean E_KEY_RELEASED=false;
		boolean F_KEY_PRESSED=false;boolean F_KEY_JUST_PRESSED=false;boolean F_KEY_RELEASED=false;
		boolean G_KEY_PRESSED=false;boolean G_KEY_JUST_PRESSED=false;boolean G_KEY_RELEASED=false;
		boolean H_KEY_PRESSED=false;boolean H_KEY_JUST_PRESSED=false;boolean H_KEY_RELEASED=false;
		boolean I_KEY_PRESSED=false;boolean I_KEY_JUST_PRESSED=false;boolean I_KEY_RELEASED=false;
		boolean J_KEY_PRESSED=false;boolean J_KEY_JUST_PRESSED=false;boolean J_KEY_RELEASED=false;
		boolean K_KEY_PRESSED=false;boolean K_KEY_JUST_PRESSED=false;boolean K_KEY_RELEASED=false;
		boolean L_KEY_PRESSED=false;boolean L_KEY_JUST_PRESSED=false;boolean L_KEY_RELEASED=false;
		boolean M_KEY_PRESSED=false;boolean M_KEY_JUST_PRESSED=false;boolean M_KEY_RELEASED=false;
		boolean N_KEY_PRESSED=false;boolean N_KEY_JUST_PRESSED=false;boolean N_KEY_RELEASED=false;
		boolean O_KEY_PRESSED=false;boolean O_KEY_JUST_PRESSED=false;boolean O_KEY_RELEASED=false;
		boolean P_KEY_PRESSED=false;boolean P_KEY_JUST_PRESSED=false;boolean P_KEY_RELEASED=false;
		boolean Q_KEY_PRESSED=false;boolean Q_KEY_JUST_PRESSED=false;boolean Q_KEY_RELEASED=false;
		boolean R_KEY_PRESSED=false;boolean R_KEY_JUST_PRESSED=false;boolean R_KEY_RELEASED=false;
		boolean S_KEY_PRESSED=false;boolean S_KEY_JUST_PRESSED=false;boolean S_KEY_RELEASED=false;
		boolean T_KEY_PRESSED=false;boolean T_KEY_JUST_PRESSED=false;boolean T_KEY_RELEASED=false;
		boolean U_KEY_PRESSED=false;boolean U_KEY_JUST_PRESSED=false;boolean U_KEY_RELEASED=false;
		boolean V_KEY_PRESSED=false;boolean V_KEY_JUST_PRESSED=false;boolean V_KEY_RELEASED=false;
		boolean W_KEY_PRESSED=false;boolean W_KEY_JUST_PRESSED=false;boolean W_KEY_RELEASED=false;
		boolean X_KEY_PRESSED=false;boolean X_KEY_JUST_PRESSED=false;boolean X_KEY_RELEASED=false;
		boolean Y_KEY_PRESSED=false;boolean Y_KEY_JUST_PRESSED=false;boolean Y_KEY_RELEASED=false;
		boolean Z_KEY_PRESSED=false;boolean Z_KEY_JUST_PRESSED=false;boolean Z_KEY_RELEASED=false;
	}
	
	public static void Key_Pressed(KeyEvent e) {
		switch(e.getKeyCode()) {
			case KeyEvent.VK_0:
				Keys.ZERO_KEY_PRESSED = true;Keys.ZERO_KEY_JUST_PRESSED = false;Keys.ZERO_KEY_RELEASED = false;
			case KeyEvent.VK_1:
			case KeyEvent.VK_2:
			case KeyEvent.VK_3:
			case KeyEvent.VK_4:
			case KeyEvent.VK_5:
			case KeyEvent.VK_6:
			case KeyEvent.VK_7:
			case KeyEvent.VK_8:
			case KeyEvent.VK_9:
			case KeyEvent.VK_A:
			case KeyEvent.VK_B:
			case KeyEvent.VK_C:
			case KeyEvent.VK_D:
			case KeyEvent.VK_E:
			case KeyEvent.VK_F:
			case KeyEvent.VK_G:
			case KeyEvent.VK_H:
			case KeyEvent.VK_I:
			case KeyEvent.VK_J:
			case KeyEvent.VK_K:
			case KeyEvent.VK_M:
			case KeyEvent.VK_N:
			case KeyEvent.VK_O:
			case KeyEvent.VK_P:
			case KeyEvent.VK_Q:
			case KeyEvent.VK_R:
			case KeyEvent.VK_S:
			case KeyEvent.VK_T:
			case KeyEvent.VK_U:
			case KeyEvent.VK_V:
			case KeyEvent.VK_W:
			case KeyEvent.VK_X:
			case KeyEvent.VK_Y:
			case KeyEvent.VK_Z:
		}
	}
	
	public static void Key_Just_Pressed(KeyEvent e) {
		switch(e.getKeyCode()) {
			case KeyEvent.VK_0:
			case KeyEvent.VK_1:
			case KeyEvent.VK_2:
			case KeyEvent.VK_3:
			case KeyEvent.VK_4:
			case KeyEvent.VK_5:
			case KeyEvent.VK_6:
			case KeyEvent.VK_7:
			case KeyEvent.VK_8:
			case KeyEvent.VK_9:
			case KeyEvent.VK_A:
			case KeyEvent.VK_B:
			case KeyEvent.VK_C:
			case KeyEvent.VK_D:
			case KeyEvent.VK_E:
			case KeyEvent.VK_F:
			case KeyEvent.VK_G:
			case KeyEvent.VK_H:
			case KeyEvent.VK_I:
			case KeyEvent.VK_J:
			case KeyEvent.VK_K:
			case KeyEvent.VK_M:
			case KeyEvent.VK_N:
			case KeyEvent.VK_O:
			case KeyEvent.VK_P:
			case KeyEvent.VK_Q:
			case KeyEvent.VK_R:
			case KeyEvent.VK_S:
			case KeyEvent.VK_T:
			case KeyEvent.VK_U:
			case KeyEvent.VK_V:
			case KeyEvent.VK_W:
			case KeyEvent.VK_X:
			case KeyEvent.VK_Y:
			case KeyEvent.VK_Z:
		}
	}
	
	public static void Key_Released(KeyEvent e) {
		switch(e.getKeyCode()) {
			case KeyEvent.VK_0:
			case KeyEvent.VK_1:
			case KeyEvent.VK_2:
			case KeyEvent.VK_3:
			case KeyEvent.VK_4:
			case KeyEvent.VK_5:
			case KeyEvent.VK_6:
			case KeyEvent.VK_7:
			case KeyEvent.VK_8:
			case KeyEvent.VK_9:
			case KeyEvent.VK_A:
			case KeyEvent.VK_B:
			case KeyEvent.VK_C:
			case KeyEvent.VK_D:
			case KeyEvent.VK_E:
			case KeyEvent.VK_F:
			case KeyEvent.VK_G:
			case KeyEvent.VK_H:
			case KeyEvent.VK_I:
			case KeyEvent.VK_J:
			case KeyEvent.VK_K:
			case KeyEvent.VK_M:
			case KeyEvent.VK_N:
			case KeyEvent.VK_O:
			case KeyEvent.VK_P:
			case KeyEvent.VK_Q:
			case KeyEvent.VK_R:
			case KeyEvent.VK_S:
			case KeyEvent.VK_T:
			case KeyEvent.VK_U:
			case KeyEvent.VK_V:
			case KeyEvent.VK_W:
			case KeyEvent.VK_X:
			case KeyEvent.VK_Y:
			case KeyEvent.VK_Z:
		}
	}
	
}
