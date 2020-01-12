import java.util.Scanner;
public class Switchcase{
	public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Your Grade=");
	 char grade=sc.next().charAt(0);
	 switch(grade)
	 {
		 case 'A':
		      System.out.println("Excellent");
		      break;
		 case 'B':
		       System.out.println("Well Done");
		      break;
		  case 'C':
		   System.out.println("Passed");
		      break;
		  case 'D':
		   System.out.println("Better try Again");
		      break;
        default :
        System.out.println("Invalid Statement");
	 }
	 if(grade=='A'){
     System.out.println("Your grade="+grade);
	 }
	 else if(grade=='B'){
	 System.out.println("Your grade="+grade);
	 } 
	 else if(grade=='C'){
	 System.out.println("Your grade="+grade);
	 } 
	 else if(grade =='D'){
	 System.out.println("Your grade="+grade);
	 }
	 else {
	 System.out.println("Enter right grade");
	 }
}
}