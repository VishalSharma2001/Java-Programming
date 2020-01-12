public class Static{
	int x;
	static int y;
	public static void Show(){
	y=4;	
	System.out.println("Value is="+y);
	}
	static class Test{
		public static String name="Vishal";
	//System.out.println("name is="+name);
	}	
}
class UseStatic{
	public static void main(String[] args){
	//Static s1=new Static();
	Static.y=5;
	System.out.println("Value is="+Static.y);
	Static.Show();		
	System.out.println("Name is="+Static.Test.name);
	}
}