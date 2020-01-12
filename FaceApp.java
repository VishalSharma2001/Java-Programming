/*<applet code="FaceApp" width="1000" height="1000"></applet>*/
import java.applet.*;
import java.awt.*;
import java.io.*;
public class FaceApp extends Applet{
	public void  init(){
	 setBackground(Color.CYAN);
	}
	public void paint(Graphics g){
		g.setColor(Color.YELLOW);
        g.fillOval(150,80,500,550);
		g.setColor(Color.RED);
		g.fillOval(378,370,50,50);
        g.setColor(Color.black);
        g.drawOval(210,220,150,60);
        g.fillOval(275,240,25,25);		
	    //g.drawOval 
	}
}