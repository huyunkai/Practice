package Awt;

import java.io.OutputStream;
import java.net.Socket;

public class TcpClient 
{
	public static void main(String []args)throws Exception
	{
		//�����ͻ��˵�socket����ָ��Ŀ�������Ͷ˿�.
		Socket s=new Socket("127.0.0.1",10003);
		//Ϊ�˷������ݣ�Ӧ�û�ȡsocket���е������.
		OutputStream os=s.getOutputStream();
		os.write("tcp lai le".getBytes());
		s.close();
	}
}
