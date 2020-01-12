import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
public class Swingadd extends JFrame{
	JLabel l1,l2,l3,l4;
    JTextField t1,t2;
	JButton b1,b2;
    	public void setComponent(){
		   l1=new JLabel("Enter First No");
	       l2=new JLabel("Enter Second No");
	       l3=new JLabel();
	       l4=new JLabel("Addtion of Two Number");
		   t1=new JTextField();
		   t2=new JTextField();
		   b1=new JButton("Add");
		   b2=new JButton("Clear");  
		   setLayout(null);
		   l1.setBounds(60,60,80,40);
		   t1.setBounds(180,70,200,20);
		   l2.setBounds(60,100,95,40);
       	   t2.setBounds(180,110,200,20);
		   b1.setBounds(200,180,90,30);
     	   l3.setBounds(30,300,80,50);
		   l4.setBounds(60,10,150,30);
           b2.setBounds(310,180,100,30);   		  
		  add(l1);
		   add(t1);
		   add(l2);
		   add(l3);
		   add(t2);
		   add(b1);
		   add(l4);
		   add(b2);
		   b1.addActionListener(new Handler());
		   b2.addActionListener(new Handler1());
		}
	class Handler implements ActionListener{
	public void actionPerformed(ActionEvent e){
	 int a,b,s;
     a=Integer.parseInt(t1.getText());
	 b=Integer.parseInt(t2.getText());
	 s=a+b;
	 l3.setText("Sum is="+s);
	}
	}
	class Handler1 implements ActionListener{
	public void actionPerformed(ActionEvent e){
	 t1.setText("");
	 t2.setText("");
	 l3.setText("");
	}
  	}
	
    public static void main(String[] args){
    Swingadd f =new Swingadd();
	f.setComponent();
	//f.setColor(Color.cyan);
	f.setTitle("Vishal Swings");
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(500,400);
	f.setTitle("vishal swing");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	 }
	 }