/*
 * ��дһ���������.
 * �������ݵĲ��֣��ͷ����ݵĲ���.
 * ����������Ҫͬʱִ��.
 * ����Ҫ���̼߳�����
 * һ���߳̿����գ�һ���سǿ��Ʒ�.
 * 
 * ��Ϊ�պͷ��ǲ�һ�µ�,����Ҫ��������run����.
 * ��������������Ҫ��װ����ͬ������.
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
