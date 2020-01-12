import java.awt.event.*;
import java.applet.Applet;
import java.awt.*;
/*<applet code="Guiadd" width="500",height="350"></applet>*/ 
public class Guiadd extends Applet implements ActionListener{
	 Label l1,l2,l3;
     TextField t1,t2;
	 Button b1,b2;
	public void init(){
		   setBackground(Color.cyan);
      	   l1=new Label("Enter First No");
	       l2=new Label("Enter Second No");
		   t1=new TextField();
		   t2=new TextField();
		   b1=new Button("Add");
		   l3=new Label("");
           b2=new Button("clear");
	       setLayout(null);
		   l1.setBounds(60,60,80,40);
		   t1.setBounds(180,70,200,20);
		   l2.setBounds(60,100,95,40);
       	   t2.setBounds(180,110,200,20);
		   b1.setBounds(200,180,50,30);
     	   l3.setBounds(30,300,80,50);
           b2.setBounds(280,180,50,30);	
           b1.setVisible(true);		   
		   add(l1);
		   add(t1);
		   add(l2);
		   add(l3);
		   add(t2);
		   add(b1);
		   add(b2);
		   b1.addActionListener(this);
		   b2.addActionListener(this);
		   }
          public void actionPerformed(ActionEvent e){
			  int a,b,sub,s;
			  a=Integer.parseInt(t1.getText());
			  b=Integer.parseInt(t2.getText());
		  if(e.getSource()==b1){
			  s=a+b;
			  l3.setText("Sum is"+s);
		  /*if(e.getSource()==b2){
		    t1.setText("");
		    t2.setText("");
			a=0;
			b=0;
			*/

			  
		  }
		  }
		  }			  
     
		
     