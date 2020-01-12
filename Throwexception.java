import java.util.Scanner;
class Throwexception{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int balance=5000;
		int withdrawl;
		System.out.println("Available balance="+balance);
		System.out.println("Enter WithdrawlAmount:");
		withdrawl=sc.nextInt();
		try{
		if(balance<=withdrawl){
			throw new ArithmeticException("Insufficient Balance");
		}
	    else{
		balance=balance-withdrawl;
		System.out.println("New Balance="+balance);
        System.out.println("Transaction is complete");
		  }
		}
		catch(ArithmeticException e){
		   System.out.println("Error="+e.getMessage());
		}
	}
}	