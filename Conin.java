/*class A{
public A(){
System.out.println("vishal");
}
}
class B extends A{
	public B(){
		System.out.println("sharma");
	}
}
public class Conin{
	public static void main(String[] args){
 B b=new B();
}
}*/
class A{
	int a;
	public A(int x){
	x=a;
	System.out.println("X="+x);
	}
}
class B extends A{
	public B(){
		super(4);
	System.out.println("Hai");
	}
}
class Conin{
	public static void main(String args[]){
	B c=new B();
	}
}

