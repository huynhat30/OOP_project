package ControlCenter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Iterator;

import Character.Potato;
import Character.IcePeaShooter;
import Character.Sun;
import Character.Sunflower;
import Character.PeaShooter;
import Character.Walnut;
import Character.WareHouse;
import MainGame.Level1;
import MainGame.ScreenSize;
import MainGame.HighScore_SunPrice;

public class MouseControl implements MouseListener , MouseMotionListener { 
	public int x , xRelease , y , yRelease ,  xClicked, yClicked; 
	public static ScreenSize sz =  new ScreenSize();
	private static int id = 0 ;
	private static int squareWidth  = 100;  
	private static int squareHeight = 100;
	private static int yardWidthInitial = sz.getGameScrWidth() - 1040; 
	private static int yardWidthFinal   = sz.getGameScrWidth() - 35; 
	private static int yardHeightInitial = sz.getGameScrHeight()- 545;
	private static int yardHeightFinal   = sz.getGameScrHeight()- 45; 
	public static int plant_HorizonRange ;
	public static int plant_VerticalRange ;
	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX() ; 
		y = e.getY() ;
		//sunflower
		if ((x > 10) && (x < 75) && (y > 70) && (y < 155)){
			id =  1  ;
		}
		//greentree
		if ((x > 10) && (x < 75) && (y > 155) && (y < 240 )){
			id = 2 ; 	
		}
		//Icetree ; 
		if ((x > 10) && (x < 75) && (y > 240) && (y < 325)){
			id = 3 ; 	
		}
		//Walnut
		if ((x > 10) && (x < 75) && (y > 325) && (y < 410)){
			id = 4 ;	
		}
		//Boom
		if ((x > 10) && (x < 75) && (y > 410) && (y < 495)){
			id = 5 ;	
		}
		//Remover
		if ((x > 1100) && (x < 1155) && (y > 0) && (y < 60)){
			id = 6 ;	
		}
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {	
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		xRelease  = e.getX() ; 
		yRelease  = e.getY();
		Level1.status =  true;
		for(int a = yardWidthInitial ; a < yardWidthFinal; a += squareWidth) {
			for(int b = yardHeightInitial ; b < yardHeightFinal; b+= squareHeight) {
				plant_HorizonRange = (squareWidth /2) + a - 30;
				plant_VerticalRange = (squareHeight/2) + b - 20;
				
				if((xRelease >= a)&&(xRelease <= a + squareWidth)&&(yRelease >= b)&&(yRelease <= b + squareWidth)){
					IcePeaShooter icetree = new IcePeaShooter(plant_HorizonRange,plant_VerticalRange);
					Walnut walnut = new Walnut(plant_HorizonRange,plant_VerticalRange - 10);
					Potato potato = new Potato(plant_HorizonRange,plant_VerticalRange -10);
					
					if((id == 1 )&&(HighScore_SunPrice.price >= 50)) {
							Sunflower sunflower = new Sunflower(plant_HorizonRange,plant_VerticalRange);
							WareHouse.sunflower.add(sunflower);
							HighScore_SunPrice.price  = HighScore_SunPrice.price - 50 ;
							HighScore_SunPrice.sunPrice = Integer.toString(HighScore_SunPrice.price);
							id = 0 ; 
						}
					
					if((id == 2)&&(HighScore_SunPrice.price >= 100) ) {
							PeaShooter peaShooter = new PeaShooter(plant_HorizonRange,plant_VerticalRange);
							WareHouse.peaShooter.add(peaShooter);
							HighScore_SunPrice.price  = HighScore_SunPrice.price - 100 ;
							HighScore_SunPrice.sunPrice = Integer.toString(HighScore_SunPrice.price);
							id = 0 ;
						}
					
					if((id == 3)&&(HighScore_SunPrice.price >= 175) ) {
							WareHouse.icetree.add(icetree);
							HighScore_SunPrice.price  = HighScore_SunPrice.price - 150 ;
							HighScore_SunPrice.sunPrice = Integer.toString(HighScore_SunPrice.price);
							id = 0 ;
						}
					
					if((id == 4)&&(HighScore_SunPrice.price >= 50) ) {
							WareHouse.walnut.add(walnut);
							HighScore_SunPrice.price = HighScore_SunPrice.price - 50 ;
							HighScore_SunPrice.sunPrice = Integer.toString(HighScore_SunPrice.price);
							id = 0 ;
						}
					
					if((id == 5)&&(HighScore_SunPrice.price >= 25) ) {
							WareHouse.potato.add(potato);
							HighScore_SunPrice.price = HighScore_SunPrice.price - 40 ;
							HighScore_SunPrice.sunPrice = Integer.toString(HighScore_SunPrice.price);
							id = 0 ;
						}
					
					if(id == 6 ) {
						for(Iterator<PeaShooter> iTree =  WareHouse.peaShooter.iterator(); iTree.hasNext() ;) {
							PeaShooter t1 = iTree.next();
							if((t1.getdX() == plant_HorizonRange )&&(t1.getdY() == plant_VerticalRange)) {
								iTree.remove();
							}							
							id = 0 ;
						}
						
						for(Iterator <Sunflower> iSunflower = WareHouse.sunflower.iterator() ; iSunflower.hasNext();) {
							Sunflower s1 = iSunflower.next();
							if((s1.getdX() == plant_HorizonRange )&&(s1.getdY() == plant_VerticalRange)) {
								iSunflower.remove();
							}
						id = 0 ;	
						}
						
						for(Iterator<Potato> iBoom = WareHouse.potato.iterator(); iBoom.hasNext();) {
						Potato b1 = iBoom.next();
							if((b1.getdX() == plant_HorizonRange) && (b1.getdY() == plant_VerticalRange) ) {
								iBoom.remove();
							}
							id = 0 ;
						}
						
						for(Iterator<IcePeaShooter> icetree1 = WareHouse.icetree.iterator(); icetree1.hasNext();) {
						IcePeaShooter b1 = icetree1.next();
							if((b1.getdX() == plant_HorizonRange) && (b1.getdY() == plant_VerticalRange) ) {
								icetree1.remove();
							}
							id = 0 ;
						}
						
						for(Iterator<Walnut> iWalnut = WareHouse.walnut.iterator(); iWalnut.hasNext();) {
						Walnut b1 = iWalnut.next();
							if((b1.getdX() == plant_HorizonRange) && (b1.getdY() == plant_VerticalRange) ) {
								iWalnut.remove();
						}
							id = 0 ;
					}	
				}
			}
		}
	}
}
	@Override
	public void mouseClicked(MouseEvent e) {
		xClicked = e.getX();
		yClicked = e.getY();
			for(Iterator <Sun> isun  = WareHouse.sun.iterator(); isun.hasNext();) {
				Sun sun = isun.next();
				if((xClicked > sun.getdX())&&(xClicked < (sun.getdX() + 50) )&& (yClicked > sun.getdY()) &&((yClicked < (sun.getdY() + 50)))) {
					HighScore_SunPrice.price += Sun.value ;
					HighScore_SunPrice.sunPrice = Integer.toString(HighScore_SunPrice.price);
					isun.remove();
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

}
