package MainGame;
import java.awt.Canvas;
import java.awt.Dimension;


import javax.swing.*;

import Character.Pea;
import ControlCenter.MouseControl;

public class BackgroundDisplay {
	private static int width;
	private static int height ;
	private JFrame frame ;
	private Canvas canvas ;
	private JLabel score;
	private MouseControl mouse ;  
	private ScreenSize sz;
	
	public BackgroundDisplay() {	
		int scoree = new Pea().getScore();
		String Score = Integer.toString(scoree);
		sz = new ScreenSize();
		width=sz.getScrWidth()*72/100;
		height =sz.getScrHeight()*57/100;
		frame = new JFrame("Plants vs Zombies");
		frame.setSize(width	,height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		canvas = new Canvas();
        score = new JLabel("Score");
        score.setText("High score: "+Score);
        score.setLocation(115,166);
        score.setSize(120,20);
		canvas.setPreferredSize(new Dimension(width,height));
		canvas.setMaximumSize(new Dimension(width,height));
		canvas.setMinimumSize(new Dimension(width,height));
		canvas.setFocusable(false);
		mouse = new MouseControl();
		canvas.addMouseListener(mouse);
		frame.setLocationRelativeTo(null);
		frame.add(score);
		frame.add(canvas);
		frame.pack();
		frame.setVisible(true);
	}
	
	public JFrame getJFrame () {
		return frame ; 
	}
	public Canvas getCanvas() {
		return canvas ;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
}