/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

/**
 *
 * @author Daniel
 */
public class Racquet {

    private static final int Y = 330;
    private static final int WIDTH = 60;
    private static final int HEIGHT = 10;
    int x = 0;
    int xa = 0;
    private Game game;

    Racquet(Game game) {
        this.game = game;
    }

    public void paintRacquet(Graphics2D g2d) {
        g2d.fillRect(x, Y, WIDTH, HEIGHT);
    }

    void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            xa = -1;
        }
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            xa = 1;
        }
    }

    void keyReleased(KeyEvent ke) {
        xa = 0;
    }

    void moveRacquet() {
        if (x + xa > 0 && x + xa < game.getWidth() - WIDTH) {
            x = x + xa;
        }
    }

    public Rectangle getBounds() {
        return new Rectangle(x, Y, WIDTH, HEIGHT);
    }

    public int getTopY() {
        return Y;
    }
}
