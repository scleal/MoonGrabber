import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.net.URL;

public class ImageEditor {
	
	private static final int WIDTH = 1024, HEIGHT = 1024;
	
	public static void main(String[] args) throws IOException {
		
		BufferedImage image = ImageIO.read(new URL("http://api.usno.navy.mil/imagery/moon.png"));
		int black = image.getRGB(0, 0);
		for (int xx = 0; xx < WIDTH; xx++) {
			for (int yy = 0; yy < HEIGHT; yy++) {
				if (image.getRGB(xx, yy) == black) {
					image.setRGB(xx, yy, 0);
				}
			}
		}
		ImageIO.write(image, "png", new File("moon.png"));

	}

}
