/*
 * 需求：通过udp传输方式，将一段文字数据方式出去.
 * 思路
 * 1,建立udpsocket服务.
 * 2,提供数据，并将数据封装到数据包中.
 * 3,通过socket服务的发送功能，将数据包发出去.
 * 4,关闭资源.
 * */

package Awt;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {
	public static void main(String []args)throws Exception
	{
		//1,创建upd服务,通过DatagramSocket对象.
		DatagramSocket ds=new DatagramSocket();
		//2,确定数据，兵封装成数据包.
		byte []data="udp lai le".getBytes();
		DatagramPacket dp=new DatagramPacket(data, data.length, InetAddress.getByName("127.0.0.1"), 180);
		//通过Socket服务，将已有的数据包发送出去，通过send方法.
		ds.send(dp);
		//4，关闭资源.
		ds.close();
		
	}
}
