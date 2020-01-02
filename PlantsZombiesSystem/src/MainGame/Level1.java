package MainGame;


import java.awt.Graphics;
import java.util.ArrayList;

import Character.NormalZombies;
import Character.Sun;
import Character.WareHouse;

public class Level1 {
	public static boolean status = false ; 
	private WareHouse warehouse ;
	private long sunTimeBeforeProduce , sunTimeBeforeProduce1  ;
	public static ArrayList<Sun> sun = new ArrayList<>();
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
		while(System.currentTimeMillis() - sunTimeBeforeProduce > sunTimeProduce) {
			sun = new ArrayList<Sun>();
			Sun sunP = new Sun();
			sun.add(sunP);
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