package ton_of_bricks;

import java.applet.Applet;
import java.awt.*;

public class ton_of_bricks_for extends Applet{
	
   private static final long serialVersionUID = 1L;
  
   public static final int START_X = 0;
   public static final int START_Y = 0;
   public static final int BRICK_WIDTH = 32;
   public static final int BRICK_HEIGHT = 16;
   public static final int GAP = 4;
   public static final int DISPLAY_WIDTH = 600;
   public static final int DISPLAY_HEIGHT = 600;

   public void paint(Graphics g){
	   
      int x = START_X;
      int y = START_Y;

      resize(DISPLAY_WIDTH, DISPLAY_HEIGHT);
      setBackground(Color.darkGray);
      g.setColor(Color.red);

      for (int row = 1; row <= DISPLAY_HEIGHT; row++){

         for (int col = 1; col <= DISPLAY_WIDTH; col++){ 
        	 
            g.fillRect (x, y, BRICK_WIDTH, BRICK_HEIGHT);
            x += BRICK_WIDTH + GAP;
            
         }

         if (row%2 == 0)
             x = START_X;
          else
             x = START_X - BRICK_WIDTH/2 - GAP/2;

         y += BRICK_HEIGHT + GAP;

      }
   }
}