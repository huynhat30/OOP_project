package Character;

import java.awt.Graphics;

import Graphics.ImgAssetAndCrop;

public class Remover {
	private int dx , dy ;	
	public Remover(int dx,int dy) {
		this.dx = dx ; 
		this.dy = dy ; 
	}
	public void Render(Graphics g) {
		g.drawImage(ImgAssetAndCrop.remover[0],dx,dy,null);
	}

}
