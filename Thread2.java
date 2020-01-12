class A extends Thread{
	int i;
	public void run(){
	  for(i=0;i<=10;i++)
		  System.out.println("i= "+i+"Thread A");
	}
}
	class B extends Thread{
     int i;
    public void run(){	 
	 for(i=0;i<=10;i++)
		 System.out.println("i="+i+"Thread B");
	}
	}
public class Thread2{
 public static void main(String [] args){
      A a=new A();
	  B b=new B();
      a.start();
	  b.start();
 }
}