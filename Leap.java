import java.util.Scanner;
class Leap{
     int year;
     boolean isleap=false;
	 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the year");
	 year=sc.nextInt();
	 if(year%4==0){
		 if(year%400==0 || year%100!=0)
			 isleap=true;
	 } 
	else
     isleap=false;
    if(isleap)
     System.out.println("year is leap");
    else
    System.out.println("year is not leap");		
	 }
    public static void main(String []args){
	 new Leap();  
	}
}