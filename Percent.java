import java.util.*;
public class Percent{
    public static void main(String[] args){
	 double a,b,result;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter Scored num:");
	 a=s.nextInt();
	 System.out.println("Total num:");
	 b=s.nextInt();
	 result=(a/b)*100;
	 System.out.println("Percent is:"+result);
	 }
}