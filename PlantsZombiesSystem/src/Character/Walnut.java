package Character;

import java.awt.Graphics;
import java.awt.Rectangle;

import Graphics.Animation;
import Graphics.ImgAssetAndCrop;

public class Walnut extends Plants {
	private Animation animation ;
	private int width = 45 ;
	private int height= 57 ; 
	public Walnut(int dX, int dY) {
		super(dX, dY);	
		animation = new Animation(ImgAssetAndCrop.walnutImg);
		health = 4000 ;
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
		g.drawImage(animation.getFrames(), dX, dY,null);
	}

}
