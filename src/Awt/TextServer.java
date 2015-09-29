package Awt;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TextServer 
{
	public static void main(String []args)throws Exception
	{
		ServerSocket ss=new ServerSocket(10003);
		Socket s=ss.accept();
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter out=new PrintWriter(new FileWriter("server.txt"),true);
		String line=null;
		while((line=bufIn.readLine())!=null)
		{
			if("over".equals(line))
				break;
			out.println(line);
		}
		PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
		
		pw.println("上传成功");
		out.close();
		s.close();
		ss.close();
	}
}
