import java.applet.*;
import java.awt.*;

public class Shapes extends Applet{
		public void init(){
			setBackground(Color.white);
			setForeground(Color.blue);
			//setColor(Color.red);
		}
		int x =300,y = 100,r = 50;
		public void paint(Graphics g){
			
			g.drawLine(30,300,200,10);
			g.drawOval(x-r,y-r,100,100);
			g.drawRect(400,50,200,100);
		}
}