public class Example1 //extends Employe
{
	public static void main(String[] args){
	 Employe e1=new Employe();
     e1.setName("vishal");
	 e1.setAge(18);
	 e1.setAddress("Wardno 12 Surajgarh");
	 e1.getName();
	 e1.getAge();
	 e1.getAddress();
	 e1.setsalary(2000000);
	 e1.getsalary();
	 e1.setbranch("suarajgarh");
	 e1.getbranch();	
	 System.out.print("\nName="+e1.getName());
	 System.out.print("\nAge="+e1.getAge());       
	 System.out.print("\nAddress="+e1.getAddress());
	 System.out.print("\nsalary="+e1.getsalary());
	System.out.print("\nBranch="+e1.getbranch());
	 
	}
}