package addressbook;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class ImagePanel extends JPanel {
    
    private BufferedImage image;

	public ImagePanel() throws MalformedURLException {
		super();
                Random rnd = new Random();
                int number = rnd.nextInt(9);
                URL imageURL = new URL("http://javaadds.prv.pl/add"+number+".jpg");
		try {
			image = ImageIO.read(imageURL);
		} catch (IOException e) {
			System.err.println("Blad odczytu obrazka");
			e.printStackTrace();
		}

		Dimension dimension = new Dimension(image.getWidth(), image.getHeight());
		setPreferredSize(dimension);
	}

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(image, 0, 0, this);
	}    
}
