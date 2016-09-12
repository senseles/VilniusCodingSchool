/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotsclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author Daniel
 */
public class RobotsClass {

    /**
     * @param args the command line arguments
     */
    Robot robot =null;

    public static void main(String[] args) {
        // TODO code application logic here
          new RobotsClass();
          
    }

    public RobotsClass() throws AWTException {
          robot = new Robot();
        
        robot.setAutoDelay(40);
        robot.setAutoWaitForIdle(true);

        robot.delay(4000);
        robot.mouseMove(40, 130);
        robot.delay(500);

        leftClick();
        robot.delay(500);
        leftClick();

        robot.delay(500);
        type("Hello, world");

        robot.mouseMove(40, 160);
        robot.delay(500);

        leftClick();
        robot.delay(500);
        leftClick();

        robot.delay(500);
        type("This is a test of the Java Robot class");

        robot.delay(50);
        type(KeyEvent.VK_DOWN);

        robot.delay(250);
        type("Four score and seven years ago, our fathers ...");

        robot.delay(1000);
        System.exit(0);
    }

    private void leftClick() {
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }

    private void type(int i) {
        robot.delay(40);
        robot.keyPress(i);
        robot.keyRelease(i);
    }

    private void type(String s) {
        byte[] bytes = s.getBytes();
        for (byte b : bytes) {
            int code = b;
            // keycode only handles [A-Z] (which is ASCII decimal [65-90])
            if (code > 96 && code < 123) {
                code = code - 32;
            }
            robot.delay(40);
            robot.keyPress(code);
            robot.keyRelease(code);
        }
    }

}
