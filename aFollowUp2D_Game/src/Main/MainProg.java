package Main;

import javax.swing.JFrame;

public class MainProg {

    public static void main(String[] args) {

        // Window that displays game
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("A mess called a 2D Game");

        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);

        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Actual workings of the game

    }
}