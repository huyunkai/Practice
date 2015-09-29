package Awt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * 服务端
 * 源：socket读取流.
 * 目的:socket输出流.
 * 都是文本，都是装饰.
 * */
public class TransServer 
{
	public static void main(String []args)throws Exception
	{
		ServerSocket ss=new ServerSocket(10005);
		Socket s=ss.accept();
		//读取socket读取流中的数据.
		BufferedReader bufIn=new BufferedReader(new InputStreamReader(s.getInputStream()));
		//目的:socket输出流,将大写数据写入到socket输出流,并发送给客户端.
		BufferedWriter bufw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line=null;
		while((line=bufIn.readLine())!=null)
		{
			bufw.write(line.toUpperCase());
		}
		s.close();
		ss.close();
	}
}
/*
 * 该例子出现的问题. 
 * 现象：客户端和服务端都在莫名的等待，
 * 客服端和服务端都有阻塞式方法，这些方法没有读到结束标记，那么就一直等待.
 * */
