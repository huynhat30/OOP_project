package Character;

import java.awt.Graphics;

public abstract class Plants {
	protected int dX;
	protected int dY ;
	protected int health ;
	protected int width ;
	protected int height ; 
	public Plants(int dX , int dY) {
		this.dX = dX ;
		this.dY = dY ;
	}
	public abstract void update ();
	public abstract void render(Graphics g);
	public int getdY() {
		return dY;
	}
	public int getdX() {
		return dX ; 
	}
}
