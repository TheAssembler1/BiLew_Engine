package core;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;

import game.User_Game;

import javax.swing.JPanel;

public class Drawing extends JPanel{
	
	
	public Drawing() {
		Main.jframe.add(this);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		Toolkit.getDefaultToolkit().sync();
		User_Game.Draw(g2d);
	}
}
