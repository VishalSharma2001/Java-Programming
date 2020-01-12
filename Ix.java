class Ex{
	public void f1(){
		System.out.println("vishal");
	}
}
class Fx extends Ex{
	public void f2(){
	
	System.out.println("sharma");
	}
}
public class Ix{
public static void main(String[] args){
	Fx f = new Fx();
	f.f2();
}
}	