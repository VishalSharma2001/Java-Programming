public class Employe extends Person{
	private  int salary;
	private  String branch;
    public void setsalary(int s){
	  salary=s;
	}
	public void setbranch(String b){
	  branch=b;
	}
	public int getsalary(){
		return(salary);
	}
	public String getbranch(){
		return(branch);
	}
}
	