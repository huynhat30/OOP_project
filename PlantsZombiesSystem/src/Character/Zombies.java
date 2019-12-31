package Character;

import java.awt.Graphics;
import java.util.Random;

import MainGame.ScreenSize;

public abstract class Zombies {	
	protected int dX; 
	protected int dY;
	protected int width  = 75 ;
	protected int height = 90 ;	
	protected int damage ; 
	protected int health ;
	protected double speed  ;
	Random rd  = new Random();
	protected int y = rd.nextInt(new ScreenSize().getScrHeight()*40/100);
	public Zombies() {
		dX = new ScreenSize().getYardWidth() ; 
		dY = y - y%100 + 55 ; 
	}
	public int getdX() {
		return dX ; 
	}
	public int getdY() {
		return dY;
	}
	public abstract void move(); 
	public abstract void update();
	
	public abstract void render(Graphics g);
}
