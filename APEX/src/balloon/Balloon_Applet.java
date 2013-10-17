package balloon;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;//import java.awt.event.*;  goes with ActionListener and actionPerformed

public class Balloon_Applet extends Applet
                             implements ActionListener//import java.awt.event.*;  goes with ActionListener and actionPerformed
{//variable & object declarations and initializations                                        
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L; //serial id
	Button north, west, south, east, northeast, northwest, southeast, southwest;
    public static final int DISPLAY_WIDTH = 600;// this is a constant
    private int startX = DISPLAY_WIDTH/2;
    private int startY = DISPLAY_WIDTH/2;

    public static final boolean CONSOLE_LOGGING = true;
        
    public void init()
    {
    	west = new Button ("West");
        add (west);
        west.addActionListener (this); 
    	
        northwest = new Button ("Northwest");
        add (northwest);
        northwest.addActionListener (this); 
        
        northeast = new Button ("Northeast");
        add (northeast);
        northeast.addActionListener (this); 
                
        north = new Button ("North");
        add (north);
        north.addActionListener (this); 
        
        south = new Button ("South");
        add (south);
        south.addActionListener (this); 
                 
        southwest = new Button ("Southwest");
        add (southwest);
        southwest.addActionListener (this);
        
        southeast = new Button ("Southeast");
        add (southeast);
        south.addActionListener (this); 
                
        east = new Button ("East");
        add (east);
        east.addActionListener (this);  
          
        
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
    	if (clic.getSource()== west)
            doWest();
    	else if (clic.getSource()== northwest)
            doNorthwest();
    	else if (clic.getSource()== northeast)
            doSoutheast();
    	else if (clic.getSource()== north)
            doNorth();
    	else if (clic.getSource()== south)
            doSouth();
    	else if (clic.getSource()== southwest)
            doWest();
    	else if (clic.getSource()== southeast)
        	doEast();
    	else if (clic.getSource()== east)
            doEast();
                   
        repaint();
        
        if (CONSOLE_LOGGING)
        	System.out.println(startX + " " + startY);
            
    }//endActionPerformed
    
    public void doWest()
    {
        startX-=50;
    }
    public void doNorthwest()
    {
        startY-=50;
        startX-=50;
    }
    public void doNortheast()
    {
    	startX+=50;
    	startY-=50;
        
    }
    public void doNorth()
    {
        startY-=50;
    }
    public void doSouth()
    {
        startY+=50;
    }
    public void doSoutwest()
    {
        startY+=50;
        startX-=50;
    }
    public void doSoutheast()
    {
        startX+=50;
    }
    public void doEast()
    {
        startX+=50;
    }
}   //endProgram    









