import java.util.Scanner;
class While{
	public static void main(String[] args){
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		while((n=sc.nextInt())!=0){
			System.out.println("You Entered"+n);
		    System.out.println("Its an integer");
		}
		System.out.println("Out of loop");
	}
}