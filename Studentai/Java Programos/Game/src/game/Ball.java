/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author Daniel
 */
public class Ball {

    private static final int DIAMETER = 10;
    int x = 0;
    int y = 0;
    int xa = 1;
    int ya = 1;
    private Game game;

    Ball(Game game) {
        this.game = game;
    }

    public void moveBall() {
        if (x + xa > game.getWidth() - 45) {
            xa = -1;
        }
        if (x + xa < 0) {

            xa = 1;
        }
        if (y + ya > game.getHeight() - 30) {
            ya = -1;
        }
        if (y + ya < 0) {
            ya = 1;
        }
        if (collision()) {
            ya = -1;
            y = game.racquet.getTopY() - DIAMETER;

        }
        if (y > 325) {
            game.gameOver();
        }
        game.speed++;
        x = x + xa;
        y = y + ya;
    }

    public boolean collision() {
        return game.racquet.getBounds().intersects(getBounds());
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }

    public void paintBall(Graphics2D g2d) {
        g2d.fillOval(x, y, DIAMETER, DIAMETER);
    }
}
