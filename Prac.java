/*class A{
	public int c,a,b;
	public void add(){
		a=10;
		b=11;
		c=a+b*10;
		System.out.println("c="+c);
	}
}
public class Prac{
public static void main(String[] args){
	A a =new A();
	a.add();
}
}*/
class A{
	int c,a,b;
	public void setvala(int x){
		a=x;
	}
	public void setvalb(int y){
		b=y;
	}
	public int getvala(){
		return(a);
	}
	public int getvalb(){
		return(b);
	}
	public void res(){
	c=a+b*10;
    System.out.println("c="+c);	
	}
}
public class Prac{
     public static void main(String[] args){ 
     A a=new A();
	 a.setvala(10);
	 a.setvalb(11);
	 a.getvala();
	 a.getvalb();
	 a.res();
    }
}
		