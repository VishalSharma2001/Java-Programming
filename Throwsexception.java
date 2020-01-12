import java.io.*;
/*class Throwsexception{
	public static void main(String[] args){
	  throw new IOException();
	  //System.out.println("Vishal sharma");	
	  }
}
*/
class throwsexception{
	public static void main(String[] args){
    	try{
	   throw new IOException();
		}
     catch(IOException e){
	    System.out.println("Error"+e.getMessage());
	 }		 
	}
}