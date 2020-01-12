/*<applet code="AppletPara" height="500" width="500"></applet>*/
import java.applet.Applet;
import java.awt.*;
public class AppletPara extends Applet{
	private String defaultMessage="hello";
	public void paint(Graphics g){
		String s1=this.getParameter("Message");
		if(s1==null)
			s1 = defaultMessage;
		g.drawString(s1,50,50);
	}
}
