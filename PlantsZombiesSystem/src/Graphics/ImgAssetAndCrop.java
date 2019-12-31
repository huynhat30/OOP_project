package Graphics;

import java.awt.image.BufferedImage;

public class ImgAssetAndCrop {
	private static int width = 75 , height = 90 ;
	private static BufferedImage background;
	public static BufferedImage sun;
	public static BufferedImage[] normalZomImg, peaShooterImg ,bullet , boom , cards,  sunflowerImg , walnutImg, icePeaShooterImg , remover;  
	public static void RunImages() {

		setBackground(StoreImages.loadImages("/Store/Background1.jpg"));
		setSun(StoreImages.loadImages("/Store/sun.png"));
		
		
		SpriteSheet sheet = new SpriteSheet(StoreImages.loadImages("/Store/Full7.png"));
		SpriteSheet sheet1 = new SpriteSheet(StoreImages.loadImages("/Store/White_thumb.png"));
		
		normalZomImg = new BufferedImage[5];
		normalZomImg[0] = sheet.crop(15, 110, width, height);
		normalZomImg[1] = sheet.crop(220, 110, width, height);
		normalZomImg[2] = sheet.crop(320, 110, width, height);
		normalZomImg[3] = sheet.crop(415, 110, width, height);
		normalZomImg[4] = sheet.crop(515, 105, width, height);
		
		peaShooterImg = new BufferedImage[4];
		peaShooterImg[0] = sheet.crop(228,750,width,height);
		peaShooterImg[1] = sheet.crop(130,750,width,height);
		peaShooterImg[2] = sheet.crop(425,750,width,height);
		peaShooterImg[3] = sheet.crop(625,750,width,height);
		
		sunflowerImg = new BufferedImage[4];
		sunflowerImg[0]  = sheet.crop(322, 254, width, height - 45);
		sunflowerImg[1]  = sheet.crop(422, 254, width, height - 45);
		sunflowerImg[2]  = sheet.crop(525, 254, width, height - 45);
		sunflowerImg[3]  = sheet.crop(623, 254, width, height - 45);
		
		walnutImg = new BufferedImage[2];
		walnutImg[0] = sheet.crop(724, 244, width - 30 , height - 33);
		walnutImg[1] = sheet.crop(827, 244, width - 30 , height - 33);
		
		icePeaShooterImg    = new BufferedImage[4];
		icePeaShooterImg[0] = sheet.crop(230, 845, width, height - 35);
		icePeaShooterImg[1] = sheet.crop(325, 845, width, height - 35);
		icePeaShooterImg[2] = sheet.crop(425, 845, width, height - 35);
		icePeaShooterImg[3] = sheet.crop(530, 845, width, height - 35);
		
		bullet  = new BufferedImage[2];
		bullet[0] = sheet.crop(140,45,20,20);
		bullet[1] = sheet.crop(31,41 ,23,20);
		
		boom = new BufferedImage[2];
		boom[0] = sheet.crop(525, 45, width, height - 40);
		boom[1] = sheet.crop(618, 45, width, height - 40);
		
		cards =  new BufferedImage[7];
		cards[0] = sheet.crop(13 , 610, width , height );
		cards[1] = sheet.crop(115, 610, width, height );
		cards[2] = sheet.crop(217, 610, width, height );
		cards[3] = sheet.crop(319, 610, width, height );
		cards[4] = sheet.crop(415, 610, width, height );
		cards[5] = sheet.crop(180,   3, width + 15, height) ; 
		cards[6] = sheet1.crop(5, 10, width + 15, 20);
		
		remover =  new BufferedImage[1];
		remover[0] = sheet.crop(530, 640, width - 20, height - 30);
		
		
	}
	public static BufferedImage getBackground() {
		return background;
	}
	public static void setBackground(BufferedImage background) {
		ImgAssetAndCrop.background = background;
	}
	public static BufferedImage getSun() {
		return sun;
	}
	public static void setSun(BufferedImage sun) {
		ImgAssetAndCrop.sun = sun;
	}
	
	

}
