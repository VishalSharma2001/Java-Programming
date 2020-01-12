import java.awt.*;
import java.applet.*;
public class Appsample extends Applet{
	String msg;
	public void init(){
		msg="inside init()";
	}
	public void start(){
	   msg+="inside paint()";
	}
	public void paint(Graphics g){
		msg+="inside paint()";
		g.drawString(msg,10,30);
	}
}
/*<applet code="Appsample" Width="300",Height="300"></applet>*/