import java.io.*;
public class Bufferedreader{
	public static void main(String[] args) throws IOException {
		int i;
		BufferedReader br=new BufferedReader(new FileReader("./Fileoutput.txt"));
		while((i=br.read())!=-1){
			System.out.print((char)i);
		}
		br.close();
	}
}
/*import java.io.*;
public class Bufferedreader{
	public static void main(String[] args) throws IOException { 
	BufferedReader br=new BufferedReader(new FileReader("./Fileoutput.txt"));
	String s;
	s=br.readLine();
	System.out.print(s);
	br.close();
}
}*/
/*import java.io.*;
public class Bufferedreader{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("./Fileoutput.txt"));
		char[]s=new char[120];
		br.read(s,5,110);
		System.out.print(s);
		br.close();
}
}*/