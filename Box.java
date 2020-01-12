class Box{
private int  chal;
        int  breadth;
        int  height;
public void setDimension(int c,int b,int h){
	 chal=c;
     breadth=b;
     height=h;
    }
public void showDimension(){
    System.out.println("C="+chal);
    System.out.println("B="+breadth);	
	System.out.println("H="+height);
}
public static void main(String[] args)
{ 	
	Box B =new Box();
	B.setDimension(2,5,6);
    B.showDimension();	
}
}