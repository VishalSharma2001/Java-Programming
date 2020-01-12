interface I1{
void fun();
}
interface I2{
void fun2();
}
class A implements I1,I2{
 public void fun(){
    System.out.println("vishal");
 }
 public void fun2(){
	 System.out.println("Sharma");
	// System.out.println("Sharma");
 }
}
/*public class Inter{
	public static void main(String[] args){
	A a=new A();	
    a.fun();
	a.fun2();
}
}*/
public class Inter{
	public static void main(String[] args){
	//I1 a=new A();
    I2 a=new A();	
   // a.fun();
    a.fun2();
}
}

