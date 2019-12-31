	package Graphics;
import java.awt.image.BufferedImage;

public class Animation {
	private BufferedImage [] frames ; 
	private int index ; 
	private long timer, last ;
	
	public Animation(BufferedImage[]frames) {
		this.frames = frames ;
		index = 0 ;
		last = System.currentTimeMillis();
		
	}
	
	public void update() {
		timer += System.currentTimeMillis() - last ;
		last = System.currentTimeMillis();
		if(timer > 400) {
			index ++ ; 
			timer = 0 ;
			if(index >= frames.length) {
				index = 0 ;
			}
		}
	}	
	
	public BufferedImage getFrames() {
		return frames[index];
	}
}
