 class A{
	public int x,y;
	public void f1(int x){
	System.out.println("class 1");
}
	
}
//overloding
class B extends A{
	public void f1(int x){
	System.out.println("class 2");
	
}
}
/* function overridding
class C extends B{
	public void f2(int x, int y){
	System.out.print("class 3");
	}
}*/
public class Over{
public static void main(String[] args){
    B b=new B();
  	//b.f1(4);
    b.f1(2);
//b.f3(1,2);
	//A a=new A();
	//a.f1(5);
    //a.f2(5,10);	
}
}

