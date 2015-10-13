package Awt;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String  []args)throws Exception
	{
			ServerSocket ss=new ServerSocket(11000);
			Socket s=ss.accept();
			System.out.println(s.getInetAddress().getHostAddress());
			PrintWriter out=new PrintWriter(s.getOutputStream(),true);
			out.println("¿Í»§¶ËÄãºÃ");
			s.close();
			ss.close();

	}
}
