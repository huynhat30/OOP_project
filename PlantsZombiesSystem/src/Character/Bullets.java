package Character;

import java.awt.Graphics;

public abstract class Bullets {
	
	public Bullets() {
		
	}
	public abstract void move() ;
	public abstract void update() ;
	public abstract void render(Graphics g ) ;
}
