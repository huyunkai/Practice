package File;

import java.io.IOException;
import java.io.PipedInputStream;

public class Read implements Runnable {
	private PipedInputStream in;
	
	Read(PipedInputStream i)
	{
		this.in=in;
	}
	@Override
	public void run() {
		try
		{
			byte []buf=new byte[1024];
			System.out.println("��ȡǰ..û����������");
			int len=in.read(buf);
			System.out.println("��������..��������");
			String s=new String(buf, 0, len);
			System.out.println(s);
			in.close();
		}
		catch(IOException e)
		{
			throw new RuntimeException("�ܵ���ȡ��ʧ��");
		}

	}

}
