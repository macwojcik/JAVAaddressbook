package addressbook;

import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ImageFrame extends JFrame implements Runnable {
    
    private Thread watek;
    private final int pauza = 30000;
    
    public ImageFrame() throws MalformedURLException {
		super("REKLAMA");

		JPanel obrazPanel = new ImagePanel();
		add(obrazPanel);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                
		pack();
                setLocationRelativeTo(null);
		setVisible(true);
                
	}

    public void start() {
        if (watek == null) {
        watek = new Thread(this);
        watek.start();
        }
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                watek.sleep(pauza);
                new ImageFrame();
            } catch (MalformedURLException ex) {
                Logger.getLogger(ImageFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(ImageFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            //try {
                //watek.sleep(pauza);
            //}
           // catch (InterruptedException e) {}
            }
    }
    
     public void stop() {
        watek = null;
    }
}
