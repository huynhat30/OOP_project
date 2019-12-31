package Character;

import java.awt.Graphics;
import java.awt.Rectangle;

import Graphics.Animation;
import Graphics.ImgAssetAndCrop;

public class IcePeaShooter extends Plants{
	private Animation animation ;
	private long last;
	private static long time = 500 ;
	private int width  = 75 ; 
	private int height = 55 ; 
	public IcePeaShooter(int dX, int dY) {
		super(dX,dY);
		last = System.currentTimeMillis();
		animation = new Animation(ImgAssetAndCrop.icePeaShooterImg);
		health = 2000 ;
	}

	@Override
	public void update() {
		animation.update();
		Shoot();
	}
	public Rectangle getRectangle() {
		return new Rectangle(dX,dY,width,height);
	}
	@Override
	public void render(Graphics g) {
		g.drawImage(animation.getFrames(),dX,dY,null);
	}
	public void Shoot() {
		if((System.currentTimeMillis() - last) > time ) {
			new IcePea(dX,dY);
			last =  System.currentTimeMillis();
		}
	}
	
}
