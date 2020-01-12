import java.util.Scanner;
class Swap3{
	public static void main(String[] args){
		int a,b,c,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		a=sc.nextInt();
		System.out.println("Enter b:");
		b=sc.nextInt();
		System.out.println("Enter c:");
		c=sc.nextInt();
		temp=a;
		a=b;
		b=c;
		c=temp;
		System.out.println("Value a:"+a);	
		System.out.println("Value b:"+b);
		System.out.println("Value c:"+c);
	}
}