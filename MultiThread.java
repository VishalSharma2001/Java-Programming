import java.util.Scanner;
class Account{
   private int bal;
   public Account(int bal){
     this.bal=bal;
	 System.out.println("current Balance="+bal);
	 }
	 public boolean isSufficientBalance(int w){
		 if(bal>=w)
			 return(true);
		 else 
			 return(false);
	 }
	public void withdraw(int amt){
		bal=bal-amt;
		System.out.println("The amount="+amt);
		System.out.println("New Bal="+bal);
	}
}
class Customer implements Runnable{
	public String name;
	private Account account;
	public Customer(Account account,String n){
	this.account=account;
	name=n;
	}
	public void run(){
     synchronized(account){
	Scanner sc=new Scanner(System.in);
	System.out.println(name+",Enter the Ammount=");
	int amt=sc.nextInt();
	if(account.isSufficientBalance(amt)){
    System.out.println(name);	
	account.withdraw(amt);
	}
	else 
		System.out.println("InsufficientBalance");
	}
	}
}
public class MultiThread{
	public static void main(String[] args){
     Account a1=new Account(1000);
	 Customer c1=new Customer(a1,"vishal");
	 Customer c2=new Customer(a1,"Sumit");
     Thread t1=new Thread(c1);
	 Thread t2=new Thread(c2);
	 t1.start();
	 t2.start();
}
}