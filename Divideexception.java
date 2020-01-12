import java.util.Scanner;
class Divideexception{
	public static void main(String[] args){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the First num:");
		a=sc.nextInt();
		System.out.println("enter the Second num:");
		b=sc.nextInt();
		try{
		c=a/b;
		System.out.println("Result:"+c);
		}
     catch(ArithmeticException e){
            	 System.out.println("Error"+e.getMessage());
				 System.out.println("GO BACK");
	 }		
  	 
	}
}
		