package ton_of_bricks;

import java.applet.Applet;
import java.awt.*;

public class Ton_of_bricks_for extends Applet{
	
   private static final long serialVersionUID = 1L;
  
   public static final int START_X = 0;
   public static final int START_Y = 0;
   public static final int BRICK_WIDTH = 60;
   public static final int BRICK_HEIGHT = 30;
   public static final int DISPLAY_WIDTH = 600;
   public static final int DISPLAY_HEIGHT = 600;
   public static final int GAP = 5;

   public void init(){
	   resize(DISPLAY_WIDTH, DISPLAY_HEIGHT);
	   setBackground(Color.GRAY);
   }
   
   public void paint(Graphics g){
	   
   	   int x = 0;
   	   int y = 0;
   		  	   
   	   g.setColor(Color.RED); 
      
   	   for (int row = 1; row <= DISPLAY_WIDTH; row++){ //while row is less than windows width, increase rows

   			for (int col = 1; col <= DISPLAY_HEIGHT; col++){ //while col is less than windows height, increase cols 
        	         	 
   				g.fillRect (x, y, BRICK_WIDTH, BRICK_HEIGHT); //drawing bricks
            
   				x += BRICK_WIDTH + GAP; //generates columns
   			}

   			if (row%2 == 0)
   				x = START_X;
   			else
   				x = START_X - BRICK_WIDTH/2 - GAP/2; //offsets bricks  

   				y += BRICK_HEIGHT + GAP; //generates rows

   	   } //end for(rows)
   } //end pain
} //public class ton_of_bricks_for