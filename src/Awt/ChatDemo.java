/*
 * 编写一个聊天程序.
 * 有收数据的部分，和发数据的部分.
 * 这两部分需要同时执行.
 * 就需要多线程技术。
 * 一个线程控制收，一个县城控制发.
 * 
 * 因为收和发是不一致的,所以要定义两个run方法.
 * 而且这两个方法要封装到不同的类中.
 * */
package Awt;

import java.net.DatagramSocket;

public class ChatDemo 
{ 
	public static void main(String []args)throws Exception
	{
		DatagramSocket sendosocket=new DatagramSocket();
		DatagramSocket recesocket=new DatagramSocket(1000);
		new Thread(new Send(sendosocket)).start();
		new Thread(new Rece(recesocket)).start();
		
	}
}
