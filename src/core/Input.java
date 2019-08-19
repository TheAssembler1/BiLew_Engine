package core;

import java.awt.event.KeyEvent;

public abstract class Input {
	
	
	public abstract static class Keys{
		 //creates key booleans
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
	}
	
	
	public static void Key_Pressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_0:
			Keys.ZERO_KEY_PRESSED=true;Keys.ZERO_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_1:
			Keys.ONE_KEY_PRESSED=true;Keys.ONE_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_2:
			Keys.TWO_KEY_PRESSED=true;Keys.TWO_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_3:
			Keys.THREE_KEY_PRESSED=true;Keys.THREE_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_4:
			Keys.FOUR_KEY_PRESSED=true;Keys.FOUR_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_5:
			Keys.FIVE_KEY_PRESSED=true;Keys.FIVE_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_6:
			Keys.SIX_KEY_PRESSED=true;Keys.SIX_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_7:
			Keys.SEVEN_KEY_PRESSED=true;Keys.SEVEN_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_8:
			Keys.EIGHT_KEY_PRESSED=true;Keys.EIGHT_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_9:
			Keys.NINE_KEY_PRESSED=true;Keys.NINE_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_A:
			Keys.A_KEY_PRESSED=true;Keys.A_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_B:
			Keys.B_KEY_PRESSED=true;Keys.B_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_C:
			Keys.C_KEY_PRESSED=true;Keys.C_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_D:
			Keys.D_KEY_PRESSED=true;Keys.D_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_E:
			Keys.E_KEY_PRESSED=true;Keys.E_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_F:
			Keys.F_KEY_PRESSED=true;Keys.F_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_G:
			Keys.G_KEY_PRESSED=true;Keys.G_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_H:
			Keys.H_KEY_PRESSED=true;Keys.H_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_I:
			Keys.I_KEY_PRESSED=true;Keys.I_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_J:
			Keys.J_KEY_PRESSED=true;Keys.J_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_K:
			Keys.K_KEY_PRESSED=true;Keys.K_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_L:
			Keys.L_KEY_PRESSED=true;Keys.L_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_M:
			Keys.M_KEY_PRESSED=true;Keys.M_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_N:
			Keys.N_KEY_PRESSED=true;Keys.N_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_O:
			Keys.O_KEY_PRESSED=true;Keys.O_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_P:
			Keys.P_KEY_PRESSED=true;Keys.P_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_Q:
			Keys.Q_KEY_PRESSED=true;Keys.Q_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_R:
			Keys.R_KEY_PRESSED=true;Keys.R_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_S:
			Keys.S_KEY_PRESSED=true;Keys.S_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_T:
			Keys.T_KEY_PRESSED=true;Keys.T_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_U:
			Keys.U_KEY_PRESSED=true;Keys.U_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_V:
			Keys.V_KEY_PRESSED=true;Keys.V_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_W:
			Keys.W_KEY_PRESSED=true;Keys.W_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_X:
			Keys.X_KEY_PRESSED=true;Keys.X_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_Y:
			Keys.Y_KEY_PRESSED=true;Keys.Y_KEY_JUST_PRESSED=false;
			break;
		case KeyEvent.VK_Z:
			Keys.Z_KEY_PRESSED=true;Keys.Z_KEY_JUST_PRESSED=false;
			break;
		}
	}
	
	/*
	public static void Key_Just_Pressed(KeyEvent e) {
		switch(e.getKeyCode()) {
			case KeyEvent.VK_0:
				Keys.ZERO_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_1:
				Keys.ONE_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_2:
				Keys.TWO_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_3:
				Keys.THREE_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_4:
				Keys.FOUR_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_5:
				Keys.FIVE_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_6:
				Keys.SIX_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_7:
				Keys.SEVEN_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_8:
				Keys.EIGHT_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_9:
				Keys.NINE_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_A:
				Keys.A_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_B:
				Keys.B_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_C:
				Keys.C_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_D:
				Keys.D_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_E:
				Keys.E_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_F:
				Keys.F_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_G:
				Keys.G_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_H:
				Keys.H_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_I:
				Keys.I_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_J:
				Keys.J_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_K:
				Keys.K_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_L:
				Keys.L_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_M:
				Keys.M_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_N:
				Keys.N_KEY_JUST_PRESSED=true;;
			case KeyEvent.VK_O:
				Keys.O_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_P:
				Keys.P_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_Q:
				Keys.Q_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_R:
				Keys.R_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_S:
				Keys.S_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_T:
				Keys.T_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_U:
				Keys.U_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_V:
				Keys.V_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_W:
				Keys.W_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_X:
				Keys.X_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_Y:
				Keys.Y_KEY_JUST_PRESSED=true;
			case KeyEvent.VK_Z:
				Keys.Z_KEY_JUST_PRESSED=true;
		}
	}*/
	
	public static void Key_Released(KeyEvent e) {
		switch(e.getKeyCode()) {
			case KeyEvent.VK_0:
				Keys.ZERO_KEY_PRESSED=false;Keys.ZERO_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_1:
				Keys.ONE_KEY_PRESSED=false;Keys.ONE_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_2:
				Keys.TWO_KEY_PRESSED=false;Keys.TWO_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_3:
				Keys.THREE_KEY_PRESSED=false;Keys.THREE_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_4:
				Keys.FOUR_KEY_PRESSED=false;Keys.FOUR_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_5:
				Keys.FIVE_KEY_PRESSED=false;Keys.FIVE_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_6:
				Keys.SIX_KEY_PRESSED=false;Keys.SIX_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_7:
				Keys.SEVEN_KEY_PRESSED=false;Keys.SEVEN_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_8:
				Keys.EIGHT_KEY_PRESSED=false;Keys.EIGHT_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_9:
				Keys.NINE_KEY_PRESSED=false;Keys.NINE_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_A:
				Keys.A_KEY_PRESSED=false;Keys.A_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_B:
				Keys.B_KEY_PRESSED=false;Keys.B_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_C:
				Keys.C_KEY_PRESSED=false;Keys.C_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_D:
				Keys.D_KEY_PRESSED=false;Keys.D_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_E:
				Keys.E_KEY_PRESSED=false;Keys.E_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_F:
				Keys.F_KEY_PRESSED=false;Keys.F_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_G:
				Keys.G_KEY_PRESSED=false;Keys.G_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_H:
				Keys.H_KEY_PRESSED=false;Keys.H_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_I:
				Keys.I_KEY_PRESSED=false;Keys.I_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_J:
				Keys.J_KEY_PRESSED=false;Keys.J_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_K:
				Keys.K_KEY_PRESSED=false;Keys.K_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_L:
				Keys.L_KEY_PRESSED=false;Keys.L_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_M:
				Keys.M_KEY_PRESSED=false;Keys.M_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_N:
				Keys.N_KEY_PRESSED=false;Keys.N_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_O:
				Keys.O_KEY_PRESSED=false;Keys.O_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_P:
				Keys.P_KEY_PRESSED=false;Keys.P_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_Q:
				Keys.Q_KEY_PRESSED=false;Keys.Q_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_R:
				Keys.R_KEY_PRESSED=false;Keys.R_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_S:
				Keys.S_KEY_PRESSED=false;Keys.S_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_T:
				Keys.T_KEY_PRESSED=false;Keys.T_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_U:
				Keys.U_KEY_PRESSED=false;Keys.U_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_V:
				Keys.V_KEY_PRESSED=false;Keys.V_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_W:
				Keys.W_KEY_PRESSED=false;Keys.W_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_X:
				Keys.X_KEY_PRESSED=false;Keys.X_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_Y:
				Keys.Y_KEY_PRESSED=false;Keys.Y_KEY_JUST_PRESSED=false;
			case KeyEvent.VK_Z:
				Keys.Z_KEY_PRESSED=false;Keys.Z_KEY_JUST_PRESSED=false;
		}
	}
	
	
}
