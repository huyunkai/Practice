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
			System.out.println("读取前..没有数据阻塞");
			int len=in.read(buf);
			System.out.println("读到数据..阻塞结束");
			String s=new String(buf, 0, len);
			System.out.println(s);
			in.close();
		}
		catch(IOException e)
		{
			throw new RuntimeException("管道读取流失败");
		}

	}

}
