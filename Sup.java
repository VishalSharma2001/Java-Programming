class Sup{
	 public static void f1(){
		int y=4;
		System.out.println("y="+y);
	}
	class  Sub extends Sup{
	
}
public static void main(String[] args){
     Sub.f1();
}	 
}