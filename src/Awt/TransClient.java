package Awt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TransClient 
{
	public static void main(String []args)throws Exception
	{
		Socket s=new Socket("127.0.0.1",10005); 
		//定义读取键盘数据的流对象.
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		//定义目的,将数据写入到socket输出流，发送给服务端.
		BufferedWriter bufw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		//定义一个socket读取流,读取服务端返回的大写信息
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line=null;
		while((line=bufr.readLine())!=null)
		{
			
			if("over".equals(line))
				break;
			bufw.write(line);
			//重新读取从服务器传来的数据
			String str=bufIn.readLine();
			System.out.println("server:"+str);
			
		}
		bufr.close();
		s.close();
	}
}
