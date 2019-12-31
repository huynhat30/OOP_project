package Character; 

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Iterator;

import Graphics.Animation;
import Graphics.ImgAssetAndCrop;
import MainGame.HighScore_SunPrice;

public class Pea extends Bullets{
	
	private Animation animation;
	private static int width = 20 ; 
	private static int height = 20 ;  
	protected int dx ;
	protected int dy ;
	public static int damage = 100 ;
	private static final int speed =  10 ; 
	public Pea() {}
	public Pea (int x , int y) {
		dx = x ; 
		dy = y ;
		WareHouse.pea.add(this);
		animation = new Animation(ImgAssetAndCrop.bullet);
	}
	@Override
	public void move() {
		dx += speed ; 			
	}			
	@Override
	public void update() {
		move();
		Collision();
	}
	public Rectangle getRectangle() {
		return new Rectangle(dx,dy,width,height);
	}
	@Override
	public void render(Graphics g) {
			g.drawImage(animation.getFrames(), dx, dy, null);
		}
	public int getDx() {
		return dx  ; 
	}
	public int getDy() {
		return dy ; 
	}
	
	

	
	public void Collision() {
		for(Iterator<NormalZombies> izom = WareHouse.zom1.iterator();
				izom.hasNext();) {
			NormalZombies norzom = izom.next();
			if(norzom.getRectangle().intersects(this.getRectangle())){
				WareHouse.pea.remove(this);
				norzom.health -= damage ;
				System.out.print("\nHealth : " + norzom.health);
				if(norzom.health <= 0) {
					izom.remove();
					HighScore_SunPrice.score += 25;
					HighScore_SunPrice.scoreH = Integer.toString(HighScore_SunPrice.score);
				}
				
			}
		}
	}

}

