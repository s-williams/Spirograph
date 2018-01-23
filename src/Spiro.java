import java.awt.*;
import javax.swing.JApplet;
import java.math.*;

public class Spiro extends JApplet {
	
	public void paint(Graphics screen) {
		Graphics2D screenX = (Graphics2D) screen;
		int R = 50;
		int r = 10;
		int O = 50;
		double t = 0;
//		double x = (R+r)*Math.cos(t) - (r+O)*Math.cos(((R+r)/r)*t);
//		double y = (R+r)*Math.cos(t) - (r+O)*Math.cos(((R+r)/r)*t);
		while (t<=100000) {
			double x = ((R+r)*Math.cos(t) - (r+O)*Math.cos(((R+r)/r)*t))+300;
			double y = ((R+r)*Math.sin(t) - (r+O)*Math.sin(((R+r)/r)*t))+300;
			//System.out.println(x);
			//System.out.println(y);
			screenX.drawLine((int)(x), (int)(y), (int)(x), (int)(y));
			t++;
		}
	}
	
	public void init() {
		
	}
	
}
