package Awt;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Rece implements Runnable
{
	private DatagramSocket ds;
	Rece(DatagramSocket ds)
	{
		this.ds=ds;
	}
	@Override
	public void run()
	{
		try
		{
			while(true)
			{
				byte []buf=new byte[1024];
			DatagramPacket dp=new DatagramPacket(buf, buf.length);
			ds.receive(dp);
			String ip=dp.getAddress().getHostAddress();
			String data=new String(dp.getData(),0,dp.getLength());
			System.out.println(ip+"::"+data);
			}
		}
		catch(Exception e)
		{
			throw new RuntimeException("Ω” ‹ ß∞‹£°");
		}
		
	}
	
	
}
