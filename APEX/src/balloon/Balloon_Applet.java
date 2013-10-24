package balloon;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Balloon_Applet extends Applet
	
implements ActionListener{  
	
    private static final long serialVersionUID = 1L; 
    
    Button north, west, south, east, northeast, northwest, southeast, southwest, center;
    Button increaseWidth, decreaseWidth, increaseHeight, decreaseHeight;
    Button UL, UR, LL, LR;
    
    public int displayWidth = 600;
    public int displayHeight = 600;
    public int boundX = displayWidth-50;
    public int boundY = displayHeight-76;
    public int startX = boundX/2;
    public int startY = boundY/2;
    
    public static final boolean CONSOLE_LOGGING = true;
        
    public void init(){
    	
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
        
        center = new Button ("Center");
        add (center);
        center.addActionListener (this);
        
        south = new Button ("South");
        add (south);
        south.addActionListener (this); 
                 
        southwest = new Button ("Southwest");
        add (southwest);
        southwest.addActionListener (this);
        
        southeast = new Button ("Southeast");
        add (southeast);
        southeast.addActionListener (this); 
                
        east = new Button ("East");
        add (east);
        east.addActionListener (this); 
        
        increaseWidth = new Button ("Increase Width");
        add (increaseWidth);
        increaseWidth.addActionListener (this); 
        
        decreaseWidth = new Button ("Decrease Width");
        add (decreaseWidth);
        decreaseWidth.addActionListener (this); 
        
        increaseHeight = new Button ("Increase Height");
        add (increaseHeight);
        increaseHeight.addActionListener (this); 
        
        decreaseHeight = new Button ("Decrease Height");
        add (decreaseHeight);
        decreaseHeight.addActionListener (this); 
        
        UL = new Button ("Upper Left Corner");
        add (UL);
        UL.addActionListener (this);
        
        UR = new Button ("Upper Right Corner");
        add (UR);
        UR.addActionListener (this);
        
        LL = new Button ("Lower Left Corner");
        add (LL);
        LL.addActionListener (this);
        
        LR = new Button ("Lower Right Corner");
        add (LR);
        LR.addActionListener (this);
    
    } // end Init 
    
    public void paint(Graphics g){
    	
    	resize(displayWidth, displayHeight);
        setBackground(Color.BLACK);
        g.setColor(Color.WHITE);
        g.fillOval(startX,startY,50,70);
        g.drawLine(startX+25,startY+70,displayWidth/2, displayHeight);
        
    } //end Paint
    
    public void actionPerformed(ActionEvent click){
            
    		if (click.getSource()== west)
    			doWest();
            else if (click.getSource()== northwest)
            	doNorthwest();
            else if (click.getSource()== northeast)
            	doNortheast();
            else if (click.getSource()== north)
            	doNorth();
            else if (click.getSource()== center)
            	doCenter();
            else if (click.getSource()== south)
            	doSouth();
            else if (click.getSource()== southwest)
            	doSouthwest();
            else if (click.getSource()== southeast)
            	doSoutheast();
            else if (click.getSource()== east)
            	doEast();
            else if (click.getSource()== increaseWidth)
            	doincreaseWidth();
            else if (click.getSource()== decreaseWidth)
            	dodecreaseWidth();
            else if (click.getSource()== increaseHeight)
            	doincreaseHeight();
            else if (click.getSource()== decreaseHeight)
            	dodecreaseHeight();
            else if (click.getSource()== UL)
            	doUpperLeftCorner();
            else if (click.getSource()== UR)
                doUpperRightCorner();
            else if (click.getSource()== LL)
                doLowerLeftCorner();
            else if (click.getSource()== LR)
                doLowerRightCorner();
                        
    		repaint();
        
    		if (CONSOLE_LOGGING)
                System.out.println(startX + " " + startY);
            
    } //end ActionPerformed
    
    public void doNorth(){
    	
        if (startY-10 >= 0)
            startY-=10;
        else
            startY -= Math.abs(0+startY);
    }
    public void doWest(){
    	
    	if (startX-10 >= 0)
            startX-=10;
        else
            startX -= Math.abs(0+startX);
    }
    public void doEast(){
    	
        if (startX+10 <= boundX)
            startX+=10;
        else
            startX += Math.abs(boundX-startX);
    }
    public void doSouth(){
    	
    	if (startY+10 <= boundY)
    		startY+=10;
    	else
    		startY += Math.abs(boundY-startY);
    }
    public void doNorthwest(){
    	
    	doNorth();
        doWest();
    }
    public void doNortheast(){
    	
        doNorth();
        doEast();
    }
    public void doSouthwest(){
    	
        doSouth();
        doWest();
    }
    public void doSoutheast(){
    	
        doSouth();
        doEast();
    }
    public void doincreaseWidth(){
    	
    	displayWidth += 25;
    	boundX = displayWidth - 50;
     
    }
    public void dodecreaseWidth(){
    	
    	displayWidth -= 25;
    	boundX = displayWidth - 50;
    
    }
    public void doincreaseHeight(){
	
    	displayHeight += 25;
    	boundY = displayHeight - 70;
    
    }
    public void dodecreaseHeight(){
	
    	displayHeight -= 25;
    	boundY = displayHeight - 70;
        	
    }
    public void doCenter(){
	
    	startX=boundX/2;
        startY=boundY/2;
    
    }
    public void doUpperLeftCorner(){
    	
    	startX = 0;
    	startY = 0;
    	
    }
	public void doUpperRightCorner(){
    	
		startX = boundX;
		startY = 0;
		
    }
 	public void doLowerLeftCorner(){
 	
 		startX = 0;
 		startY = boundY;
 		
 	}
 	public void doLowerRightCorner(){
 	
 		startX = boundX;
 		startY = boundY;
 		
 	}
    
 } //end ActionListener   