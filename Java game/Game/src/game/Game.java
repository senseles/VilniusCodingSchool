/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Daniel
 */
public class Game extends JPanel {
    
    Ball ball = new Ball(this);
    Racquet racquet = new Racquet(this);
    public static AudioClip clip = null;
    public static AudioClip clip2 = null;
    public static AudioClip clip3 = null;
    int speed = 0;
    
    private int getScore() {
        return speed - 1;
    }
    
    public Game() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
            }
            
            @Override
            public void keyPressed(KeyEvent ke) {
                racquet.keyPressed(ke);
            }
            
            @Override
            public void keyReleased(KeyEvent ke) {
                racquet.keyReleased(ke);
            }
        });
        setFocusable(true);
    }
    
    public void gameOver() {
        
        JOptionPane.showMessageDialog(this, "Game Over", "Game Over", JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        ball.paintBall(g2d);
        racquet.paintRacquet(g2d);
        
        g2d.setColor(Color.GRAY);
        g2d.setFont(new Font("Verdana", Font.BOLD, 30));
        g2d.drawString(String.valueOf(getScore()), 10, 30);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        // TODO code application logic here
        JFrame frame = new JFrame("Mini Tennis");
        Game game = new Game();
        frame.add(game);// klases pridejimas prie lango
        frame.setSize(300, 400);// lango parametrai 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        URL url = new URL("http://www.slinkycity.com/u4r/32dohs.wav");
        clip = Applet.newAudioClip(url);
        
        while (true) {
            game.move();
            game.repaint();
            Thread.sleep(10);
        }
    }
    
    private void move() {
        ball.moveBall();
        racquet.moveRacquet();
    }
}
