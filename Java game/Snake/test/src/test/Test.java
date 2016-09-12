/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Daniel
 */
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Test 
{
boolean loop;
static boolean exit;

public static void main(String[] args) throws AWTException
{
    System.out.println("before");
    makeButtons();
    System.out.println("after");
}

public static void makeButtons()
{
    JFrame jfrMain = new JFrame ("Mouse Robot");
    JPanel jplMain = new JPanel();
    final JButton run = new JButton("Run");
    final JButton end = new JButton("End");

    run.setEnabled(true);
    end.setEnabled(true);

    run.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            //run.setEnabled(false);
            //end.setEnabled(true);
            try {
                run(true);
            } catch (AWTException e1) 
            {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    });

    end.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            exit = true;
        }
    });

    jplMain.setLayout(new FlowLayout());
    jplMain.add(run);
    jplMain.add(end);

    jfrMain.getContentPane().add(jplMain, BorderLayout.CENTER);
    jfrMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrMain.pack();
    jfrMain.setVisible(true);

    }   

public static void run(boolean loop) throws AWTException
{
    Robot r2d2 = new Robot();

    while(loop)
    {

        System.out.println("1");
        Point mousePoint = MouseInfo.getPointerInfo().getLocation();
        mousePoint.translate(0, 1);
        r2d2.mouseMove(mousePoint.x, mousePoint.y);
        r2d2.delay(60000);
        //r2d2.delay(60000);
        //r2d2.delay(60000);
        System.out.println("2");
        mousePoint = MouseInfo.getPointerInfo().getLocation();
        mousePoint.translate(0, -1);
        r2d2.mouseMove(mousePoint.x, mousePoint.y);
        r2d2.delay(60000);
        //r2d2.delay(60000);
        //r2d2.delay(60000);
        System.out.println("looping");
        if (exit = true)
        {
            break;
        }
    }
}

}