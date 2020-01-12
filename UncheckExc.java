class UncheckExc{
	public static void main(String[] args){
		try{
			//System.out.println(3/0);
			String s1=null;
			System.out.println("The String length"+s1.length());
		}
		catch(NullPointerException f)
		{  
		System.out.println("Pointer Exception"+f.getMessage());
		}
		catch(ArithmeticException e){
			System.out.println("The Excepatin"+e.getMessage());
			System.out.println("Hey vishal");
		}
	}
}