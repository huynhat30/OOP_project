package MainGame;


import java.awt.Graphics;

import Character.NormalZombies;
import Character.Sun;
import Character.WareHouse;

public class Level1 {
	public static boolean status = false ; 
	private WareHouse warehouse ;
	private long sunTimeBeforeProduce , sunTimeBeforeProduce1  ;
	private static long zomTimeProduce = 7000 ;
	private static long sunTimeProduce = 5000 ;

	public Level1() {
		sunTimeBeforeProduce  =System.currentTimeMillis();
		sunTimeBeforeProduce1 =System.currentTimeMillis();	
		warehouse = new WareHouse();
	}
	public void update() {

			warehouse.update();
			addZom();
	     	produceSun();
  
	}	

	public void render(Graphics g) {
		warehouse.render(g);						
		}
	public void produceSun() {
		if(System.currentTimeMillis() - sunTimeBeforeProduce > sunTimeProduce) {
			new Sun();
			sunTimeBeforeProduce = System.currentTimeMillis();
		}
	}
	public void addZom() {
		if(System.currentTimeMillis() - sunTimeBeforeProduce1 > zomTimeProduce) {
			new NormalZombies();
			sunTimeBeforeProduce1 = System.currentTimeMillis();
		}
	}
}		