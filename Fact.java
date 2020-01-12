import java.util.Scanner;
public class Fact{
	public static void main(String[] args){
	 int n,i,facto=1;
	 Scanner sc=new Scanner(System.in);
	  System.out.println("Enterthe number:");
	   n =sc.nextInt();
	   if(n<0){
	   System.out.println("Number not a negative value");
	   }
	   else{
	    for(i=1;i<=n;i++){
		facto = facto*i;
        System.out.println("Factorial is:"+facto);   
	   }}
	}
}