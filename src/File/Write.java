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
			System.out.println("��ʼд�����ݣ��ȴ�6���");
			Thread.sleep(6000);
			os.write("piped coming".getBytes());
			os.close();
		}
		catch(IOException | InterruptedException e)
		{
			throw new RuntimeException("�ܵ������ʧ��");
		}
	}

}
