/*import javax.swing.*;
public class Swing1{
	public static void main(String [] args){
    JFrame f=new JFrame();
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(500,500);
	f.setTitle("vishal swing");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}		
  First method  */
/*import javax.swing.*;
public class Swing1 extends JFrame{
	Swing1()
	{
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(500,500);
	setTitle("vishal swing");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
	 Swing1 s=new Swing1();
	}
}
Second method*/

import javax.swing.*;
public class Swing1 extends JFrame{
public Swing1(){}
public Swing1(String s){
	super(s);
}
     public static void main(String[] args){
    Swing1 f=new Swing1("vishal Swing");
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(500,500);
	f.setTitle("vishal swing");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	 }
	 }
	 
	 
	 
	 
	 l4.setBounds(10,10,150,30);
	 b1.setBounds(200,180,100,30);