

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class addframe extends JPanel {

        private BufferedImage background;

       public addframe() {
            setLayout(new GridBagLayout());
            try {
                background = ImageIO.read(new File("castle5.png"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

       
       
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(500, 400);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (background != null) {
                Graphics2D g2d = (Graphics2D) g.create();
                int x = (getWidth() - background.getWidth()) / 2;
                int y = (getHeight()- background.getHeight()) / 2;
                g2d.drawImage(background, x, y, this);
                g2d.dispose();
            }
        }
    }