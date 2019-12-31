package Character;

import java.awt.Graphics;
import java.util.Random;

import Graphics.ImgAssetAndCrop;
import MainGame.ScreenSize;

public class Sun {
	private int dx ; 
	private int dy;
	public static int value = 50;  
	private int valueOnBoard;
	
	public Sun() {
		Random rd = new Random();
		dx = 100 + rd.nextInt(new ScreenSize().getYardWidth()) -40;
		dy = rd.nextInt(400) ; 
		WareHouse.sun.add(this);
	}
	public void render(Graphics g) {
		g.drawImage(ImgAssetAndCrop.getSun(), dx , dy , null);		
	}
	
	
	public int getdX() {
		return dx  ;
	}
	public int getdY()
	{
		return dy ;
	}
	
	public int getValueOnBoard() {
		return valueOnBoard;
	}
	public void setValueOnBoard(int valueOnBoard) {
		this.valueOnBoard = valueOnBoard;
	}
	
	
}
