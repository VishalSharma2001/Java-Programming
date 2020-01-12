import java.io.*;
public class FileExample1{
	public static void main(String [] args) throws IOException
	{
		File f1=new File("D:/java/New1.txt");
	    f1.createNewFile();
		System.out.println("Exist:"+f1.exists());
		System.out.println("Size:"+f1.length());
		System.out.println("can Write:"+f1.canWrite());
		System.out.println("Name:"+f1.getName()); 
	    //f1.delete();	
	}
}