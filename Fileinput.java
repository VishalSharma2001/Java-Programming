/*import java.io.*;
public class Fileinput{
   public static void main(String [] args) throws IOException       
   {
    FileInputStream fin= new  FileInputStream("./Fileoutput.txt");
	 int i;
	do{
        i=fin.read();		
		if(i!=-1)
		System.out.print((char)i);
	}while(i!=-1);
 }
}*/
import java.io.*;
public class Fileinput{
	public static void main(String[] args)throws IOException
	{    int i;
		FileReader fin=new FileReader("./Fileoutput.txt");
		while((i=fin.read())!=-1)
			System.out.print((char)i);
		fin.close();
	}
}