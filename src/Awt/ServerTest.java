package Awt;

import java.net.Socket;

public class ServerTest {
	public static void main(String  []args)throws Exception
	{
		Socket ss=new Socket();
		System.out.println(ss.getInetAddress().getByName("www.baidu.com"));
	}
}	
