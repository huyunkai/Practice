package Awt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TextClient 
{
	public static void main(String []args)throws Exception
	{
		Socket s=new Socket("127.0.0.1",10003);
		BufferedReader bufr=new BufferedReader(new FileReader("TCPDemo.java"));
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		String line=null;
		while((line=bufr.readLine())!=null)
		{
			out.println(line);
		}
		out.println("over");
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str=bufIn.readLine();
		System.out.println(str);
		bufr.close();
		s.close();		
	}
}
