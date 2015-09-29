package Awt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send implements Runnable
{ 	private DatagramSocket ds;
	Send(DatagramSocket ds)
	{
		this.ds=ds;
	}
	@Override
	public void run() {
		try
		{
			BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
			String line=null;
			while((line=bufr.readLine())!=null)
			{
				if("886".equals(line))
				break;
				byte [] buf=new byte[1024];
				DatagramPacket dp=new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 1000);	
				ds.send(dp);
			}
		}
		catch(Exception e)
		{
			throw new RuntimeException("∑¢ÀÕ∂À ß∞‹!");
		}
		
	}

}
