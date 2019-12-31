package Character;

import java.awt.Graphics;
import java.awt.Rectangle;
import Graphics.Animation;
import Graphics.ImgAssetAndCrop;

public class PeaShooter extends Plants {
	private Animation animation ;
	private long  last2 ;
	private static long time = 500 ;  
	public PeaShooter (int dX,int dY) {
		super(dX,dY);
		last2 = System.currentTimeMillis();
		animation = new Animation(ImgAssetAndCrop.peaShooterImg);
		health = 2000 ;
	}

	@Override
	public void update() {
		animation.update();
		Shoot();
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(animation.getFrames(),dX,dY,null);
	}
	public void Shoot() {
		if((System.currentTimeMillis() - last2) > time) {
				new Pea(dX+40,dY);
			last2 = System.currentTimeMillis();
			}
	}
	public Rectangle getRectangle() {
		return new Rectangle(dX,dY,65,90);
	}
	public int getdY() {
		return dY;
	}
	public int getdX() {
		return dX ; 
	}
	public int getHealth() {
		return health ;
	}
}
