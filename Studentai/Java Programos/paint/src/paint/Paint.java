/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;
     import javax.imageio.ImageIO;
     import javax.swing.*;
     import javax.swing.border.Border;
     import javax.swing.border.LineBorder;

     import java.awt.*;
     import java.awt.event.*;
     import java.awt.image.BufferedImage;
     import java.io.File;
     import java.io.IOException;
     import java.util.*;
/**
 *
 * @author Daniel
 */
public class Paint extends JPanel implements MouseListener,ActionListener {

    /**
     * @param args the command line arguments
     */
 public static int stroke, eraser = 0;
private int xX1, yY1 , xX2, yY2, choice ;

public static void main(String [] args)
{
    new Paint();
}

Paint()
{


    JFrame frame = new JFrame("Paint Program");
    frame.setSize(1200, 800);
    frame.setBackground(Color.WHITE);
    frame.getContentPane().add(this);


    JMenuBar menuBar = new JMenuBar();
    frame.setJMenuBar(menuBar);
    JMenu help = new JMenu("Help");
    menuBar.add(help);
    JMenuItem about = new JMenuItem("About");
    help.add(about);
    about.addActionListener(this);



    JButton button1 = new JButton("Clear");
    button1.addActionListener(this);
    JButton color = new JButton("Color");
    color.addActionListener(this);
    JButton erase = new JButton("Erase?");
    erase.addActionListener(this);
    JButton button2 = new JButton("Empty Rect");
    button2.addActionListener(this);
    JButton button3 = new JButton("Filled oval");
    button3.addActionListener(this);
    JButton button4 = new JButton("Filled Rect");
    button4.addActionListener(this);
    JButton button5 = new JButton("Empty oval");
    button5.addActionListener(this);
    JButton button6 = new JButton("Line");
    button6.addActionListener(this);
    JRadioButton thin = new JRadioButton("Thin Line");
    thin.addActionListener(this);
    JRadioButton medium = new JRadioButton("Medium Line");
    medium.addActionListener(this);
    JRadioButton thick = new JRadioButton("Thick Line");
    thick.addActionListener(this);


    ButtonGroup lineOption = new ButtonGroup( );
    lineOption.add(thin);
    lineOption.add(medium);
    lineOption.add(thick);

   this.add(button1); 
   this.add(color);
   this.add(erase);
   this.add(button2);
   this.add(button3);
   this.add(button4);
   this.add(button5);
   this.add(button6);
   this.add(thin);
   this.add(medium);
   this.add(thick);
   addMouseListener(this);
   frame.setVisible(true);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



}

public void paintComponent(Graphics g)
{ 
     super.paintComponent(g);  
     Graphics2D g2 = (Graphics2D)g;
     if(grid == null){
        int w = this.getWidth();
        int h = this.getHeight();
        grid = (BufferedImage)(this.createImage(w,h));
        gc = grid.createGraphics();
        gc.setColor(Color.BLUE);
     }

     g2.drawImage(grid, null, 0, 0);
     check();
}
BufferedImage grid;
Graphics2D gc;


public void draw()
{
    Graphics2D g = (Graphics2D)getGraphics();
     int w = xX2 - xX1;
        if (w<0)
        w = w *(-1);

   int h = yY2-yY1;
        if (h<0)
        h=  h*(-1);

     switch(choice)
    {
        case 1:
            check();
            gc.drawRect(xX1, yY1, w, h);
            repaint();
            break;

        case 2:
            check();
            gc.drawOval(xX1, yY1, w, h);
            repaint();
            break;

        case 3:
            check();
            gc.drawRect(xX1, yY1, w, h);
            gc.fillRect(xX1, yY1, w, h);
            repaint();
            break;

        case 4:
            check();
            gc.drawOval(xX1, yY1, w, h);
            gc.fillOval(xX1, yY1, w, h);
            repaint();
            break;  

        case 5:

            if (stroke == 0)
            gc.setStroke(new BasicStroke (1));
            if (stroke == 1)
            gc.setStroke(new BasicStroke (3));
            if (stroke == 2)
            gc.setStroke(new BasicStroke (6));
            gc.drawLine(xX1, yY1, xX2, yY2);
            repaint();
            break;

        case 6:
            repaint();
            Color temp = gc.getColor();
            gc.setColor(Color.WHITE);
            gc.fillRect(0, 0, getWidth(), getHeight());
            gc.setColor(temp);
            repaint();
            break;   

        case 7:

            if (eraser == 1)
            {
                gc.clearRect(xX1, yY1, w, h);
            }
            else
            {

            }
            break;
    }
}

public void check()
{
    if (xX1 > xX2)
    {
        int z = 0;
        z = xX1;
        xX1 = xX2;
        xX2 =z;
    }
    if (yY1 > yY2)
    {
        int z = 0;
        z = yY1;
        yY1 = yY2;
        yY2 = z;
    }
}




public void actionPerformed(ActionEvent e)
{

if (e.getActionCommand().equals("Color"))
{
     Color bgColor
     = JColorChooser.showDialog(this,"Choose Background Color", getBackground());
   if (bgColor != null)
     gc.setColor(bgColor);
}


if (e.getActionCommand().equals("About"))
{
    System.out.println("About Has Been Pressed");
    JFrame about = new JFrame("About");
    about.setSize(300, 300);
    JButton picture = new JButton(new ImageIcon("C:/Users/TehRobot/Desktop/Logo.png"));
    about.add(picture);
    about.setVisible(true);
}

if (e.getActionCommand().equals("Empty Rect")) 
{         
  System.out.println("Empty Rectangle Has Been Selected~");
   choice = 1;

  }

if (e.getActionCommand().equals("Empty oval")) 
{         
 System.out.println("Empty Oval Has Been Selected!");
   choice = 2;
  }


if (e.getActionCommand().equals("Filled Rect"))
{         
  System.out.println("Filled Rectangle Has Been Selected");
   choice = 3;
  }


if (e.getActionCommand().equals("Filled oval")) 
{         
 System.out.println("Filled Oval Has Been Selected");
   choice = 4;
  }


if (e.getActionCommand().equals("Line"))
{
    System.out.println("Draw Line Has Been Selected");
    choice = 5;
}

if (e.getActionCommand().equals("Thin Line"))
{
    stroke = 0;
}

if (e.getActionCommand().equals("Medium Line"))
{
    stroke = 1;
}

if (e.getActionCommand().equals("Thick Line"))
{
    stroke = 2;
}

if(e.getActionCommand().equals("Erase?"))
{
    eraser = 1;
    choice = 7;
}

if (e.getActionCommand().equals("Clear"))
{         
    System.out.println("Clear All The Things!!!");
    choice = 6;
    draw();
}


 }

 public void mouseExited(MouseEvent evt){}
 public void mouseEntered(MouseEvent evt){}
 public void mouseClicked(MouseEvent evt){}
 public void mousePressed(MouseEvent evt)
 {

     xX1 = evt.getX();
     yY1= evt.getY();



   }
 public void mouseReleased(MouseEvent evt)
 {
     xX2 =evt.getX();
     yY2=evt.getY();
     draw();
     eraser = 0;
   }
}
