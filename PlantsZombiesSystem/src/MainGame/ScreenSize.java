package MainGame;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ScreenSize {

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	public int getScrWidth() {
		return screenSize.width;
	}

	public int getScrHeight() {
		return screenSize.height;
	}

	public int getYardWidth() {
		return getScrWidth()*70/100;
	}


	public int getYardHeight() {
		return getScrHeight();
	}


	
}
