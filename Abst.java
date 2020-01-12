abstract class  A{
   abstract void fun();
}
class B extends A{
	void fun(){
	 System.out.println("vishal sharma ");
	 }
}
public class Abst{
		 public static void main(String[] args){
	     B b=new B();
		 b.fun();
	}
}