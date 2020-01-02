package Character;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Graphics.Animation;
import Graphics.ImgAssetAndCrop;
import MainGame.HighScore_SunPrice;


public class NormalZombies extends Zombies {
	private Animation animation ;
	public NormalZombies() {
		health = 1500; 
		damage = 10 ; 
		speed = getSpeedd() ;
		width = 60;
		height = 50 ; 
		animation = new Animation(ImgAssetAndCrop.normalZomImg);
		WareHouse.zom1.add(this);
	}
	
	
	public double getSpeedd() {
		return 3.5;
	}


	@Override
	public void move() {
		dX -= speed ;
		if(dX < 250){
			speed = 0;
			JFrame frame = new JFrame();
	    	JButton button = new JButton("Close");
	        JPanel panel = new JPanel();
	        JLabel label = new JLabel("Game Over");
	        
	        label.setFont (label.getFont ().deriveFont (16.0f));
	        label.setBounds(30, -6, 1000, 60);
	        
	        button.setBounds(130, 50, 80, 30);
	        button.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	
	            	System.exit(0);
	            }
	        });
	        
	        panel.setLayout(null);
	        panel.add(button);
	        panel.add(label);
	        
	               
	        frame.add(panel);
	        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	        frame.setSize(350, 150);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
			
		}
	}
	@Override
	public void update() {
		animation.update();
		move();
		Collision();
	}	
	public Rectangle getRectangle() {
		return new Rectangle(dX,dY, width, height);
	}
	@Override
	public void render(Graphics g) {
		g.drawImage(animation.getFrames(), dX, dY, null);
	}
	public double getDx() {
		return dX;
	}
	
	public void Collision() {

		for(Iterator<PeaShooter>  itree = WareHouse.peaShooter.iterator() ;
				itree.hasNext();) {
			PeaShooter peaShooter = itree.next();
			if(peaShooter.getRectangle().intersects(this.getRectangle())) {
				speed = 0 ; 
				peaShooter.health -= damage ;
					if(peaShooter.health <= 0) {
						itree.remove();
						speed = getSpeedd() ;
				}
			}
		}

		for(Iterator <Walnut> iwalnut = WareHouse.walnut.iterator();
				iwalnut.hasNext();) {
			Walnut walnut = iwalnut.next();
			if(walnut.getRectangle().intersects(this.getRectangle())) {
				speed = 0 ;
				walnut.health -= damage ;
				if(walnut.health <= 0 ) {
					iwalnut.remove();
					speed = getSpeedd() ; 
				}
			}
		}

		for(Iterator <Potato> iboom = WareHouse.potato.iterator();
				iboom.hasNext();) {
			Potato potato = iboom.next();
			if(potato.getRectangle().intersects(this.getRectangle())) {
					iboom.remove();
					WareHouse.zom1.remove(this);
					HighScore_SunPrice.score += 25 ;
					HighScore_SunPrice.scoreH = Integer.toString(HighScore_SunPrice.score);
			}
		}
		for(Iterator<IcePeaShooter>  icetree = WareHouse.icetree.iterator() ;
				icetree.hasNext();) {
			IcePeaShooter ICetree = icetree.next();
			if(ICetree.getRectangle().intersects(this.getRectangle())) {
				speed = 0 ; 
				ICetree.health -= damage ;
					if(ICetree.health <= 0) {
						icetree.remove();
						speed = getSpeedd() ;
				}
			}
		}

		for(Iterator <Sunflower> isunflower = WareHouse.sunflower.iterator(); isunflower.hasNext();) {
			Sunflower sunflower = isunflower.next();
			if(sunflower.getRectangle().intersects(this.getRectangle())) {
				speed = 0 ; 
				sunflower.health -= damage ; 
				if(sunflower.health <= 0) {
					isunflower.remove();
					speed = getSpeedd() ; 
				}
			}
		}
		
		
	}
	
}
