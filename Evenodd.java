import java.util.*;
class Evenodd{
	public static void main(String[] args){
		int a;
		System.out.println("Enter the num:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a % 2 ==0){
			System.out.println("number is even");
		}
		else{
         System.out.println("number is odd");
	    }
	}
}	