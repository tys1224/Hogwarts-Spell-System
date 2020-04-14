

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
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TransparentTextArea extends JTextArea {

        public TransparentTextArea(String text) {
            super(text);
            init();
        }

        public TransparentTextArea(int rows,int columns) {
            super(rows,columns);
            init();
        }

        public TransparentTextArea(String text, int rows,int columns) {
            super(text, rows,columns);
            init();
        }

        protected void init() {
            setOpaque(false);
        }

        @Override
        public void paint(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setComposite(AlphaComposite.SrcOver.derive(0.5f));
            super.paint(g2d);
            g2d.dispose();
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setColor(getBackground());
            g2d.fillRect(0, 0, getWidth(), getHeight());
            super.paintComponent(g2d);
            g2d.dispose();
        }

    }