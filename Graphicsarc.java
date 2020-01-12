import java.applet.*;
import java.awt.*;
public class Graphicsarc extends Applet{
	public void init(){
 	}
	public void paint(Graphics g){
	//g.drawArc(10,10,50,100,10,45);
	for( int i=0;i<=320;i++){
		g.setColor(Color.YELLOW);
	g.fillArc(100,100,100,100,i,320);
	}
	g.setColor(Color.BLACK);
	g.fillOval(170,120,10,10);
	g.drawRect(100,95,100,110);
	}
}
/*<applet code="Graphicsarc" height="400" width="500"> </applet>*/