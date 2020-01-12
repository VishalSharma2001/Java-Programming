public class Final{
	private final int x=5;//instance variable 
	private final static int y=5;//static variable
	public void get(){
	 final int k=5;//local variable 
	 	System.out.println("k="+k);
	 
	System.out.println("x="+x);
	}
	public void get1(){
	System.out.println("y="+y);
	}
	static{
		System.out.println("y="+y);
	}
	/*3.Final(){
	System.out.println("x="+x);
	}*/
	/*2.{
		x=1;
		System.out.println("x="+x);
	}*/
	public static void main(String[] args){
	Final f=new Final();
	f.get();
	f.get1();
	}
}