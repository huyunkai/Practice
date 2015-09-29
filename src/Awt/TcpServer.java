package Awt;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 服务端：
 * 需求:定义端点接受数据兵打印在控制台上.
 * 1,建立服务端的socket服务,serverSocket();
 * 并监听一个端口.
 * 2，获取链接过来的客户端对象.
 * 通过serverSocket的accept方法.所以这个方法是阻塞式的.
 * 3,客户端如果发送数据,那么服务端要使用对应的客户端对象，兵获取到该客户端对象的
 * 读取流来读取发过来的数据，并打印在控制台.
 * 4,关闭服务端.（可选操作.）
 * 
 * 
 * */
public class TcpServer 
{
	public static void main(String []args)throws Exception
	{
		//建立服务端的Scoket服务并监听一个端口.
		ServerSocket ss=new ServerSocket(10003);
		//通过accept方法获取链接过来的客户端对象.
		Socket s=ss.accept();
		//获取客服端发送过来的数据，那么要使用客户端对象的读取流来读取数据.
		String ip=s.getInetAddress().getHostAddress();
		System.out.println(ip+"....connect");
		InputStream in=s.getInputStream();
		byte []buf=new byte[1024];
//		int len=in.read(buf);
//		System.out.println(new String(buf,0,len));
		int len=0;
		while((len=in.read(buf))!=-1)
		{
			System.out.println(new String(buf,0,len));
		}
		s.close();
		ss.close();
		
	}
}
