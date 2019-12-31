package Graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class StoreImages {
	public static BufferedImage loadImages(String path)  {
		try {
			return ImageIO.read(StoreImages.class.getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}

}
