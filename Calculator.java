import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;





public class Calculator extends Applet implements ActionListener
{
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn_mul,btn_div,btn_min,btn_add,btn_enter,btn_decimal,btn_clr;
    Label lbltext;
    
    String temp1="",temp2,temp4;
    double temp3;
    boolean decimal=false,mul=false,div=false,add=false,min=false,first=true;
    
    public void init()
    {
        setForeground(Color.blue);
        setBackground(Color.yellow);
        Font font = new Font("Verdana", Font.BOLD, 20);
        setFont(font);
        
        setLayout(null);
        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");
        btn6 = new Button("6");
        btn7 = new Button("7");
        btn8 = new Button("8");
        btn9 = new Button("9");
        btn0 = new Button("0");
        btn_mul = new Button("*");
        btn_div = new Button("/");
        btn_min = new Button("-");
        btn_add = new Button("+");
        btn_enter = new Button("=");
        btn_decimal = new Button(".");
        btn_clr = new Button("Clear All");
        lbltext = new Label("Press Button to add value..");
        
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btn0);
        add(btn_mul);
        add(btn_div);
        add(btn_min);
        add(btn_add);
        add(btn_enter);
        add(btn_decimal);
        add(lbltext);
        add(btn_clr);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn0.addActionListener(this);
        btn_mul.addActionListener(this);
        btn_div.addActionListener(this);
        btn_min.addActionListener(this);
        btn_add.addActionListener(this);
        btn_enter.addActionListener(this);
        btn_decimal.addActionListener(this);
        btn_clr.addActionListener(this);
        
        lbltext.setBounds(10,10,450,30);
        btn1.setBounds(10,45,50,50);
        btn2.setBounds(90,45,50,50);
        btn3.setBounds(170,45,50,50);
        btn_mul.setBounds(250,45,50,50);
        
        
        btn4.setBounds(10,125,50,50);
        btn5.setBounds(90,125,50,50);
        btn6.setBounds(170,125,50,50);
        btn_div.setBounds(250,125,50,50);
        
        btn7.setBounds(10,205,50,50);
        btn8.setBounds(90,205,50,50);
        btn9.setBounds(170,205,50,50);
        btn_min.setBounds(250,205,50,50);
        
        btn0.setBounds(10,285,50,50);
        btn_decimal.setBounds(90,285,50,50);
        btn_enter.setBounds(170,285,50,50);
        btn_add.setBounds(250,285,50,50);
        
        btn_clr.setBounds(10,365,250,50);
        
    }
    


    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn1)
        {
                temp1=temp1+"1";
                lbltext.setText(temp1);
        }
        if(e.getSource()==btn2)
        {
                temp1=temp1+"2";
                lbltext.setText(temp1);
        }
        if(e.getSource()==btn3)
        {
                temp1=temp1+"3";
                lbltext.setText(temp1);
        }
        if(e.getSource()==btn4)
        {
                temp1=temp1+"4";
                lbltext.setText(temp1);
        }
        if(e.getSource()==btn5)
        {
                temp1=temp1+"5";
                lbltext.setText(temp1);
        }
        if(e.getSource()==btn6)
        {
                temp1=temp1+"6";
                lbltext.setText(temp1);
        }
        if(e.getSource()==btn7)
        {
                temp1=temp1+"7";
                lbltext.setText(temp1);
        }
        if(e.getSource()==btn8)
        {
                temp1=temp1+"8";
                lbltext.setText(temp1);
        }
        if(e.getSource()==btn9)
        {
                temp1=temp1+"9";
                lbltext.setText(temp1);
        }
        if(e.getSource()==btn0)
        {
                temp1=temp1+"0";
                lbltext.setText(temp1);
        }
        if(e.getSource()==btn_decimal&& decimal==false)
        {
                temp1=temp1+".";
                lbltext.setText(temp1);
                decimal=true;
        }
        
        if(e.getSource()==btn_clr)
        {
            decimal=false;
            mul=false;
            div=false;
            add=false;
            min=false;
            first=true;
            temp1="";
            temp2="";
            temp3=0;
            temp4="";
            lbltext.setText("");
        }
        if(e.getSource()==btn_mul)
        {
            mul=true;
            div=false;
            min=false;
            add=false;
            
            temp2=temp1;
            lbltext.setText("");
            temp1="";
            //if(temp4!=null){action(); }
            
        }
        if(e.getSource()==btn_div)
        {
            mul=false;
            div=true;
            min=false;
            add=false;
            
            temp2=temp1;
            lbltext.setText("");
            temp1="";
            //if(first==false){action();    }
            
        }
        if(e.getSource()==btn_min)
        {
            mul=false;
            div=false;
            min=true;
            add=false;
            
            temp2=temp1;
            lbltext.setText("");
            temp1="";
            if(first==false){action();  }
            first=false;
        }
        if(e.getSource()==btn_add)
        {
            mul=false;
            div=false;
            min=false;
            add=true;
            
            temp2=temp1;
            lbltext.setText("");
            temp1="";
            //if(first==false){action();    }
            first=false;
        }
        
        if(e.getSource()==btn_enter)
        {
            action();
        }
    }
    
    public void action()
    {
        if(mul)
            {
                temp3 = Double.parseDouble(temp2) * Double.parseDouble(temp1);
                temp4=Double.toString(temp3);
                temp1=temp4;
                lbltext.setText(temp4);
                mul=false;
                div=false;
                min=false;
                add=false;
            }
            if(div)
            {
                temp3 = Double.parseDouble(temp2) / Double.parseDouble(temp1);
                temp4=Double.toString(temp3);
                temp1=temp4;
                lbltext.setText(temp4);
                mul=false;
                div=false;
                min=false;
                add=false;
            }
            if(min)
            {
                temp3 = Double.parseDouble(temp2) - Double.parseDouble(temp1);
                temp4=Double.toString(temp3);
                temp1=temp4;
                lbltext.setText(temp4);
                mul=false;
                div=false;
                min=false;
                add=false;
            }
            if(add)
            {
                temp3 = Double.parseDouble(temp2) + Double.parseDouble(temp1);
                temp4=Double.toString(temp3);
                temp1=temp4;
                lbltext.setText(temp4);
                mul=false;
                div=false;
                min=false;
                add=true;
            }
    }
}
/*<applet code="Calculator" width="500",height="350"></applet>*/ 