public class Cons{
	private int l,b,h;
	public Cons(){
	l=10;
	b=15;
	h=10;
	System.out.println("lenghtis="+l);
	System.out.println("breadthis="+b);
	System.out.println("heightis="+h);
	}
	/*public void print(){
	System.out.println("lenghtis="+l);
	System.out.println("breadthis="+b);
	System.out.println("heightis="+h);
	}*/		
	public Cons(int L,int B,int H){
	l=L;
    b=B;
    h=H;
	System.out.println("lenghtis="+l);
	System.out.println("breadthis="+b);
	System.out.println("heightis="+h);

	}
	/*public int getCons(){
		
	return(l);
	}
	public int getCons1(){
		return(b);
	}
    public int getCons2(){
	 return(h);
	}*/
public static void main(String[] args){
    Cons c1=new Cons();	
	Cons c2=new Cons(14,15,16);	
	/*c1.print();
     System.out.println("Lenght is="+c1.getCons());
     System.out.println("breadth is="+c1.getCons1());
	 System.out.println("Height is="+c1.getCons2());
	*/
}
}
	