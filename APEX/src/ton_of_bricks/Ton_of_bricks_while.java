package ton_of_bricks;

import java.applet.*;
import java.awt.*;

public class Ton_of_bricks_while extends Applet {

	private static final long serialVersionUID = 1L;
	
	public int START_X = 0;
	public int START_Y = 0;
	public static final int DISPLAY_WIDTH = 600;
	public static final int DISPLAY_HEIGHT = 600;
	public static final int BRICK_WIDTH = 60;
	public static final int BRICK_HEIGHT = 30;
	public int GAP = 5;

	public void init(){
		resize(DISPLAY_WIDTH, DISPLAY_HEIGHT);
		setBackground(Color.GRAY);
	}

	public void paint(Graphics g){
		int currentX = 0;
		int currentY = 0;
		boolean checkIfRow = true;

		g.setColor(Color.RED);

		while (currentX <= DISPLAY_HEIGHT || currentY <= DISPLAY_WIDTH){

			if (currentX > DISPLAY_HEIGHT){
				
				currentY += BRICK_HEIGHT + GAP;

				if (checkIfRow){
					
					checkIfRow = false;
					currentX = START_X - (BRICK_WIDTH / 2);
				}
				else{
					
					currentX = START_X;
					checkIfRow = true;
				}

				g.fillRect(currentX, currentY, BRICK_WIDTH, BRICK_HEIGHT);

			}
			else if (currentX == START_X || currentX == START_X / 2){
				
				g.fillRect(currentX, currentY, BRICK_WIDTH, BRICK_HEIGHT);
				currentX += BRICK_WIDTH + GAP;
			}
			else{
				
				currentX += BRICK_WIDTH + GAP;
				g.fillRect(currentX, currentY, BRICK_WIDTH, BRICK_HEIGHT);
			}
			
			g.fillRect(currentX, currentY, BRICK_WIDTH, BRICK_HEIGHT);

		} //end while

	} //end paint

} //end public class Ton_of_bricks_while