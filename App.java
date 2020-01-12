import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
public class App extends Applet{
	public void init(){
      setBackground(Color.YELLOW);		
	}
	 public void paint(Graphics g){
		 g.setFont(new Font("TimesRomen",Font.PLAIN,80));
		 g.setColor(Color.BLUE);
		 g.drawString("sumit ko",200,200);  
		 g.drawString("thagh liya",350,300); 
		 g.drawString("I3 bol ke pentium de diya",450,400);
		 g.drawString("par hai super fast",530,490);
	}
}
            