package MainGame;

import java.awt.Graphics;

public class HighScore_SunPrice {
	public static int price = 50;
	public static int score = 0 ;
	public static String sunPrice ;
	public static String scoreH ;
	public HighScore_SunPrice() {
		sunPrice = Integer.toString(HighScore_SunPrice.price);	
		scoreH = Integer.toString(HighScore_SunPrice.score);
	}

	public void render(Graphics g) {
		g.drawString(sunPrice, 120 , 150);
		g.drawString("Score: "+scoreH, 100 , 185);
	}
	
}
