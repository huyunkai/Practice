/*
 * ����ͨ��udp���䷽ʽ����һ���������ݷ�ʽ��ȥ.
 * ˼·
 * 1,����udpsocket����.
 * 2,�ṩ���ݣ��������ݷ�װ�����ݰ���.
 * 3,ͨ��socket����ķ��͹��ܣ������ݰ�����ȥ.
 * 4,�ر���Դ.
 * */

package Awt;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {
	public static void main(String []args)throws Exception
	{
		//1,����upd����,ͨ��DatagramSocket����.
		DatagramSocket ds=new DatagramSocket();
		//2,ȷ�����ݣ�����װ�����ݰ�.
		byte []data="udp lai le".getBytes();
		DatagramPacket dp=new DatagramPacket(data, data.length, InetAddress.getByName("127.0.0.1"), 180);
		//ͨ��Socket���񣬽����е����ݰ����ͳ�ȥ��ͨ��send����.
		ds.send(dp);
		//4���ر���Դ.
		ds.close();
		
	}
}
