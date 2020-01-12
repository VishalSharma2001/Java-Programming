import java.util.Scanner;
class AreaRec{
	public static void main(String[] args){
		double a;
		double w;
		double h;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Width=");		
		 w=sc.nextDouble();
		 System.out.println("Width is="+w);
        System.out.println("Enter Height=");
		h=sc.nextDouble();
		System.out.println("Enter Width="+h);
        a=w*h;
     System.out.println("Area of Rectangle is="+a);
	}
}	