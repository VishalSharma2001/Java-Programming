import java.io.*;
public class Bufferedwrite{
	public static void main(String[] args) throws IOException{
		FileWriter fw=new FileWriter("./Fileoutput.txt",true);
		BufferedWriter bf=new BufferedWriter(fw);
		 bf.write("I am Coder");
		 bf.close();
	}
}