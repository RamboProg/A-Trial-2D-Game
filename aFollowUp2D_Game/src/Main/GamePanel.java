package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
    // Screen Settings
    final int ogTileSize = 16; // 16x16 res
    final int scaleRatio = 3; // 16 x scaleRatio

    final int tilesize = ogTileSize * scaleRatio; // 48*48
    final int col = 16;
    final int row = 12;
    final int screenWidth = tilesize * col; // 768 pixels
    final int screenHeight = tilesize * row; // 576 pixels
    // size of gamescreen is 576 x 768

    Thread gameThread;

    public void startGameThread() {
        gameThread = new Thread(this); // instantiate a thread
        gameThread.start();
    }

    @Override
    public void run() {
        while (gameThread != null) {
            // 1. UPDATE info such as character pos
            update();

            // 2. DRAW the screen with the updated info
            repaint();
        }
    }

    public void update() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.white);
        g2.fillRect(100, 100, tilesize, tilesize);// puts a rectangle
        g2.dispose();// releases any system resources it was using

    }

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true); // the drawing of the screen will be done offscreen

    }

}
