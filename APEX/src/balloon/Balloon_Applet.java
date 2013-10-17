package balloon;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;//import java.awt.event.*;  goes with ActionListener and actionPerformed

public class Balloon_Applet extends Applet
                             implements ActionListener//import java.awt.event.*;  goes with ActionListener and actionPerformed
{//variable & object declarations and initializations                                        
    Button up, left, down, right;
    public static final int DISPLAY_WIDTH = 600;// this is a constant
    private int startX = DISPLAY_WIDTH/2;
    private int startY = DISPLAY_WIDTH/2;
    
    public void init()
    {
    	left = new Button ("Left");
        add (left);
        left.addActionListener (this); 
    	
        up = new Button ("Up");
        add (up);
        up.addActionListener (this); 
        
        down = new Button ("Down");
        add (down);
        down.addActionListener (this); 
        
        right = new Button ("Right");
        add (right);
        right.addActionListener (this);  
          
        
    }// endInit 
    public void paint(Graphics g)
    {
        resize(DISPLAY_WIDTH,500);
        setBackground(Color.CYAN);
        g.setColor(Color.BLACK);
        g.fillOval(startX,startY,50,70); 
       
    }//endPaint
    
    public void actionPerformed(ActionEvent clic)//import java.awt.event.*;  goes with ActionListener and actionPerformed
    {
        if ( clic.getSource()== right)
            doRight();
        if ( clic.getSource()== left)
            doLeft();
        if ( clic.getSource()== up)
            doUp();
        if ( clic.getSource()== down)
            doDown();
        repaint();
    }//endActionPerformed
    
    public void doLeft()
    {
        startX-=50;
    }
    public void doUp()
    {
        startY-=50;
    }
    public void doDown()
    {
        startY+=50;
    }
    public void doRight()
    {
        startX+=50;
    }
}   //endProgram    









