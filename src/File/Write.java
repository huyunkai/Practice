package File;

import java.io.IOException;
import java.io.PipedOutputStream;

public class Write implements Runnable{
	private PipedOutputStream os;
	Write(PipedOutputStream os)
	{
		this.os=os;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("开始写入数据，等待6秒后");
			Thread.sleep(6000);
			os.write("piped coming".getBytes());
			os.close();
		}
		catch(IOException | InterruptedException e)
		{
			throw new RuntimeException("管道输出流失败");
		}
	}

}
