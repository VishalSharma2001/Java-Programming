package pack1;
import pack2.Student;
import pack2.Sport;
public class Example{
	//private int c;
	public static void main(String[] args){
    Student s1=new Student();
    s1.setRollno(98);
    s1.setName("vishal");
    s1.setmarks(71);
    System.out.println("Rollno="+s1.getRollno());
	System.out.println("Name="+s1.getName());
	System.out.println("Marks="+s1.getmarks());
	Sport s2=new Sport();
	s2.setscorecricket(305);
	s2.setscorefootball(5);
	/* this is wrape method*/
	//int c =Integer.parseInt("315");
	//System.out.println("score="+c);
	System.out.println("CricketScore="+s2.getcricket());
    System.out.println("FootBallScore="+s2.getfootball());
	}
}

