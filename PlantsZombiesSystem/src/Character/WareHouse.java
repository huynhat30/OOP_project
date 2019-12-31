package Character;

import java.awt.Graphics;
import java.util.ArrayList;
public class WareHouse {
	public static boolean switched = false ; 
	public static ArrayList<PeaShooter> peaShooter =  new ArrayList<>();
	public static ArrayList<Sunflower> sunflower = new ArrayList<>();
	public static ArrayList<NormalZombies> zom1 = new ArrayList<>();
	public static ArrayList<Walnut> walnut =  new ArrayList<>();
	public static ArrayList<IcePeaShooter> icetree = new ArrayList<>();
	public static ArrayList<Potato> potato = new ArrayList<>();
	public static ArrayList<Pea> pea = new ArrayList<>();
	public static ArrayList<IcePea> iceshoot = new ArrayList<>();
	public static ArrayList<Sun> sun = new ArrayList<>();
	public WareHouse() {
	}
	public void updateZombie() {
		for(int i = 0 ; i < zom1.size() ; i ++) {
			zom1.get(i).update();
		}
	}
	public void update() {
		for(int i = 0 ; i < zom1.size() ; i ++) {
			zom1.get(i).update();
		}
			
		for(int i = 0 ; i < peaShooter.size() ; i++) {
			peaShooter.get(i).update();
			}
		for(int i = 0 ; i < sunflower.size() ; i++) {
			sunflower.get(i).update();
			
		}
		for(int i = 0 ; i < walnut.size() ; i++) {
			walnut.get(i).update();
		}
		for(int i = 0 ; i < icetree.size() ; i++) {
			icetree.get(i).update();
		}
		for(int i = 0 ; i < potato.size() ; i++) {
			potato.get(i).update();
		}
		for(int i = 0 ; i < pea.size() ; i++) {
			pea.get(i).update();
		}
		for(int i = 0 ; i < iceshoot.size() ; i++) {
			iceshoot.get(i).update();
		}
	}
	public void render(Graphics g) {
		
		for(int i = 0; i<peaShooter.size(); i++) {
			peaShooter.get(i).render(g);
			}
		for(int i = 0 ; i < sunflower.size();i++) {
			sunflower.get(i).render(g);
			}
		for(int i = 0 ; i < walnut.size();i++) {
			walnut.get(i).render(g);
		}
		for(int i = 0 ; i < icetree.size() ; i++) {
			icetree.get(i).render(g);
		}
		for(int i = 0 ; i < potato.size() ; i++) {
			potato.get(i).render(g);
		}
		for(int i = 0 ; i < zom1.size() ; i++) {
			zom1.get(i).render(g); 
		}
		for(int i = 0 ; i < pea.size() ; i++) {
			pea.get(i).render(g);		
		}
		for(int i = 0 ; i < iceshoot.size() ; i++) {
			iceshoot.get(i).render(g);		
		}
		for(int i = 0 ; i < sun.size() ; i++) {
			sun.get(i).render(g);
		}

	}
}