import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
     
        
        
    
        	  //Point A coordinates
        	  int x1 = 0;
        	  int y1 = 600;
        	 
        	  //Point B coordinates
        	  int x2 = 0;
        	  int y2 = 0;
        	 
        	  //loop that repeats 150 times
        	  int count = 0; //control variable
        	  for(count = 0; count < 150; count++){
        		//draw the line
        		g2.drawLine(x1,y1,x2,y2);
        	    
        		//update point A so that it moves down
        		 y1-=10;
        		 x2+=15;
        	    
        		//update point B so that it moves
        	  }
        		 
        	  x1 = 800;
           	  y1 = 600;
           	 
           	  //Point B coordinates
           	  x2 = 800;
           	  y2 = 0;
           	 
           	  //loop that repeats 150 times
           	  count = 0; //control variable
           	  for(count = 0; count < 150; count++){
           		//draw the line
           		g2.drawLine(x1,y1,x2,y2);
           	    
           		//update point A so that it moves down
           		 y1-=10;
           		 x2-=15;
           	    

        	  }
        	  }
        	
	
	
	
	
        
        
		 
	/*	//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		g2.drawRect(10, 10, 765, 540);
		
		
		//2) Draw a horizontal line to bisect the Rectangle
		g2.drawLine(10, 270, 770, 270);
		
		
		//3) Draw a vertical line to bisect the shape again
		g2.drawLine(765/2, 10, 765/2,550 );
		
		
		//4) small rectangles on top-left
	//	g2.drawLine(765/4, 10, 765/4, 550/2-10);
		
		
		/* 
		 * int var = 0; 						<---- control variable
		 * while(var < 10){ 					<---- condition to run the loop
		 *   
		 *   //any repeating code
		 *   
		 *   var++;								<---- update control variable
		 *   
		 * }
		 */
		
		/* int count = 0;

        g2.setStroke(new BasicStroke(2));
        while(count<=100) {
        	int colorR = (int)(Math.random()*256);
        	int colorG = (int)(Math.random()*256);
        	int colorB = (int)(Math.random()*256);
        	int x1 = (int)(Math.random()*373)+10;
        	int x2 = (int)(Math.random()*373)+10;
        	int y1 = (int)(Math.random()*261)+10;
        	int y2 = (int)(Math.random()*261)+10;

        	g2.setColor(new Color(colorR,colorG,colorB));
        	g2.drawLine(x1, y1, x2, y2);
        	count++;
        	
        }
        
        count=0;
        while(count<=100) {
        	int colorR = (int)(Math.random()*256);
        	int colorG = (int)(Math.random()*256);
        	int colorB = (int)(Math.random()*256);
        	int x1 = (int)(Math.random()*365)+383;
        	int y1 = (int)(Math.random()*235)+7;
        	g2.setColor(new Color(colorR,colorG,colorB));
        	g2.fillRect(x1, y1, 28, 28);
        	count++;
        	
        }
        
        count=0;
        g2.setStroke(new BasicStroke(1));

        while(count<=50) {
        	
        	int colorR = (int)(Math.random()*256);
        	int colorG = (int)(Math.random()*256);
        	int colorB = (int)(Math.random()*256);
        	int x1 = (int)(Math.random()*1000)+10;
        	int y1 = (int)(Math.random()*1000)+275;
        	int diameter = (int)(Math.random()*201)+10;        	
        	while(x1+diameter>375||y1+diameter>=550) {
            	x1 = (int)(Math.random()*1000)+15;
            	y1 = (int)(Math.random()*1000)+275;
        	}
        	
        	g2.setColor(new Color(colorR,colorG,colorB));
        	g2.drawOval(x1,y1,diameter, diameter);
        	count++;
        }


	
	
	}
	
	
	
	
	
	
	*/
	
	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
		
		
		
	}
}
