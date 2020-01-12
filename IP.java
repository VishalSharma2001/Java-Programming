import java.net.InetAddress;
public class IP{
	public static void main(String []args) throws Exception
	{
	InetAddress myIP=InetAddress.getLocalHost();
	System.out.println("My IP address");
	System.out.println(myIP.getHostAddress());
	}
}