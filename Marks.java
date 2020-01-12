import java.util.Scanner;
public class Marks{
	public static void main(String[] args){
		int passingmarks,obtainedmarks;
        passingmarks=33;
		System.out.println("Enter the marks=");
        Scanner sc=new Scanner(System.in);
		obtainedmarks=sc.nextInt();
		System.out.println("Scored marks="+obtainedmarks);
		if(obtainedmarks>=passingmarks){
			System.out.println("Pass hai bhai tu");
		}
		
		else{
			System.out.println("Try again bro");
		}
		while(obtainedmarks>=60){
		    System.out.println("waah 60 aaga");
		}
		//do(obtainedmarks=1);


	}
	
}
			
         		