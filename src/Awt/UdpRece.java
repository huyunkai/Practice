/*
 * ����
 * ����udpsocket����ͨ�������һ���˿ڣ���ʵ���Ǹ������������Ӧ�ó��������ֱ�ʶ.
 * 
 * ����һ��Ӧ�ó���,���ڽ���udpЭ�鴫������ݲ������.
 * ˼·:
 * 1,����udpsocket����.
 * 2,����һ�����ݰ�,��ΪҪ�洢Ҫ���ܵ����ֽ�����,��Ϊ���ݰ�����
 * ���и��๦�ܿ�����ȡֱ�������еĲ�ͬ������Ϣ.
 * 3,ͨ��socket�����receive�������ܵ������ݴ����Ѷ���õ����ݰ���
 * 4,ͨ�����ݰ���������й��ܣ�����Щ��ͬ������ȡ��,��ӡ�ڿ���̨��.
 * 5,�ر���Դ.
 * */
package Awt;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpRece {

	public static void main(String[] args)throws Exception
	{
		//1������udp socket,�����˵㡣
		DatagramSocket ds=new DatagramSocket(180);
		//2,�������ݰ�.���ڴ洢����.
		 byte []buf=new byte[1024];
		 DatagramPacket dp=new DatagramPacket(buf, buf.length);
		 //3��ͨ�������receive�������ܵ����ݴ������ݰ���.
		 ds.receive(dp);
		 //4,ͨ�����ݰ��ķ�����ȡ���е�����.
		 String ip=dp.getAddress().getHostAddress();
		 String data=new String(dp.getData(),0,dp.getLength());
		 int port=dp.getPort();
		 System.out.println(ip+"::"+data+"::"+port);
		 //�ر���Դ
		 ds.close();
		}

}
