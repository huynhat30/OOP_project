package Character;

import java.awt.Graphics;
import java.awt.Rectangle;

import Graphics.Animation;
import Graphics.ImgAssetAndCrop;

public class Sunflower extends Plants{
	private Animation animation ;
	private long last;
	private static int time = 15000 ; 
	public Sunflower(int dX, int dY) {
		super(dX ,dY);
		animation = new Animation(ImgAssetAndCrop.sunflowerImg);
		health = 1000 ;
		width = 50 ; 
		height = 50 ;
	}
	@Override
	public void update() {
		animation.update();
		produceSun();
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(animation.getFrames(), dX, dY, null);
		
	}
	public void produceSun() {
		if(System.currentTimeMillis() - last > time ) {
			new Sun();
			last = System.currentTimeMillis();
		}
	}
	public Rectangle getRectangle() {
		return new Rectangle(dX,dY,width,height); 
	}
}
