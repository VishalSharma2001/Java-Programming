/*import java.io.*;
public class Fileoutput{
	public static void main(String [] args) throws IOException {
     FileOutputStream fout=new FileOutputStream("../java/Fileoutput.txt",true);
     String s="Vishal";	 
	 char ch[]=s.toCharArray();
     for(int i=0;i<s.length();i++)
      fout.write(ch[i]);		 
      fout.close();
 }
}*/
import java.io.*;
public class Fileoutput{
	public static void main(String [] args) throws IOException {
     FileOutputStream fout=new FileOutputStream("../java/Fileoutput.txt",true);
      String s="vishal,17ebkcs118";
	  byte b[]=s.getBytes();
	  fout.write(b);
     fout.close();
	}
}
	 