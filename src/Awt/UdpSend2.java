package Awt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpSend2
{
	public static void main(String []args)throws Exception
	{
		DatagramSocket ds=new DatagramSocket();
		BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		while((line=bufr.readLine())!=null)
		{
			if("886".equals(line))
				break;
			byte[] buf=line.getBytes();
			DatagramPacket dp=new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 100);
			ds.send(dp);
		}
		ds.close();
	}
}
