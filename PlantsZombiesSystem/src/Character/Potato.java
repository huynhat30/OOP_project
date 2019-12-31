package Character;

import java.awt.Graphics;
import java.awt.Rectangle;

import Graphics.Animation;
import Graphics.ImgAssetAndCrop;

public class Potato extends Plants {
	private Animation animation; 
	private int width  = 30 ;
	private int height = 50;
	public Potato(int dX, int dY) {
		super(dX, dY);
		animation = new Animation(ImgAssetAndCrop.boom);
	}

	@Override
	public void update() {
		animation.update();
		
	}
	public Rectangle getRectangle() {
		return new Rectangle(dX,dY,width,height);
	}
	@Override
	public void render(Graphics g) {
		g.drawImage(animation.getFrames(), dX, dY, null );		
	}

}
