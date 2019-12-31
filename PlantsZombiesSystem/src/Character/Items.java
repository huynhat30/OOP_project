package Character;

import java.awt.Graphics;


import ControlCenter.MouseControl;
import Graphics.ImgAssetAndCrop;


public class Items {
	private static final int xStart = 10 ; 
	private static final int yStart = 70;
	private static final int height = 85 ; 
	private static final int width  = 75 ;

	public static int getHeight() {
		return height;
	}
	public static int getWidth() {
		return width;
	}
	public Items(){
		new MouseControl();
	}
	public void update() {
	}
	public void render(Graphics g ) {
		g.drawImage(ImgAssetAndCrop.cards[0], xStart,yStart, null);
		g.drawImage(ImgAssetAndCrop.cards[1], xStart,yStart + height,   null);
		g.drawImage(ImgAssetAndCrop.cards[2], xStart,yStart + height*2, null);
		g.drawImage(ImgAssetAndCrop.cards[3], xStart,yStart + height*3, null);
		g.drawImage(ImgAssetAndCrop.cards[4], xStart,yStart + height*4, null);
		g.drawImage(ImgAssetAndCrop.cards[5],100,yStart , null);
		g.drawImage(ImgAssetAndCrop.remover[0], 1100,0,null);
	}
	public static int getX() {
		return xStart ; 
	}
	public static int getY() {
		return yStart ;
	}
}
